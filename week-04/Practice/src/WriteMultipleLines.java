import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number,
  // than it should write to a file.
  // The path parameter should be a string, that describes the location of the file.
  // The word parameter should be a string, that will be written to the file as lines
  // The number paramter should describe how many lines the file should have.
  // So if the word is "apple" and the number is 5, than it should write 5 lines
  // to the file and each line should be "apple"
  // The function should not raise any error if it could not write the file.
  public static void main(String[] args) {
    writeMultiLines("multilines.txt", "cucumber", 3);
  }

  public static void writeMultiLines(String pathstring, String wordToBeWritten, int numberOfLines){
    Path path = Paths.get(pathstring);
    List<String> word = new ArrayList<>();
    word.add(wordToBeWritten);
    if (!Files.exists(path)){
      try {
        Files.createFile(path);
      } catch (IOException e){
      }
    } else {
      try {
        for (int i = 0; i < numberOfLines; i++) {
          Files.write(path, word, StandardOpenOption.APPEND);
        }
        for (String line : Files.readAllLines(path)){
          System.out.println(line);
        }
      } catch (IOException e){
      }
    }
  }
}
