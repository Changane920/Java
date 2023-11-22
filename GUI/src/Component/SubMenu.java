package Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SubMenu implements ActionListener {
	JMenuBar mb;
	JMenu m, subm;
	JMenuItem mi1, mi2, open;
	JTextArea ta;
	JFrame j;
	
	SubMenu(){
		j = new JFrame();
		j.setTitle("Sub Menu");
		j.setLayout(null);
		j.setSize(300,100);
		
		mb = new JMenuBar();
		m = new JMenu("File");
		subm = new JMenu("Import file");
		open = new JMenuItem("Open");
		mi1 = new JMenuItem("Import Document");
		mi2 = new JMenuItem("Import Image");
		
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(50,50,500,200);
		
		j.setJMenuBar(mb);
		mb.add(m); 
		m.add(subm);
		m.add(open);
		subm.add(mi1); subm.add(mi2);
		j.add(js);
		
		open.addActionListener(this);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new SubMenu();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(open)) {
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(j);
			if(i == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				String path = f.getPath();
				
				try {
					BufferedReader br = new BufferedReader(new FileReader(path));
					String str;
					while((str = br.readLine()) != null) {
						ta.append(str + "\n");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}		
	}
}
