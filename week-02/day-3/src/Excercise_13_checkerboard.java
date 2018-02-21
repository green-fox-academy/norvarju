import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_13_checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        checkerboard(graphics);

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
    public static void checkerboard(Graphics graphics) {
        int basicX1 = 0;
        int basicY1 = 0;
        int basicX2 = 0;
        int basicY2 = 0;
        int width = 50;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(basicX1 , basicY1+(width*i), width, width);
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(basicX1 + width, basicY1+(width*i) , width, width);
                    basicX1 += 2*width;
                } else if (i % 2 != 0) {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(basicX2, basicY2 + width*i, width, width);
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(basicX2 + width, basicY2 + width*i, width, width);
                    basicX2 += 2*width;
                }
            }
                basicX1 = 0;
                basicY1 = 0;
                basicX2 = 0;
                basicY2 = 0;


            }
        }


        }