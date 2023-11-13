package Dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialog {
	InputDialog(){
		JFrame jf = new JFrame();
		jf.setTitle("Input Dialog");
		jf.setSize(200,100);
		jf.setLayout(null);
		
		String name = JOptionPane.showInputDialog(null, "What's your name?","Mr.");
		JOptionPane.showMessageDialog(null, "Your name is " + name);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new InputDialog();
	}
}
