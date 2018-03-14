package main.java.music;

public class StringedInstrument extends Instrument{

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument() {
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void sound(){
    }

    @Override
    public void play() {
        System.out.print(name + ", a " + numberOfStrings + "-stringed " +
                "instrument that " +
                "goes "); sound();
        System.out.println("\r");
    }
}
