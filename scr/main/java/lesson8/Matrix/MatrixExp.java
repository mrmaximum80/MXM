package lesson8.Matrix;

public class MatrixExp {

    public static void main(String[] args) {

        int x = 3;
        int m = 3;
        int n = 3;
        int[][] array = new int[m][n];
        Matrix matrix = new Matrix(m, n, array);
        matrix.fillMatrix(matrix.getMatrix());

        System.out.println("Array 1");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("--------------------------------");
        System.out.println("Array 1 в степени " + x);
        matrix.printMatrix(matrix.matrixExp(x));
    }
}

