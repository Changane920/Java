package Ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex1 extends JFrame{
	Ex1(){
		setTitle("Login Form");
		setSize(400,200);
		setLayout(null);

		JLabel unameLabel = new JLabel("Username");
		unameLabel.setBounds(70,30,150,30);
		JTextField unameField = new JTextField();
		unameField.setBounds(150,35,150,20);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setBounds(70,60,150,30);
		JTextField passField = new JTextField();
		passField.setBounds(150,65,150,20);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(150,100,70,20);
		
		add(unameLabel);
		add(unameField);
		add(passLabel);
		add(passField);
		add(loginButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1();
	}
}
