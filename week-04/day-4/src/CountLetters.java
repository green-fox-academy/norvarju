import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private String wordToLetters;

    public CountLetters(String wordToLetters) {
        this.wordToLetters = wordToLetters;
    }

    public String getWordToLetters() {
        return wordToLetters;
    }

    public Map<Character, Integer> dictionary(){

        Map<Character, Integer> mapOfWords = new HashMap<Character, Integer>();

        for (int i = 0; i < wordToLetters.length(); i++) {
            if(!mapOfWords.containsKey(wordToLetters.charAt(i))){
                mapOfWords.put(wordToLetters.charAt(i), 1);
            } else {
                mapOfWords.put(wordToLetters.charAt(i), mapOfWords.get(wordToLetters
                        .charAt(i))+1);
            }
        }

        Map<Character, Integer> mapOfWords2 = new HashMap<Character, Integer>();

        for (int i = 0; i < wordToLetters.length(); i++) {
            mapOfWords2.put(wordToLetters.charAt(i), 0);
        }

        char[] list = new char[wordToLetters.length()];

        for (int i = 0; i < wordToLetters.length(); i++) {
            for (int j = 0; j < mapOfWords2.entrySet().toArray().length; j++) {
                if (wordToLetters.charAt(i) == mapOfWords2.entrySet().toArray
                        ()[j].toString().charAt(0)){
                    list[i] = wordToLetters.charAt(i);
                }
            }
        }
        System.out.println(list);

        return mapOfWords2;
    }
}
