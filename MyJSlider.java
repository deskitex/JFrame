package Jframe;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyJSlider implements ChangeListener{
// Change listner layaknya process godot agar program tahu bahwa user ingin value yang berubah ubah sesuai slider yang kita inputkan
 JFrame frame;
 JPanel panel;
 JLabel label;
 JSlider slider;
 
 MyJSlider(){
  
  frame = new JFrame("Slider Demo");
  panel = new JPanel();
  label = new JLabel();
  slider = new JSlider(0,100,50);
  
  slider.setPreferredSize(new Dimension(400,200));
  
  slider.setPaintTicks(true); // Memunculkan tick pada slider
  slider.setMinorTickSpacing(10); // Membuat tick kecil sesuai space
  
  slider.setPaintTrack(true);
  slider.setMajorTickSpacing(30); // Membuat tick besar sesuai space 0, 25,50,75,100
  
  slider.setPaintLabels(true); // Memunculkan Angka setMajorTickSpacing
  slider.setFont(new Font("MV Boli",Font.PLAIN,15));
  label.setFont(new Font("MV Boli",Font.PLAIN,25));
  
  //slider.setOrientation(SwingConstants.HORIZONTAL);
  slider.setOrientation(SwingConstants.VERTICAL);
  
  label.setText("°C = "+ slider.getValue());
  
  slider.addChangeListener(this);
  
  panel.add(slider);
  panel.add(label);
  frame.add(panel);
  frame.setSize(420,420);
  frame.setVisible(true);
 }
 @Override
 public void stateChanged(ChangeEvent e) {
  label.setText("°C = "+ slider.getValue());
 }
 public static void main(String[] args) {
    new MyJSlider();
 }
}
