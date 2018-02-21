import javax.swing.*;

        import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_15_connectdots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        connentingGame(graphics);
        drawShape(graphics);



    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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
    public static void connentingGame(Graphics graphics) {
        int[][] dots = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        graphics.setColor(new Color(16,127,11));
        for (int i = 0; i < 3; i++) {
            graphics.drawLine((dots[i][0]), (dots[i][1]), (dots[i + 1][0]), (dots[i + 1][1]));
        }
        graphics.drawLine(dots[3][0], dots[3][1], dots[0][0], dots[0][1]);
    }

        public static void drawShape(Graphics graphics){
            int[][] shape = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
            graphics.setColor(new Color(16,127,11));
            for (int i = 0; i < 7; i++) {
                graphics.drawLine((shape[i][0]), (shape[i][1]), (shape[i + 1][0]), (shape[i + 1][1]));
            }
            graphics.drawLine(shape[7][0], shape[7][1], shape[0][0], shape[0][1]);
        }
    }



// create a 300x300 canvas.