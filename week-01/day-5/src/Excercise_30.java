import java.util.Scanner;

public class Excercise_30 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number + 1; i++) {
            for (int k = 0; k < number - i * 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number - 1; i++) {
            for (int k = 0; k < (i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 2; j < 2 * number - (2 * i + 1); j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
