import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines_refactor {
  public static void main(String[] args) {
    String nameOfFile = "reversed-lines.txt";
    String reversedContent = reversedContentToString(readFileContent(nameOfFile));
    reversedLinesToFile(reversedContentToList(reversedContent));
  }

  public static List<String> readFileContent(String fileName){
    Path pathOfFile = Paths.get(fileName);
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(pathOfFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }

  public static String reversedContentToString(List<String> fileContent){
    String reversedContent = "";
    for (int i = 0; i < fileContent.size(); i++) {
      for (int j = fileContent.get(i).length()-1; j >= 0; j--) {
        reversedContent += (fileContent.get(i).charAt(j));
      }
      reversedContent += "\n";
    }
    return reversedContent;
  }

  public static List<String> reversedContentToList(String reversedContent){
    List<String> listOfReversedContent = new ArrayList<>();
    listOfReversedContent.add(reversedContent);
    return listOfReversedContent;
  }

  public static void reversedLinesToFile(List<String> listOfReversedContent){
    String reversedFile = "reversed-file-refactor.txt";
    Path pathOfReversedFile = Paths.get(reversedFile);
    try {
      Files.write(pathOfReversedFile, listOfReversedContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
