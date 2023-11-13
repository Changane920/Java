package Window_Frame;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class ScrollBar extends JFrame implements AdjustmentListener{
	JScrollBar sb;
	JLabel label;

	public ScrollBar() {
		setSize(400,400);
		setTitle("Scroll Bar");
		setLayout(null);
		
		sb = new JScrollBar();
		sb.setBounds(100,100,50,100);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		
		sb.addAdjustmentListener(this);
		
		add(sb);
		add(label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScrollBar();
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		label.setText("Vertical Scroll value: " + sb.getValue());
	}
}
