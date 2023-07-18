import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class ProductPrinter {
    public ProductInfo productInfo = new ProductInfo();
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
        String leastExpensiveProduct = productInfo.getLeastExpensiveProduct(coffeeShop);

        System.out.println(coffeeShop.getShopName() + " -- " + leastExpensiveProduct
                + " -  P " + coffeeShop.getProducts().get(leastExpensiveProduct));
    }

    public void printMostExpensiveProduct(CoffeeShop coffeeShop) {
        String mostExpensiveProduct = productInfo.getMostExpensiveProduct(coffeeShop);

        System.out.println(coffeeShop.getShopName() + " -- " + mostExpensiveProduct
                + " -  P " + coffeeShop.getProducts().get(mostExpensiveProduct));
    }
}
