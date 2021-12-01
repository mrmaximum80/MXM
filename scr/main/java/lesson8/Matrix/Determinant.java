package lesson8.Matrix;

public class Determinant {

    public static void main(String[] args) {

        int m = 5;
        int n = 5;
        int[][] array = new int[m][n];
        int [][] anotherArray = new int [m][n];
        Matrix matrix = new Matrix(m, n, array, anotherArray);
        matrix.fillMatrix(matrix.getMatrix());

//        int[][] arr = {{3, 2, 8, 5}, {3, 2, 6, 4}, {5, 0, 1, 3}, {0, 7, 4, 5}}; // не считал , {5, 8, 3, 8}
//        matrix.setMatrix(arr);

        System.out.println("Исходный массив:");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("");
        System.out.println("Исходный массив, приведенный к треугольнику:");
        matrix.determinant(matrix);
        matrix.printMatrix(matrix.getSecondMatrix());
        System.out.println("");
        System.out.println("Детерминант равен");
        System.out.println(matrix.getDeterminant());
    }
}
