package util;

import model.Shop;
import model.ShopProduct;

import java.math.BigDecimal;
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

    public void removeShop(String shopName) {
        shops.removeIf(shop -> shop.getShopName().equalsIgnoreCase(shopName));
    }

    public List<Shop> getListOfShops() {
        return shops;
    }

    public Optional<Shop> getShopByName(String shopName) {
        return shops.stream()
                .filter(shop -> shop.getShopName().equalsIgnoreCase(shopName))
                .findFirst();
    }

    public void addProductToShop(String shopName, String productName, BigDecimal price) throws Exception {
        if (!isShopExisting(shopName)) {
            throw new Exception("Shop not found.");
        }
        Shop shop = getShopByName(shopName).get();
        shop.addProduct(new ShopProduct(productName, price));
    }

    public boolean isShopExisting(String shopName) {
        return getShopByName(shopName).isPresent();
    }
}
