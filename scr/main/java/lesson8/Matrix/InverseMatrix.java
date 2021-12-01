package lesson8.Matrix;

public class InverseMatrix {

    public static void main(String[] args) {

        int m = 3;
        int n = 3;
//        int [][] array = new int [m][n];
        int[][] array2 = new int[m][n];
        int array[][] = {{0, 6, 0}, {6, 1, 4}, {2, 7, 8}};
        Matrix matrix = new Matrix(m, n, array, array2);
        double[][] invArray = new double[m][n];


//        matrix.fillMatrix(array);
        System.out.println("Array 1");
        matrix.printMatrix(array);
        System.out.println("-----------------------------");
        System.out.println("Array 1 inv");
        invArray = matrix.inverseMatrix(matrix);
        matrix.printMatrix(invArray);
        System.out.println("-----------------------------");
        System.out.println("Array 1 * Array 1 inv");
        matrix.printMatrix(matrix.matrixMult(invArray));
    }
}
