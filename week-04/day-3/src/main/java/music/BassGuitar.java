package main.java.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setType("Bass Guitar");
    }

    public BassGuitar() {
        setNumberOfStrings(4);
        setType("Bass Guitar");
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }
}
