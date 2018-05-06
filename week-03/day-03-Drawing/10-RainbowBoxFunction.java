// Create a square drawing function that takes 2 parameters:
// The square size, and the fill color,
// and draws a square of that size and color to the center of the canvas.
// Create a loop that fills the canvas with rainbow colored squares.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        int squareSize;
        int[] colourCode = new int[3];

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < colourCode.length; j++) {
                colourCode[j] = (int) (Math.random() * 256);
            }
            squareSize = (int) (1 + Math.random() * WIDTH);
            drawSquare(graphics, colourCode, squareSize);
        }
    }

    public static void drawSquare(Graphics graphics, int[] colour, int squareSize) {
        graphics.setColor(new Color(colour[0], colour[1], colour[2]));
        graphics.fillRect((WIDTH - squareSize) / 2, (HEIGHT - squareSize) / 2, squareSize, squareSize);
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
   