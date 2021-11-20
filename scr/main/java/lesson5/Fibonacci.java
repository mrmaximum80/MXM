package lesson5;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Введите номер члена последовательности Фибоначчи.");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается целое положительное значение, а Вы вввели " + text);
        }
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Номер члена последовательности должен быть больше 0!");
        } else {
            System.out.println("Значение " + number + "-го члена последовательности Фибоначчи равно " + fibonacci(number));
        }
    }

    /**
     * Метод выполняет расчет числа Фибоначчи по его номеру в последовательности.
     *
     * @param number - номер искомого числа в последовательности.
     * @return - возвращает искомое число.
     */
    public static int fibonacci(int number) {
        switch (number) {
            case 1:
                return 0;           //  Первые два числа ряда являются исходными данными для расчета последующих чисел,
            case 2:
                return 1;           //  поэтому возвращаются без расчетов.

            default: {              //  Начиная с 3-го числа выполоняется расчет, как суммы двух предыдущих чисел ряда.
                int member = 0;
                int nextmember = 1;
                for (int count = 3; count <= number; count++) {
                    int summ = member + nextmember;                 //  Рассчитываем след. член, как сумму предыдущих
                    member = nextmember;                            //  Переприсваиваем значения для следующей
                    nextmember = summ;                              //  итерации
                }
                return nextmember;
            }
        }
    }
}
