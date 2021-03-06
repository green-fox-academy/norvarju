package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        //System.out.println(dominoes.get(0).getValues()[1]);
        //System.out.println(sortTheDominoes(dominoes));


        /*for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 1; j < dominoes.size(); j++) {
                if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
                    dominoes.add(i+1, dominoes.get(j));
                    dominoes.remove(j+1);
                }
            }
        }
        System.out.println(dominoes);*/

        Collections.sort(dominoes);
        System.out.println(dominoes.toString());
        for (Domino d : dominoes) {
            d.printAllFields();
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static List<Domino> sortTheDominoes( List<Domino> dominoList) {
        for (int i = 0; i < dominoList.size(); i++) {
            for (int j = 1; j < dominoList.size(); j++) {

                if (dominoList.get(i).getValues()[1] == dominoList.get(j).getValues()[0]) {
                    dominoList.add(i + 1, dominoList.get(j));
                    dominoList.remove(j + 1);
                }
            }
        }
        return dominoList;
    }


}

