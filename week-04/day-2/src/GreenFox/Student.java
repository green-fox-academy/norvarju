package GreenFox;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String
            previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.previousOrganization = "School of Life";
        this.skippedDays = 0;
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " +
                getGender() + " from " + previousOrganization + " who skipped" +
                " " + skippedDays + " from the course already.");
    }

    public int skipDays(int numberOfDays){
        skippedDays = skippedDays + numberOfDays;
        return skippedDays;
    }
}
