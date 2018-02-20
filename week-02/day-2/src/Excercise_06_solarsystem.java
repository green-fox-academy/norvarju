import java.util.ArrayList;
import java.util.Arrays;


public class Excercise_06_solarsystem {
    public static void main(String[] args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        //System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
        putsaturn(planetList);
    }

    public static ArrayList putsaturn(ArrayList<String> example){
        String planet = "Saturn";
        example.add(planet);
        System.out.println(example.toString());
        return example;
    }
}
