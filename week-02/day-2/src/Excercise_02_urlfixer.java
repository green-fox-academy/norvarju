public class Excercise_02_urlfixer {
    public static void main(String[] args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String urlFixed = url.replace("bots", "odds");
        String urlFinal = urlFixed.replace("s/", "s:/");
        System.out.println(urlFinal);

    }
}
