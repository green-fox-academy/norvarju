import java.util.Arrays;

public class Excercise_19 {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};
        int[] reverse = new int[5];
        for (int i = aj.length-1; i >= 0 ; i--) {
            reverse[i] = aj[aj.length-i-1];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
