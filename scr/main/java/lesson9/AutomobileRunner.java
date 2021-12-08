package lesson9;

public class AutomobileRunner {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "Kalina", "Красный");
        Car audi = new Car("Audi", "A6", "Черный");
        Car bmw = new Car("BMW", "X6", "Синий");
        Car nissan = new Car("Nissan", "Murano", "Белый");
        Car haval = new Car("Haval", "F7x", "Коричневый");

        Truck kamaz = new Truck("КамАЗ", "54901", "Белый");
        Truck belaz = new Truck("БелАЗ", "75320", "Желтый");
        Truck maz = new Truck("МАЗ", "5440М9", "Серый");
        Truck man = new Truck("MAN", "TGS 6x6", "Черный");
        Truck foton = new Truck("Foton H5", "Auman", "Белый");

        Automobile[] automobiles = new Automobile[]{lada, audi, bmw, nissan, haval, kamaz, belaz, maz, man, foton};

        for (Automobile auto : automobiles) {
            auto.move((int) (Math.random() * 1000));
        }
    }
}
