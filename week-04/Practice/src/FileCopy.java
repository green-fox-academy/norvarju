import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {
  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {
    System.out.println(copyAFile("my-file.txt"));
  }

  public static boolean copyAFile(String filename){
    Path pathOfFileToBeCopied = Paths.get(filename);
    String targetFile = "filecopy.txt";
    Path pathOfFileTiWhichWeCopy = Paths.get(targetFile);
    try {
      Files.copy(pathOfFileToBeCopied, pathOfFileTiWhichWeCopy);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
