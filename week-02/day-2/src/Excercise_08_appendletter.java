import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise_08_appendletter {
        public static void main(String[] args){
            List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
            // Create a method called "appendA()" that adds "a" to every string in the "far" list.
            // The parameter should be a list.

            appendA(far);

        }
        public static List appendA(List<String> animals) {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println(animals.get(i) + "a");
            }
            return animals;
        }

}
