package Component;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class tabbedPane extends JFrame{
	JTabbedPane tp;
	JPanel p1,p2,p3;
	tabbedPane(){
		setTitle("TabbedPane");
		setSize(1000,1000);
				
		//create a tabbed pane
		tp = new JTabbedPane();
		
		Page1();
		Page2();
		Page3();
		
		tp.add("page 1", p1);
		tp.add("page 2", p2);
		tp.add("page 3", p3);
		
		add(tp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void Page1() {
		p1 = new JPanel();
		p1.setLayout(null);
		
		JLabel l1 = new JLabel("Username: ");
		JLabel l2 = new JLabel("Password: ");
		JTextField tf1 = new JTextField();
		JPasswordField tf2 = new JPasswordField();
		
		l1.setBounds(40,40,200,15);
		tf1.setBounds(40,60,200,15);
		l2.setBounds(40,80,200,15);
		tf2.setBounds(40,100,200,15);
		
		p1.add(l1); p1.add(l2); p1.add(tf1); p1.add(tf2);
	}
	private void Page2() {
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("South");
		JButton b2 = new JButton("North");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");
		
		p2.add(b1, BorderLayout.SOUTH);
		p2.add(b2, BorderLayout.NORTH);
		p2.add(b3, BorderLayout.EAST);
		p2.add(b4, BorderLayout.WEST);
		p2.add(b5, BorderLayout.CENTER);
	}
	private void Page3() {
		p3 = new JPanel();
		p3.setLayout(new GridLayout(3,2));
		
		p3.add(new JLabel("First"));
		p3.add(new JLabel("Second"));
		p3.add(new JLabel("Third"));
		p3.add(new JLabel("Fourth"));
		p3.add(new JLabel("Fifth"));
		p3.add(new JLabel("Sixth"));
	}
	public static void main(String[] args) {
		new tabbedPane();
	}
}
