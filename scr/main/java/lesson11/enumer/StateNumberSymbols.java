package lesson11.enumer;

/**
 * Перечесление всех возможных символов в номерах российских автомобилей
 */
public enum StateNumberSymbols {

    А("А"), В("В"), Е("Е"), К("К"), М("М"), Н("Н"), О("О"), Р("Р"), С("С"), Т("Т"), У("У"), Х("Х");

    String symbol;

    StateNumberSymbols(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Метод возвращает случайный символ из списка
     *
     * @return - символ
     */
    public static String getSymbol() {
        StateNumberSymbols[] symbols = StateNumberSymbols.values();
        return symbols[(int) (Math.random() * symbols.length)].symbol;
    }
}

