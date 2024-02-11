package Jframe;

import java.awt.*;
import javax.swing.*;
public class MyJProgressBar {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100); // Min, Max
	
	MyJProgressBar(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true); // Make string or text visible if constructor in JProgressBar is null, then min 0 and max 100
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red); 
		bar.setBackground(Color.black);
			
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	public void fill() {
		int counter =0;
		while(counter<=100) {
			
			bar.setValue(counter); // Making setValue to Counter
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("Done! :)"); // Set Text when loop done
	}

	public static void main(String[] args) {
		new MyJProgressBar();
	}
}
