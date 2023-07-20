

public class ShopPricePrinter {
  public static void main(String[] args) {

    // Creating shops and adding products
    Shop groceryShop = new Shop("Grocery Shop");
    groceryShop.addProduct("Apples", 12);
    groceryShop.addProduct("Bread", 34);
    groceryShop.addProduct("Milk", 56);

    Shop electronicsShop = new Shop("Electronics Shop");
    electronicsShop.addProduct("Smartphone", 23000);
    electronicsShop.addProduct("Laptop", 62000);
    electronicsShop.addProduct("Headphones", 1200);

    Shop clothingShop = new Shop("Pet Shop");
    clothingShop.addProduct("Cat", 3500);
    clothingShop.addProduct("Dog", 8000);
    clothingShop.addProduct("Rabbit", 5200);

    // Printing products and product details for each shop
    groceryShop.printProducts();
    electronicsShop.printProducts();
    clothingShop.printProducts();

    // Printing the most expensive product for each shop
    System.out.println("\n");
    groceryShop.printMostExpensiveProduct();
    electronicsShop.printMostExpensiveProduct();
    clothingShop.printMostExpensiveProduct();

    // Printing the least expensive product for each shop
    System.out.println("\n");
    groceryShop.printLeastExpensiveProduct();
    electronicsShop.printLeastExpensiveProduct();
    clothingShop.printLeastExpensiveProduct();
  }
}
