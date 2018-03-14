package Exam;

import java.util.ArrayList;

public class PirateCounter {
    static class Pirate {
        String name;
        boolean hasWoodenLeg;
        int gold;

        Pirate(String name, boolean hasWoodenLeg, int gold) {
            this.name = name;
            this.hasWoodenLeg = hasWoodenLeg;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public boolean hasWoodenLegOrNot() {
            return hasWoodenLeg;
        }

        public int getGold() {
            return gold;
        }

        public String toString(){
            return name;
        }
    }

    public static void main(String[] args){
        ArrayList<Pirate> pirates = new ArrayList<>();

        // Given this list...

        pirates.add(new Pirate("Olaf", false, 12));
        pirates.add(new Pirate("Uwe", true, 9));
        pirates.add(new Pirate("Jack", true, 16));
        pirates.add(new Pirate("Morgan", false, 17));
        pirates.add(new Pirate("Hook", true, 20));

        // Write a function that takes any list that contains pirates as in the example,
        // And returns a list of names containing the pirates that
        // - have wooden leg and
        // - have more than 15 gold
        System.out.println(listOfPirates(pirates));
    }

    public static ArrayList<String> listOfPirates(ArrayList<Pirate> pirates1){
        ArrayList<String> sortedPirates = new ArrayList<>();
        for (int i = 0; i < pirates1.size(); i++) {
            if(pirates1.get(i).hasWoodenLegOrNot() && pirates1.get(i).getGold()
                    > 15){
                sortedPirates.add(pirates1.get(i).getName());
            }
        }
        return sortedPirates;
    }
}
