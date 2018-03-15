import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    encodedLine("encoded-lines.txt");
  }

  public static void encodedLine(String fileName){
    Path pathOfFile = Paths.get(fileName);
    List<String> fileContent = new ArrayList<>();
    String encrypted = "";
    try {
      fileContent = Files.readAllLines(pathOfFile);
      for (int i = 0; i < fileContent.size(); i++) {
        for (int j = 0; j < fileContent.get(i).length(); j++) {
          if (fileContent.get(i).charAt(j) != ' ') {
            encrypted += (char) ((int) (fileContent.get(i).charAt(j)) - 1);
          } else {
            encrypted += " ";
          }
        } encrypted += "\n";
      }
      System.out.print(encrypted);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}