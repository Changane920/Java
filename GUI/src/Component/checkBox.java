package Component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkBox extends JFrame implements ItemListener{
	JCheckBox c1, c2;
	JLabel l1;
	checkBox(){
		setTitle("CheckBox");
		setSize(400,400);
		setLayout(null);
		
		c1 = new JCheckBox("Java");
		c2 = new JCheckBox("C++");
		l1 = new JLabel("This is a ");
		
		c1.setBounds(100,150,100,50);
		c2.setBounds(100,200,100,50);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(300,50);
		
		add(c1);
		add(c2);
		add(l1);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new checkBox();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(c1.isSelected()) {
			l1.setText("Java checkbox: checked");
			
		}
	}
}
