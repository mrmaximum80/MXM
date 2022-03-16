package lesson11;

import lesson11.exception.EmergencySpeedingException;
import lesson11.exception.SpeedingException;
import lesson11.exception.WeightDimensionsException;

public class AutomobileRunner {

    public static void main(String[] args) {

        Automobile car1 = new Car();
        Automobile car2 = new Car();
        Automobile car3 = new Car();
        Automobile car4 = new Car();
        Automobile car5 = new Car();
        Automobile car6 = new Car();
        Automobile car7 = new Car();
        Automobile car8 = new Car();
        Automobile car9 = new Car();
        Automobile car10 = new Car();

        Automobile[] cars = new Automobile[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

        System.out.println("Генерация автомобилей:\n--------------------------------------------------------------------------");
        for (Automobile car : cars) {
            car.markGen();
            car.speedGen();
            car.stateNumberGen();
            car.weightGen();
            car.widthGen();
            car.heightGen();
            car.lengthGen();
            System.out.println(car.toString());
        }
        System.out.println("--------------------------------------------------------------------------");

        Automobile truck1 = new Truck();
        Automobile truck2 = new Truck();
        Automobile truck3 = new Truck();
        Automobile truck4 = new Truck();
        Automobile truck5 = new Truck();
        Automobile truck6 = new Truck();
        Automobile truck7 = new Truck();
        Automobile truck8 = new Truck();
        Automobile truck9 = new Truck();
        Automobile truck10 = new Truck();

        Automobile[] trucks = new Automobile[]{truck1, truck2, truck3, truck4, truck5, truck6, truck7, truck8, truck9, truck10};

        for (Automobile truck : trucks) {
            truck.markGen();
            truck.speedGen();
            truck.stateNumberGen();
            truck.weightGen();
            truck.widthGen();
            truck.heightGen();
            truck.lengthGen();
            System.out.println(truck.toString());
        }
        System.out.println("--------------------------------------------------------------------------\n" +
                "Эмуляция проезда автомобилей через КПП\n" +
                "--------------------------------------------------------------------------");

        Automobile[] automobiles = new Automobile[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10,
                truck1, truck2, truck3, truck4, truck5, truck6, truck7, truck8, truck9, truck10};

        for (Automobile auto : automobiles) {
            try {
                auto.speedCheck();
                auto.weightDimensionsCheck();
            } catch (SpeedingException e) {
                System.out.println("ВНИМАНИЕ! Автомобиль " + auto.getMark() + " движется со скоростью более 80 км/ч (" +
                        auto.getSpeed() + " км/ч)! Проед через КПП запрещается!");
            } catch (EmergencySpeedingException e) {
                System.out.println("ВНИМАНИЕ! Автомобиль " + auto.getMark() + ", госномер " + auto.getStateNumber() +
                        " движется со скоростью более 100 км/ч (" + auto.getSpeed() + " км/ч)! " +
                        " Для предотвращения нарушения вызвана полиция!");
            } catch (WeightDimensionsException e) {
                System.out.println("ВНИМАНИЕ! Автомобиль " + auto.getMark() + ", госномер " + auto.getStateNumber() +
                        " не допускается к проезду через КПП, так как его вес / габариты превышают допустимые.");
            }
        }
    }
}
