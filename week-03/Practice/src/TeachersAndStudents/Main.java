package TeachersAndStudents;

public class Main {
    public static void main(String[] args) {
        Teachers teachers = new Teachers();
        Students students = new Students();

        System.out.println(students.getKnowledge());
        teachers.teach(students);
        System.out.println(students.getKnowledge());
        System.out.println(teachers.getPatience());
        students.question(teachers);
        students.question(teachers);
        System.out.println(teachers.getPatience());
        students.learn();
        students.learn();
        System.out.println(students.getKnowledge());
        teachers.teach(students);
        System.out.println(students.getKnowledge());






    }
}
