public class ShopProducts implements IProduct{
    private Product[] products;

    public ShopProducts(Product[] products) {
        this.products = products;
    }
    @Override
    public Product[] getProducts() {
        return products;
    }

    @Override
    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = products[0];
        for (int i = 1; i < products.length; i++){
            if (products[i].getProductPrice() > mostExpensiveProduct.getProductPrice()) {
                mostExpensiveProduct = products[i];
            }
        }
        return mostExpensiveProduct;
    }

    @Override
    public Product getLeastExpensiveProduct() {
        Product leastExpensiveProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getProductPrice() < leastExpensiveProduct.getProductPrice()) {
                leastExpensiveProduct = products[i];
            }
        }
        return leastExpensiveProduct;
    }
}
