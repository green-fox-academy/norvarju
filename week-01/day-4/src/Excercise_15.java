import java.util.Scanner;

public class Excercise_15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        double miles = distance * 0.6214;
        System.out.println(miles + " miles");

    }
}
