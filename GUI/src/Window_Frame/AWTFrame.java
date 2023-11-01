package Window_Frame;

import java.awt.Frame;

public class AWTFrame {
	AWTFrame(){
		Frame j = new Frame("AWT Frame");
		j.setTitle("Hello World!");
		j.setSize(300,300);
		j.setVisible(true);
		j.setLocation(700,300);
		j.setLayout(null);
		
		//make close button work
		
	}
	public static void main(String[] args) {
		new AWTFrame();
	}
}
