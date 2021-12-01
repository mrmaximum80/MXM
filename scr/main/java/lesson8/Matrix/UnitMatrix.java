package lesson8.Matrix;

public class UnitMatrix {

    public static void main(String[] args) {

        int n = 7;
        System.out.println("Единичная матрица порядка " + n);
        Matrix.printMatrix(Matrix.unitMatrix(n));
    }
}
