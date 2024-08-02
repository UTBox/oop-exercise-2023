package product;

public class Appliance implements IProduct {
    private String name;
    private double price;
    private ProductType type;

    public Appliance(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = ProductType.APPLIANCE;
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
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return this.type.getName() + "\t | \t" + this.name + "\t | \t" + this.price;
    }
}
