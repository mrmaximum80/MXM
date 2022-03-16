package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAverage {

    public static void main(String[] args) {
        int index;
        System.out.println("Введите целое положительное число от 2-х до 20-ти.");
        System.out.println("При вводе значений менее 2-х или более 20-ти системой будут приняты для расчета 2 или 20 соответственно!");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается целое положительное значение, а Вы вввели " + text);
        }
        index = scanner.nextInt();
        if (index < 2) {
            index = 2;
        }
        if (index > 20) {
            index = 20;
        }
        int[] array = new int[index];
        fillArray(array);
        System.out.println("Исходный массив состоит из " + index + " элементов:");
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальный элемент массива равен " + min(array) + ".");
        System.out.println("Максимальный элемент массива равен " + max(array) + ".");
        System.out.println("Среднее арифметическое элементов массива равно " + String.format("%.2f", average(array)) + ".");
    }

    public static void fillArray(int[] array) {             //  Заполняем массив случайными числами от 0 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static int min(int[] array) {                    //  Присваиваем переменной min заведомо наибольшее значение
        int min = 100;                                      //  В цикле сравниваем min с элементами массива
        for (int i = 0; i < array.length; i++) {            //  Если min больше, присваиваеи ей значение соответсвующего элемента массива
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {                    //  Присваиваем переменной max заведомо наименьшее значение
        int max = 0;                                        //  В цикле сравниваем max с элементами массива
        for (int i = 0; i < array.length; i++) {            //  Если max меньше, присваиваеи ей значение соответсвующего элемента массива
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static float average(int[] array) {              //  Считаем сумму элементов массива и делим на количество элементов
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        return (float) summ / array.length;
    }
}