import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseChar5 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String myString = "hElLogOoDBYe";
    List<Character> myStringChars = new ArrayList<>();
    for (int i = 0; i < myString.length(); i++) {
      myStringChars.add(myString.charAt(i));
    }
   List<Character> uppercaseChars = myStringChars.stream()
            .filter((c) -> Character.isUpperCase((c)))
            .collect(Collectors.toList());

    System.out.println(uppercaseChars);
  }
}
