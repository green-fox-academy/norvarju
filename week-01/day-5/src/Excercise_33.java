import java.util.Random;
import java.util.Scanner;

public class Excercise_33 {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8ű

        Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        Boolean win = false;

        while (win == false) {
            System.out.println("Please guess the number between 1 and 10:");
            int number = scanner.nextInt();
            if (random < number) {
                System.out.println("The stored number is lower");
            } else if (random > number) {
                System.out.println("The stored number is higher");
            } else {
                win = true;
            }
        }
        System.out.println("You won! The number was:" + random);
    }
}
