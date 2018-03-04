package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        Ship leviathanShip = new Ship();
        Ship nautilusShips = new Ship();

        leviathanShip.fillShip();
        System.out.println(leviathanShip.toString());
        nautilusShips.fillShip();
        System.out.println(nautilusShips.toString());

        leviathanShip.battle(nautilusShips);

        System.out.println(leviathanShip.toString());
        System.out.println(nautilusShips.toString());
    }
}
