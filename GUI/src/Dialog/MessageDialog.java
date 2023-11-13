package Dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialog extends JFrame{
	MessageDialog(){
		setTitle("Message Dialog");
		setSize(400,400);
		setLayout(null);
		
		JOptionPane.showMessageDialog(this, "Hello");
		JOptionPane.showMessageDialog(this, "World!", "Title" ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hello World!");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MessageDialog();
	}
}
