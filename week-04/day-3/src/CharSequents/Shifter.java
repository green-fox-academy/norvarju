package CharSequents;

public class Shifter implements CharSequence{

    private String wordToShift;
    private int shiftAmount;

    public Shifter(String wordToShift, int shiftAmount) {
        this.wordToShift = wordToShift;
        this.shiftAmount = shiftAmount;
    }

    @Override
    public int length() {
        return wordToShift.length();
    }

    @Override
    public char charAt(int index) {
        return wordToShift.charAt(index + shiftAmount);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
