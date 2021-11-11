package lesson4;

import java.util.Scanner;

public class SquareRootWhile {

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        double result = squareRootWhile(value);
        if (result * result == (double) value) {
            System.out.println("Квадратный корень из числа " + value + " равен " + (int) result);    // int, для того чтобы корень из 4
            // был равен 2, а не 2.0, раз целый квадрат
        } else {
            String resultMin = String.format("%.2f", result - .01);                                    //  Просто нагуглил, чтобы много знаков после запятой
            String resultMax = String.format("%.2f", result);                                        //  не выводить, может можно проще.
            System.out.println("Квадратный корень из числа " + value + " больше " + resultMin + " и меньше " + resultMax);
        }
    }

    /**
     * Метод возвращет целочисленный квадратный корень (для случая, когда аргумент является полным квадратом)
     * либо ближайшее большее к нему число с точностью до второго знака после запятой
     *
     * @param arg аргумент, из которого извлекается квадратный корень
     * @return возвращает результат извлечения корня
     */
    public static double squareRootWhile(int arg) {
        double result = 1.0d;
        while (result * result < (double) arg) {
            result++;
        }
        if (result * result == (double) arg) {      //  Если вдруг так совпало, что arg точный квадрат, дальше продолжать смысла нет
            return (int) result;
        }
        result--;
        while (result * result < (double) arg) {    //  В противном случае подбираем сначала до десятых
            result = result + 0.1d;
        }
        result = result - 0.1d;
        while (result * result < (double) arg) {     //  Потом до сотых
            result = result + 0.01d;
        }
        return result;
    }
}
