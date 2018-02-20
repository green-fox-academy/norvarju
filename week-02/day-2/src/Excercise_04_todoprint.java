public class Excercise_04_todoprint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //  - Diablo

        String myTodo = "My todo:\n";
        String games = " - Download games\n";
        String diablo = " - Diablo\n";

        String result = myTodo.concat(todoText).concat(games).concat(diablo);
        System.out.println(result);
    }
}
