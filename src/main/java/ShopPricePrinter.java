import java.sql.SQLOutput;

public class ShopPricePrinter {

  public static void main(String[] args) {
    CoffeeShop coffeeBeanTeaLeaf = new CoffeeBeanTeaLeaf();
    CoffeeShop abacaBaking = new AbacaBaking();
    CoffeeShop bosCoffee = new BosCoffee();
    ProductPrinter menu = new ProductPrinter();

    menu.printProducts(coffeeBeanTeaLeaf);
    menu.printProducts(abacaBaking);
    menu.printProducts(bosCoffee);

    System.out.println("----- Most Expensive Products -----");
    menu.printMostExpensiveProduct(coffeeBeanTeaLeaf);
    menu.printMostExpensiveProduct(abacaBaking);
    menu.printMostExpensiveProduct(bosCoffee);
    System.out.println("-----------------------------------");

    System.out.println("----- Least Expensive Products -----");
    menu.printLeastExpensiveProduct(coffeeBeanTeaLeaf);
    menu.printLeastExpensiveProduct(abacaBaking);
    menu.printLeastExpensiveProduct(bosCoffee);
    System.out.println("-----------------------------------");

  }
}
