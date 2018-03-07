package main.java.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setType("Electric Guitar");
    }

    public ElectricGuitar() {
        setNumberOfStrings(6);
        setType("Electric Guitar");
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }
}
