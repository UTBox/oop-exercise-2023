import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopInterface {
    private String shopName;
    private List<ShopProduct> products;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.products = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public void addProduct(ShopProduct product) {
        products.add(product);
    }

    @Override
    public void removeProduct(String productName) {
        products.removeIf(product -> product.getProductName().equalsIgnoreCase(productName));
    }

    @Override
    public List<ShopProduct> getProducts() {
        return products;
    }

    @Override
    public ShopProduct getMostExpensiveProduct() {
        return null;
    }

    @Override
    public ShopProduct getCheapestProduct() {
        return null;
    }
}
