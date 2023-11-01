package Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex2 extends JFrame implements ActionListener{
	JButton countButton;
	JTextField	countField;
	int count = 1;
	Ex2(){
		setTitle("Counter");
		setSize(400,150);
		setLayout(null);
		
		JLabel countLabel = new JLabel("Count");
		countLabel.setBounds(50,30,100,30);
		
		countField = new JTextField("0");
		countField.setBounds(100,35,100,20);
		
		countButton = new JButton("+1");
		countButton.setBounds(210,35,60,20);
		countButton.addActionListener(this);
		
		add(countLabel);
		add(countField);
		add(countButton);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(countButton)) {
			countField.setText(String.valueOf(count++));
		}
	}
}
