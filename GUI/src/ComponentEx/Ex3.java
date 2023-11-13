package ComponentEx;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex3 {
	JFrame jf;
	Ex3(){
		Color orange = new Color(255,28,28);
		
		jf = new JFrame();
		jf.setTitle("Pizza Shop");
		jf.setSize(700,500);
		jf.setLayout(null);
		
		JLabel h1 = new JLabel("Welcome to Home Style Pizza Shop");
		h1.setForeground(orange);
		h1.setBounds(30,30,500,20);
		h1.setFont(new Font("JetBrains Mono",Font.PLAIN,20));

		//card1
		JPanel c1 = new JPanel();
		c1.setBounds(30,70,150,200);
		c1.setBorder(BorderFactory.createLineBorder(orange));
		c1.setLayout(null);
		
		JLabel sh1 = new JLabel("Eath Topping $1.50");
		sh1.setHorizontalAlignment(JLabel.CENTER);
		sh1.setSize(150,25);
		sh1.setForeground(orange);
		
		JCheckBox cb11 = new JCheckBox("Tomato");
		cb11.setBounds(20,35,110,15);
		JCheckBox cb12 = new JCheckBox("Green Pepper");
		cb12.setBounds(20,55,110,15);
		JCheckBox cb13 = new JCheckBox("Black Olives");
		cb13.setBounds(20,75,110,15);
		JCheckBox cb14 = new JCheckBox("Mushrooms");
		cb14.setBounds(20,95,110,15);
		JCheckBox cb15 = new JCheckBox("Extra Cheese");
		cb15.setBounds(20,115,110,15);
		JCheckBox cb16 = new JCheckBox("Pepproni");
		cb16.setBounds(20,135,110,15);
		JCheckBox cb17 = new JCheckBox("Sausage");
		cb17.setBounds(20,155,110,15);
		
		//card2
		JPanel c2 = new JPanel();
		c2.setBounds(205,70,150,150);
		c2.setBorder(BorderFactory.createLineBorder(orange));
		c2.setLayout(null);
		
		JLabel sh2 = new JLabel("Pizza Size");
		sh2.setHorizontalAlignment(JLabel.CENTER);
		sh2.setSize(150,25);
		sh2.setForeground(orange);
		
		JCheckBox cb21 = new JCheckBox("Small: $6.50");
		cb21.setBounds(20,40,110,15);
		JCheckBox cb22 = new JCheckBox("Medium: $8.50");
		cb22.setBounds(20,70,110,15);
		JCheckBox cb23 = new JCheckBox("Large: $10.00");
		cb23.setBounds(20,100,110,15);
	
		//card3
		JPanel c3 = new JPanel();
		c3.setBounds(380,70,150,150);
		c3.setBorder(BorderFactory.createLineBorder(orange));
		c3.setLayout(null);
		
		JLabel sh3 = new JLabel("Pizza Type");
		sh3.setHorizontalAlignment(JLabel.CENTER);
		sh3.setSize(150,25);
		sh3.setForeground(orange);
		
		JCheckBox cb31 = new JCheckBox("Thin Crust");
		cb31.setBounds(20,40,110,15);
		JCheckBox cb32 = new JCheckBox("Medium Crust");
		cb32.setBounds(20,70,110,15);
		JCheckBox cb33 = new JCheckBox("Pan");
		cb33.setBounds(20,100,110,15);
		
		//button
		JButton order = new JButton("Process Selection");
		order.setBounds(205,240,325,30);
		
		//description
		JLabel sh4 = new JLabel("Your order: ");
		sh4.setBounds(30,270,100,20);
		
		JTextArea desc = new JTextArea();
		desc.setBounds(30,290,500,100);
		
		jf.add(h1);	jf.add(c1);	jf.add(c2);	jf.add(c3); jf.add(order); jf.add(sh4); jf.add(desc);
		c1.add(sh1); c1.add(cb11); c1.add(cb12); c1.add(cb13); c1.add(cb14); c1.add(cb15); c1.add(cb16); c1.add(cb17);
		c2.add(sh2); c2.add(cb21); c2.add(cb22); c2.add(cb23);
		c3.add(sh3); c3.add(cb31);c3.add(cb32);c3.add(cb33);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex3();
	}
}
