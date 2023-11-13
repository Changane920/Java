package Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class List implements ActionListener{
	JList<String> f1,f2;
	JLabel l1;
	List(){
		JFrame jf = new JFrame("List");
		jf.setLayout(null);
		jf.setSize(500,300);
		
		DefaultListModel<String> lang = new DefaultListModel<String>();
		lang.addElement("Java"); 
		lang.addElement("C"); 
		lang.addElement("C++"); 
		lang.addElement("PHP");
		DefaultListModel<String> frame = new DefaultListModel<String>();
		frame.addElement("Spring");
		frame.addElement("Turbo C++");
		frame.addElement("Struct");
		frame.addElement("Lalaval");
		
		f1 = new JList<String>(lang);
		f1.setBounds(40,40,70,100);
		f2 = new JList<String>(frame);
		f2.setBounds(120,40,70,100);
		JButton b1 = new JButton("Click me!");
		b1.setBounds(40,150,80,40);
		l1 = new JLabel("This is a text!");
		l1.setBounds(250,80,300,15);
		
		b1.addActionListener(this);
		
		jf.add(f1);
		jf.add(f2);
		jf.add(b1);
		jf.add(l1);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		new List();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(f1.getSelectedIndex() >= 0 || f2.getSelectedIndex() >= 0) {
			if(f1.getSelectedValue().equalsIgnoreCase("java") && f2.getSelectedValue().equalsIgnoreCase("Spring")) {
				String temp = "Language is : " + f1.getSelectedValue() + ", Frame: " + f2.getSelectedValue();	
				l1.setText(temp);
			}
			else if(f1.getSelectedValue().equalsIgnoreCase("C") && f2.getSelectedValue().equalsIgnoreCase("Struct")) {
				String temp = "Language is : " + f1.getSelectedValue() + ", Frame: " + f2.getSelectedValue();	
				l1.setText(temp);
			}
			else if(f1.getSelectedValue().equalsIgnoreCase("C++") && f2.getSelectedValue().equalsIgnoreCase("Turbo C++")) {
				String temp = "Language is : " + f1.getSelectedValue() + ", Frame: " + f2.getSelectedValue();	
				l1.setText(temp);
			}
			else if(f1.getSelectedValue().equalsIgnoreCase("PHP") && f2.getSelectedValue().equalsIgnoreCase("Lalaval")) {
				String temp = "Language is : " + f1.getSelectedValue() + ", Frame: " + f2.getSelectedValue();	
				l1.setText(temp);
			}
			else {
				l1.setText("Wrong Framework!");
			}
		}
		else {
			l1.setText("Select at least one item");			
		}
	}
}
