package Garden;

public class Plant {
    private String color;
    private String type;
    private double waterAmount;
    private double absorbentCapacity;
    private int wateringLimit;

    public Plant(String color, String type, double waterAmount, double
            absorbentCapacity, int wateringLimit) {
        this.color = color;
        this.type = type;
        this.waterAmount = waterAmount;
        this.absorbentCapacity = absorbentCapacity;
        this.wateringLimit = wateringLimit;
    }

    public Plant(String color) {
        this.color = color;
    }

    public Plant() {
    }

    public void watering(int addedWater) {
        waterAmount = waterAmount + (addedWater * absorbentCapacity);
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public void setAbsorbentCapacity(double absorbentCapacity) {
        this.absorbentCapacity = absorbentCapacity;
    }

    public void setWateringLimit(int wateringLimit) {
        this.wateringLimit = wateringLimit;
    }

    public boolean needsWaterOrNot(){
        return wateringLimit > waterAmount;
    }

    public void waterStatus() {
        if (waterAmount >= wateringLimit) {
            System.out.println("The " + getColor() + " " + getType()
                    + " doesn't need " +
                    "water. (Current water amount: " + getWaterAmount() + ")");
        } else {
            System.out.println("The " + getColor() + " " + getType() + " " +
                    "needs water. (Current water amount: " + getWaterAmount() +
                    ")");
        }
    }
}

