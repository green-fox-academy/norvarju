import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_07_fillwithrectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 4; i++) {
            int red = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            int cordX = (int) (Math.random()*320);
            int cordY = (int) (Math.random()*343);
            int width = (int) (Math.random()*150 + 50);
            int height = (int) (Math.random()*150 + 50);
            graphics.setColor(new Color(red, green, blue));
            graphics.fillRect(cordX, cordY, width, height);
        }
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}