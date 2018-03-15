import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    reversedLines("reversed-lines.txt");
  }

  public static void reversedLines(String filename) {
    Path pathOfFile = Paths.get(filename);
    Path pathOfDecryptedFile = Paths.get("reversed-lines-decrypted.txt");
    List<String> fileContent = new ArrayList<>();
    List<String> decryptedFileContent = new ArrayList<>();
    String decryptedContent = "";
    try {
      fileContent = Files.readAllLines(pathOfFile);
      for (int i = 0; i < fileContent.size(); i++) {
        for (int j = fileContent.get(i).length()-1; j >= 0; j--) {
          decryptedContent += fileContent.get(i).charAt(j);
        } decryptedContent += "\n";
      }
      System.out.println(decryptedContent);
      decryptedFileContent.add(decryptedContent);
      Files.write(pathOfDecryptedFile, decryptedFileContent);
    } catch (IOException e) {
      System.out.println("Oooops");
    }
  }
}