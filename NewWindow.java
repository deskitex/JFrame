package Jframe;
import java.awt.Font;

import javax.swing.*;
public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow(){
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            label.setBounds(0, 0, 200, 200);
            label.setFont(new Font("Comic Sans", Font.PLAIN, 25));

            frame.add(label);
            frame.setVisible(true);
    }
}
