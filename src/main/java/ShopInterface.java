import java.util.List;

public interface ShopInterface {
    public void addProduct(ShopProduct product);
    public void removeProduct(String productName);
    public List<ShopProduct> getProducts();
    public List<ShopProduct> getMostExpensiveProducts();
    public List<ShopProduct> getCheapestProducts();
}
