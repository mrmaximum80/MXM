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
        double targetTemp;                      // Целевая температура

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
        targetScaleWrite = DegreeScales.write(targetScale);
        System.out.println("Выбрана целевая шкала - шкала " + targetScaleWrite + ".\n");
        targetTemp = degree.convert(initScale, targetScale, initTemp);
        System.out.println(initTemp + " градусов " + initScaleWrite + " равны " + targetTemp + " градусам "
                + targetScaleWrite + ".");
    }
}
