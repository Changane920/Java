package ComponentEx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex1 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4;
	JRadioButton ir1,ir2,ir3,or1,or2,or3;
	JTextField it,ot;
	
	Ex1(){
		setTitle("Converter");
		setSize(300,300);
		setLayout(null);
		
		l1 = new JLabel("Input");
		l1.setBounds(30,30,50,30);
		it = new JTextField();
		it.setBounds(80,35,100,20);
		
		ir1 = new JRadioButton("Celcius");
		ir2 = new JRadioButton("Fahrenheit");
		ir3 = new JRadioButton("Kelvin");
		or1 = new JRadioButton("Celcius");
		or2 = new JRadioButton("Fahrenheit");
		or3 = new JRadioButton("Kelvin");
		
		ButtonGroup bg = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();
		
		ir1.setBounds(30,70,100,20); or1.setBounds(150,70,100,20);
		ir2.setBounds(30,100,100,20); or2.setBounds(150,100,100,20);
		ir3.setBounds(30,130,100,20); or3.setBounds(150,130,100,20);
		
		l2 = new JLabel("Output");
		l2.setBounds(30,170,50,30);
		ot = new JTextField();
		ot.setBounds(80,175,100,20);
		
		add(l1); add(it);
		add(ir1); add(or1);
		add(ir2); add(or2);
		add(ir3); add(or3);
		add(l2); add(ot);
		
		bg.add(ir1); bg.add(ir2); bg.add(ir3); bg2.add(or1); bg2.add(or2); bg2.add(or3);
		
		ir1.addActionListener(this);
		ir2.addActionListener(this);
		ir3.addActionListener(this);
		or1.addActionListener(this);
		or2.addActionListener(this);
		or3.addActionListener(this);		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double temp = Double.parseDouble(it.getText());
		
		if(ir1.isSelected()) {
			if(or1.isSelected()) {
				ot.setText(it.getText());
			}
			else if(or2.isSelected()) {
				double result = (temp * 9/5) + 32;
				ot.setText(String.valueOf(result));
			}
			else if(or3.isSelected()) {
				double result = temp + 273.15;
				ot.setText(String.valueOf(result));
			}
		}
		else if(ir2.isSelected()) {
			if(or2.isSelected()) {
				ot.setText(it.getText());
			}
			else if(or1.isSelected()) {
				double result = (temp - 32)/1.8;
				ot.setText(String.valueOf(result));
			}
			else if(or3.isSelected()) {
				double result = (temp + 459.67) * 5/9;
				ot.setText(String.valueOf(result));
			}
		}
		else if(ir3.isSelected()) {
			if(or3.isSelected()) {
				ot.setText(it.getText());
			}
			else if(or2.isSelected()) {
				double result = (temp * 1.8) - 459.67;
				ot.setText(String.valueOf(result));
			}
			else if(or1.isSelected()) {
				double result = (temp - 273.15);
				ot.setText(String.valueOf(result));
			}
		}
	}
}