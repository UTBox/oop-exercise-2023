package product;

public class Helmet implements IProduct {
    private String name;
    private double price;
    private ProductType type;

    public Helmet(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = ProductType.HELMET;
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
}
