package Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class comboBox {
	comboBox(){
		JFrame jf = new JFrame();
		jf.setTitle("Combo Box");
		jf.setSize(500,400);
		jf.setLayout(null);
		
		JLabel h1 = new JLabel("This is a label! ");
		h1.setBounds(50,20,300,15);
		
		String[] arr = {"Myanmar","India","Thailand","Korea", "Japan"};
		JComboBox<String> cb = new JComboBox<String>(arr);
		cb.setBounds(50,50,100,50);
		
		jf.add(h1);
		jf.add(cb);
		
		cb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				h1.setText("I am from " + cb.getSelectedItem());
			}
		});
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new comboBox();
	}
}
