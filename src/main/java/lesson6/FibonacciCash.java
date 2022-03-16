package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciCash {

    public static void main(String[] args) {
        //  Объявляем массив для промежуточного кэша, диапазон int позволяет выполнить расчет максимум 46-го члена
        int[] cash = new int[47];
        //  Максимальный текущий номер, до которого уже выполнен расчет ряда. Изначально это 1, так как расчетов еще не было
        int maxMemberNumber = 1;
        //  Присваиваем первому члену ряда значение 1, 0-му члену уже присвоен0 при объявлении массива.
        //  Это будут исходные данные для расчета.
        cash[1] = 1;
        //  Объявляем переменную для номера члена ряда.
        int number = 1;

        //  Повторяем цикл, пока введенный номер находится нужном интервале от 0 до 46
        while (number >= 0 && number <= 46) {
            System.out.println("Введите номер члена последовательности Фибоначчи в интервале от 0 до 46 включительно для расчета числа.");
            System.out.println("Для окончания расчета введите любое число вне этого интервала.");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                String text = scanner.next();
                System.out.println("Ожидается целое значение, а Вы вввели " + text);
            }
            number = scanner.nextInt();

            //  если член последовательности еще не расчитан, выполняем расчет от последнего рассчитанного члена до текущего
            if (number > maxMemberNumber && number < 47) {
                calculationCash(number, maxMemberNumber, cash);
                maxMemberNumber = number;
                System.out.println("Значение " + number + "-го члена последовательности Фибоначчи равно " + cash[number] + ".");
                System.out.println("---------------------------------------------------------");
            }

            //  если член уже рассчитан, просто выводим значение из массива
            if (number < maxMemberNumber && number >= 0) {
                System.out.println("Значение " + number + "-го члена последовательности Фибоначчи равно " + cash[number] + ".");
                System.out.println("---------------------------------------------------------");
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("Итоговое значение массива на основании произведенных расчетов до " + maxMemberNumber + "-го члена последовательности Фибоначчи:");
        System.out.println(Arrays.toString(cash));
    }

    /**
     * Метод выполняет расчет членов последовательности Фибоначчи от последнего рассчитаного члена до текущего и
     * сохраняет результаты в массиве
     *
     * @param number          - текущее введенное значение номера члена последовательности, требующее расчета
     * @param maxMemberNumber - номер последнего рассчитанного члена последовательности
     * @param cash            - итоговый массив для сохранения рассчитанных значений
     */
    public static void calculationCash(int number, int maxMemberNumber, int[] cash) {
        //  Берем два последних рассчитанных члена последовательности и на основании их суммы рассчитываем
        //  следующие члены до достижения целевого номера
        for (int count = maxMemberNumber + 1; count <= number; count++) {
            cash[count] = cash[count - 1] + cash[count - 2];
        }
    }
}