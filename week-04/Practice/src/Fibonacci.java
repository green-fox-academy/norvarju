import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  //Write a function that computes a member of the fibonacci sequence by a given index
  //Create tests that covers all types of input (like in the previous workshop exercise)

  private int number;

  public Fibonacci() {
    this.number = number;
  }

  public int nthMemberOfFibonacciSequence(int indexOfNumber){
    List<Integer> listOfFibonacci = new ArrayList<>();
    listOfFibonacci.add(0);
    listOfFibonacci.add(1);
    for (int i = 2; i < 21; i++) {
      listOfFibonacci.add(i, listOfFibonacci.get(i-1) + listOfFibonacci.get(i-2));
    }
    return listOfFibonacci.get(indexOfNumber);
  }

  public static void main(String[] args) {
    Fibonacci myFibonacciChecker = new Fibonacci();
    System.out.println(myFibonacciChecker.nthMemberOfFibonacciSequence(20));
  }
}
