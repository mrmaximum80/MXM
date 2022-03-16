package lesson3;

public class Factorial {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(n + "! = " + factorial(n));
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
