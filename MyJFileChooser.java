package Jframe;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
public class MyJFileChooser extends JFrame implements ActionListener {
    JButton chooseFile;
    MyJFileChooser(){

        chooseFile = new JButton("Choose File");
        chooseFile.addActionListener(this);

        this.add(chooseFile);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(rootPaneCheckingEnabled);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseFile){
            JFileChooser chooser = new JFileChooser();
             chooser.setCurrentDirectory(new File("")); // Agar memilih current directory awal saat pilih file
            // chooser.showOpenDialog(null);                    // Memunculkan dialog untuk open
           int response =  chooser.showSaveDialog(null); // Memunculkan dialog untuk save

           if (response == JFileChooser.APPROVE_OPTION){ // Approve option mengindikasikan file pasti dipilih tidak pencet cancel atau close option
            File file = new File(chooser.getSelectedFile().getAbsolutePath()); //Mendapatkan file sekaligus absolue pathnya
            System.out.println(file);
           }
        }
    }
    public static void main(String[] args) {
        new MyJFileChooser();
    }
}
