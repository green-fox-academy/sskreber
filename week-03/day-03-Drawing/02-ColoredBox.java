import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.ORANGE);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH / 4 * 3, HEIGHT / 4);

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH / 4, HEIGHT / 4 * 3);

        graphics.setColor(new Color(50, 200, 150));
        graphics.drawLine(WIDTH / 4, HEIGHT / 4 * 3, WIDTH / 4 * 3, HEIGHT / 4 * 3);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(WIDTH / 4 * 3, HEIGHT / 4 * 3, WIDTH / 4 * 3, HEIGHT / 4);
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