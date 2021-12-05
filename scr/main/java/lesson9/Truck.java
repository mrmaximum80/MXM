package lesson9;

public class Truck extends Automobile{

    public Truck (String brand, String model, String color) {
        super (brand, model , color);
    }
    private static final int MAX_DISTANCE = 1200;

    @Override
    public final void move(int distance) {
        if (distance < MAX_DISTANCE) {
            System.out.println(getColor() + " грузовой автомобиль " + getBrand() + " " + getModel() + " проехал " + distance + " км без дозаправки.\n");
        } else {
            System.out.println(getColor() + " грузовой автомобиль " + getBrand() + " " + getModel() + " проехал " + MAX_DISTANCE + " км.");
            System.out.println("После этого пришлось заехать на АЗС, так как закончился бензин, а оставалось проехать еще "
                    + (distance - MAX_DISTANCE) + " км.\n");
        }
    }
}
