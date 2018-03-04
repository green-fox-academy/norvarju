package Counter;

public class Counter {

    private int number;
    private int initial;

    public Counter() {
        this.number = 0;
    }

    public Counter(int number) {
        this.number = number;
        initial = number;
    }

    public int add(int numberToAdd){
        number = numberToAdd + number;
        return number;
    }

    public void add(){
        number++;
    }

    public int get(){
        return number;
    }

    public int reset(){
        number = initial;
        return number;
    }
}
