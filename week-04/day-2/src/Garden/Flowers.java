package Garden;

public class Flowers    {

    private String name;
    private double waterAmount;
    private String type;
    private double absorb;
    private double wateringLimit;

    public Flowers(String name, int waterAmount) {
        this.name = name;
        this.waterAmount = waterAmount;
        this.type = "flower";
        this.absorb = 0.75;
        wateringLimit = 5;
    }

    public Flowers() {
    }

    public double getWaterAmount(){
        return waterAmount;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAbsorb(double absorb) {
        this.absorb = absorb;
    }

    public void setWaterAmount(int addedWater) {
        waterAmount = waterAmount + (addedWater*absorb);
    }

    public void setWateringLimit(int wateringLimit) {
        this.wateringLimit = wateringLimit;
    }

    public void watering(int addedWater){
        if (getWaterAmount() < wateringLimit) {
            setWaterAmount(addedWater);
        }
        getStatus();

    }

    public void getStatus(){

        if(getWaterAmount() < 5){
            System.out.println("The " + getName() + " " + getType() + " needs" +
                    " " +
                    "water. Current water amount: " + getWaterAmount());
        } else {
            System.out.println("The " + getName() + " " + getType() + " " +
                    "doesn't " +
                    "need " +
                    " " +
                    "water. Current water amount: " + getWaterAmount());
        }
    }
}
