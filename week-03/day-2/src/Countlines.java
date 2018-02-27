import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Countlines {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {
        lineOfFiles();
    }


    public static void lineOfFiles() {
        String filename = "anything.txt";
        Path pathOfFile = Paths.get(filename);

        int counter = 0;
        try {
            for (String line : Files.readAllLines(pathOfFile)) {
                counter++;
            }
        }
            catch (IOException e){
                System.out.println("0");
            }
        }

        }