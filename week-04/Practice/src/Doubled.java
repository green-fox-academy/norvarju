import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    decryptDuplication("duplicated-chars.txt");
  }

  public static void decryptDuplication(String fileName){
    Path path = Paths.get(fileName);
    Path pathOfDecryptedFile = Paths.get("decryptedfile.txt");
    List<String> fileContent = new ArrayList<>();
    List<String> decryptedContent = new ArrayList<>();
    String decrypted = "";
    try {
      fileContent = Files.readAllLines(path);
      for (int i = 0; i < fileContent.size(); i++) {
        for (int j = 0; j < fileContent.get(i).length(); j++) {
          if(j%2 == 0){
            decrypted += fileContent.get(i).charAt(j);
          }
        } decrypted += "\n";
      }
      System.out.println(decrypted);
      decryptedContent.add(decrypted);
      Files.write(pathOfDecryptedFile, decryptedContent);
    } catch (IOException e) {
      System.out.println("Oooops");
    }
  }
}