package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetLeastExpensiveProduct implements ProductGetterCommand {

    @Override
    public List<IProduct> get(IShop shop) {
        List<IProduct> products = shop.getProducts();
        double maxPrice = products.stream()
                .mapToDouble(IProduct::getPrice)
                .min()
                .orElse(0);

        return products.stream()
                .filter(product -> product.getPrice() == maxPrice)
                .collect(Collectors.toList());
    }
}
