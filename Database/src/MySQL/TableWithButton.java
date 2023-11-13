package MySQL;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableWithButton implements ActionListener {
	JButton jb, delete, insert, update;
	JTable jt;

	TableWithButton() {
		JFrame jf = new JFrame();
		jf.setTitle("Table with DB");
		jf.setSize(500, 300);

		jt = new JTable();
		jb = new JButton("Click");
		delete = new JButton("Delete");
		insert = new JButton("Insert");
		update = new JButton("Update");
		JPanel jp = new JPanel();
		JScrollPane js = new JScrollPane(jt);

		jt.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "id", "name", "mark" }));

		jb.addActionListener(this);
		delete.addActionListener(this);
		insert.addActionListener(this);
		update.addActionListener(this);

		jf.add(jp, BorderLayout.NORTH);
		jp.add(jb);
		jp.add(delete);
		jp.add(update);
		jp.add(insert);
		jf.add(js);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new TableWithButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) jt.getModel();
		Connection cn;
		Statement st;
		PreparedStatement pt;

		try {
			cn = new connectDB().getConnection();
			st = cn.createStatement();
			st.execute("use javadb");

			if (e.getSource().equals(jb)) {
				model.setRowCount(0);
				try {
					ResultSet r = st.executeQuery("select * from mark");

					while (r.next()) {
						// get column
						Object[] row = new Object[jt.getColumnCount()];

						// data from db to row obj
						row[0] = r.getInt(1);
						row[1] = r.getString(2);
						row[2] = r.getDouble(3);

						// add to table
						model.addRow(row);
					}
				} 
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
			else if (e.getSource().equals(delete)) {
				int i = jt.getSelectedRow();
				int id = Integer.parseInt(model.getValueAt(i, 0).toString());

				model.removeRow(i);

				try {
					pt = cn.prepareStatement("delete from mark where id = ?");
					pt.setInt(i, id);
					pt.executeUpdate();
					model.setRowCount(0);
				} 
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
			else if (e.getSource().equals(insert)) {
				JTextField id = new JTextField();
				JTextField name = new JTextField();
				JTextField mark = new JTextField();
				
				ImageIcon icon = new ImageIcon("C:\\Users\\Chan_gane\\Downloads\\tumblr_pggvxxkz9x1xqcwupo5_400-3210606556.png");
				Image scaleImage = icon.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
				icon = new ImageIcon(scaleImage);
				
				Object[] obj = {
						"Id: ", id,
						"Name: ", name,
						"Mark: ", mark
				};
				
				int opt = JOptionPane.showConfirmDialog(null,obj,"Add Data",JOptionPane.OK_CANCEL_OPTION,JOptionPane.NO_OPTION,icon);
				if(opt == JOptionPane.OK_OPTION) {
					String query = "insert into mark values (" + Integer.parseInt(id.getText()) + ",\"" + name.getText() + "\"," + Double.parseDouble(mark.getText()) + ");";
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Insert Complete!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Insert Cancel!");
				}
			} 
			else if (e.getSource().equals(update)) {
				try {
					int i = jt.getSelectedRow();
					int id = Integer.valueOf(model.getValueAt(i, 0).toString());
					String name = String.valueOf(model.getValueAt(i, 1).toString());
					double mark = Double.valueOf(model.getValueAt(i, 2).toString());
					
					st.executeUpdate("update mark set name=\""+name+"\",mark="+mark+" where id="+id+"");
					
					JOptionPane.showMessageDialog(null, "Update Finish!", "Notificationi",JOptionPane.INFORMATION_MESSAGE);
					model.setRowCount(0);
				} 
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} 
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
