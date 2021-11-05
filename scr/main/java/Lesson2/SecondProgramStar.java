package Lesson2;

// Вычисление объема цилиндра по заданным радиусу основания и высоте

public class SecondProgramStar {

    public static void main(String[] args) {
        int r=5;
        int h=7;
        System.out.println("Объем цилиндра высотой " + h + " и радиусом " + r + " составляет:");
        double V = cylinderVolume(r, h);
        System.out.println(V);
    }

    /**
     * Метод вычисляет объем цилиндра
     * @param r - радиус основания цилиндра
     * @param h - высота цилиндра
     * @return - возвращает объем цилиндра
     */
    public static double cylinderVolume(int r, int h) {
        return 3.14*r*r*h;
    }
}

