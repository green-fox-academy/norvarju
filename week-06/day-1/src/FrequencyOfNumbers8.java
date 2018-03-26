import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfNumbers8 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    Map<Object, Long> frequencyChecker = numbers
            .stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    System.out.println(frequencyChecker);
    Map<Integer, Integer> myHashMap = new HashMap<>();
    for (int i = 0; i < numbers.size(); i++) {
      if(!myHashMap.containsKey(numbers.get(i))){
        myHashMap.put(numbers.get(i), 1);
      } else {
        myHashMap.put(numbers.get(i), myHashMap.get(numbers.get(i))+1);
      }
    }
    System.out.println(myHashMap);
  }
}
