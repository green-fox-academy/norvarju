import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Collections;
import java.util.Scanner;

public class Excercise_28 {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j <= i) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
