package lesson12;

import lesson12.exception.MyArrayDataException;
import lesson12.exception.MyArraySizeException;

public class ArrayCount {

    public int arrayCount(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не 4 х 4!");
        } else {
            for (String[] arr1 : array) {
                if (arr1.length != 4) {
                    throw new MyArraySizeException("Размер массива не 4 х 4!");
                }
            }
        }
        int arraySum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (isNumeric(array[i][j])) {
                    arraySum += Integer.parseInt(array[i][j]);
                } else {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return arraySum;
    }

    public static boolean isNumeric(String string) {
        int intValue;

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
