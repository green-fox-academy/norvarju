package Flyable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Helicopter myHelicopter = new Helicopter();
        Bird newBird = new Bird();

        System.out.println("How does the helicopter fly?");
        myHelicopter.takeoff();
        myHelicopter.fly();
        myHelicopter.land();
        System.out.println("-----------------------------");

        System.out.println("How does a bird fly?");
        newBird.takeoff();
        newBird.fly();
        newBird.land();
    }
}
