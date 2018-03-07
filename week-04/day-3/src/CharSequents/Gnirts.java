package CharSequents;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    private String word;

    public Gnirts(String word) {
        this.word = word;
    }


    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(word.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
