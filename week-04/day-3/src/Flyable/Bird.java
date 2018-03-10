package Flyable;

public class Bird implements Flyable{

    private String colorOfBeak;

    public Bird(String name, int age, String gender, int numberOfLegs, String
            sound, int hunger, String colorOfBeak) {
        this.colorOfBeak = colorOfBeak;
    }

    public Bird() {
    }

    @Override
    public void land() {
        System.out.println("The legs touch the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The wing beats keep the bird in the " +
                "air.");
    }

    @Override
    public void takeoff() {
        System.out.println("The legs get lifted off the ground.");
    }
}
