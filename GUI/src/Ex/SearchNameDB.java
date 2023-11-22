package Ex;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SearchNameDB implements KeyListener {
	JLabel h,firstName,lastName;
	JButton query;
	JTextField tfFirst,tfLast;
	JPanel p1;
	JTable tb;
	
	SearchNameDB(){
		JFrame j = new JFrame();
		j.setTitle("Customer");
		j.setSize(1000,500);
		
		h = new JLabel("Actor Profile");
		h.setHorizontalAlignment(JLabel.CENTER);
		h.setSize(1000,50);
		h.setFont(new Font("JetBrains Mono",Font.BOLD,30));
		
		p1 = new JPanel();
		firstName = new JLabel("FirstName: ");
		lastName = new JLabel("LastName: ");
		tfFirst = new JTextField();
		tfLast = new JTextField();

		p1.setLayout(null);
		firstName.setBounds(30,30,200,15);
		firstName.setFont(new Font("JetBrains Mono",Font.PLAIN,15));
		tfFirst.setBounds(150,28,200,20);
		lastName.setBounds(400,28,200,15);
		lastName.setFont(new Font("JetBrains Mono",Font.PLAIN,15));
		tfLast.setBounds(500,28,200,20);
		
		query = new JButton("Query");
		query.setBounds(750,20,100,30);
		
		tb = new JTable();
		JScrollPane js = new JScrollPane(tb);
		js.setBounds(30,100,900,500);
		tb.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {"Actor id","FirstName","LastName","Last Updated"}
				));
		
		tfFirst.addKeyListener(this);
		tfLast.addKeyListener(this);
		
		j.add(h,BorderLayout.NORTH); j.add(p1,BorderLayout.CENTER);
		p1.add(firstName); p1.add(lastName);
		p1.add(tfFirst); p1.add(tfLast);
		p1.add(query); p1.add(js);
		
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new SearchNameDB();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		Connection cn;
		PreparedStatement pst;
		DefaultTableModel model = (DefaultTableModel) tb.getModel();

		try {
			model.setRowCount(0);
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			Statement st = cn.createStatement();
			
			
			
			st.execute("use actorprofile");
			//pst = cn.prepareStatement("select * from actor");
			pst = cn.prepareStatement("select * from actor where firstName like ? AND lastName like ?");
			pst.setString(1, (tfFirst.getText() + "%"));
			pst.setString(2, (tfLast.getText() + "%"));
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Object[] row = new Object[tb.getColumnCount()];
				row[0] = rs.getInt(1);
				row[1] = rs.getString(2);
				row[2] = rs.getString(3);
				row[3] = rs.getDate(4);
				model.addRow(row);
			}
			
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}
}
