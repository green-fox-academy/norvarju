package Garden;

public class Flower extends Plant {
    public Flower(String color, String type, int waterAmount, double
            absorbentCapacity, int wateringLimit) {
        super(color, type, waterAmount, absorbentCapacity, wateringLimit);
    }

    public Flower(String color) {
        super(color);
        setType("Flower");
        setWaterAmount(0);
        setAbsorbentCapacity(0.75);
        setWateringLimit(5);
    }
}
