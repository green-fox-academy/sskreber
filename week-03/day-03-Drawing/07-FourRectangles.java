import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        /* sskreber: was thinking of creating an ArrayList<String> with colour names, pulling out
        items of it randomly (with Math.random() on its indeces) and feeding it into the
        graphics.setColor command to avoid calling latter 4 times, but it doesn't accept String variables
        as an argument... How to avoid calling graphics.setColor 4 times then?... TBC.
         */

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                graphics.setColor(Color.GREEN);
            } else if (i == 1) {
                graphics.setColor(Color.RED);
            } else if (i == 2) {
                graphics.setColor(Color.BLUE);
            } else {
                graphics.setColor(Color.BLACK);
            }
            int rectX = (int) (Math.random() * (WIDTH));
            int rectY = (int) (Math.random() * (HEIGHT));
            int rectWidth = 1 + (int) (Math.random() * (WIDTH));
            int rectHeight = 1 + (int) (Math.random() * (HEIGHT));
            graphics.drawRect(rectX, rectY, rectWidth, rectHeight);
        }
    }

    //    Don't touch the code below
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