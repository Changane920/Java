package Window_Frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClosableAWT extends Frame{
	ClosableAWT(){
		setTitle("Closable AWT");
		setVisible(true);
		setSize(500,500);
		setBackground(Color.black);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	public static void main(String[] args) {
		new ClosableAWT();
	}
}
