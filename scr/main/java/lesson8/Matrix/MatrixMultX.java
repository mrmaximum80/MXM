package lesson8.Matrix;

public class MatrixMultX {

    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int[][] array = new int[m][n];
        Matrix matrix = new Matrix(m, n, array);
        matrix.fillMatrix(matrix.getMatrix());
        double x = 5;

        System.out.println("Array 1");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("--------------------------------");
        System.out.println("Array 1 * " + x);
        matrix.printMatrix(matrix.matrixMultX(x));
    }
}
