package lesson8;

public class AnimalVoice {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 1, "мяукать");
        Dog bim = new Dog("Бим", 2, "лаять");
        Parrot kesha = new Parrot("Кеша", 5, "говорить по-человечески");

        System.out.println("Вывод поэлементно.\n");
        barsik.voice();
        bim.voice();
        kesha.voice();
        System.out.println("-----------------------------------------------");
        System.out.println("Вывод из массива.\n");

        Animal[] animal = new Animal[]{barsik, bim, kesha};
        for (Animal an : animal) {
            an.voice();
        }
    }
}
