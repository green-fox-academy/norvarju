import java.util.ArrayList;

public class Excercise_09_candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        //System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
        //System.out.println(arrayList.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(2)) {
                arrayList.set(i, "Croissan");
            } else if (arrayList.get(i).equals(false)) {
                arrayList.set(i, "Ice cream");
            }
        }
        System.out.println(arrayList.toString());
    }
}
