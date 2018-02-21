import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_12_purplesteps3D {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int size = 10;
        purpleSteps3D(graphics, size);
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
    public static void purpleSteps3D(Graphics graphics, int width) {
        int basicX = 0;
        int basicY = 0;
        width = 10;

        for (int i = 0; i < 10; i++) {
            graphics.setColor(new Color(106, 0, 127));
            graphics.fillRect(basicX, basicY, width, width);
            basicX += width;
            basicY += width;
            width += (0.5 * width);
        }
    }
}