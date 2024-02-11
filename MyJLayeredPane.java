package Jframe;

import java.awt.Color;
import javax.swing.*;
public class MyJLayeredPane {
    public static void main(String[] args) {
        
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null); 

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    label1.setBackground(Color.RED);
    label1.setOpaque(true);
    label1.setBounds(50,50,200,200);

    label2.setBackground(Color.BLUE);
    label2.setOpaque(true);
    label2.setBounds(100,100,200,200);

    label3.setBackground(Color.GREEN);
    label3.setOpaque(true);
    label3.setBounds(150,150,200,200);

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0, 0, 500, 500);

    layeredPane.add(label1,0);
    layeredPane.add(label2,2);
    layeredPane.add(label3,1);

    frame.add(layeredPane);
    frame.setVisible(true);
}
}

