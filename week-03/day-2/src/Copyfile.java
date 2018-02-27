import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Copyfile {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    public static void main(String[] args){
      fileCopy("goodmorning.txt");
    }
    public static String fileCopy(String pathOfTargetString){
        //String pathOfTargetString = "hello.txt";
        Path pathOfTarget = Paths.get(pathOfTargetString);
        String pathOfStartString = "goodbye.txt";
        Path pathOfCopied = Paths.get(pathOfStartString);

        try{
            Files.copy(pathOfCopied, pathOfTarget, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("true");
        }catch (IOException e){
            System.out.println("false");
        }
        return pathOfStartString;
    }
}
