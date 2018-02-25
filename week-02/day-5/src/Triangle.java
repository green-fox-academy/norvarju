import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        pyramid(graphics);

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

    static public void pyramid(Graphics graphics) {
        int a = 40;
        double m = Math.sqrt(a * a - (a / 2) ^ 2);
        System.out.println(Math.sqrt(40 * 40) - ((40 / 2) ^ 2));
        int x1 = 300;
        int y1 = 100;
        int x2 = 300 + (a / 2);
        double y2Double = 100 + m;
        int y2 = (int) y2Double;
        int rows = 9;
            for (int j = 0; j <rows; j++) {
                for ( int i = j ; i < rows; i++) {
                    graphics.drawLine(x1 - (a / 2 * i) + a * j, (int) (y1 + m * i), x2 - (a / 2 * i) + a * (j), (int) (y2 + (m * i)));
                    graphics.drawLine(x2 - (a / 2 * i) + a * j, (int) (y2 + m * i), x1 - (a / 2 * (i + 1)) + (a * j), (int) (y2 + m * i));
                    graphics.drawLine(x1 - (a / 2 * (i + 1)) + (a * j), (int) (y2 + m * i), x1 - (a / 2 * i) + a * j, (int) (y1 + m * i));
                }
        }
    }
}