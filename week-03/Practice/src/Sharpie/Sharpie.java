package Sharpie;

public class Sharpie {

    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public String getColor(){
        return color;
    }

    public float getWidth(){
        return width;
    }

    public void use(){

        inkAmount = inkAmount - 50;
    }

    public float getInkAmount(){

        return inkAmount;
    }

    @Override

    public String toString() {
        String result = "";
        result = "[" + color + " " + width + " " + inkAmount + "]" + " ";
        return result;
    }


}
