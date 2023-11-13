package Ex;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex3 extends JFrame implements ActionListener{
	JTextField num1,num2;
	JButton add,sub,clear;
	JTextArea result;
	JPanel p1,p2,p3;
	
	Ex3(){
		setSize(400,300);
		setTitle("Calculator");
		setLayout(null);
		
		num1 = new JTextField();
		num1.setPreferredSize(new Dimension(160,30));
		num2 = new JTextField();
		num2.setPreferredSize(new Dimension(160, 30));
		
		add = new JButton("Add");
		add.setPreferredSize(new Dimension(100,20));
		sub = new JButton("Subtract");
		sub.setPreferredSize(new Dimension(100,20));
		clear = new JButton("Clear");
		clear.setPreferredSize(new Dimension(100,20));
		
		result = new JTextArea();
		result.setSize(400,200);
		
		JScrollPane sp = new JScrollPane(result);
		sp.setBounds(10,120,400,200);
		
		p1 = new JPanel();
		p1.setBounds(5,10,350,70);
		p2 = new JPanel();
		p2.setBounds(5,50,340,70);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		
		add(sp);
		add(p2); p2.add(add); p2.add(sub); p2.add(clear); 
		add(p1); p1.add(num1); p1.add(num2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(add)) {
			int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
			result.append(num1.getText() + " + " + num2.getText() + " = " + String.valueOf(sum) + "\n");
		}
		else if(e.getSource().equals(sub)) {
			int sum = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
			result.append(num1.getText() + " - " + num2.getText() + " = " + String.valueOf(sum) + "\n");
		}
		else if(e.getSource().equals(clear)) {
			num1.setText(null);
			num2.setText(null);
			result.setText(null);
		}
		
	}
}
