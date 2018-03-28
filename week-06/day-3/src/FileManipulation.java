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
      contentList = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void Writer(String content){
    try {
      Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
