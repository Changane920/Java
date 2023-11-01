package Window_Frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPanel extends JFrame{
	SwingPanel(){
		setTitle("JFrame Panel");
		setSize(500,500);
		setVisible(true);
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.green);		
		
		p1.add(p2);
		add(p1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingPanel();
	}
}
