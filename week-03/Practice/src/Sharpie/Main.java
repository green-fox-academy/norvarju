package Sharpie;

/*Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
        When creating one, we need to specify the color and the width
        Every sharpie is created with a default 100 as inkAmount
        We can use() the sharpie objects
        which decreases inkAmount*/

public class Main {
    public static void main(String[] args) {
        Sharpie mySharpie1 = new Sharpie("black" , 5);
        Sharpie mySharpie2 = new Sharpie("blue", 3);
        Sharpie mySharpie3 = new Sharpie("green", 10);
        Sharpie mySharpie4 = new Sharpie("pink", 15);
        Sharpie mySharpie5 = new Sharpie("purple", 7);
        SharpieSet mySharpieSet = new SharpieSet();

        System.out.println(mySharpieSet.getSharpies().toString());
        System.out.println(mySharpie1.getColor() + " " + mySharpie1.getWidth());

        mySharpieSet.setSharpies(mySharpie1);
        mySharpieSet.setSharpies(mySharpie2);
        mySharpieSet.setSharpies(mySharpie3);
        mySharpieSet.setSharpies(mySharpie4);
        mySharpieSet.setSharpies(mySharpie5);

        mySharpie1.use();
        mySharpie1.use();

        System.out.println(mySharpie1.getInkAmount());
        System.out.println(mySharpieSet.countUsable());
        mySharpieSet.removeTrash();
        System.out.println(mySharpieSet.toString());

    }
}
