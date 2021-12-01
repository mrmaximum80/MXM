package lesson8;

public class Animal {
    protected String name;      // Если сделать private, то не получается работать с полями в методах дочерних классов.
    protected int age;          // Я что-то не то делаю?
    protected String voice;

    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public String kind() {
        if (this instanceof Cat) {
            return "Кот";
        }
        if (this instanceof Dog) {
            return "Собака";
        }
        if (this instanceof Parrot) {
            return "Попугай";
        }
        return "Животное";
    }

    public void voice() {
        System.out.println(this.kind() + " " + this.name + " умеет " + this.voice + ".\n");
    }
}
