package Lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Выполнение операций сложения, вычитания, умножения и деления.");

        long add = addition(3, 5);
        System.out.println(add);

        long sub = subtraction(15, 5);
        System.out.println(sub);

        long mult = multiplication(8, 8);
        System.out.println(mult);

        float div = division(15, 2);
        System.out.println(div);
    }

    public static long addition(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static long subtraction(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static float division(float arg1, float arg2) {
        return arg1 / arg2;
    }
}

