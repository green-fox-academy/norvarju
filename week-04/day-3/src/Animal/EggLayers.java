package Animal;

public class EggLayers extends Animal{

    public EggLayers(String name, int age, String gender, int numberOfLegs,
                     String sound, int hunger) {
        super(name, age, gender, numberOfLegs, sound, hunger);
    }

    public EggLayers(String name) {
        super(name);
    }

    public EggLayers() {
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
