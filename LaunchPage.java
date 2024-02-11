package Jframe;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
public class LaunchPage implements ActionListener,MouseListener{
    int sizeWindow = 500;
    int sizeButton = 100;
    Random random = new Random();
    int randomInt = random.nextInt(100);
        JFrame frame = new JFrame();
        JButton button = new JButton("New Windows");

        LaunchPage(){
            frame.setSize(sizeWindow,sizeWindow);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            button.setBounds(sizeWindow/2 - sizeButton,sizeWindow/2 - sizeButton,sizeButton*2,sizeButton);
            button.addActionListener(this);
            frame.addMouseListener(this);

            frame.add(button);
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                frame.dispose(); // Like queue Free godot, the window got deleted
                new NewWindow();
            }
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel label = new JLabel();
            label.setBackground(Color.red);
            label.setBounds(0,randomInt,200,200);
            label.setOpaque(true);
            frame.add(label);
            frame.repaint();
            System.out.println("haloo");

        }
        @Override
        public void mousePressed(MouseEvent e) {
            return;
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            return;
        }
        @Override
        public void mouseEntered(MouseEvent e) {
          return;
        }
        @Override
        public void mouseExited(MouseEvent e) {
            return;
        }
}
