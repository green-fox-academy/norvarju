package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> sharpies;

    public SharpieSet() {
        sharpies = new ArrayList<>();
    }

    public void setSharpies(Sharpie sharpies1) {
        sharpies.add(sharpies1);
    }

    public List<Sharpie> getSharpies() {
        return sharpies;
    }

    @Override

    public String toString() {
        String result = "";
        for (int i = 0; i < sharpies.size(); i++) {
            result += sharpies.get(i);
        }
        return result;
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() >= 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash(){
        for (int i = 0; i < sharpies.size(); i++) {
            if(sharpies.get(i).getInkAmount() == 0){
                sharpies.remove(i);
            }
        }
    }
}
