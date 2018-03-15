import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    reversedOrder("reversed-order.txt");
  }

  public static void reversedOrder(String fileName){
    Path pathOfFileToBeDecrypted = Paths.get(fileName);
    Path pathOfDecryptedFile = Paths.get("reversed-order-decrypted.txt");
    List<String> fileContent = new ArrayList<>();
    List<String> decryptedContent = new ArrayList<>();
    String decrypted = "";
    try {
      fileContent = Files.readAllLines(pathOfFileToBeDecrypted);
      for (int i = fileContent.size()-1; i >= 0; i--) {
        decrypted += fileContent.get(i);
        decrypted += "\n";
      }
      System.out.println(decrypted);
      decryptedContent.add(decrypted);
      Files.write(pathOfDecryptedFile, decryptedContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}