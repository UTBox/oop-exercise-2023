import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class ProductPrinter {
    public void printProducts(CoffeeShop coffeeShop) {
        HashMap<String, Double> productHashMap = coffeeShop.getProducts();
        String[] productNames = productHashMap.keySet().toArray(new String[0]);

        System.out.println("----- " + coffeeShop.getShopName() + " -----");
        for (String productKey: productNames) {
            System.out.print(productKey + " -  P ");
            System.out.println(productHashMap.get(productKey));
        }
        System.out.println("-------------------------");
    }

    public void printLeastExpensiveProduct(CoffeeShop coffeeShop) {
        System.out.println(coffeeShop.getShopName() + " -- " +
                coffeeShop.getLeastExpensiveProduct() + " -  P " +
                coffeeShop.getProducts().get(coffeeShop.getLeastExpensiveProduct()));
    }

    public void printMostExpensiveProduct(CoffeeShop coffeeShop) {
        System.out.println(coffeeShop.getShopName() + " -- " +
                coffeeShop.getMostExpensiveProduct() + " -  P " +
                coffeeShop.getProducts().get(coffeeShop.getMostExpensiveProduct()));
    }
}
