package main.java.music;

public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Electric Guitar");
    }

    public ElectricGuitar() {
        setNumberOfStrings(6);
        setName("Electric Guitar");
    }

    public void sound(){
        System.out.print("Twang");
    }
}
