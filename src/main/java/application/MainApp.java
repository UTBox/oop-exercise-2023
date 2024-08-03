package application;

import model.Shop;
import util.ShopPricePrinter;
import util.ShopService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainApp {

    private ShopService shopService;

    public MainApp() {
        this.shopService = new ShopService();
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.runRoutine(new Scanner(System.in));
    }

    public void runRoutine(Scanner scanner) {
        String userInput = "";

        do {
            printMainInterface();
            userInput = scanner.nextLine();
            processUserInput(userInput, scanner);
        } while(!userInput.equals("4"));
    }

    public static void printMainInterface() {
        System.out.printf("1. Add a shop%n" +
                           "2. Add a product%n" +
                           "3. Show shop products%n" +
                           "4. Exit%n");
    }

    public void processUserInput(String userInput, Scanner scanner) {
        String shopName;

        switch (userInput) {
            case "1":
                System.out.print("Enter shop name: ");
                shopName = scanner.nextLine();
                shopService.addShop(shopName);
                break;
            case "2":
                double productPrice;
                printShopNames();
                System.out.print("Enter shop name: ");
                shopName = scanner.nextLine();
                System.out.print("Enter product name: ");
                String productName = scanner.nextLine();
                do {
                    System.out.print("Enter product price: ");
                    if (scanner.hasNextDouble()) {
                        productPrice = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                } while (true);
                scanner.nextLine(); // Clear scanner buffer

                try {
                    shopService.addProductToShop(shopName, productName, BigDecimal.valueOf(productPrice));
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case "3":
                printShopNames();
                System.out.print("Enter shop name: ");
                shopName = scanner.nextLine();
                if (!shopService.isShopExisting(shopName)) {
                    System.out.println("Shop not found.");
                }
                    Optional<Shop> optionalShop = shopService.getShopByName(shopName);
                    if (optionalShop.isEmpty()) {
                        System.out.println("Shop does not exist.");
                        break;
                    }
                    ShopPricePrinter.printShopProducts(optionalShop.get());
                    ShopPricePrinter.printMostExpensiveProductsForShop(optionalShop.get());
                    ShopPricePrinter.printCheapestProductsForShop(optionalShop.get());
                break;
            case "4":
                System.out.println("Program terminated.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void printShopNames() {
        System.out.println("List of shop names: ");
        List<Shop> shopList = shopService.getListOfShops();
        for (Shop shop : shopList) {
            System.out.println(shop.getShopName());
        }
        System.out.println();
    }
}
