public class Shop {
    private final String shopName;
    private final Product[] products;

    public Shop(String shopName, Product[] product) {
        this.shopName = shopName;
        this.products = product;
    }

    public String getShopName() {
        return shopName;
    }

    public Product[] getProducts() {
        return  products;
    }

    public Product getMostExpensiveProduct() {
        Product mostExpensive = products[0];
        for (Product product : products) {
            if (product.getProductPrice() > mostExpensive.getProductPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public Product getLeastExpensiveProduct() {
        Product leastExpensive = products[0];
        for (Product product : products) {
            if (product.getProductPrice() < leastExpensive.getProductPrice()) {
                leastExpensive = product;
            }
        }
        return leastExpensive;
    }
}
