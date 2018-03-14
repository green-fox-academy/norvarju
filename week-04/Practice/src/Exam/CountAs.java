package Exam;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    String pathString = "src/afile.txt";
    System.out.println(countAs(pathString));
  }

  public static int countAs(String filePathString){
    Path path = Paths.get(filePathString);
    try {
      int counter = 0;
      List<String> fileContent = Files.readAllLines(path);
      for (int i = 0; i < fileContent.size(); i++){
        for (int j = 0; j < fileContent.get(i).length(); j++) {
          if (fileContent.get(i).charAt(j) == 'a' || fileContent.get(i).charAt(j) == 'A') {
            counter++;
          }
        }
      }
      return counter;
    } catch (IOException e) {
      return 0;
    }
  }

}
