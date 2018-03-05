package Homework;

public class Student extends Person {
    private String name;
    private int age;
    private String gender;
    private String previousOrganization;
    private int skippedDays;
    private int numberOfDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                gender + " from " + previousOrganization + " who skipped " +
                skippedDays + " days from the course already");
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public int skipDays(int numberOfDays){
        skippedDays = skippedDays + numberOfDays;
        return skippedDays;
    }
}
