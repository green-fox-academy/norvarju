public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {
        counter(5);
    }

    public static int counter(int number){
        if(number < 0){
            return 1;
        } else {
            System.out.println(number);
            counter(number - 1);
            return number;
        }

    }
}
