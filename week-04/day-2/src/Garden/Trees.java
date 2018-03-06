package Garden;

public class Trees extends Flowers {

    private double absorb;


    public Trees(String name, int waterAmount) {
        super(name, waterAmount);
        setAbsorb(0.4);
        setType("tree");
        setWateringLimit(10);
    }

    public Trees() {
    }



    public void getStatus(){

        if(getWaterAmount() < 10){
            System.out.println("The " + getName() + " " + getType() + " needs" +
                    " " +
                    "water. Current water amount: " + getWaterAmount());
        } else {
            System.out.println("The " + getName() + " " + getType() + " " +
                    "desn't " +
                    "need " +
                    " " +
                    "water. Current water amount: " + getWaterAmount());
        }
    }

}
