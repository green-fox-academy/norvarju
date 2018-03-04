package Pirate;

public class Main {
    public static void main(String[] args) {

        Parrot newParrot = new Parrot("Lory", "rainbow", 15);

        Ship newShip = new Ship();
        Ship opponentShip = new Ship();

        newShip.fillShip();

        System.out.println(newShip.getShip().get(1).getName() + " " + newShip.getShip().get(1).consumedRum());
        newShip.getShip().get(1).drinkSomeRum();
        System.out.println(newShip.getShip().get(1).getName() + " " + newShip.getShip().get(1).consumedRum());
        newShip.getShip().get(1).die();
        System.out.println(newShip.getShip().get(1).getIsDead());
        System.out.println(newShip.getShip().get(1).status());

        System.out.println(newShip.toString());

        opponentShip.fillShip();
        System.out.println(opponentShip.toString());

        System.out.println(newShip.battle(opponentShip));

        System.out.println(newShip.toString());
        System.out.println(opponentShip.toString());


    }
}
