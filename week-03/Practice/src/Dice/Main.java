package Dice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dice diceSet = new Dice();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

        rollDice(diceSet);
    }

    public static Dice rollDice(Dice myDice){
        int counter = 0;
        for (int i = 0; i < myDice.getCurrent().length ; i++) {
            while(myDice.getCurrent(i) != 6){
                myDice.reroll(i);
                counter ++;
                System.out.println(Arrays.toString(myDice.getCurrent()));
            }
        }
        return myDice;
    }
}
