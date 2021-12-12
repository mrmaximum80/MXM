package lesson10.degreesConvereter;

import lesson10.degreesConvereter.constantEnum.DegreeScales;
import lesson10.degreesConvereter.inter.Inputable;

public class ConverterRunner {

    public static void main(String[] args) {

        Inputable input = new Input();
        Converter degree = new Converter();
        String initScale;                       // Символ для выбора исходной шкалы
        String targetScale;                     // Символ для выбора целевой шкалы
        String initScaleWrite;                  // Название исходной шкалы
        String targetScaleWrite;                // Название целевой шкалы
        double initTemp;                        // Исходная температура
        double targetTemp = 0;                  // Целевая температура

        System.out.println("Введите исходную температурную шкалу, для чего нажмите:\n" +
                "c - шкала Цельсия\n" +
                "k - шкала Кельвина\n" +
                "f - шкала Фаренгейта");
        initScale = input.InputString();
        initScaleWrite = DegreeScales.write(initScale);
        System.out.println("Выбрана исходная шкала - шкала " + initScaleWrite + ".\n");
        System.out.println("Введите температуру в градусах " + initScaleWrite + ":");
        initTemp = input.InputNumber();
        System.out.println("");
        System.out.println("Введите целевую температурную шкалу, для чего нажмите:\n" +
                "c - шкала Цельсия\n" +
                "k - шкала Кельвина\n" +
                "f - шкала Фаренгейта");

        targetScale = input.InputString();
        if (initScale.equals(targetScale)) {
            System.out.println("Конвертировать из шкалы " + initScaleWrite + " в шкалу " + initScaleWrite + " не очень мудро )");
            return;
        }
        targetScaleWrite = DegreeScales.write(targetScale);
        System.out.println("Выбрана целевая шкала - шкала " + targetScaleWrite + ".\n");
        if (initScale.equals(DegreeScales.CELSIUS.getScanScale())) {
            if (targetScale.equals(DegreeScales.FAHRENHEIT.getScanScale())) {
                targetTemp = degree.celsiusToFahrenheit(initTemp);
            } else {
                targetTemp = degree.celsiusToKelvin(initTemp);
            }
        }
        if (initScale.equals(DegreeScales.FAHRENHEIT.getScanScale())) {
            if (targetScale.equals(DegreeScales.CELSIUS.getScanScale())) {
                targetTemp = degree.fahrenheitToCelsius(initTemp);
            } else {
                targetTemp = degree.fahrenheitToKelvin(initTemp);
            }
        }
        if (initScale.equals(DegreeScales.KELVIN.getScanScale())) {
            if (targetScale.equals(DegreeScales.CELSIUS.getScanScale())) {
                targetTemp = degree.kelvinToCelsius(initTemp);
            } else {
                targetTemp = degree.kelvinToFahrenheit(initTemp);
            }
        }
        System.out.println(initTemp + " градусов " + initScaleWrite + " равны " + targetTemp + " градусам "
                + targetScaleWrite + ".");
    }
}
