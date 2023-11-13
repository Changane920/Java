package Dialog;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEg {
	JTableEg(){
		JFrame jf = new JFrame("Table");
		jf.setSize(500,300);
		
		String[][] multiarr = {
				{"101","Mg Mg","1000"},
				{"103","Ma Ma",null},
				{"102","Ko Ko","500"},
				};
		String[] coln = {"ID","NAME","SALARY"};
		
		JTable jt = new JTable(multiarr,coln);
		
		JScrollPane js = new JScrollPane(jt);
		
		jf.add(js);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new JTableEg();
	}
}
