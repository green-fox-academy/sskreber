import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

        checkerBoardDrawer(graphics, 20);
    }

    public static void checkerBoardDrawer(Graphics graphics, int squareSize) {
        int i = 0;
        int j = 0;
        Color colour1 = new Color(255, 255, 255);
        Color colour2 = new Color(0, 0, 0);
        Color colourHolder;
        while (squareSize * j < HEIGHT) {
            while (squareSize * i < WIDTH) {
                graphics.setColor(colour1);
                graphics.fillRect(squareSize * i, squareSize * j, squareSize, squareSize);
                i++;
                graphics.setColor(colour2);
                graphics.fillRect(squareSize * i, squareSize * j, squareSize, squareSize);
                i++;
            }
            j++;
            i = 0;
            colourHolder = colour1;
            colour1 = colour2;
            colour2 = colourHolder;
        }
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
   