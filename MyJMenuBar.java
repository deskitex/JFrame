package Jframe;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class MyJMenuBar extends JFrame implements ActionListener {
    JMenuItem Save;
    JMenuItem Load;
    JMenuItem Exit;
    MyJMenuBar(){
        JMenuBar menu = new JMenuBar();
        JMenu File = new JMenu("File");
        JMenu Edit = new JMenu("Edit");
        JMenu Help = new JMenu("Help");
        
        Save = new JMenuItem("Save File");
        Load = new JMenuItem("Load File");
        Exit = new JMenuItem("Close Program");
        
        menu.add(File);
        menu.add(Edit);
        menu.add(Help);

        File.add(Save);
        File.add(Load);
        File.add(Exit);
        
        Save.addActionListener(this);
        Load.addActionListener(this);
        Exit.addActionListener(this);

        // Set Shortcut Key
        Save.setMnemonic(KeyEvent.VK_S); // klik file dulu baru bisa pencet S
        Load.setMnemonic(KeyEvent.VK_L);
        Exit.setMnemonic(KeyEvent.VK_E);

        File.setMnemonic(KeyEvent.VK_F); // Perlu Alt + F 

        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.add(menu);
        this.setJMenuBar(menu); // Agar menjadi menu bar, menunya harus di add dulu baru setJMenuBar

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyJMenuBar();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Save){
            System.out.println("Saving File");
        }
        if (e.getSource() == Load){
            System.out.println("Loading an");}
        if (e.getSource() == Exit){
            System.exit(0);
        }
    }
}
