package Window_Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingLabel extends JFrame{
	SwingLabel(){
		setSize(400,400);
		setTitle("Label");
		setLayout(null);
		
		JLabel l1 = new JLabel("First Name");
		l1.setBounds(100,30,150,30);
		JTextField t1 = new JTextField("Mg Mg");
		t1.setBounds(100,60,150,20);
		
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(300,30,150,30);
		JTextField lastNameField = new JTextField("John");
		lastNameField.setBounds(300,60,150,20);
		
		JLabel l2 = new JLabel("Password");
		l2.setBounds(100, 80, 150, 30);
		JPasswordField t2 = new JPasswordField("pass123");
		t2.setBounds(100,110,150,20);
		
		JTextArea a1 = new JTextArea("This is a text area!");
		a1.setBounds(100,140,150,50);
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(a1);
		add(lastName);
		add(lastNameField);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingLabel();
	}
}
