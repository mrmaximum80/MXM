package lesson8.Matrix;

public class MatrixMult {

    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int[][] array = new int[m][n];
        Matrix matrix = new Matrix(m, n, array);
        matrix.fillMatrix(matrix.getMatrix());

        int i = 3;
        int j = 3;
        int[][] anotherArray = new int[i][j];
        matrix.fillMatrix(anotherArray);

        System.out.println("Array 1");
        matrix.printMatrix(matrix.getMatrix());
        System.out.println("--------------------------------");
        System.out.println("Array 2");
        matrix.printMatrix(anotherArray);
        System.out.println("--------------------------------");
        System.out.println("Array 1 * Array 2");
        matrix.printMatrix(matrix.matrixMult(anotherArray));

    }
}
