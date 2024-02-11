package Jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrameJTextField extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    FrameJTextField(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setForeground(Color.WHITE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white); // Warna Pointer di text field

        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){

            button.setEnabled(false);
            textField.setEditable(false);
            // Make After click submit button then user cant submit again and edit text
            System.out.println(textField.getText()); 
        }
    }
}
