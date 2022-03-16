package lesson12;

import lesson12.exception.MyArrayDataException;
import lesson12.exception.MyArraySizeException;

public class ArrayCountRunner {

    public static void main(String[] args) {

        ArrayCount arrayCount = new ArrayCount();

        String[][] array = new String[][]{{"1", "2", "4", "5"}, {"1", "2", "5", "4"}, {"1", "2", "3", "4"}, {"1", "5", "3", "4"}};
        try {
            System.out.println("Сумма элементов массива равна " + arrayCount.arrayCount(array) + ".");
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не 4 х 4!");
        } catch (MyArrayDataException e) {
            System.out.println("В ячейке массива [" + e.getI() + "][" + e.getJ() + "] неверные данные!\n" +
                    "Расчет остановлен.");
        }
    }
}
