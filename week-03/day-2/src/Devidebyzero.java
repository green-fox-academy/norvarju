public class Devidebyzero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args){
        divide(1);

    }
    public static int divide(int numberToDevide) {

            try {
                int result = 10 / numberToDevide;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("fail");
            }
            return numberToDevide;
    }
}
