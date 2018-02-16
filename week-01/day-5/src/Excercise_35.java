import java.util.Scanner;

public class Excercise_35 {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                if (i%2 == 0) {
                    System.out.print("% ");
                }

                else if (i%2 != 0){
                    System.out.print(" %");

                }
            }
            System.out.println();
        }
    }
}
