package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    private List<Ship> armada;
    private int sizeOfArmada;

    public Armada() {
        armada = new ArrayList<>();
        this.sizeOfArmada = (int) (Math.random()*3 + 5);
    }

    public void fillArmda(){
        for (int i = 0; i < sizeOfArmada; i++) {
            armada.add(new Ship());
            for (int j = 0; j < armada.get(i).getNumberOfCrew()-1; j++) {
                armada.get(i).getShip().add(new Pirate());
            }
        }



    }

    public void war(Armada armada){

    }

    @Override

    public String toString(){
        String result = "";

        for (int j = 0; j < armada.size(); j++) {
            result += "-- ARMADA" + (j+1);
            for (int i = 0; i < armada.get(i).getShip().size()-1; i++) {
                result += "[" + armada.get(j).getShip().get(i).getName() + "] ";
            }
            result += "--\n";
        }
        return result;
    }
}
