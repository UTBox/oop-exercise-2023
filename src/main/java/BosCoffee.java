import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BosCoffee implements CoffeeShop{
    private HashMap<String, Double> shopProducts;

    public BosCoffee() {
        shopProducts = new HashMap<String, Double>();

        shopProducts.put("Americano", 125.00);
        shopProducts.put("Vanilla Latte", 160.00);
        shopProducts.put("Espresso", 120.00);
        shopProducts.put("Cappuccino", 135.00);
        shopProducts.put("Hot Chocolate", 145.00);
    }

    @Override
    public String getShopName() {
        return "Bo's Coffee";
    }

    @Override
    public HashMap<String, Double> getProducts() {
        return this.shopProducts;
    }

    @Override
    public void addShopProduct(String productName, Double productPrice) {
        this.shopProducts.put(productName, productPrice);
    }
}
