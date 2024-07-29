import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GadgetShop implements Shop {
    List<Product> productList = new ArrayList<Product>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void printAllProducts() {
        productList.forEach(product -> System.out.println(product));
    }

    @Override
    public void printMostExpensiveProduct() {
        productList.stream()
                .max(Comparator.comparing(product -> product.getPrice()))
                .ifPresent(product -> System.out.println(product));
    }

    @Override
    public void printLeastExpensiveProduct() {
        productList.stream()
                .min(Comparator.comparing(product -> product.getPrice()))
                .ifPresent(product -> System.out.println(product));
    }
}
