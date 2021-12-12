package lesson10.degreesConvereter;

import lesson10.degreesConvereter.constantEnum.Degrees;
import lesson10.degreesConvereter.inter.CelToFahConvertable;
import lesson10.degreesConvereter.inter.CelToKelConvertable;
import lesson10.degreesConvereter.inter.FahToKelConvertable;

public class Converter implements CelToFahConvertable, CelToKelConvertable, FahToKelConvertable {


    @Override
    public double celsiusToFahrenheit(double degree) {
        return (Degrees.CEL_TO_FAH.getValue2() / Degrees.CEL_TO_FAH.getValue1() * degree
                + Degrees.CEL_TO_FAH.getValue3());
    }

    @Override
    public double fahrenheitToCelsius(double degree) {
        return (Degrees.CEL_TO_FAH.getValue1() / Degrees.CEL_TO_FAH.getValue2() *
                (degree - Degrees.CEL_TO_FAH.getValue3()));
    }

    @Override
    public double celsiusToKelvin(double degree) {
        return (degree + Degrees.CEL_TO_KEL.getValue1());
    }

    @Override
    public double kelvinToCelsius(double degree) {
        return degree - Degrees.CEL_TO_KEL.getValue1();
    }

    @Override
    public double fahrenheitToKelvin(double degree) {
        return celsiusToKelvin(fahrenheitToCelsius(degree));
    }

    @Override
    public double kelvinToFahrenheit(double degree) {
        return celsiusToFahrenheit(kelvinToCelsius(degree));
    }
}
