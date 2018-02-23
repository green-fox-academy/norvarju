import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lineplayquarters {
    public static void mainDraw(Graphics graphics) {

        linePQuarters(graphics);


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

    public static void linePQuarters(Graphics graphics) {

        int division = 8;
        int screenWidth = WIDTH/(division/2); /*150*/
        int distance = 5;
        graphics.drawRect(0, 0, 300, 300);

        for (int n = 0; n < division/2; n++) {
            for (int k = 0; k < division/2; k++) {
                graphics.setColor(new Color(0, 191, 27));
                for (int i = 0; i < screenWidth / distance; i++) {
                    graphics.drawLine(0 + screenWidth*n, distance * i + screenWidth * k, distance * i + screenWidth*n, screenWidth + screenWidth * k);
                }
                graphics.setColor(new Color(116, 0, 127));
                for (int j = 0; j < screenWidth / distance; j++) {
                    graphics.drawLine(distance * j + screenWidth*n, 0 + screenWidth * k, screenWidth + screenWidth*n, distance * j + screenWidth * k);
                }
            }
        }
    }
}
