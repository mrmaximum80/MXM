package lesson7;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 200, 2, null);
        barsik.run(150);
        barsik.run(300);
        barsik.jump(1);
        barsik.jump(5);
        barsik.swim(10);

        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");

        Dog bim = new Dog("Бим", "немецкая овчарка", 500, 2, 10);
        bim.run(400);
        bim.run(600);
        bim.jump(1);
        bim.jump(5);
        bim.swim(5);
        bim.swim(20);

        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");

        Tiger leo = new Tiger("Лео", 1000, 3, 50);
        leo.run(700);
        leo.run(1200);
        leo.jump(2);
        leo.jump(5);
        leo.swim(30);
        leo.swim(70);

        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");

        Turtle tortilla = new Turtle("Тортилла", 20, null, 1000);
        tortilla.run(10);
        tortilla.run(30);
        tortilla.jump(1);
        tortilla.swim(900);
        tortilla.swim((1200));
    }
}
