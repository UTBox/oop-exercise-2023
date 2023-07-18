public class Product implements IProduct{
    private final String productName;
    private final double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public Product[] getProducts() {
        return new Product[] {this};
    }

    @Override
    public Product getMostExpensive() {
        return this;
    }

    @Override
    public Product getLessExpensive() {
        return this;
    }
}
