import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_08_squarepositioning {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        int firstCord = (int) (Math.random() * 270);
        int secondCord = (int) (Math.random() * 293);
        squareFromTopLeft(graphics, firstCord, secondCord);
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

    public static void squareFromTopLeft(Graphics graphics, int cordX, int cordY) {
        for (int i = 0; i < 3; i++) {
            cordX = (int) (Math.random() * 370);
            cordY = (int) (Math.random() * 393);
            graphics.drawRect(cordX, cordY, 50, 50);
        }

    }
}