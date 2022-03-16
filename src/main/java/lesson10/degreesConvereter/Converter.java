package lesson10.degreesConvereter;

import lesson10.degreesConvereter.constantEnum.DegreeScales;
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

    /**
     * Метод в зависимости от введеных значений исходной и целевой шкалы запускает соответствующий метод перевода
     *
     * @param initScale   - исходная шкала
     * @param targetScale - целевая шкала
     * @param initTemp    - температура в градусах исходной шкалы
     * @return - возвращает значение температуры в единицах целевой шкалы
     */
    public double convert(String initScale, String targetScale, double initTemp) {
        double targetTemp = 0;
        if (initScale.equals(targetScale)) {
            System.out.println("Конвертировать из шкалы " + DegreeScales.write(initScale) + " в шкалу " +
                    DegreeScales.write(targetScale) + " не очень мудро )");
            return initTemp;
        }
        if (initScale.equals(DegreeScales.CELSIUS.getScanScale())) {
            if (targetScale.equals(DegreeScales.FAHRENHEIT.getScanScale())) {
                targetTemp = celsiusToFahrenheit(initTemp);
            } else {
                targetTemp = celsiusToKelvin(initTemp);
            }
        }
        if (initScale.equals(DegreeScales.FAHRENHEIT.getScanScale())) {
            if (targetScale.equals(DegreeScales.CELSIUS.getScanScale())) {
                targetTemp = fahrenheitToCelsius(initTemp);
            } else {
                targetTemp = fahrenheitToKelvin(initTemp);
            }
        }
        if (initScale.equals(DegreeScales.KELVIN.getScanScale())) {
            if (targetScale.equals(DegreeScales.CELSIUS.getScanScale())) {
                targetTemp = kelvinToCelsius(initTemp);
            } else {
                targetTemp = kelvinToFahrenheit(initTemp);
            }
        }
        return targetTemp;
    }
}
