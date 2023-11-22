package Component;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {
	JMenuBar mb;
	JMenu file, edit;
	JMenuItem New,Close,Open, Copy, Paste, Cut;
	
	MenuBar(){
		JFrame j = new JFrame();
		j.setTitle("Menu Bar");
		j.setSize(300,300);
		j.setLayout(null);
		
		mb = new JMenuBar();
		file = new JMenu("Title");
		
		New = new JMenuItem("New");
		New.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\new.png"));
		Close = new JMenuItem("CLose");
		Close.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\close.png"));
		Open = new JMenuItem("Open");
		Open.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\open.png"));
		
		//2nd menu
		edit = new JMenu("Edit");
		
		Copy = new JMenuItem("Copy");
		Copy.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\copy.png"));
		Paste = new JMenuItem("Paste");
		Paste.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\paste.png"));
		Cut = new JMenuItem("Cut");
		Cut.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\cut.png"));
		
		mb.setBackground(Color.cyan);
		
		//addSeparator() is separate two segement
		file.add(New); file.add(Open); file.addSeparator(); file.add(Close);
		edit.add(Copy); edit.add(Cut); edit.add(Paste);
		mb.add(file); mb.add(edit);
		j.setJMenuBar(mb);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new MenuBar();
	}
}
