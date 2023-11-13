package Ex;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListEx4 implements ItemListener, ListSelectionListener {
	JLabel sh1, sh2, sh3, re1, re2, re3;
	JComboBox<String> cb1;
	JList<String> l1,l2;
	
	ListEx4(){
		JFrame jf = new JFrame();
		jf.setTitle("EX 4");
		jf.setSize(700,300);
		jf.setLayout(new GridLayout(3,3));
		
		sh1 = new JLabel("Select a State");
		sh2 = new JLabel("Select a Pet");
		sh3 = new JLabel("Select several Vehicle");
		re1 = new JLabel("State is ");
		re2 = new JLabel("Pet is ");
		re3 = new JLabel("Vehicle is ");
		
		String[] state = {"Yangon", "Naypyitaw", "Pyin Oo Lwin"};
		cb1 = new JComboBox<String>(state);
		
		DefaultListModel<String> d1 = new DefaultListModel<String>();		
		d1.addElement("Dog");		
		d1.addElement("Cat");
		d1.addElement("Bird");
		d1.addElement("Monkey");
		d1.addElement("Lion");
		d1.addElement("Parrot");
				
		l1 = new JList<String>(d1);
		JScrollPane js1 = new JScrollPane(l1);
		
		DefaultListModel<String> d2 = new DefaultListModel<String>();
		d2.addElement("Car");
		d2.addElement("Bicycle");
		
		l2 = new JList<String>(d2);
		JScrollPane js2 = new JScrollPane(l2);
		
		cb1.addItemListener(this);
		l1.addListSelectionListener(this);
		l2.addListSelectionListener(this);
				
		jf.add(sh1); jf.add(sh2); jf.add(sh3);
		jf.add(cb1); jf.add(js1); jf.add(js2);
		jf.add(re1); jf.add(re2); jf.add(re3);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx4();
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource().equals(l1)) {
			re2.setText("Your pet is " + l1.getSelectedValue());
		}
		else if(e.getSource().equals(l2)) {
			re3.setText("Your vehicle is " + l2.getSelectedValue());
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		re1.setText("Your state is " + cb1.getSelectedItem());		
	}
}
