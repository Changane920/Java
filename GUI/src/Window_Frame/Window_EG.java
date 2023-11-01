package Window_Frame;

import javax.swing.JWindow;

public class Window_EG {
	Window_EG(){
		JWindow w = new JWindow();
		w.setSize(300,300);
		w.setVisible(true);
		w.setLocation(500,300);
		w.setBackground(null);
	}
	
	public static void main(String[] args) {
		new Window_EG();
	}
}
