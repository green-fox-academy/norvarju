public class Sharpie {
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void us(){
        inkAmount--;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("Black", 16);
        sharpie.us();
        sharpie.us();
        System.out.println(sharpie.inkAmount);
    }
}
