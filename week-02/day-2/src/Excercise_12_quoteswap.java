import java.util.ArrayList;
import java.util.Arrays;

public class Excercise_12_quoteswap {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        //System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
        quoteswap(list);

    }
    public static ArrayList quoteswap(ArrayList<String> listOfWords){

        listOfWords.add(2, listOfWords.get(5));
        listOfWords.set(6, listOfWords.get(3));
        listOfWords.remove(3);

        for (int i = 0; i < listOfWords.size(); i++) {
            System.out.print(listOfWords.get(i) + " ");
        }

        return listOfWords;

    }
}
