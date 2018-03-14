package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
    public static void main(String[] args) {
      // Create a function that takes a list as a parameter,
      // and returns a new list with every second element from the orignal list
      // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
      List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
      System.out.println(listOfSecondElements(listOfNumbers).toString());
    }

    public static List<Integer> listOfSecondElements(List<Integer> listToTransform){
      List<Integer> myList = new ArrayList<>();
      /*for (int i = 1; i < listToTransform.size(); i+=2) {
        myList.add(listToTransform.get(i));
      }*/
      for (int i = 0; i < listToTransform.size(); i++) {
        if(i%2 == 1){
          myList.add(listToTransform.get(i));
        }
      }
      return myList;
    }
  }
