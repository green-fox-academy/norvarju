import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountLetters {

  //Write a function, that takes a string as an argument and returns a dictionary with all letters
  //in the string as keys, and numbers as values that shows how many occurrences there are.
  //Create a test for that.

  private String wordToCheck;

  public CountLetters() {
    this.wordToCheck = wordToCheck;
  }

  public HashMap<Character, Integer> countLetters(String myWord){
    HashMap<Character, Integer> mapOfLetters = new HashMap<>();
    List<Character> lettersOfWord = new ArrayList<>();
    for (int i = 0; i < myWord.length(); i++) {
      lettersOfWord.add(myWord.charAt(i));
    }
    Collections.sort(lettersOfWord);
    for (int i = 0; i < lettersOfWord.size(); i++) {
      if(!mapOfLetters.containsKey(lettersOfWord.get(i))){
        mapOfLetters.put(lettersOfWord.get(i), 1);
      } else {
        mapOfLetters.put(lettersOfWord.get(i), mapOfLetters.get(lettersOfWord.get(i))+1);
      }
    }
    return mapOfLetters;
  }

  public static void main(String[] args) {
    CountLetters letterCountingProg = new CountLetters();
    System.out.println(letterCountingProg.countLetters("apple"));
  }
}
