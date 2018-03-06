package Garden;

public class Main {
    public static void main(String[] args) {
        Flowers lily = new Flowers("yellow", 0);
        Flowers rose = new Flowers("blue", 0);
        Trees oak = new Trees("purple", 0);
        Trees pine = new Trees("orange", 0);


        Garden myGarden = new Garden();
        myGarden.addFlower(lily);
        myGarden.addFlower(rose);
        myGarden.addTrees(oak);
        myGarden.addTrees(pine);

        myGarden.getStatus();

        System.out.println("--------------------------------------");

        myGarden.watering(40);
        myGarden.watering(20);
        myGarden.watering(20);
        myGarden.watering(20);

    }
}
