package lesson10.lengthConverter;

import lesson10.lengthConverter.inter.Inputable;

import java.util.Scanner;

public class Input implements Inputable {

    /**
     * Метод циклически обрабатывает ввод с клавиатуры до тех пор, пока не будет введено число
     *
     * @return - возвращает введеное число
     */
    @Override
    public double InputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String text = scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }

    /**
     * Метод циклически обрабатывает ввод с клавиатуры до тех пор, пока не будет введено "m" или "k"
     *
     * @return - возвращает введеный символ в нижнем регистре
     */
    @Override
    public String InputString() {
        Scanner scanner = new Scanner(System.in);
        String key;
        do {
            key = scanner.next();
        }
        while (!("m".equalsIgnoreCase(key) || "k".equalsIgnoreCase(key)));
        return key.toLowerCase();
    }
}
