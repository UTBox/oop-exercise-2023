package shopCommand;

import product.IProduct;
import shop.IShop;

import java.util.List;

public interface ProductGetterCommand {
    public List<IProduct> get(IShop shop);
}
