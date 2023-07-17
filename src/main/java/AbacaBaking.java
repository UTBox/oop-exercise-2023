import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AbacaBaking implements CoffeeShop{
    private HashMap<String, Double> shopProducts;
    private ArrayList<String> productNameList;
    private ArrayList<Double> productPriceList;

    public AbacaBaking() {
        shopProducts = new HashMap<String, Double>();

        shopProducts.put("Americano", 125.00);
        shopProducts.put("Vanilla Latte", 175.00);
        shopProducts.put("Espresso", 110.00);
        shopProducts.put("Cappuccino", 145.00);
        shopProducts.put("Hot Chocolate", 125.00);
    }

    @Override
    public String getShopName() {
        return "Abaca Baking Company";
    }

    @Override
    public HashMap<String, Double> getProducts() {
        return this.shopProducts;
    }

    @Override
    public String getLeastExpensiveProduct() {
        productNameList = new ArrayList<>(getProducts().keySet());
        productPriceList = new ArrayList<>(getProducts().values());

        double minPrice = Collections.min(productPriceList);
        int minPriceIndex = productPriceList.indexOf(minPrice);

        return productNameList.get(minPriceIndex);
    }

    @Override
    public String getMostExpensiveProduct() {
        productNameList = new ArrayList<>(getProducts().keySet());
        productPriceList = new ArrayList<>(getProducts().values());

        double maxPrice = Collections.max(productPriceList);
        int maxPriceIndex = productPriceList.indexOf(maxPrice);

        return productNameList.get(maxPriceIndex);
    }

    @Override
    public void addShopProduct(String productName, Double productPrice) {
        this.shopProducts.put(productName, productPrice);
    }
}
