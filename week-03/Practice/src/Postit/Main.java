package Postit;

//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

public class Main {
    public static void main(String[] args) {
        Postit myPostit = new Postit("orange", "blue", "Idea 1");
        Postit myPostit2 = new Postit("pink", "black", "Awesome");
        Postit myPostit3 = new Postit("yellow", "green", "Superb");

        System.out.println(myPostit.getBackgroundColor() + " " + myPostit.getText() + " " + myPostit.getTextColor());
    }
}
