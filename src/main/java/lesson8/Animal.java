package lesson8;

public abstract class Animal {
    private String name;
    private int age;
    private String voice;

    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getVoice() {
        return voice;
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
        return "";
    }

    public void voice() {
        System.out.println(this.kind() + " " + this.name + " умеет " + this.voice + ".\n");
    }
}
