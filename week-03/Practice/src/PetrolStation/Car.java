package PetrolStation;

public class Car {

    private int gasAmount;
    private int capacity;

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public void setGasAmount(){
        gasAmount = gasAmount + capacity;
    }

    public int getGasAmount(){
        return gasAmount;
    }


}
