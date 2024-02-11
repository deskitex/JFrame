package Jframe;

import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;

public class Obstacle extends JLabel{
        
        int sizeViewport_x = 480;
        int sizeViewport_Y = 854;
        Obstacle(){
            Random random = new Random();
           this.setBackground(Color.RED);
           this.setBounds(0, 0, 20, 100);
           this.setOpaque(true);
           this.setLocation(50, sizeViewport_Y - random.nextInt(1000)+100);
            
        }

}
