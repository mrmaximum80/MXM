package lesson10.lengthConverter;

import lesson10.lengthConverter.Input;
import lesson10.lengthConverter.inter.Inputable;

public class LengthConverterRunner {

    public static void main(String[] args) {

        Inputable input = new Input();
        LenghtConverner length = new LenghtConverner();
        String initUnit;
        double initLength;

        System.out.println("Введите исходную единицу измерения, для чего нажмите:\n" +
                "m - мили\n" +
                "k - километры");
        initUnit = input.InputString();
        System.out.println("Введите длину в " + Lengths.write(initUnit));

        initLength = input.InputNumber();

        if (initUnit.equals("m")) {
            System.out.println(initLength + " " + Lengths.MILE.getUnit() + " равняется " +
                    length.milesToKm(initLength) + " " + Lengths.KM.getUnit() + ".");
        } else {
            System.out.println(initLength + " " + Lengths.KM.getUnit() + " равняется " +
                    length.kmToMiles(initLength) + " " + Lengths.MILE.getUnit() + ".");
        }
    }
}
