package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Main {

    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        graphics.setColor(new Color(80,0,0,80));
        graphics.fillRect(0,0,100,100);
        graphics.setColor(new Color(160,0,0,80));
        graphics.fillRect(100,0,100,100);
        graphics.setColor(new Color(240,0,0,80));
        graphics.fillRect(200,0,100,100);
        graphics.setColor(new Color(80,0,0,160));
        graphics.fillRect(0,100,100,100);
        graphics.setColor(new Color(160,0,0,160));
        graphics.fillRect(100,100,100,100);
        graphics.setColor(new Color(240,0,0,160));
        graphics.fillRect(200,100,100,100);
        graphics.setColor(new Color(80,0,0,240));
        graphics.fillRect(0,200,100,100);
        graphics.setColor(new Color(160,0,0,240));
        graphics.fillRect(100,200,100,100);
        graphics.setColor(new Color(240,0,0,240));
        graphics.fillRect(200,200,100,100);


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