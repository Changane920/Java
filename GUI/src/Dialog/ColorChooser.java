package Dialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser {
	Container c;
	JButton b;
	ColorChooser(){
		JFrame jf = new JFrame("Color Chooser");
		jf.setSize(500,500);
		
		c = jf.getContentPane();
		c.setLayout(new FlowLayout());
		
		b = new JButton("Color");
		b.setSize(100,20);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color inColor = Color.red;
				Color col = JColorChooser.showDialog(jf, "Select a color", inColor);
				c.setBackground(col);
			}			
		});
		
		c.add(b);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
