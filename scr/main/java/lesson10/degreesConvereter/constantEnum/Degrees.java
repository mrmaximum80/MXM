package lesson10.degreesConvereter.constantEnum;

/**
 * В классе перечисляются коэффициенты, необходимые для перевода из одной темперетурной шкалы в другую
 */
public enum Degrees {
    CEL_TO_FAH(5, 9, 32),                       // Цельсий - Фаренгейт
    CEL_TO_KEL(273.15);                  //  Цельсий - Кельвин
//    FAH_TO_KEL(5, 9, 32, 273.15);              //  Фаренгейт - Кельвин. Данные не используются, т.к. для
                                                 // для конвертации последовательно вызываются Цельсий - Фаренгейт и
                                                 // Цельсий - Кельвин. Но на всякий случай пусть будут.
    private double value1;
    private double value2;
    private double value3;
//    private double value4;

    Degrees(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    Degrees(double value1) {
        this.value1 = value1;
    }

//    Degrees(double value1, double value2, double value3, double value4) {
//        this.value1 = value1;
//        this.value2 = value2;
//        this.value3 = value3;
//        this.value4 = value4;
//    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue3() {
        return value3;
    }

//    public double getValue4() {
//        return value4;
//    }
}
