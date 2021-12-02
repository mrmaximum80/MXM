package lesson9;

public class Automobile  {

    protected String brand;
    private String model;
    private String color;
    private int MAX_DISTANCE;

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

    public void move (int distance) {
        }
}



