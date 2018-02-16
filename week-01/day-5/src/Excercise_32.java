import java.util.Scanner;

public class Excercise_32 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                if (j == i || j == 0 || j == number -1 ) {
                    System.out.print("%");
                }

                else if (i == 0 || i == number - 1){
                    System.out.print("%");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
