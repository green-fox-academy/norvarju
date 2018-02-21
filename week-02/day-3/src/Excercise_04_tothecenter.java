import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise_04_tothecenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int firstCo = (int) (Math.random()) * 320;
        int secondCo = (int) (Math.random()) * 343;
        drawLineForMe(graphics, firstCo, secondCo);
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
        public static void drawLineForMe(Graphics graphics, int coordinateX, int coordinateY) {
            for (int i = 0; i < 3; i++) {
                coordinateX = (int) (Math.random() * (320));
                coordinateY = (int) (Math.random() * (340));
                graphics.setColor(Color.RED);
                graphics.drawLine(coordinateX, coordinateY, 160, (int) 171.5);
            }
        }
}
