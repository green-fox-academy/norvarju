package Garden;

public class Tree extends Plant{
    public Tree(String color, String type, int waterAmount, double
            absorbentCapacity, int wateringLimit) {
        super(color, type, waterAmount, absorbentCapacity, wateringLimit);
    }

    public Tree(String color) {
        super(color);
        setType("Tree");
        setWaterAmount(0);
        setAbsorbentCapacity(0.4);
        setWateringLimit(10);
    }
}
