import java.util.Scanner;

public class ShopPricePrinter {

  public static void main(String[] args) {
    Product[] mercuryProducts = {
            new Product("Shampoo", 10.99),
            new Product("Soap", 20.50),
            new Product("Water", 15.75)
    };

    Product[] roseProducts = {
            new Product("Shampoo", 12.99),
            new Product("Soap", 18.75),
            new Product("Water", 25.00)
    };

    Product[] watsonsProducts = {
            new Product("Shampoo", 8.50),
            new Product("Soap", 16.25),
            new Product("Water", 21.99)
    };

    Shop[] shops = {
            new Shop("Mercury Drug Store", new ShopProducts(mercuryProducts)),
            new Shop("Rose Pharmacy", new ShopProducts(roseProducts)),
            new Shop("Watsons Pharmacy", new ShopProducts(watsonsProducts))
    };

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nShop List:");
      for (int i = 0; i < shops.length; i++){
        System.out.println((i + 1) + ". " + shops[i].getShopName());
      }

      System.out.print("Enter the number of the shop to view the products (or 0 to exit): ");
      int choice = scanner.nextInt();

      if (choice == 0) {
        System.out.println("Exiting...");
        break;
      } else if (choice >= 1 && choice <= shops.length) {
        Shop selectedShop = shops[choice - 1];
        IProduct products = selectedShop.getProducts();
        System.out.println("\n" + selectedShop.getShopName());
        System.out.println("Products Available: ");

        for (Product product : products.getProducts()) {
          System.out.println(product.getProductName() + " is worth P" + product.getProductPrice());
        }

        Product mostExpensiveProduct = products.getMostExpensiveProduct();
        Product leastExpensiveProduct = products.getLeastExpensiveProduct();

        System.out.println("Most Expensive Product: " + mostExpensiveProduct.getProductName() + " is worth P" + mostExpensiveProduct.getProductPrice());
        System.out.println("Least Expensive Product: " + leastExpensiveProduct.getProductName() + " is worth P" + leastExpensiveProduct.getProductPrice());
      } else {
        System.out.println("Invalid choice! Please try again.");
      }
    }

    scanner.close();
  }
}
