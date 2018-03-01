public class Bunnies2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
        System.out.println(oddBunnies(1, 2));
    }

    public static int oddBunnies(int bunnies, int lineNumber){
        if(bunnies == 1 && lineNumber%2 == 0){
                return 3;
        } else if (bunnies == 1 && lineNumber % 2 != 0){
                return 2;
        } else {
            if (lineNumber % 2 == 0) {
                return 3 + oddBunnies(bunnies - 1, lineNumber);
            } else {
                return 2 + oddBunnies(bunnies - 1, lineNumber);
            }
        }
        }
    }
