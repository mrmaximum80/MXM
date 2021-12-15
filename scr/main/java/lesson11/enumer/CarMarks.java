package lesson11.enumer;

/**
 * Перечесление марок легковых автомобилей
 */
public enum CarMarks {

    LADA("Лада"),
    AUDI("Ауди"),
    BMW("БМВ"),
    SCODA("Шкода"),
    TOYOTA("Тойота"),
    MAZDA("Мазда"),
    NISSAN("Ниссан");

    String mark;

    CarMarks(String mark) {
        this.mark = mark;
    }

    /**
     * Метот возвращает случайную марку автомобиля из списка
     *
     * @return - марка автомобиля
     */
    public static String getMark() {
        CarMarks[] carMarks = CarMarks.values();
        return carMarks[(int) (Math.random() * carMarks.length)].mark;
    }
}
