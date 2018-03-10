package main.java.music;


public class StringedInstrument extends Instrument {

    private int numberOfStrings;
    private String type;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public StringedInstrument() {
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sound(){
    }

    public void play(){
        System.out.print( type + ", a " + numberOfStrings + "-stringed " +
                "instrument, that goes ");
        sound();
    }
}
