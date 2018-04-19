import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, 0, WIDTH / 2, HEIGHT / 2);

        graphics.setColor(Color.RED);
        graphics.drawLine(0, HEIGHT, WIDTH / 2, HEIGHT / 2);

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 2, HEIGHT / 2, WIDTH, 02);

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 2, HEIGHT / 2, WIDTH, HEIGHT);
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