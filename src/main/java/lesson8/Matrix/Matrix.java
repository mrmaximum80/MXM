package lesson8.Matrix;

import java.util.Arrays;

public class Matrix {
    private int m;
    private int n;
    private int[][] matrix = new int[m][n];
    private int[][] secondMatrix = new int[m][n];

    private int sign = 1;
    private int determinant;

    public Matrix(int m, int n) {
        this.m = 2;
        this.n = 2;
    }

    public Matrix(int m, int n, int[][] matrix) {
        this.m = m;
        this.n = n;
        this.matrix = matrix;
    }

    public Matrix(int m, int n, int[][] matrix, int[][] secondMatrix) {
        this.m = m;
        this.n = n;
        this.matrix = matrix;
        this.secondMatrix = secondMatrix;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getSecondMatrix() {
        return secondMatrix;
    }

    public void setSecondMatrix(int[][] secondMatrix) {
        this.secondMatrix = secondMatrix;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public int getDeterminant() {
        return determinant;
    }

    public void setDeterminant(int determinant) {
        this.determinant = determinant;
    }

    /**
     * Метод выполняет заполнение массива целыми случайными числами от 0 до 9
     *
     * @param array - исходный массив, который необходимо заполнить
     */
    public void fillMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    /**
     * Метод выполняет сложение двух матриц
     *
     * @param array - матрица,которую нужно прибавить к матрице matrix
     * @return возвращает матрицу, являющейся результатом сложения
     */
    public int[][] matrixSumm(int[][] array) {
        if (array.length != m || array[0].length != n) {
            System.out.println("Допускается сложение только матриц одинакового размера!");
            return matrix;
        }
        int[][] matrixSumm = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSumm[i][j] = matrix[i][j] + array[i][j];
            }
        }
        return matrixSumm;
    }

    /**
     * Метод выполняет вычитание двух матриц
     *
     * @param array - матрица,которую нужно отнять от матрицы matrix
     * @return возвращает матрицу, являющейся результатом сложения
     */
    public int[][] matrixSub(int[][] array) {
        if (array.length != m || array[0].length != n) {
            System.out.println("Допускается сложение только матриц одинакового размера!");
            return matrix;
        }
        int[][] matrixSub = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSub[i][j] = matrix[i][j] - array[i][j];
            }
        }
        return matrixSub;
    }

    /**
     * Метод выполняет транспонирование матрицы (способ 1 согласно ДЗ)
     *
     * @return возращает результат транспонирования
     */
    public int[][] matrixTrans() {
        int[][] matrixTrans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixTrans[j][i] = matrix[i][j];
            }
        }
        return matrixTrans;
    }

    /**
     * Метод выполняет транспонирование матрицы (способ 2 согласно ДЗ)
     *
     * @param matrix - матрица,которую необходимо транспонировать
     * @return возращает результат транспонирования
     */
    public static int[][] matrixTrans(int[][] matrix) {
        int[][] matrixTrans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixTrans[j][i] = matrix[i][j];
            }
        }
        return matrixTrans;
    }

    /**
     * Метод выполняет создание единичной матрицы
     *
     * @param n - порядок матрицы
     * @return - возвращает единичную матрицу n-го порядка
     */
    public static int[][] unitMatrix(int n) {
        int[][] unitMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    unitMatrix[i][j] = 1;
                } else {
                    unitMatrix[i][j] = 0;
                }
            }
        }
        return unitMatrix;
    }

    /**
     * Метод выполняет произведение матрицы matrix на число
     *
     * @param x - число, на которое нужно умножить матрицу
     * @return возвращает результат умножения
     */
    public double[][] matrixMultX(double x) {
        double[][] matrixMultX = new double[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixMultX[i][j] = (double) (matrix[i][j] * x);
            }
        }
        return matrixMultX;
    }

    /**
     * Метод возвращает результат произведения матрицы matrix на другую матрицу
     *
     * @param array - матрица, на которую нужно умножить matrix
     * @return возвращает результат умножения
     */
    public int[][] matrixMult(int[][] array) {
        if (array.length != n) {
            System.out.println("Для выполнения произведения необходимо, чтобы число столбцов первой матрицы " +
                    "равнялось числу строк второй!");
            return matrix;
        }
        int[][] matrixMult = new int[m][array[0].length];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < n; k++) {
                    matrixMult[i][j] += matrix[i][k] * array[k][j];
                }
            }
        }
        return matrixMult;
    }

    public double[][] matrixMult(double[][] array) {
        if (array.length != n) {
            System.out.println("Для выполнения произведения необходимо, чтобы число столбцов первой матрицы " +
                    "равнялось числу строк второй!");
            return array;
        }
        double[][] matrixMult = new double[m][array[0].length];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < n; k++) {
                    matrixMult[i][j] += matrix[i][k] * array[k][j];
                }
            }
        }
        return matrixMult;
    }

    /**
     * Метод выполняет возведение матрицы matrix в степерь x
     *
     * @param x -степень, в которую нужно возвести
     * @return возвращает результат возведения
     */
    public int[][] matrixExp(int x) {
        if (n != m) {
            System.out.println("Возводить в степень можно только квадратные матрицы!");
            return matrix;
        }
        int[][] matrixExp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrixExp[i][j] = matrix[i][j];
            }
        }
        for (int i = 1; i < x; i++) {
            matrixExp = matrixMult(matrixExp);
        }
        return matrixExp;
    }

    /**
     * Метод находит определитель исходной матрицы, сохраняя, как промежуточный результат приведение к треугольной матрице
     * исходной матрицы
     *
     * @param treMatrix - объект класса Matrix, в поле matrix которого указана исходная матрица, а также поля для
     *                  сохранения детерминанта и промежуточной треугольной матрицы
     */
    public void determinant(Matrix treMatrix) {
        if (n != m) {
            System.out.println("Детерминант можно найти только для квадратной матрицы!");
            return;
        }
        for (int i = 0; i < treMatrix.m; i++) {
            for (int j = 0; j < treMatrix.n; j++) {
                treMatrix.secondMatrix[i][j] = treMatrix.matrix[i][j];
            }
        }
        treMatrix.secondMatrix = treangleMatrix(treMatrix.secondMatrix);
        treMatrix.determinant = treMatrix.secondMatrix[treMatrix.m - 1][treMatrix.n - 1] * treMatrix.sign;
        return;
    }

    /**
     * Метод приводит к треугольной матрице исходную матрицу. Вызывается в методе determinant.  Для работы метода
     * используется Алгоритм Барейса (https://dev.abcdef.wiki/wiki/Bareiss_Algorithm#References, https://planetcalc.ru/1959/),
     * т.к. принято, что все элементы матриц целочисленные.
     *
     * @param processMatrix - исходная матрица,которую небходимо привести к треугольной
     * @return возвращает треугольную матрицу
     */
    public int[][] treangleMatrix(int[][] processMatrix) {
        int high = processMatrix.length;
        int len = processMatrix[0].length;
        int[] temp = new int[len];
        int div = 0;
        int temp1;
        int temp2;
        for (int i = 0; i < high - 1; i++) {
            for (int j = i + 1; j < high; j++) {
                if (processMatrix[i][i] == 0) {
                    processMatrix = changeStrings(processMatrix, i);
                }
                if (i == 0) {
                    div = 1;
                } else {
                    if (processMatrix[i - 1][i - 1] == 0) {
                        System.out.println("Система не может рассчитать эту матрицу...");
                    } else {
                        div = processMatrix[i - 1][i - 1];
                    }
                }
                temp1 = processMatrix[i][i];
                temp2 = processMatrix[j][i];
                for (int k = i; k < len; k++) {
                    temp[k] = processMatrix[i][k] * temp2;
                    processMatrix[j][k] = processMatrix[j][k] * temp1;
                    processMatrix[j][k] = (processMatrix[j][k] - temp[k]) / div;
                }

            }
        }
        return processMatrix;
    }

    /**
     * Метод меняет местами две строки в исходной матрице. Вызывается методом treangleMatrix, если в процессе расчета
     * один из элементов главной диагонали принимает нулевое значение
     *
     * @param chgMatrix - исходная матрица
     * @param index     - номер строки с нулевым элементом, которую необходимо поменять
     * @return
     */
    public int[][] changeStrings(int[][] chgMatrix, int index) {
        int high = chgMatrix.length;
        int len = chgMatrix[0].length;
        boolean flag = false;
        int temp;
        int searchIndex = 0;
        for (int i = index + 1; i < high; i++) {
            if (chgMatrix[i][index] != 0) {
                flag = true;
                for (int j = 0; j < len; j++) {
                    temp = chgMatrix[index][j];
                    chgMatrix[index][j] = chgMatrix[i][j];
                    chgMatrix[i][j] = temp;
                }
                searchIndex = i;
                break;
            }
        }
        sign = Math.abs(index - searchIndex) == 1 || Math.abs(index - searchIndex) % 2 != 0 ? -sign : sign;

        if (chgMatrix[index][index] == 0 & flag == false) {
            System.out.println("Все элементы 0-го столбца матрицы равны 0, детерминант также равен 0.");
            return chgMatrix;
        }
        return chgMatrix;
    }

    /**
     * Метод находит обратную матрицу с помощью союзной матрицы.
     * @param invMatrix - исходная матрица,для которой требуется найти обратную.
     * @return возвращает обратную матрицу.
     */
    public double[][] inverseMatrix(Matrix invMatrix) {
        determinant(invMatrix);
        System.out.println(invMatrix.determinant);
        if (invMatrix.determinant == 0) {
            System.out.println("Определитель матрицы равен 0. Обратной матрицы не существует.");
            return null;
        }
        int deter = invMatrix.determinant;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                secondMatrix[i][j] = matrix[i][j];
            }
        }
        secondMatrix = matrixTrans(secondMatrix);

        int[][] unionMatrix = new int[m][n];
        int[][] minorMatrix = new int[m - 1][n - 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ii = 0;
                for (int k = 0; k < m - 1; k++) {
                    if (ii == i) {
                        ii++;
                    }
                    int jj = 0;
                    for (int l = 0; l < m - 1; l++) {
                        if (jj == j) {
                            jj++;
                            minorMatrix[k][l] = secondMatrix[ii][jj];
                        } else {
                            minorMatrix[k][l] = secondMatrix[ii][jj];

                        }
                        jj++;

                    }
                    ii++;
                }
                int[][] sMinor = new int[m - 1][n - 1];
                Matrix forUnion = new Matrix(m - 1, n - 1, minorMatrix, sMinor);
                determinant(forUnion);
                unionMatrix[i][j] = forUnion.determinant * (int) Math.pow(-1, (i + j + 2));
            }
        }
        printMatrix(unionMatrix);
        Matrix unMatrix = new Matrix(m, n, unionMatrix);
        double[][] secMatrix = unMatrix.matrixMultX((-1) / (double) deter);
        return secMatrix;
    }

    /**
     * Метод осуществляет построчный вывод массива на экран
     *
     * @param array - массив, который необходимо вывести на экран
     */
    public static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void printMatrix(double[][] array) {
        for (double[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
