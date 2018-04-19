import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int x1 = 0;
        int y1 = 0;
        for (int i = 0; i < 3; i++) {
            x1 = (int) (Math.random() * (WIDTH + 1));
            y1 = (int) (Math.random() * (HEIGHT + 1));
            System.out.println("This is x1: " + x1);
            System.out.println("This is y1: " + y1);
            goToCenter(graphics, x1, y1);
        }
    }

    private static void goToCenter(Graphics graphics, int x1, int y1) {
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, WIDTH / 2, HEIGHT / 2);
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
}