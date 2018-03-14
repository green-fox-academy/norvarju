package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Bass Guitar");
    }

    public BassGuitar() {
        setNumberOfStrings(4);
        setName("Bass Guitar");
    }

    public void sound(){
        System.out.print("Duum-duum-duum");
    }
}
