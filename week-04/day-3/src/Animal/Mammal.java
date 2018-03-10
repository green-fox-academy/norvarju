package Animal;

public class Mammal extends Animal {

    private String furColor;

    public Mammal(String name, int age, String gender, int numberOfLegs,
                  String sound, int hunger, String furColor) {
        super(name, age, gender, numberOfLegs, sound, hunger);
        this.furColor = furColor;
    }

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }
}
