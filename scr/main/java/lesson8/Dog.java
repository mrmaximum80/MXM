package lesson8;

public class Dog extends Animal {

    public Dog(String name, int age, String voice) {
        super(name, age, voice);
    }

    private static final String ANOTHER_VOICE = "выть";

    @Override
    public void voice() {
        System.out.println("Собака " + this.name + " умеет " + this.voice + ".");
        System.out.println("А иногда, когда ему грустно, он может " + ANOTHER_VOICE + " на луну.\n");
    }
}
