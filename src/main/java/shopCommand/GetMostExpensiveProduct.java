package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetMostExpensiveProduct implements ProductGetterCommand {

    @Override
    public List<IProduct> get(IShop shop) {
        List<IProduct> products = shop.getProducts();
        double maxPrice = products.stream()
                .mapToDouble(IProduct::getPrice)
                .max()
                .orElse(0);

        return products.stream()
                .filter(product -> product.getPrice() == maxPrice)
                .collect(Collectors.toList());
    }
}
