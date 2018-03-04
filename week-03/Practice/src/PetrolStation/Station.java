package PetrolStation;

public class Station {

    private int gasAmount;

    public Station() {
        this.gasAmount = 10000;
    }

    public void refill(Car car){
        car.setGasAmount();
        gasAmount = gasAmount - car.getGasAmount();
    }

    public int getGasAmount(){
        return gasAmount;
    }
}
