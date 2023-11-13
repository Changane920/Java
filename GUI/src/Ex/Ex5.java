package Ex;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Ex5 extends JFrame implements AdjustmentListener{
	JLabel l1;
	JScrollBar hbr,vbr;
	Ex5(){
		setTitle("Scroll Bar");
		setSize(400,400);
		setLayout(null);
		
		hbr = new JScrollBar(JScrollBar.HORIZONTAL);
		vbr = new JScrollBar();
		l1 = new JLabel();
		
		hbr.setBounds(30,30,200,20);
		vbr.setBounds(30,100,20,200);
		l1.setBounds(200,200,300,30);
		
		add(hbr);
		add(vbr);
		add(l1);
		
		hbr.addAdjustmentListener(this);
		vbr.addAdjustmentListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex5();
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		l1.setText("Vertical: " + vbr.getValue() + " Horizontal: " + hbr.getValue());
	}
}
