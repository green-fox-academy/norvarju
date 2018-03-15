import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    findCommonNumbers("lottery.txt");
  }

  public static void findCommonNumbers(String filename){
    Path sourcePath = Paths.get(filename);
    List<String> fileContent = new ArrayList<>();
    List<Integer> filtered = new ArrayList<>();
    String filteredNums = "";
    String filteredNums2 = "";
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> fiveMostFrequentNumber = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(sourcePath);
      for (int i = 0; i < fileContent.size(); i++) {
          filteredNums += fileContent.get(i).substring(fileContent.get(i).length()-14, fileContent
                  .get(i).length());
          filteredNums += ";";
        }
      System.out.println(filteredNums);
      filteredNums2 = filteredNums.replace(";", " ").replace("t", "").replace("F", "").replace
              ("  ", " ");
      System.out.println(filteredNums2);
      String[] filteredToArray = filteredNums2.split(" ");
      System.out.println(Arrays.toString(filteredToArray));
      for (String item : filteredToArray){
        if (!item.equals("")) {
          filtered.add(Integer.valueOf(item));
        }
      }
      System.out.println(filtered.toString());
      Collections.sort(filtered);
      System.out.println(filtered.toString());
      for (int i = 0; i <filtered.size() ; i++) {
        if(!map.containsKey(filtered.get(i))){
          map.put(filtered.get(i), 1);
        } else {
          map.put(filtered.get(i), map.get(filtered.get(i)) + 1);
        }
      }
      System.out.println(Arrays.asList(map));
      List<Map.Entry<Integer, Integer>> sortedMap = map.entrySet().stream().sorted(Map.Entry
              .comparingByValue()).collect(Collectors.toList());
      System.out.println(Arrays.asList(sortedMap));
      for (int i = 89; i >= 85; i--) {
        fiveMostFrequentNumber.add(sortedMap.get(i).getKey());
      }
      System.out.println(fiveMostFrequentNumber.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}