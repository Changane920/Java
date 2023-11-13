package LayoutTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEg1 extends JFrame implements ActionListener{
	JPanel p1,p2,p3,p4,p5,p6;
	JButton b1,b2,b3;
	
	BorderLayoutEg1(){
		setTitle("Nested Border Layout");
		setSize(400,400);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		
		b1 = new JButton("Blue");
		b2 = new JButton("Yellow");
		b3 = new JButton("Black");
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.red);
		p4.setBackground(Color.red);
		p5.setBackground(Color.red);
		p6.setBackground(Color.yellow);
		
		p1.setPreferredSize(new Dimension(50,50));
		p3.setPreferredSize(new Dimension(50,50));
		p4.setPreferredSize(new Dimension(50,50));
		p5.setPreferredSize(new Dimension(50,50));
				
		add(p1,BorderLayout.NORTH);
		add(p5,BorderLayout.SOUTH);
		add(p3,BorderLayout.EAST);
		add(p4,BorderLayout.WEST);
		add(p2,BorderLayout.CENTER);
		p2.add(p6,BorderLayout.CENTER);
		p6.add(b1,BorderLayout.WEST);
		p6.add(b2,BorderLayout.CENTER);
		p6.add(b3,BorderLayout.EAST);
		
		b1.addActionListener(this);		
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEg1();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b1)) {
			p2.setBackground(Color.blue);
		}
		else if(e.getSource().equals(b2)) {
			p2.setBackground(Color.yellow);
		}
		else if(e.getSource().equals(b3)) {
			p2.setBackground(Color.black);
		}
	}
}
