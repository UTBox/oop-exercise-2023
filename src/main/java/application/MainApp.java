package application;

import model.Shop;
import util.ShopService;

import java.util.List;
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
        } while(userInput.equals("3"));
    }

    public static void printMainInterface() {
        System.out.println("1. Add a shop%n" +
                           "2. Add a product%n" +
                           "3. " +
                           "3. Exit");
    }

    public void processUserInput(String userInput, Scanner scanner) {
        switch (userInput) {
            case "1":
                System.out.print("Enter shop name: ");
                String shopName = scanner.nextLine();
                shopService.addShop(shopName);
                break;
            case "2":
                System.out.print("Enter product name: ");
                String productName = scanner.nextLine();
                do {
                    System.out.print("Enter product price: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    double productPrice = scanner.nextDouble();
                } while(scanner.hasNextDouble());
                break;
            case "3":
                System.out.println("Program terminated.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void printShopNames() {
        List<Shop> shopList = shopService.getListOfShops();
    }
}
