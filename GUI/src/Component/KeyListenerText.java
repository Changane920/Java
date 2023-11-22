package Component;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyListenerText implements KeyListener{
	JLabel l1;
	KeyListenerText(){
		JFrame j = new JFrame();
		j.setTitle("KeyListener Text");
		j.setSize(600,300);
		j.setLayout(null);
		
		l1 = new JLabel("This is a text!");
		JTextField tf = new JTextField();
		
		l1.setBounds(50,50,200,15);
		tf.setBounds(200,50,200,15);
		
		j.add(l1); j.add(tf);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		
		tf.addKeyListener(this);
	}
	public static void main(String[] args) {
		new KeyListenerText();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		l1.setText("Key Typed");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l1.setText("Key Pressed");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		l1.setText("Key Released");
	}
}
