public class Refactorio {
    public static void main(String[] args) {
        System.out.println(factorio(2));
    }

    public static int factorio(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return factorio(number-1)*number;
        }
    }
}
