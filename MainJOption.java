package Jframe;
import javax.swing.*;
public class MainJOption {
    public static void main(String[] args) {
        int answer;
        //parentCompoment, Argumen, title, messageType dan ada 5 Message Type yang membaut berganti icon message saja
        JOptionPane.showMessageDialog(null, "Bruh, Hell nah", "This is Title", JOptionPane.PLAIN_MESSAGE); 
        JOptionPane.showMessageDialog(null, "Bruh, Hell nah", "This is Title", JOptionPane.ERROR_MESSAGE); 
        JOptionPane.showMessageDialog(null, "Bruh, Hell nah", "This is Title", JOptionPane.WARNING_MESSAGE); 
        JOptionPane.showMessageDialog(null, "Bruh, Hell nah", "This is Title", JOptionPane.QUESTION_MESSAGE); 
        JOptionPane.showMessageDialog(null, "Bruh, Hell nah", "This is Title", JOptionPane.INFORMATION_MESSAGE); 
        
        //parentCompoment, Argumen, title, optionType, messageType dan ada 3 option type utama yes,no, cancel atau yes and no atau yes doang
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.YES_NO_CANCEL_OPTION, 0);
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.YES_NO_OPTION, 0);
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.YES_OPTION, 0);
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.CLOSED_OPTION, 0);
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.OK_OPTION, 0);
        answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Thsis title confirm dialog", JOptionPane.CANCEL_OPTION, 0);
        
        ImageIcon icon = new ImageIcon("smile.png");
		String[] responses = {"No, you are!","thank you!","*blush*"};
        //JOptionPane.showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue) : int
		JOptionPane.showOptionDialog(null, "You are the best! :D", "Secret message", JOptionPane.DEFAULT_OPTION, 0, icon, responses, responses[0]);
        System.out.println(answer);
}
}
