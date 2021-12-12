package lesson10.degreesConvereter.inter;

/**
 * Объявляются методы для перевода из шкалы Цельсия в шкалу Фаренгейта и обратно
 */
public interface CelToFahConvertable {

    double celsiusToFahrenheit(double degree);

    double fahrenheitToCelsius(double degree);
}
