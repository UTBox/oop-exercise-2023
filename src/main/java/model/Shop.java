package model;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Shop implements ShopInterface {
    private String shopName;
    private List<ShopProduct> products;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public Shop(String shopName, List<ShopProduct> products) {
        this.shopName = shopName;
        this.products = products;
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
    public List<ShopProduct> getMostExpensiveProducts() {
        BigDecimal highestPrice = products.stream()
                .map(ShopProduct::getProductPrice)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);

        return products.stream()
                .filter(product -> product.getProductPrice().compareTo(highestPrice) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<ShopProduct> getCheapestProducts() {
        BigDecimal minPrice = products.stream()
                .map(ShopProduct::getProductPrice)
                .min(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);

        return products.stream()
                .filter(product -> product.getProductPrice().compareTo(minPrice) == 0)
                .collect(Collectors.toList());
    }
}
