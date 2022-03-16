package lesson9;

public abstract class Automobile {

    protected String brand;
    private String model;
    private String color;

    public Automobile(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public abstract void move(int distance);
}



