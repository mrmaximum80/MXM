package lesson10.lengthConverter;

import lesson10.lengthConverter.inter.MilesToKmConvertable;

public class LenghtConverner implements MilesToKmConvertable {

    @Override
    public double milesToKm(double miles) {
        return Math.round(miles * Lengths.MILE_TO_KM.getValue() * 100) / 100d;
    }

    @Override
    public double kmToMiles(double km) {
        return Math.round(km / Lengths.MILE_TO_KM.getValue() * 100) / 100d;
    }

    /**
     * Метод в зависимости от введеной единицы измерения запускает метод либо перевода из милей в км, либо
     * из км в мили, после чего выводит результат в консоль
     *
     * @param initUnit   - исходная единица измерения
     * @param initLength - исходная длина
     */
    public void convert(String initUnit, double initLength) {
        if (initUnit.equals("m")) {
            System.out.println(initLength + " " + Lengths.MILE.getUnit() + " равняется " +
                    milesToKm(initLength) + " " + Lengths.KM.getUnit() + ".");
        } else {
            System.out.println(initLength + " " + Lengths.KM.getUnit() + " равняется " +
                    kmToMiles(initLength) + " " + Lengths.MILE.getUnit() + ".");
        }
    }
}
