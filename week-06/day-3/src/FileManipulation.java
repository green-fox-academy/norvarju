import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

  private Path filePath;

  public FileManipulation() {
    filePath = Paths.get("C:/Users/norac/Desktop/Gitpractice/Greenfox/norvarju/week-06/day-3/file.txt");
  }

  public void Reader(List<String> contentList){
    try {
      for (String line: Files.readAllLines(filePath)) {
        contentList.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void writer(List<ToDo> content){
    try {
      String contentString = "";
      for (int i = 0; i < content.size(); i++) {
        contentString += content.get(i);
        contentString += "\n";
      }
      Files.write(filePath, contentString.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
