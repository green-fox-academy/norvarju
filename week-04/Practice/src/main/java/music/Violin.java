package main.java.music;

public class Violin extends StringedInstrument {
    public Violin(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        setName("Violin");
    }

    public Violin() {
        setNumberOfStrings(4);
        setName("Violin");
    }

    public void sound(){
        System.out.print("Screech");
    }
}
