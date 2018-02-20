public class Excercise_03_takeslonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String missingPart = "always takes longer than";
        String beginToConcat = quote.substring(0, 21);
        String afterConcat = quote.substring(20);
        String concated = beginToConcat.concat(missingPart);
        String result = concated.concat(afterConcat);

        System.out.println(quote);
        System.out.println(result);
    }
}
