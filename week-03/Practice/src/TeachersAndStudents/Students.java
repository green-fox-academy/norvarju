package TeachersAndStudents;

public class Students {

    private int knowledge; //the level of knowledge on a 1-10 list

    public Students() {
        this.knowledge = 100;
    }

    public void learn(){
        knowledge++;
    }

    public void question(Teachers teachers){
        System.out.println("Miss Eliot, how old is the captain?");
        teachers.answer();
        teachers.setPatience();
    }

    public int getKnowledge(){
        return knowledge;
    }




}
