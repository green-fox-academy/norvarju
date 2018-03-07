package main.java.music;

public class Violin extends StringedInstrument{

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        setType("Bass Guitar");
    }

    public Violin() {
        setNumberOfStrings(4);
        setType("Violin");
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }
}
