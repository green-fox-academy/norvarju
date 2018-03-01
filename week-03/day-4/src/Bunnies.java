public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunny(9));
    }

    public static int bunny(int bunnies){
        if(bunnies == 1){
            return 2;
        } else {
            return 2 + bunny(bunnies-1);
        }
    }
}
