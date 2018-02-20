import java.util.Arrays;
import java.util.List;

public class Excercise_08_appendletter {
        public static void main(String[] args){
            List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
            // Create a method called "appendA()" that adds "a" to every string in the "far" list.
            // The parameter should be a list.

            //System.out.println(appendA(far));
            for (int i = 0; i < far.size(); i++) {
                System.out.println(far.get(i) + "a");
            }
        }

}
