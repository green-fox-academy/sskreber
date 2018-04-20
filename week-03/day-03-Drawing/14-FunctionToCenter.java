import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x1 = 0;
        int y1 = 0;
        int i = 0;
        int j = 0;
        while (20 * i < HEIGHT) {
            goToCenter(graphics, x1, i * 20);
            goToCenter(graphics, WIDTH, i * 20);
            i++;
            if (20 * j < WIDTH) {
                goToCenter(graphics, i * 20, y1);
                goToCenter(graphics, i * 20, HEIGHT);
                j++;
            }
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