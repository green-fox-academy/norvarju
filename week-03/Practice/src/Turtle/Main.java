package Turtle;

public class Main {

    public static void main(String[] args) {
        Turtle myTurtle = new Turtle("Jarry", 20, 20, 69, 5);

        myTurtle.setMood();
        myTurtle.getMood();
        //System.out.println(myTurtle.getMood());
        //System.out.println(myTurtle.getWeight());
        myTurtle.eat();
        myTurtle.eat();
        myTurtle.eat();
        System.out.println(myTurtle.getMood());
        System.out.println(myTurtle.getWeight());
        myTurtle.eat();
        System.out.println(myTurtle.getMood());
        System.out.println(myTurtle.getWeight());
        myTurtle.train();
        myTurtle.train();
        myTurtle.train();
        System.out.println(myTurtle.getMood());
        System.out.println(myTurtle.getWeight());
        System.out.println(myTurtle.getSpeed());
        myTurtle.resetSpeed();
        System.out.println(myTurtle.getSpeed());
        myTurtle.train();
        myTurtle.train();
        System.out.println(myTurtle.getSpeed());
        myTurtle.resetSpeed();
        System.out.println(myTurtle.getSpeed());


    }
}
