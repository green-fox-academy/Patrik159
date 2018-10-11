package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i <= 300; i = i + 20) {
            for (int j = 0; j <= 300; j = j + 300) {
                drawing(graphics, j, i);
                drawing(graphics, i, j);
            }
//            drawing(graphics, 0, i);
//            drawing(graphics, i, 0);
//            drawing(graphics, 300, i);
//            drawing(graphics, i, 300);
        }


    }

    public static void drawing (Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, 150, 150);
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