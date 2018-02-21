import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_14_everythinggoestocenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        linesToCenter(graphics);


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

    public static void linesToCenter(Graphics graphics) {
        int coordX = 0;
        int coordY = 0;
        for (int i = 0; i < 320/20 ; i++) {
            graphics.drawLine(coordX + 20 * (i), 0, 160, (int) 171.5);
        }
        for (int i = 0; i < 320/20 ; i++){
            graphics.drawLine(coordX + 20 * (i), 343, 160, (int) 171.5);
        }
        for (int i = 0; i < 343/20 ; i++) {
            graphics.drawLine(0, coordY + 20 * (i), 160, (int) 171.5);
        }
        for (int i = 0; i < 343/20 ; i++) {
            graphics.drawLine(320, coordY + 20 * (i), 160, (int) 171.5);
        }
        graphics.drawLine(320, 343, 160, (int) 171.5);
        }
    }