package lesson10.lengthConverter;

/**
 * В классе перечисляются клавиши, по которым производится выбор соответствующей единицы измерения,
 * сокращенные названия единиц измерений, а также коэффициент для конвертации
 */
public enum Lengths {

    MILE("m", "ми"),
    KM("k", "км"),
    MILE_TO_KM(1.61);

    String key;
    String unit;
    double value;

    Lengths(String key, String unit) {
        this.key = key;
        this.unit = unit;
    }

    Lengths(double value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public static String write(String sc) {
        if (KM.key.equalsIgnoreCase(sc)) {
            return KM.unit;
        }
        if (MILE.key.equalsIgnoreCase(sc)) {
            return MILE.unit;
        }
        return "";
    }
}
