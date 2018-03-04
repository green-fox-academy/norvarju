import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Printeachline {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        fileOpener();
}

public static void fileOpener(){
    String pathstring = "my-file.txt";
    Path pathOfFile = Paths.get(pathstring);
    File myFile = new File(pathstring);

        try{
            Files.readAllLines(pathOfFile);
        } catch (IOException e){
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
