package LayoutTest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEg {
	BorderLayoutEg(){
		JFrame jf = new JFrame();
		jf.setTitle("Border Layout");
		jf.setSize(300,300);
		
		JButton b1 = new JButton("South");
		JButton b2 = new JButton("North");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");
		
		jf.add(b1,BorderLayout.SOUTH);
		jf.add(b2,BorderLayout.NORTH);
		jf.add(b3,BorderLayout.EAST);
		jf.add(b4,BorderLayout.WEST);
		jf.add(b5,BorderLayout.CENTER);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEg();
	}
}
