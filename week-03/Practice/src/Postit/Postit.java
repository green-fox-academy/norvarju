package Postit;

public class Postit {
    private String backgroundColor;
    private String text;
    private String textColor;

    public Postit(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public String getBackgroundColor(){
        return backgroundColor;
    }

    public String getText(){
        return text;
    }

    public String getTextColor(){
        return textColor;
    }


}
