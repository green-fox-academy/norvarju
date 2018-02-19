import java.util.Scanner;

public class Excercise_34 {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        System.out.println("Enter a number, please:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double start = 0;
            for (int j = 0; j < number; j++) {
                System.out.println("Please enter another number");
                int newNumber = scanner.nextInt();
                start += newNumber;
            }
        System.out.println("The sum is: " + start);
        System.out.println("The average is: " + start / number);
    }
    }

