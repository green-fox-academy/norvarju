package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Station newStaion = new Station();

        System.out.println(myCar.getGasAmount());
        System.out.println(newStaion.getGasAmount());
        newStaion.refill(myCar);
        System.out.println(myCar.getGasAmount());
        System.out.println(newStaion.getGasAmount());

    }
}
