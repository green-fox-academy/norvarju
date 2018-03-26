import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaredAbove204 {
  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the
    //following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers.stream()
            .filter(s -> s*s > 20)
            .map(s -> s)
            .forEach(s -> System.out.println(s));
    //Old method:
    List<Integer> filteredNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if(numbers.get(i)*numbers.get(i) > 20){
        filteredNumbers.add(numbers.get(i));
      }
    }
    System.out.println(filteredNumbers);
  }
}
