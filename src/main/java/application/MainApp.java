package application;

import model.Shop;
import util.MenuDisplayService;
import util.InputService;
import util.ShopPricePrinter;
import util.ShopService;

import java.math.BigDecimal;
import java.util.List;

public class MainApp {

    private ShopService shopService;
    private InputService inputService;

    public MainApp(ShopService shopService, InputService inputService) {
        this.shopService = shopService;
        this.inputService = inputService;
    }

    public static void main(String[] args) {
        MainApp app = new MainApp(new ShopService(), new InputService());
        app.runRoutine();
    }

    public void runRoutine() {
        String userInput = "";

        do {
            MenuDisplayService.printMainInterface();
            userInput = inputService.getStringInput();
            processUserInput(userInput);
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
        System.out.printf("%s successfully added to list of shops.%n", shopName);
    }

    private void addProductToShop() {
        displayShopNames();
        System.out.print("Enter shop name: ");
        String shopName = inputService.getStringInput();

        System.out.print("Enter product name: ");
        String productName = inputService.getStringInput();

        double productPrice = inputService.getValidPriceInput();
        inputService.getStringInput(); // Clear scanner buffer

        try {
            shopService.addProductToShop(shopName, productName, BigDecimal.valueOf(productPrice));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + System.lineSeparator());
        }
    }

    private void displayShopProducts() {
        displayShopNames();
        System.out.print("Enter shop name: ");
        String shopName = inputService.getStringInput();

        if (!shopService.isShopExisting(shopName)) {
            System.out.println("Shop not found.");
            return;
        }

        Shop shop = shopService.getShopByName(shopName).get();
        ShopPricePrinter.printShopProducts(shop);
        ShopPricePrinter.printMostExpensiveProductsForShop(shop);
        ShopPricePrinter.printCheapestProductsForShop(shop);
    }

    public void displayShopNames() {
        List<Shop> shopList = shopService.getListOfShops();
        if (shopList.isEmpty()) {
            System.out.println("The list of shops is empty.");
            return;
        }

        System.out.println("List of shop names: ");
        for (Shop shop : shopList) {
            System.out.println(shop.getShopName());
        }
        System.out.println();
    }
}
