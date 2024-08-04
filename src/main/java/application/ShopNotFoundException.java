package application;

public class ShopNotFoundException extends RuntimeException {

    public ShopNotFoundException(String shopName) {
        super("Shop with name (" + shopName + ") not found.");
    }
}
