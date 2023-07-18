import java.util.HashMap;

public interface CoffeeShop {
    public String getShopName();
    public HashMap<String, Double> getProducts();
    public void addShopProduct(String productName, Double productPrice);
}
