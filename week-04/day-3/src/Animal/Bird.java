package Animal;

public class Bird extends EggLayers{

    private String colorOfBeak;

    public Bird(String name, int age, String gender, int numberOfLegs, String
            sound, int hunger, String colorOfBeak) {
        super(name, age, gender, numberOfLegs, sound, hunger);
        this.colorOfBeak = colorOfBeak;
    }

    public Bird(String name) {
        super(name);
    }
}
