package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetMostExpensiveProduct implements ProductGetterCommand {

    @Override
    public List<IProduct> get(IShop shop) {
        List<IProduct> products = shop.getProducts();
        return products.stream()
                .max(Comparator.comparingDouble(IProduct::getPrice))
                .map(List::of)
                .orElse(List.of());
    }
}
