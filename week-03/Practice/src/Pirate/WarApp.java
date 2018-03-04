package Pirate;

public class WarApp {
    public static void main(String[] args) {
        Armada eclipse = new Armada();
        Armada lazarus = new Armada();

        eclipse.fillArmda();
        lazarus.fillArmda();

        System.out.println(eclipse.toString());

    }
}
