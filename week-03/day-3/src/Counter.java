public class Counter {
    private int number;
    private int initialNumber;

    public Counter(){
        this.number = 0;
    }

    public Counter(int number) {
        this.number = number;
        initialNumber = number;
    }

    public int add(int anothernumber){
        number = number + anothernumber;
        return anothernumber;
    }

    public void add() {
        number++;
    }

    public int get() {
        return number;
    }

    public void reset(){
        number = initialNumber;
    }

    public static void main(String[] args) {
        Counter myCounter = new Counter(7);
        myCounter.add(20);
        myCounter.add();
        myCounter.reset();

        System.out.println(myCounter.number);
    }
}


