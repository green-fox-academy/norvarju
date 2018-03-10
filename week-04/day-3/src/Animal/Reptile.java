package Animal;

public class Reptile extends EggLayers{

    private boolean hasLegs;

    public Reptile(String name, int age, String gender, int numberOfLegs,
                   String sound, int hunger, boolean hasLegs) {
        super(name, age, gender, numberOfLegs, sound, hunger);
        this.hasLegs = hasLegs;
    }

    public Reptile(String name) {
        super(name);
    }
}
