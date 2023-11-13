package Dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class YesNoDialog extends JFrame{
	YesNoDialog(){
		setTitle("Yes or No");
		setSize(400,400);
		setLayout(null);
		
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to login?","Account", JOptionPane.YES_NO_CANCEL_OPTION);
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "Login Successful!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Login Fail!");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new YesNoDialog();
	}
}
