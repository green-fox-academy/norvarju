import java.util.ArrayList;
import java.util.Arrays;

public class SquaredAbove204 {
  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the
    //following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers.stream()
            .map(n -> n * n)
            .filter(s -> s > 20)
            .forEach(s -> System.out.println(s));
  }
}
