package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyApp {

    private JFrame frame;
    private static String filename = "src/ru/mirea/lab5/images/IMG_20200914_141441.png";

    public static void main(String[] args) {
        new MyApp().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setSize(400, 600);
        startApp();
    }

    static class DrawPanel extends JPanel {
        private BufferedImage image;

        public void paintComponent(Graphics g) {
            Graphics2D gr2d = (Graphics2D) g;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            gr2d.drawImage(image, 50, 50, 312, 416, this);
        }
    }

    private int index = 0;
    String[] imgs = {"src/ru/mirea/lab5/images/IMG_20200914_141441.png", "src/ru/mirea/lab5/images/IMG_20200914_141447.png", "src/ru/mirea/lab5/images/IMG_20200914_141451.png", "src/ru/mirea/lab5/images/IMG_20200914_141457.png"};

    private void startApp() {
        while (true) {
            filename =imgs[index];
            index = (index + 1) % 4;
            try {
                Thread.sleep(400);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }
}