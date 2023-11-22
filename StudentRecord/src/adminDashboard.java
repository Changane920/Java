import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class adminDashboard extends JFrame {

	private JPanel contentPane;
	Statement st;
	PreparedStatement pst;
	JTable tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminDashboard frame = new adminDashboard();
					frame.setVisible(true);
					
					//reload database
					frame.callDB();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}
	private void callDB() throws ClassNotFoundException, SQLException {
		Connection cn = new connection().getConnection();
		st = cn.createStatement();
		DefaultTableModel model = (DefaultTableModel) tb.getModel();
		
		pst = cn.prepareStatement("select * from ");
	}
	/**
	 * Create the frame.
	 */
	public adminDashboard() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1270, 920);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(5, 5, 1244, 873);
		tabbedPane.setPreferredSize(new Dimension(0, 30));
		contentPane.add(tabbedPane);

		JPanel panel2023 = new JPanel();
		panel2023.setBackground(new Color(255, 255, 255));
		tabbedPane.add("2023", panel2023);
		panel2023.setLayout(null);

		tb = new JTable();
		tb.setBackground(new Color(128, 128, 128));
		tb.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Id","Name","Phone","Class","Intake","Level"}));
		JScrollPane js = new JScrollPane(tb);
		js.setBounds(0, 33, 1239, 801);
		js.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		panel2023.add(js);
		
		JLabel lblNewLabel = new JLabel("Class");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 1, 53, 22);
		panel2023.add(lblNewLabel);
		
		JComboBox<String> cbClass = new JComboBox<String>();
		cbClass.setModel(new DefaultComboBoxModel<String>(new String[] {"ITPEC", "NCC"}));
		cbClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbClass.setBounds(63, 1, 115, 22);
		panel2023.add(cbClass);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLevel.setBounds(200, 1, 53, 22);
		panel2023.add(lblLevel);
		
		JComboBox<String> cbLevel = new JComboBox<String>();
		cbLevel.setModel(new DefaultComboBoxModel<String>(new String[] {"ITPEC", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5"}));
		cbLevel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbLevel.setBounds(263, 1, 115, 22);
		panel2023.add(cbLevel);
		
		JLabel lblIntake = new JLabel("Intake");
		lblIntake.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntake.setBounds(401, 1, 53, 22);
		panel2023.add(lblIntake);
		
		JComboBox<String> cbIntake = new JComboBox<String>();
		cbIntake.setModel(new DefaultComboBoxModel<String>(new String[] {"Janauary", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December"}));
		cbIntake.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbIntake.setBounds(464, 1, 115, 22);
		panel2023.add(cbIntake);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdate.setBounds(903, 1, 89, 23);
		panel2023.add(btnUpdate);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsert.setBounds(1022, 1, 89, 23);
		panel2023.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(1140, 1, 89, 22);
		panel2023.add(btnDelete);
	}
}
