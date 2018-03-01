public class Numberadder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {
        System.out.println(numberAdder(4));
    }

    public static int numberAdder(int number){
        int numbersToAdd = 0;
        if(number < 0){
            return 0;
        } else {
            numbersToAdd = numberAdder(number-1) + number;
            //System.out.println(numbersToAdd);
            return numbersToAdd;
        }

    }
}
