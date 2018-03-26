import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToString9 {
  public static void main(String[] args) {
    //Write a Stream Expression to convert a char array to a string!
    Character[] myChars = {'b', 'e', 'h', 'a', 'p', 'p', 'y'};
    List<Character> listOfChars = new ArrayList<>(Arrays.asList(myChars));
    String newWord = listOfChars.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining(""))
            .toString();

    System.out.println(newWord);
    //Older solution
    String result = "";
    for (int i = 0; i < myChars.length; i++) {
      result += myChars[i];
    }
    System.out.println(result);


  }
}
