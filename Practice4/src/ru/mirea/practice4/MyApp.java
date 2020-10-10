package ru.mirea.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyApp extends JFrame {

    JButton but1 = new JButton("AC Milan");
    JButton but2=new JButton("Real Madrid");

    JLabel lab1=new JLabel("Result: 0 X 0");
    JLabel lab2 = new JLabel("Last Scorer: N/A");
    JLabel lab3 = new JLabel("Winner: DRAW");


    public MyApp()
    {
        super("MyApp");

        setSize(500,400);
        add(lab1,BorderLayout.WEST);
        add(lab3,BorderLayout.EAST);
        add(lab2,BorderLayout.CENTER);
        add(but1, BorderLayout.NORTH);
        add(but2, BorderLayout.SOUTH);

        final int[] t1 = {0};
        final int[] t2 = {0};
        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                t1[0] +=1;
                lab1.setText("Result: "+ t1[0] +" X "+ t2[0]);
                lab2.setText("Last Scorer: AC Milan");
                if (t1[0]>t2[0])
                    lab3.setText("Winner: AC Milan");
                else if(t1[0]==t2[0])
                    lab3.setText("Winner: N/A");
                else
                    lab3.setText("Winner: Real Madrid");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                t2[0] +=1;
                lab1.setText("Result: "+ t1[0] +" X "+ t2[0]);
                lab2.setText("Last Scorer: Real Madrid");
                if (t1[0]>t2[0])
                    lab3.setText("Winner: AC Milan");
                else if(t1[0]==t2[0])
                    lab3.setText("Winner: N/A");
                else
                    lab3.setText("Winner: Real Madrid");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });



        setVisible(true);

    }


    public static void main(String[] args) {
        new MyApp();
    }
}
