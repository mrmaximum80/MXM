package lesson4;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int result = squareRoot(value);
        if (result * result == value) {
            System.out.println("Квадратный корень из числа " + value + " равен " + result);
        } else {
            System.out.println("Квадратный корень из числа " + value + " больше " + (result - 1) + " и меньше "+ result);
        }
    }

    /**
     * Метод возвращет целочисленный квадратный корень (для случая, когда аргумент является полным квадратом)
     * либо ближайшее большее к нему целое число
     * @param arg   аргумент, из которого извлекается квадратный корень
     * @return
     */
    public static int squareRoot(int arg) {
        int result = 1;
        for (;result * result < arg; result++) {
        }
        return result;
    }
}