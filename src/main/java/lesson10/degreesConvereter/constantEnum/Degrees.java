package lesson10.degreesConvereter.constantEnum;

/**
 * В классе перечисляются коэффициенты, необходимые для перевода из одной темперетурной шкалы в другую
 */
public enum Degrees {
    CEL_TO_FAH(5, 9, 32),                       // Цельсий - Фаренгейт
    CEL_TO_KEL(273.15);                  //  Цельсий - Кельвин

    private double value1;
    private double value2;
    private double value3;

    Degrees(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    Degrees(double value1) {
        this.value1 = value1;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue3() {
        return value3;
    }
}
