package Domino;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        System.out.println(dominoes.get(2).getValues()[0]);
        System.out.println((sortDominoes(dominoes)));
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

    public static List<Domino> sortDominoes(List<Domino> myDominoes){
        for (int i = 0; i < myDominoes.size(); i++) {
            for (int j = 0; j < myDominoes.size(); j++) {
                if (myDominoes.get(i).getValues()[1] == myDominoes.get(j).getValues()[0]){
                    myDominoes.add(i+1, myDominoes.get(j));
                    myDominoes.remove(j+1);
                }
            }
        }
        return myDominoes;
    }
}
