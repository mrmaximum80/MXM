package Lesson3;

public class QuadraticEquation {

    public static void main(String[] args) {
        int a = 3;
        int b = 7;  // При b=6 будет 1 корень
        int c = 3;

        double D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть равен 0!");
        } else if (D < 0) {
            System.out.println("Квадратное уравнение " + a + "x^ + " + b + "x + " + c + " = 0 не имеет действительных решений.");
        } else if (D == 0) {
            System.out.println("Квадратное уравнение " + a + "x^ + " + b + "x + " + c + " = 0 имеет один корень.");
            double x = - b / (2 * (double) a);
            System.out.println("x =  " + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Квадратное уравнение " + a + "x^ + " + b + "x + " + c + " = 0 имеет два корня.");
            System.out.println("x1 =  " + x1 + "   x2 = " + x2);
        }
    }
}