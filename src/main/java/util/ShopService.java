package util;

import model.Shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopService {
    private List<Shop> shops;

    public ShopService() {
        this.shops = new ArrayList<>();
    }

    public void addShop(String shopName) {
        shops.add(new Shop(shopName));
    }

    public List<Shop> getListOfShops() {
        return shops;
    }

    public Optional<Shop> getShopByName(String shopName) {
        return shops.stream()
                .filter(shop -> shop.getShopName().equalsIgnoreCase(shopName))
                .findFirst();
    }
}
