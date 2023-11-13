package LayoutTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class BoxLayoutXY extends Frame{
	Button[] b;
	BoxLayoutXY(){
		setTitle("AWT Fram");
		setSize(400,400);
		
		b = new Button[5];
		for(int i = 0; i < 5;i++) {
			if(i == 1 || i == 2) {
				setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
				b[i] = new Button("Button " + (i + 1));
				add(b[i]);
			}
			else {				
				setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
				b[i] = new Button("Button " + (i + 1));
				add(b[i]);
			}
		}
		
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	public static void main(String[] args) {
		new BoxLayoutXY();
	}
}
