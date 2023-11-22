import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel LoginPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setType(Type.UTILITY);
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		LoginPane = new JPanel();
		LoginPane.setBackground(new Color(102, 153, 153));
		LoginPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(LoginPane);
		LoginPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
		lblUsername.setBounds(68, 59, 102, 21);
		LoginPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(221, 55, 144, 29);
		LoginPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(221, 103, 144, 29);
		LoginPane.add(txtPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
		lblPassword.setBounds(68, 107, 102, 21);
		LoginPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")) {
					//close the form when login
					dispose();
					//open the admin dashboard
					adminDashboard ad = new adminDashboard();
					ad.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Username & Password incorrect!","Message Box",JOptionPane.INFORMATION_MESSAGE);
					txtUsername.setText(null); txtPassword.setText(null);
				}
			}
		});
		btnLogin.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnLogin.setBounds(157, 174, 89, 23);
		LoginPane.add(btnLogin);
	}
}
