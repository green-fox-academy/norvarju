package Animal;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private int numberOfLegs;
    private String sound;
    private int hunger;

    public Animal(String name, int age, String gender, int numberOfLegs,
                  String sound, int hunger) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
        this.sound = sound;
        this.hunger = hunger;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public void eat() {
        hunger--;
    }
}
