public class Shop {
    private final String shopName;
    private final IProduct product;

    public Shop(String shopName, IProduct products) {
        this.shopName = shopName;
        this.product = products;
    }

    public String getShopName() {
        return shopName;
    }

    public IProduct getProducts() {
        return  product;
    }
}
