import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_16_starrynight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int firstCoord = (int)(Math.random()*300);
        int secondCoord = (int)(Math.random()*330);
        int color1 = (int)(Math.random()*255);
        int color2 = (int)(Math.random()*255);
        int color3 = (int)(Math.random()*255);
        starryNight(graphics, firstCoord, secondCoord, color1, color2, color3);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

    public static void starryNight(Graphics graphics, int coordX, int coordY, int red, int green, int blue) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 320, 343);
        for (int i = 0; i < 100 ; i++) {
            coordX = (int)(Math.random()*300);
            coordY = (int)(Math.random()*330);
            red = (int)(Math.random()*255);
            green = (int)(Math.random()*255);
            blue = (int)(Math.random()*255);
            graphics.setColor(new Color(red, green, blue));
            graphics.fillRect(coordX, coordY, 1, 1);
        }
    }
}