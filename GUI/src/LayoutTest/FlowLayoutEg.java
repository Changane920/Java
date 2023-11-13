package LayoutTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEg extends JFrame{
	FlowLayoutEg(){
		setTitle("Flow Layout");
		setSize(400,400);
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		
		add(b1); add(b2); add(b3); add(b4); add(b5);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEg();
	}
}
