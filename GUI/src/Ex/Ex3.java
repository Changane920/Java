package Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex3 extends JFrame implements ActionListener{
	JTextField num1,num2;
	JButton add,sub,clear;
	JTextArea result;
	
	Ex3(){
		setSize(400,300);
		setTitle("Calculator");
		setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(30,30,100,20);
		num2 = new JTextField();
		num2.setBounds(160,30,100,20);
		
		add = new JButton("Add");
		add.setBounds(30,70,60,20);
		sub = new JButton("Subtract");
		sub.setBounds(100,70,100,20);
		clear = new JButton("Clear");
		clear.setBounds(210,70,100,20);
		
		result = new JTextArea();
		result.setBounds(30,120,280,100);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		
		add(num1);
		add(num2);
		add(add);
		add(sub);
		add(clear);
		add(result);
		
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
