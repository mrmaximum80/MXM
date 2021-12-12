package lesson10.degreesConvereter.inter;

/**
 * Объявляются методы для перевода из шкалы Фаренгейта в шкалу Кельвина и обратно
 */
public interface FahToKelConvertable {

    double fahrenheitToKelvin(double degree);

    double kelvinToFahrenheit(double degree);
}
