package Jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJColorChooser extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyJColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Choose Color");
        label = new JLabel("Change Color");
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        button.addActionListener(this);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick Your Color ", Color.white); // Harus kelasnya ternyata gak bisa nama object colorChooser

            label.setForeground(color);
            // Component component, String title, Color initialColor)
        }
    }
    public static void main(String[] args) {
        new MyJColorChooser();
    }
}
