package Dialog;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBar {
	ToolBar(){
		JFrame jf = new JFrame("Toolbar");
		jf.setSize(400,300);
		
		JButton file = new JButton("File");
		file.setPreferredSize(new Dimension(100,20));
		
		JToolBar tb = new JToolBar();
		tb.setLayout(new BoxLayout(tb, BoxLayout.Y_AXIS));
		
		Container c = jf.getContentPane();
		c.setPreferredSize(new Dimension(400,20));
		
		c.add(tb,BorderLayout.WEST);
		tb.add(file);
		tb.add(new JButton("Edit"));
		tb.add(new JComboBox<String>(new String[] {"Text1", "Text2"}));
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new ToolBar();
	}
}
