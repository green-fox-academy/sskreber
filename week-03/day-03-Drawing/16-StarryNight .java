import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int squareSize = 2;
        int[][] colourList = {
                {47, 79, 79},
                {105, 105, 105},
                {112, 128, 144},
                {119, 136, 153},
                {128, 128, 128},
                {169, 169, 169},
                {192, 192, 192},
                {211, 211, 211},
                {220, 220, 220}
        };
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int randomIndex = random.nextInt(colourList.length);
            graphics.setColor(new Color(colourList[randomIndex][0], colourList[randomIndex][1], colourList[randomIndex][2]));
            graphics.fillRect(random.nextInt(WIDTH - squareSize), random.nextInt(HEIGHT - squareSize), squareSize, squareSize);
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

