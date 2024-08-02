package product;

public enum ProductType {
    FOOD("Food"),
    APPLIANCE("Appliance"),
    HELMET("Helmet");

    private final String name;

    ProductType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
