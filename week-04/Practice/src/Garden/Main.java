package Garden;

public class Main {
    public static void main(String[] args) {
        Tree pine = new Tree("purple");
        Tree apple = new Tree("orange");
        Flower lily = new Flower("yellow");
        Flower orchid = new Flower("blue");
        Garden myGarden = new Garden();
        myGarden.addFlower(lily);
        myGarden.addFlower(orchid);
        myGarden.addTree(pine);
        myGarden.addTree(apple);
        myGarden.waterStatus();
        myGarden.watering(40);
        myGarden.waterStatus();
        myGarden.watering(70);
        myGarden.waterStatus();
    }
}
