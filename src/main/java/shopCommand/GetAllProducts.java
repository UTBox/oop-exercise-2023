package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.List;

public class GetAllProducts implements ProductGetterCommand {
    @Override
    public List<IProduct> get(IShop shop) {
        return shop.getProducts();
    }
}
