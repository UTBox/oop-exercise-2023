package shop;

import java.util.ArrayList;
import java.util.List;

import product.IProduct;
import shop.*;

public class Restaurant implements IShop{

    private String name;
    private ShopType type;
    private List<IProduct> products;

    public Restaurant(String name) {
        this.name = name;
        this.type = ShopType.RESTAURANT;
        this.products = new ArrayList<IProduct>();
    }

    public Restaurant(String name, List<IProduct> products) {
        this.name = name;
        this.type = ShopType.RESTAURANT;
        this.products = products;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setType(ShopType type) {
        this.type = type;
    }

    @Override
    public ShopType getType() {
        return this.type;
    }

    @Override
    public void setProducts(List<IProduct> products) {
        this.products = products;
    }

    @Override
    public void addProduct(IProduct product) {
        this.products.add(product);
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }
}
