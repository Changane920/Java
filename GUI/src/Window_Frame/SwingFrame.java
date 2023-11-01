package Window_Frame;

import javax.swing.JFrame;

public class SwingFrame {
	SwingFrame(){
		JFrame j = new JFrame("Swing");
		j.setSize(500,500);
		j.setVisible(true);
		j.setLocation(700,600);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingFrame();
	}
}
