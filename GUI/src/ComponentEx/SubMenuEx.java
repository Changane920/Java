package ComponentEx;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SubMenuEx {
	JMenuBar mb;
	JMenu File,Import;
	JMenuItem New,Open,Save,Exit, newfeed, bookmark, mail;
	SubMenuEx(){
		JFrame j = new JFrame();
		j.setTitle("Sub Menu Ex");
		j.setSize(1000,1000);
		
		mb = new JMenuBar();
		
		File = new JMenu("File");
		New = new JMenuItem("New");
		New.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\new.png"));
		Open = new JMenuItem("Open");
		Open.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\open.png"));
		Save = new JMenuItem("Save");
		Save.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\save.png"));
		Exit = new JMenuItem("Exit");
		Exit.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\close.png"));
		
		Import = new JMenu("Import");
		newfeed = new JMenuItem("Newsfeed");
		newfeed.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\newfeed.png"));
		bookmark = new JMenuItem("Bookmark");
		bookmark.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\bookmark.png"));
		mail = new JMenuItem("Mail");
		mail.setIcon(new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\mail.png"));
		
		j.setJMenuBar(mb);
		mb.add(File);
		File.add(New); File.add(Open); File.add(Save); File.addSeparator(); File.add(Import); File.add(Exit);
		Import.add(newfeed); Import.add(bookmark); Import.add(mail);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new SubMenuEx();
	}
}
