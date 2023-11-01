package Window_Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button extends JFrame implements ActionListener{
	JLabel jl;
	JButton jb,jb2;
	
	Button(){
		setSize(400,400);
		setTitle("Button");
		setLayout(null);
		
		jb = new JButton("Login");
		jb.setBounds(150,150,90,50);
		
		jb2 = new JButton("Click Click");
		jb2.setBounds(150,200,90,50);
		
		jl = new JLabel("Hi! I am here.");
		jl.setBounds(150,100,90,50);
		
		jb.addActionListener(this);
		jb2.addActionListener(this);
		
		add(jb);
		add(jb2);
		add(jl);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Button();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)) {
			jl.setText("Shut Up!");			
		}
		else if(e.getSource().equals(jb2)) {
			jl.setText("Double Shut Up!");
		}
	}
}
