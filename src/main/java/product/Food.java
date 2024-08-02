package product;

public class Food implements IProduct {
    private String name;
    private double price;
    private ProductType type;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = ProductType.FOOD;
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
