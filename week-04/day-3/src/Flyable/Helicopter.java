package Flyable;

public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(int flyHeight, int maximumSpeed, String type, String
            color) {
        super(flyHeight, maximumSpeed, type, color);
    }

    public Helicopter() {
    }

    @Override
    public void land() {
        System.out.println("The wheels touch the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The engine and the rotors keep the helicopter in " +
                "the air.");
    }

    @Override
    public void takeoff() {
        System.out.println("The wheels get lifted off the ground.");
    }
}
