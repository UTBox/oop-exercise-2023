import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CoffeeBeanTeaLeaf implements CoffeeShop {
    private HashMap<String, Double> shopProducts;
    public CoffeeBeanTeaLeaf() {
        shopProducts = new HashMap<String, Double>();

        shopProducts.put("Americano", 155.00);
        shopProducts.put("Vanilla Latte", 175.00);
        shopProducts.put("Espresso", 125.00);
        shopProducts.put("Cappuccino", 145.00);
        shopProducts.put("Hot Chocolate", 165.00);
    }

    @Override
    public String getShopName() {
        return "The Coffee Bean & Tea Leaf";
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
