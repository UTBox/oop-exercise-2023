package shop;

public enum ShopType {
    RESTAURANT("Restaurant"),
    APPLIANCE_CENTER("Appliance Center"),
    HELMET_SHOP("Helmet Shop");

    private final String name;

    ShopType(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
