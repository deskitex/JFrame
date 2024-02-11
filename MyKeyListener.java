package Jframe;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyKeyListener extends JFrame implements KeyListener {
    JLabel label;
    MyKeyListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel();

        label.setBackground(Color.WHITE);
        label.setBounds(0,0,100,100);
        label.setOpaque(true); // For background panel visible
        
        this.getContentPane().setBackground(Color.BLACK); // Set Backgorund JFrame
        this.add(label);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX() -10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch(e.getKeyCode()){
            case 65:
                label.setLocation(label.getX() -10, label.getY());
                break;
            case 68:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 87:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 83:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println(e.getKeyCode());
        System.out.println(e.getKeyChar());
    }
public static void main(String[] args) {
    new MyKeyListener();
    }
}
