import java.util.Arrays;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Excercise_10_elementfinder {
    public static void main(String[] args){
        ArrayList<Integer> arrayList =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        //System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
        containSeven(arrayList);
}
    public static ArrayList containSeven(ArrayList<Integer> numberList){
        if(numberList.contains(7)){
            System.out.println("Hurray!");
        }else{
            System.out.println("Nooooo!");
        }
        return numberList;
    }
    }