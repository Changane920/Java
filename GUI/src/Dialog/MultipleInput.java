package Dialog;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MultipleInput {
	MultipleInput(){
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		
		Object[] input = {
			"Number 1: " , num1,
			"Number 2: " , num2
		};
		
		int opt = JOptionPane.showConfirmDialog(null, input, "Calculator", JOptionPane.OK_CANCEL_OPTION);
		if(opt == JOptionPane.OK_OPTION) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			JOptionPane.showMessageDialog(null,n1 + " + " + n2 + " = " + (n1 + n2));
		}
		else {
			JOptionPane.showMessageDialog(null, "Have a nice day!");
		}
	}
	public static void main(String[] args) {
		new MultipleInput();
	}
}
