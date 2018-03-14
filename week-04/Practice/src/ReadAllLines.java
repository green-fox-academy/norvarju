import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAllLines {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    public static void main(String[] args) {
      printAllLines("my-file.txt");
    }

    public static void printAllLines(String stringOfFile){
      Path path = Paths.get(stringOfFile);
      if(!Files.exists(path)) {
        try {
          Files.createFile(path);
        } catch (IOException e) {
          System.out.println("Oooops");
        }
      } else {
        try {
          for (String line : Files.readAllLines(path)) {
            System.out.println(line);
          }
        } catch (IOException e) {
          System.out.println("Oooops again");
        }
      }
    }

  }