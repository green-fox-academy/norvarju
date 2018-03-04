public class Animals {

    private int hunger;
    private int thurst;

    public void eat(){
        hunger--;
    }

    public void drink(){
        thurst--;
    }

    public void play(){
        hunger++;
        thurst++;
    }

    public Animals() {
        this.hunger = 50;
        this.thurst = 50;
    }

    public static void main(String[] args){
        Animals animals = new Animals();
        animals.play();
        System.out.println(animals.hunger);
        animals.play();
        animals.play();
        System.out.println(animals.hunger);

    }
}


