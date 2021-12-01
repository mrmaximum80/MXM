package lesson8;

public class Parrot extends Animal {

    public Parrot(String name, int age, String voice) {
        super(name, age, voice);
    }

    private static final String ANOTHER_VOICE = "чирикать";

    @Override
    public void voice() {
        System.out.println("Собака " + this.name + " умеет " + this.voice + ".");
        System.out.println("А eoe он может " + ANOTHER_VOICE + " на как воробей.\n");
    }
}
