package lesson10.degreesConvereter.constantEnum;

/**
 * В классе перечисляются клавиши, по которым производится выбор соответствующей шкалы,
 * а также названия шкал
 */
public enum DegreeScales {

    CELSIUS("c", "Цельсия"),
    FAHRENHEIT("f", "Фаренгейта"),
    KELVIN("k", "Кельвина");

    String scanScale;
    String scale;

    DegreeScales(String scanScale, String scale) {
        this.scanScale = scanScale;
        this.scale = scale;
    }

    public String getScanScale() {
        return scanScale;
    }

    public String getScale() {
        return scale;
    }

    public static String write(String sc) {
        if (CELSIUS.scanScale.equalsIgnoreCase(sc)) {
            return (CELSIUS.scale);
        }
        if (FAHRENHEIT.scanScale.equalsIgnoreCase(sc)) {
            return (FAHRENHEIT.scale);
        }
        if (KELVIN.scanScale.equalsIgnoreCase(sc)) {
            return (KELVIN.scale);
        }
        return "";
    }
}