package Component;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class radioButton extends JFrame{
	JRadioButton r1,r2;
	radioButton(){
		setTitle("Radio Button");
		setSize(400,400);
		setLayout(null);
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		
		r1.setBounds(30,30,100,20);
		r2.setBounds(150, 30, 100,20);
		
		add(r1); add(r2);
		bg.add(r1); bg.add(r2); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new radioButton();
	}
}
