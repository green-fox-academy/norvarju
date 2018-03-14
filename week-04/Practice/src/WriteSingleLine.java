import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  // Open a file called "my-file.txt"
  // Write your name in it as a single line
  // If the program is unable to write the file,
  // then it should print an error message like: "Unable to write file: my-file.txt"
  public static void main(String[] args) {
    writeSingleLine("writesingleline.txt");
  }

  private static void writeSingleLine(String filename){
    Path path = Paths.get(filename);
    ArrayList<String> myname = new ArrayList<>(Arrays.asList("Varju Nóra"));
    if(!Files.exists(path)) {
      try {
        Files.createFile(path);
      } catch (IOException e) {
        System.out.println("Unable to create file");
      }
    } else {
        try {
          Files.write(path, myname);
          for (String line : Files.readAllLines(path)) {
            System.out.println(line);
          }
        } catch (IOException e) {
        System.out.println("Unable to write file: my-file.txt");
        }
      }
    }
}
