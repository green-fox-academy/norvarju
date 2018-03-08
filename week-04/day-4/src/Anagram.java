import java.util.ArrayList;

public class Anagram {
    private String name;
    private String isAnagram;

    public Anagram(String name, String isAnagram) {
        this.name = name;
        this.isAnagram = isAnagram;
    }

    public String getName() {
        return name;
    }

    public boolean anagramMaker(){
        ArrayList<Character> lettersOfWord = new ArrayList<>();
        ArrayList<Character> lettersOfisAnagram = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            lettersOfWord.add(name.charAt(i));
        }
        for (int i = 0; i < isAnagram.length(); i++) {
            lettersOfisAnagram.add(isAnagram.charAt(i));
        }
        return (lettersOfWord.size() == lettersOfisAnagram.size() &&
                lettersOfWord.containsAll(lettersOfWord));


    }
}
