package application;

import model.Shop;
import model.ShopProduct;
import util.MenuDisplayService;
import util.InputService;
import util.ShopPricePrinter;
import util.ShopService;

import java.math.BigDecimal;
import java.util.List;

public class MainApp {

    private final ShopService shopService;
    private final InputService inputService;

    public MainApp(ShopService shopService, InputService inputService) {
        this.shopService = shopService;
        this.inputService = inputService;
    }

    public static void main(String[] args) {
        MainApp app = new MainApp(new ShopService(), new InputService());
        app.runRoutine();
    }

    public void runRoutine() {
        String userInput;

        do {
            MenuDisplayService.printMainInterface();
            userInput = inputService.getStringInput();

            try {
                processUserInput(userInput);
            } catch (RuntimeException e) {
                System.err.println("Error: " + e.getMessage() + System.lineSeparator());
            }
        } while(!userInput.equals("4"));
    }

    public void processUserInput(String userInput) {
        switch (userInput) {
            case "1":
                addShopToList();
                break;
            case "2":
                addProductToShop();
                break;
            case "3":
                displayShopProducts();
                break;
            case "4":
                System.out.println("Program terminated.");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    private void addShopToList() {
        System.out.print("Enter shop name: ");
        String shopName = inputService.getStringInput();
        shopService.addShop(shopName);
        System.out.printf("%s successfully added to list of shops.%n%n", shopName);
    }

    private void addProductToShop() {
        displayShopNames();

        System.out.print("Enter shop name: ");
        String shopName = inputService.getStringInput();
        Shop shop = shopService.getShopByName(shopName).orElseThrow(() -> new ShopNotFoundException(shopName));

        String productName;
        do {
            System.out.print("Enter product name or type 'exit' to return to menu: ");
            productName = inputService.getStringInput();

            if (productName.equalsIgnoreCase("exit")) { break; }

            double productPrice = inputService.getValidPriceInput();
            inputService.getStringInput();  // Clear scanner buffer

            shop.addProduct(new ShopProduct(productName, BigDecimal.valueOf(productPrice)));
            System.out.printf("%s successfully added to %s products.%n%n", productName, shopName);
        } while (true);
    }

    private void displayShopProducts() {
        displayShopNames();

        System.out.print("Enter shop name: ");
        String shopName = inputService.getStringInput();
        Shop shop = shopService.getShopByName(shopName).orElseThrow(() -> new ShopNotFoundException(shopName));

        ShopPricePrinter.printShopProducts(shop);
        ShopPricePrinter.printMostExpensiveProductsForShop(shop);
        ShopPricePrinter.printCheapestProductsForShop(shop);
    }

    public void displayShopNames() {
        List<Shop> shopList = shopService.getListOfShops();
        if (shopList.isEmpty()) {
            throw new EmptyListException("The list of shops is empty. Add a shop first before adding a product or displaying shop products.");
        }

        System.out.println("List of shops added: ");
        for (Shop shop : shopList) {
            System.out.println(shop.getShopName());
        }
        System.out.println();   // Insert blank line after printing list
    }
}
