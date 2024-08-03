import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private List<Shop> shops;

    public ShopService() {
        this.shops = new ArrayList<>();
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void removeShop(String shopName) {
        shops.removeIf(shop -> shop.getShopName().equalsIgnoreCase(shopName));
    }

    public List<Shop> getListOfShops() {
        return shops;
    }
}
