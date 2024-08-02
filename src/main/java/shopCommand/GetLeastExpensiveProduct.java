package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.Comparator;
import java.util.List;

public class GetLeastExpensiveProduct implements ProductGetterCommand {

    @Override
    public List<IProduct> get(IShop shop) {
        List<IProduct> products = shop.getProducts();
        return products.stream()
                .min(Comparator.comparingDouble(IProduct::getPrice))
                .map(List::of)
                .orElse(List.of());
    }
}
