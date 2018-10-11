package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Square {
    public static void mainDraw(Graphics graphics){
        graphics.drawRect(0, 0, 300, 300);
        lines(0, 0, 100, graphics);
    }


    public static void lines(int x, int y, int a, Graphics graphics) {
        graphics.drawLine(x + 1 * a, y + 0 * a, x + 1 * a, y + 3 * a);
        graphics.drawLine(x + 2 * a, y + 0 * a, x + 2 * a, y + 3 * a);
        graphics.drawLine(x + 0 * a, y + 1 * a, x + 3 * a, y + 1 * a);
        graphics.drawLine(x + 0 * a, y + 2 * a, x + 3 * a, y + 2 * a);
        if (a > 1) {
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++) {
                    lines(x + (i + j) * a, y + (i - j + 1) * a, a / 3, graphics);
                }
            }
//            lines(x + 0 * a, y + 1 * a, a / 3, graphics);
//            lines(x + 1 * a, y + 0 * a, a / 3, graphics);
//            lines(x + 1 * a, y + 2 * a, a / 3, graphics);
//            lines(x + 2 * a, y + 1 * a, a / 3, graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}