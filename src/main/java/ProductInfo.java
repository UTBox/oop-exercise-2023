import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ProductInfo {
    public String getLeastExpensiveProduct(CoffeeShop coffeeShop) {
        ArrayList<String> productNameList = new ArrayList<>(coffeeShop.getProducts().keySet());
        ArrayList<Double> productPriceList = new ArrayList<>(coffeeShop.getProducts().values());

        double minPrice = Collections.min(productPriceList);
        int minPriceIndex = productPriceList.indexOf(minPrice);

        return productNameList.get(minPriceIndex);
    }
    public String getMostExpensiveProduct(CoffeeShop coffeeShop) {
        ArrayList<String> productNameList = new ArrayList<>(coffeeShop.getProducts().keySet());
        ArrayList<Double> productPriceList = new ArrayList<>(coffeeShop.getProducts().values());

        double maxPrice = Collections.max(productPriceList);
        int maxPriceIndex = productPriceList.indexOf(maxPrice);

        return productNameList.get(maxPriceIndex);
    }
}
