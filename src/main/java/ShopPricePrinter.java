import java.util.HashMap;
import java.util.Map;

public class ShopPricePrinter {

  private Map<String, Shop> shops;

  public ShopPricePrinter(){
    shops = new HashMap<>();
    //Grill house
    Shop shop1 = new Shop("Bigbelly Grill");
    shop1.addProduct("Baby Back Ribs", 599.99);
    shop1.addProduct("Spare Ribs", 299.99);
    shop1.addProduct("Roast Belly", 199.99);
    shops.put("Shop1", shop1);

    //Coffee Shop
    Shop shop2 = new Shop("Bread and Blends");
    shop2.addProduct("Spanish Cream Bread", 99.99);
    shop2.addProduct("Hot Expresso", 80.00);
    shop2.addProduct("Pizza", 299.99);
    shops.put("Shop2", shop2);

    //Unli Wings Shop
    Shop shop3 = new Shop("Chickboy");
    shop3.addProduct("Unli Wings", 599.99);
    shop3.addProduct("12 pcs Wings", 299.99);
    shop3.addProduct("Coffee Jelly", 159.99);
    shops.put("Shop3", shop3);
  }


  public void printProductsByShop(){
    for (Shop shop : shops.values()){
      System.out.println("Shop: " + shop.getShop_name());
      for( Product product : shop.getProducts().values()){
        System.out.println("Product: " + product.getName() +",......Price: " + product.getPrice());
      }
      System.out.println();
    }
  }
  public void printMostExpensiveProduct(){
    for (Shop shop : shops.values()){
      Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        System.out.println("Shop: " + shop.getShop_name() + ", Most Expensive Product: " + mostExpensiveProduct.getName()
                + " ....Price: " + mostExpensiveProduct.getPrice());
      System.out.println();

    }
  }
  public void printMostLessExpensiveProduct(){
    for (Shop shop : shops.values()){
      Product mostLessExpensiveProduct = shop.getMostLessExpensiveProduct();
      System.out.println("Shop: " + shop.getShop_name() + ", Most Less Expensive Product: " + mostLessExpensiveProduct.getName()
              + " ....Price: " + mostLessExpensiveProduct.getPrice());
      System.out.println();
    }
  }
  public static void main(String[] args) {
    ShopPricePrinter findshop = new ShopPricePrinter();

    System.out.println("==== Shops =====");
    findshop.printProductsByShop();
    System.out.println();

    System.out.println("=== Most Expensive Products ===");
    findshop.printMostExpensiveProduct();
    System.out.println();

    System.out.print("=== Most Less Expensive Products ===");
    System.out.println();
    findshop.printMostLessExpensiveProduct();

  }
}
