import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class OddAverage2 {
  public static void main(String[] args) {
    //Write a Stream Expression to get the average value of the odd numbers from the following
    // array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    double statOfNumbers = numbers
            .stream()
            .filter(n -> n%2 != 0)
            .mapToInt(n -> n)
            .summaryStatistics()
            .getAverage();

    System.out.println(statOfNumbers);
  }
}
