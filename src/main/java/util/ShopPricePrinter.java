package util;

import model.Shop;
import model.ShopProduct;

import java.util.List;

public class ShopPricePrinter {

  /*
    TODO:
      - util.ShopPricePrinter accepts any shop and prints ff:
         - Print all their products
         - Print the most expensive product
         - Print the least expensive product
  */

  private static final String PESO_ACRONYM = "PHP";

  public ShopPricePrinter() {

  }

  public static void printProductsForEachShop(List<Shop> listOfShops) {
    for(Shop shop : listOfShops) {
      System.out.println(shop.getShopName() + " products are:");
      printShopProducts(shop);
    }
  }

  public static void printShopProducts(Shop shop) {
    for (ShopProduct product : shop.getProducts()) {
      String output = String.format("%s worth %s%s", product.getProductName(), PESO_ACRONYM, product.getProductPrice());
      System.out.println(output);
    }
    System.out.println(); // Insert empty line after printing list
  }

  public static void printMostExpensiveProductsForEachShop(List<Shop> listOfShops) {
    for(Shop shop : listOfShops) {

      if(shop.getProducts().size() > 1) {
        System.out.printf("The most expensive product(s) in %s is/are:%n", shop.getShopName());
        printProductList(shop.getMostExpensiveProducts());
        continue;
      }

      System.out.println(shop.getShopName() + " only has one product.");
    }
  }

  public static void printCheapestProductsForEachShop(List<Shop> listOfShops) {
    for(Shop shop : listOfShops) {

      if(shop.getProducts().size() > 1) {
        System.out.printf("The cheapest product(s) in %s is/are:", shop.getShopName());
        printProductList(shop.getCheapestProducts());
        continue;
      }

      System.out.println(shop.getShopName() + " only has one product.");
    }
  }

  public static void printProductList(List<ShopProduct> productList) {
    for(ShopProduct product : productList) {
      String productName = product.getProductName();
      String productPrice = product.getProductPrice().toString();
      String output = String.format("%s worth %s%s", productName, PESO_ACRONYM, productPrice);
      System.out.println(output);
    }
    System.out.println(); // Insert empty line after printing list
  }
}
