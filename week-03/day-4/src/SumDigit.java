public class SumDigit {

    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    public static void main(String[] args) {
        System.out.println(sumdigit(333));
        /*int number = 123;
        int secondDigit = number;
        int thirdDigit = number;

        for (int i = 0; i < 2; i++) {
            number = number/10;
            thirdDigit = thirdDigit%10;
            secondDigit = secondDigit%100;
            }

        System.out.println(number);
        System.out.println(secondDigit/10);
        System.out.println(thirdDigit);

        int number2 = 1234;
        int secondDigit2 = number;
        int thirdDigit2 = number;

        for (int i = 0; i < 3; i++) {
            number2 = number/10;
            thirdDigit2 = thirdDigit%10;
            secondDigit2 = secondDigit%100;
        }

        System.out.println(number2);
        System.out.println(secondDigit2/10);
        System.out.println(thirdDigit2);


        }*/
    }

    public static int sumdigit(int number) {
        if (number < 10) {
            return number;
        } else {
            int result = sumdigit(number / 10) + number%10;
            return result;
        }


    }
}
