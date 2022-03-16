package lesson8;

public class Cat extends Animal {

    public Cat(String name, int age, String voice) {
        super(name, age, voice);
    }

    private static final String ANOTHER_VOICE = "мурлыкать";

    @Override
    public void voice() {
        System.out.println("Кот " + getName() + " умеет " + getVoice() + ".");
        System.out.println("А если его погладить, он может " + ANOTHER_VOICE + ".\n");
    }
}
