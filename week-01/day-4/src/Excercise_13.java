public class Excercise_13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int currSecAll = currentSeconds + (currentMinutes * 60) + (currentHours * 60 * 60);
        int SecoftheDay = 24 * 60 * 60;
        int remainingSec = SecoftheDay - currSecAll;
        System.out.println(remainingSec);
    }
}
