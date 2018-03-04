package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Pirate> ship;
    private String captain;
    private int numberOfCrew;
    private int numberOfLoss;
    private int barrelsOfRum;

    public Ship() {
        ship = new ArrayList<>();
        this.captain = captain;
        numberOfCrew = (int) (Math.random()*15 + 6);
        numberOfLoss = (int) (Math.random()*numberOfCrew + 1);
        barrelsOfRum = (int) (Math.random()*10 + 2);
    }

    public void fillShip(){
        for (int i = 0; i < numberOfCrew; i++) {
            ship.add(new Pirate());
        }
        ship.get(0).setIsCaptain();
        ship.get(0).setName();
    }

    public int getNumberOfCrew(){
        return numberOfCrew;
    }

    public List<Pirate> getShip(){
        for (int i = 0; i < ship.size(); i++) {
            ship.get(i);
        }
        return ship;
    }

    public int numberOfAlive(){
        int countAlive = 0;
        for (int i = 0; i < ship.size(); i++) {
            if(ship.get(i).getIsDead() == false){
                countAlive ++;
            }
        }
        return countAlive;
    }

    public Boolean battle(Ship ship1) {
        if ( (numberOfAlive() - ship.get(0).getLevelOfIntoxcation()) > (ship1.numberOfAlive() -
                ship1.getShip().get(1).getLevelOfIntoxcation())) {
            ship1.outComeOfWar();
            party();
            return true;
        } else {
            outComeOfWar();
            return false;
        }
    }

    public void outComeOfWar(){
        for (int i = 0; i < numberOfLoss; i++) {
            ship.get(i).die();
        }
    }

    public void party(){
        System.out.println("Hurray, we won, let's have a party!! " + barrelsOfRum + " barrels of" +
                " " +
                "rum will be needed!");

    }





    @Override

    public String toString() {
        String result = "THE SHIP OF PIRATES:";
        for (int i = 0; i < ship.size(); i++) {
            result += "\n" + "[" + ship.get(i).getName() + " " + ship
                    .get(i).consumedRum() + " " + ship.get(i).status() + "] ";

        }
        result += "\nTHE NUMBER OF ALIVE PIRATES: " + numberOfAlive() + "\n";
        return result;

    }


}
