import java.util.*;
public class Shop {

    private String name;
    private Map<String, Double> products;

    public Shop(String name) {
        this.name = name;
        this.products = new HashMap<>();
    }

    public void addProduct(String productName, double price) {
        products.put(productName, price);
    }

    public void printProducts() {
        System.out.println("Products in " + name + ":");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String productName = entry.getKey();
            double price = entry.getValue();
            System.out.println(productName + ": P" + price);
        }
        System.out.println();
    }

    public void printMostExpensiveProduct() {
        double maxPrice = Double.MIN_VALUE;
        String maxProduct = "";

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            double price = entry.getValue();
            if (price > maxPrice) {
                maxPrice = price;
                maxProduct = entry.getKey();
            }
        }

        System.out.println("Most expensive product in " + name + ": " + maxProduct + " (P" + maxPrice + ")");
    }

    public void printLeastExpensiveProduct() {
        double minPrice = Double.MAX_VALUE;
        String minProduct = "";

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            double price = entry.getValue();
            if (price < minPrice) {
                minPrice = price;
                minProduct = entry.getKey();
            }
        }

        System.out.println("Least expensive product in " + name + ": " + minProduct + " (P" + minPrice + ")");
    }

}
