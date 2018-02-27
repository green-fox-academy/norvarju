import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class Writesingleline {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        singleLine();
    }
    public static void singleLine(){
        String myFilePathString = "my-file.txt";
        Path pathOfFile = Paths.get(myFilePathString);
        File myFile = new File(myFilePathString);
        String myName = "Varju Nóra";
        ArrayList<String> myNameList = new ArrayList<>(Arrays.asList(myName));

        if(!myFile.exists()) {
            try {
                myFile.createNewFile();
                Files.write(pathOfFile, myNameList);
            } catch (IOException e) {
                System.out.println("Unable to write file: my-file.txt");
            }
        }
    }
}
