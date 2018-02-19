public class Excercise_06 {
    public static void main(String [] args){
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourth")
        // ...
        String[] givenNumber = {"first", "second" , "third", "fourth", "fifth"};
        printer(givenNumber);
    }
    public static void printer(String[] numberInput){
        for (int i = 0; i < numberInput.length ; i++) {
            System.out.print(numberInput[i] + " ");

        }
    }
}
