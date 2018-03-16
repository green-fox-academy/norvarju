import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
  //Write a function, that takes two strings and returns a boolean value based on if the two
  //strings are Anagramms or not.
  //Create a test for that.

  private String basicWord;
  private String anagram;

  public Anagram() {
    this.basicWord = basicWord;
    this.anagram = anagram;
  }

  public boolean isAnagram(String basicWord, String anagram){
    List<Character> basicWordToList = new ArrayList<>();
    List<Character> anagramToList = new ArrayList<>();
    for (int i = 0; i < basicWord.length(); i++) {
      basicWordToList.add(basicWord.toLowerCase().charAt(i));
    }
    for (int i = 0; i < anagram.length(); i++) {
      anagramToList.add(anagram.toLowerCase().charAt(i));
    }
    Collections.sort(basicWordToList);
    Collections.sort(anagramToList);
    if (basicWordToList.size() == anagramToList.size()){
      return (basicWordToList.equals(anagramToList));
    }
    return false;
  }

  public static void main(String[] args) {
    Anagram newAnagram = new Anagram();
    System.out.println(newAnagram.isAnagram("nameee", "Maneee"));
  }
}
