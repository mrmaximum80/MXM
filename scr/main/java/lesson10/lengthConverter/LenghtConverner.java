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
}
