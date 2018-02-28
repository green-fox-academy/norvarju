public class Postit {
        private String backgroundColor;
        private String text;
        private String textColor;

    public Postit(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args){

        Postit postit1 = new Postit("orange", "Idea 1", "blue");
        Postit postit2 = new Postit("pink", "Awesome", "black");
        Postit postit3 = new Postit("yellow", "Superb!", "green");
    }
}


