package Dialog;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
	LoginForm(){
		JTextField uname = new JTextField();
		JTextField upass = new JPasswordField();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\tumblr_pggvxxkz9x1xqcwupo5_400-3210606556.png");
		Image scaleImage = icon.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
		icon = new ImageIcon(scaleImage);
		
		Object[] obj = {
				"Username: ", uname, 
				"Password: ", upass
		};
		
		int opt = JOptionPane.showConfirmDialog(null, obj, "Login Form", JOptionPane.OK_CANCEL_OPTION,JOptionPane.NO_OPTION,icon);
		
		if(opt == 0) {
			if(uname.getText().equalsIgnoreCase("admin") && upass.getText().equalsIgnoreCase("admin")) {
				JOptionPane.showMessageDialog(null, "Login successful!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Login Fail!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Login cancel!");
		}

	}
	public static void main(String[] args) {
		new LoginForm();
	}
}
