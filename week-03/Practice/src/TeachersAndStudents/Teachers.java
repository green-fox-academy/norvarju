package TeachersAndStudents;

public class Teachers {

    private int patience; //the level of patience on a 1-10 list (1=impatient)

    public Teachers() {
        this.patience = 100;
    }

    public void teach(Students students){
        students.learn();
    }

    public void answer(){
        System.out.println("The captain is 76 years old.");
    }

    public void setPatience(){
        patience--;
    }

    public int getPatience(){
        return patience;
    }
}
