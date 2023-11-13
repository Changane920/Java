package Component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBtnListenerEvent implements ActionListener {
	JRadioButton small,medium,large,elarge;
	JLabel label;
	JFrame j;
	JPanel p;

	public RadioBtnListenerEvent() {
		j = new JFrame();
		j.setTitle("Radio Button Listener Event");
		j.setSize(400,400);
		j.setLayout(null);
		
		ButtonGroup bg = new ButtonGroup();
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		elarge = new JRadioButton("Extra Large");
		
		label = new JLabel("Hello World!");
		label.setBounds(150,100,200,30);
		
		small.setSize(100,20);
		medium.setSize(100,20);
		large.setSize(100,20);
		elarge.setSize(100,20);
		
		p = new JPanel();
		p.setBounds(30,200,300,40);
		
		p.add(small); p.add(medium); p.add(large); p.add(elarge); j.add(p);
		bg.add(small); bg.add(medium); bg.add(large); bg.add(elarge);
		j.add(label);
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		elarge.addActionListener(this);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		
	}
	public static void main(String[] args) {
		new RadioBtnListenerEvent();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(small)) {
			label.setFont(new Font("JetBrains Mono",Font.PLAIN,8));
			p.setBackground(Color.red);
		}
		else if(e.getSource().equals(medium)) {
			label.setFont(new Font("JetBrains Mono",Font.PLAIN,12));
			p.setBackground(Color.blue);
		}
		else if(e.getSource().equals(large)) {
			label.setFont(new Font("JetBrains Mono",Font.PLAIN,14));
			p.setBackground(Color.green);
		}
		else if(e.getSource().equals(elarge)) {
			label.setFont(new Font("JetBrains Mono",Font.PLAIN,16));
			p.setBackground(Color.black);
		}
	}
}
