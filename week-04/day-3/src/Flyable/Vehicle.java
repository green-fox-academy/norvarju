package Flyable;

public class Vehicle {

    private int flyHeight;
    private int maximumSpeed;
    private String type;
    private String color;

    public Vehicle(int flyHeight, int maximumSpeed, String type, String color) {
        this.flyHeight = flyHeight;
        this.maximumSpeed = maximumSpeed;
        this.type = type;
        this.color = color;
    }

    public Vehicle() {
    }
}
