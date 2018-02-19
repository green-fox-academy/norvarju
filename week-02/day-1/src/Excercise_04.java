public class Excercise_04 {
    public static void main(String[] args){
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
        int topNumber = 3;
        sum(topNumber);
    }
    public static void sum (int addUntil){
        int sum = 0;
        for (int i = 0; i <= addUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
