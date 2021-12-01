package lesson8.Matrix;

public class matrixSub {

    public static void main(String[] args) {

        int m = 2;
        int n = 2;
        int[][] array = new int[m][n];
        Matrix matrix = new Matrix(m, n, array);
        matrix.fillMatrix(matrix.getMatrix());

        int i = 2;
        int j = 2;
        int[][] anotherArray = new int[i][j];
        matrix.fillMatrix(anotherArray);

        System.out.println("Array 1");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("--------------------------------");
        System.out.println("Array 2");
        matrix.printMatrix(anotherArray);
        System.out.println("--------------------------------");
        System.out.println("Array 1 - Array 2");
        matrix.printMatrix(matrix.matrixSub(anotherArray));

    }
}
