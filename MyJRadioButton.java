package Jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJRadioButton extends JFrame implements ActionListener{

 JRadioButton pizzaButton;
 JRadioButton hamburgerButton;
 JRadioButton hotdogButton;
 
 MyJRadioButton(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout());
  
  pizzaButton = new JRadioButton("pizza");
  hamburgerButton = new JRadioButton("hamburger");
  hotdogButton = new JRadioButton("hotdog");
  
  ButtonGroup group = new ButtonGroup(); // Buat radio grup agar bisa memilih salah satu radio button kalau tidak dibuat malah kayak checkbox
  group.add(pizzaButton);
  group.add(hamburgerButton);
  group.add(hotdogButton);
  
  pizzaButton.addActionListener(this);
  hamburgerButton.addActionListener(this);
  hotdogButton.addActionListener(this);
  
  this.add(pizzaButton);
  this.add(hamburgerButton);
  this.add(hotdogButton);
  this.pack();
  this.setVisible(true);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==pizzaButton) {
   System.out.println("You ordered pizza!");
  }
  else if(e.getSource()==hamburgerButton) {
   System.out.println("You ordered a hamburger!");
  }
  else if(e.getSource()==hotdogButton) {
   System.out.println("You ordered a hotdog!");
  }
 }

 public static void main(String[] args) {
   new MyJRadioButton();
 }
}
