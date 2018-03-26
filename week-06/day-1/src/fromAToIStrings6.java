import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FromAToIStrings6 {
  public static void main(String[] args) {
   //Write a Stream Expression to find the strings which starts with A and ends with I in the
    //following array:
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    List<String> filteredCities = cities.stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .collect(Collectors.toList());
    System.out.println(filteredCities);
    //Old method:
    List<String> filteredList = new ArrayList<>();
    for (int i = 0; i < cities.size(); i++) {
      if(cities.get(i).startsWith("A") && cities.get(i).endsWith("I")){
        filteredList.add(cities.get(i));
      }
    }
    System.out.println(filteredList);
  }
}
