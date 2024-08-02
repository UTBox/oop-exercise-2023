package shop;

import java.util.List;
import product.IProduct;
import shop.*;

public interface IShop {
    public void setName(String name);
    public String getName();
    public void setType(ShopType type);
    public ShopType getType();
    public void setProducts(List<IProduct> products);
    public void addProduct(IProduct product);
    public List<IProduct> getProducts();
}

