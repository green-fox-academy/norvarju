package Turtle;

public class Turtle {
    private String name;
    private int weight;
    private int mood; // Mood in a 1-5 scale
    private int age;
    private int speed;
    private int initialSpeed;

    public Turtle(String name, int weight, int mood, int age, int velocity) {
        this.name = name;
        this.weight = weight;
        this.mood = mood;
        this.age = age;
        this.speed = velocity;
        initialSpeed = this.speed;
    }

    public void eat(){
        weight++;
        mood ++;
        speed --;
        setMood();
    }

    public void train(){
        weight--;
        mood --;
        speed ++;
    }

    public void watchFilm(){
        mood = 5;
    }

    public void setMood(){
        if (mood > 5){
            this.mood = 5;
        } else {
            this.mood = mood;
        }
    }

    public int getMood(){
        return mood;
    }

    public int getWeight(){
        return weight;
    }

    public int getSpeed(){
        return speed;
    }

    public int resetSpeed(){
        speed = initialSpeed;
        return speed;
    }
}
