package lesson8;

public class Parrot extends Animal {

    public Parrot(String name, int age, String voice) {
        super(name, age, voice);
    }

    private static final String ANOTHER_VOICE = "чирикать";

    @Override
    public void voice() {
        System.out.println("Попугай " + getName() + " умеет " + getVoice() + ".");
        System.out.println("А eщe он может " + ANOTHER_VOICE + " как воробей.\n");
    }
}
