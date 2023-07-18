import java.util.HashMap;
import java.util.Map;

public class Shop {
    private String Shop_name;
    private Map<String, Product> products;

    public Shop(String Shop_name){
        this.Shop_name = Shop_name;
        this.products= new HashMap<>();
    }
    public String getShop_name(){
        return Shop_name;
    }

    public void addProduct(String productName, double price){
        Product product = new Product(productName, price);
        products.put(productName, product);
    }
    public Map<String, Product> getProducts(){
        return products;
    }

    public Product getMostExpensiveProduct(){
        Product mostExpensiveProduct = null;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : products.values()){
            if (product.getPrice() > maxPrice){
                maxPrice = product.getPrice();
                mostExpensiveProduct = product;
            }
        }

        return mostExpensiveProduct;
    }

    public Product getMostLessExpensiveProduct(){
        Product mostLeastExpensiveProduct = null;
        double minPrice = Double.MAX_VALUE;

        for (Product product : products.values()){
            if (product.getPrice() < minPrice){
                minPrice = product.getPrice();
                mostLeastExpensiveProduct = product;
            }
        }

        return mostLeastExpensiveProduct;
    }
}
