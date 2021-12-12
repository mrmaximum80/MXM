package lesson10.degreesConvereter.inter;

/**
 * Объявляются методы для перевода из шкалы Цельсия в шкалу Кельвина и обратно
 */
public interface CelToKelConvertable {

    double celsiusToKelvin(double degree);

    double kelvinToCelsius(double degree);
}
