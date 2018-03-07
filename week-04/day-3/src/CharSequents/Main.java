package CharSequents;

public class Main {

    public static void main(String[] args) {
        Gnirts myWord = new Gnirts("scrumble");
        Shifter myShifted = new Shifter("scrumble", 2);

        System.out.println(myWord.length());
        System.out.println(myWord.charAt(2));
        System.out.println(myShifted.charAt(0));

    }
}
