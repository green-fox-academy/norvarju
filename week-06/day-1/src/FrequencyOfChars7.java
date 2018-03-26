import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfChars7 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
    String myString = "hellogoodbye";
    List<Character> charsOfMyString = new ArrayList<>();
    for (int i = 0; i < myString.length(); i++) {
      charsOfMyString.add(myString.charAt(i));
    }
    Map<Object, Long> result = charsOfMyString.stream().collect(Collectors.groupingBy(s -> s, Collectors
            .counting()));
    System.out.println(result);
    //Old solution:
    Map<Character, Integer> myMapOfChars = new HashMap<>();
    for (int i = 0; i < myString.length(); i++) {
      if(!myMapOfChars.containsKey(myString.charAt(i))){
        myMapOfChars.put(myString.charAt(i), 1);
      } else {
        myMapOfChars.put(myString.charAt(i), myMapOfChars.get(myString.charAt(i))+1);
      }
    }
    System.out.println(myMapOfChars);
  }
}
