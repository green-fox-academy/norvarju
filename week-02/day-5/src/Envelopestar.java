import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Envelopestar {
    public static void mainDraw(Graphics graphics) {
        envelopeStar(graphics);

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
    public static void envelopeStar(Graphics graphics){

        graphics.setColor(new Color(0, 191, 27));
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(150, 10 * i, 150-(10 * i), 150);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(150, 300-(10*i), 150-(10*i), 150);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(150, 300-(10*i), 150+(10*i), 150);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(150, 10*i, 150+(i*10), 150);
        }
    }
}