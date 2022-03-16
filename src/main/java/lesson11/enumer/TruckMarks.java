package lesson11.enumer;

/**
 * Перечесление марок грузовых автомобилей
 */
public enum TruckMarks {

    MAZ("МАЗ"),
    KAMAZ("КАМАЗ"),
    BELAZ("БЕЛАЗ"),
    FAW("FAW"),
    MAN("MAN"),
    FOTON("FOTON"),
    URAL("УРАЛ");

    String mark;

    TruckMarks(String mark) {
        this.mark = mark;
    }

    /**
     * Метот возвращает случайную марку автомобиля из списка
     *
     * @return - марка автомобиля
     */
    public static String getMark() {
        TruckMarks[] truckMarks = TruckMarks.values();
        return truckMarks[(int) (Math.random() * truckMarks.length)].mark;
    }
}
