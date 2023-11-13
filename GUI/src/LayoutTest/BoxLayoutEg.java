package LayoutTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class BoxLayoutEg {
	Button b[];
	JButton jb[];
	BoxLayoutEg(){
		Frame f = new Frame();
		f.setTitle("AWT ");
		f.setSize(400,400);
		b = new Button[5];
		for(int i = 0; i < 5; i++) {
			b[i] = new Button("Button" + (i + 1));
			f.add(b[i]);
		}
		f.setLayout(new BoxLayout(f,BoxLayout.LINE_AXIS));
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	public static void main(String[] args) {
		new BoxLayoutEg();
	}
}
