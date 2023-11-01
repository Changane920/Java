package Window_Frame;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingTextField extends JFrame{
	SwingTextField(){
		setTitle("Text Field");
		setSize(400,400);
		
		//textfield
		JTextField t1 = new JTextField("Txt 1");
		t1.setBounds(110,80,150,30);
		JTextField t2 = new JTextField("Txt 2");
		t2.setBounds(110,120,150,30);
		
		add(t1);
		add(t2);
		
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingTextField();
	}
}
