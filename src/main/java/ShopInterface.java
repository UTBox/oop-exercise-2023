import java.util.List;

public interface ShopInterface {
    public void addProduct(ShopProduct product);
    public void removeProduct(String productName);
    public List<ShopProduct> getProducts();
    public ShopProduct getMostExpensiveProduct();
    public ShopProduct getCheapestProduct();
}
