package com.company;

import javax.swing.*;



import java.awt.*;



import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {

        // Draw a box that has different colored lines on each edge.

        graphics.drawLine(25, 25, 150, 25);
        graphics.setColor(new Color(255, 0, 0, 255));
        graphics.drawLine(150, 25, 150, 75);
        graphics.setColor(new Color(0, 255, 0, 255));
        graphics.drawLine(150, 75, 25, 75);
        graphics.setColor(new Color(0, 0, 255, 255));
        graphics.drawLine(25, 75, 25, 25);




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