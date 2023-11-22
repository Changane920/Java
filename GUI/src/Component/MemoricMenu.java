package Component;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MemoricMenu implements ActionListener {
	JFrame j;
	JMenuBar mb;
	JMenu m;
	JMenuItem Print,PPreview,Exit;
	MemoricMenu(){
		j = new JFrame();
		j.setTitle("MemoricMenu");
		j.setSize(1000,1000);
		j.setLayout(null);
		
		mb = new JMenuBar();
		m = new JMenu("File");
		Print = new JMenuItem("Print");
		PPreview = new JMenuItem("Print Preview");
		Exit = new JMenuItem("Exit");
		
		j.setJMenuBar(mb);
		mb.add(m);
		m.add(Print);
		m.add(PPreview);
		m.addSeparator();
		m.add(Exit);
		
		Print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.CTRL_MASK));
		PPreview.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.SHIFT_MASK));
		Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK));
		
		Print.addActionListener(this);
		PPreview.addActionListener(this);
		Exit.addActionListener(this);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new MemoricMenu();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(Exit)) {
			j.dispose();
		}
	}
}
