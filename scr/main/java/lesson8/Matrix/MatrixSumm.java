package lesson8.Matrix;

public class MatrixSumm {

    public static void main(String[] args) {

        int m = 3;
        int n = 4;
        int[][] array = new int[m][n];
        Matrix matrix = new Matrix(m, n, array);
        matrix.fillMatrix(matrix.getMatrix());

        int i = 3;
        int j = 4;
        int[][] anotherArray = new int[i][j];
        matrix.fillMatrix(anotherArray);

        System.out.println("Array 1");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("--------------------------------");
        System.out.println("Array 2");
        matrix.printMatrix(anotherArray);
        System.out.println("--------------------------------");
        System.out.println("Array 1 + Array 2");
        matrix.printMatrix(matrix.matrixSumm(anotherArray));

    }
}
