package Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex4 extends JFrame implements ActionListener{
	JLabel l1,l2;
	JCheckBox cb1,cb2,cb3;
	JComboBox<Integer> co1,co2,co3;
	
	Integer[] amount = {1,2,3,4,5};
	int num1 = 0, num2 = 0, num3 = 0, temp = 0;
	
	Ex4(){
		setTitle("Order");
		setSize(400,400);
		setLayout(null);
	
		l1 = new JLabel("Food Items: ");
		l2 = new JLabel("Total: ");
		cb1 = new JCheckBox("Burger     $5");
		cb2 = new JCheckBox("Hot Dog    $7");
		cb3 = new JCheckBox("Pizza        $10");
		
		
		co1 = new JComboBox<Integer>(amount);
		co1.setBounds(200,55,60,20);
		co2 = new JComboBox<Integer>(amount);
		co2.setBounds(200,85,60,20);
		co3 = new JComboBox<Integer>(amount);
		co3.setBounds(200,115,60,20);
		
		l1.setBounds(30,30,100,20);
		cb1.setBounds(50,50,100,30);
		cb2.setBounds(50,80,100,30);
		cb3.setBounds(50,110,100,30);
		l2.setBounds(30,130,100,40);
		
		add(l1); add(l2); add(cb1); add(cb2); add(cb3); add(co1); add(co2); add(co3);
		
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		co1.addActionListener(this);
		co2.addActionListener(this);
		co3.addActionListener(this);
		
		co1.hide();
		co2.hide();
		co3.hide();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(cb1) && cb1.isSelected() || e.getSource().equals(co1)) {
			co1.show();
			temp = 5 * (int) co1.getSelectedItem();
			num1 = temp;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
		else if(e.getSource().equals(cb1) && !cb1.isSelected() || e.getSource().equals(co1)){			
			co1.hide();
			num1 = 0;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
		else if(e.getSource().equals(cb2) && cb2.isSelected() || e.getSource().equals(co2)) {
			co2.show();
			temp = 7 * (int) co2.getSelectedItem();
			num2 = temp;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
		else if(e.getSource().equals(cb2) && !cb2.isSelected() || e.getSource().equals(co2)){
			co2.hide();
			num2 = 0;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
		else if(e.getSource().equals(cb3) && cb3.isSelected() || e.getSource().equals(co3)) {
			co3.show();
			temp = 10 * (int) co3.getSelectedItem();
			num3 = temp;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
		else if(e.getSource().equals(cb3) && !cb3.isSelected() || e.getSource().equals(co3)) {
			co3.hide();
			num3 = 0;
			l2.setText("Total: " + (num1 + num2 + num3));
		}
	}
	
	
}
