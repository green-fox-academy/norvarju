public class Excercise_05 {
    public static void main(String[] args){
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        int number = 5;
        factorio(number);
    }
   public static void factorio (int factNumber){
    int fact = 1;
    for (int i = 2; i <= factNumber ; i++) {
        fact *= i ;
    }
    System.out.println(fact);
}
}
