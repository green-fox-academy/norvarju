import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class Writemultiplelines {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    public static void main(String[] args){
        multiLines();
    }
    public static void multiLines(){
        String pathString = "other.txt";
        Path path = Paths.get(pathString);
        String wordToFile = "apple";
        ArrayList<String> WTFList = new ArrayList<>(Arrays.asList(wordToFile));
        int numberOfLines = wordToFile.length();

        File fileWithWords = new File(pathString);

        if(!fileWithWords.exists()){
            try {
                fileWithWords.createNewFile();
                for (int i = 0; i <numberOfLines; i++) {
                    Files.write(path, WTFList, StandardOpenOption.APPEND);
                    System.out.println();
                }
            } catch (IOException e){

            }
        }
    }
}
