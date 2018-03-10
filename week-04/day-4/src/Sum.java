import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    private List<Integer> listOfNumbers;

    public Sum() {
        listOfNumbers = new ArrayList<>();
    }

    public void addNumbers(int number){
        listOfNumbers.add(number);
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public int sumOfElements(){
        int sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            sum += listOfNumbers.get(i);
        }
        return sum;
    }
}
