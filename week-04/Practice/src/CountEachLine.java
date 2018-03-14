import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountEachLine {
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.
  public static void main(String[] args) {
    System.out.println(linesOfFile("my-file.txt"));
  }

  public static int linesOfFile(String filename){
    Path path = Paths.get(filename);
    int counter = 0;
    try {
      for (String line : Files.readAllLines(path)) {
        counter++;
      }
      return counter;
    } catch (IOException e) {
      return 0;
    }
  }
}
