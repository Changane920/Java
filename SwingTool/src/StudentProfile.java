import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentProfile extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblRollNo;
	private JTextField txtRollNo;
	private JLabel lblGender;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAddress;
	private JTextField txtPMark1;
	private JTextField txtPMark2;
	private JTextField txtPMark3;
	private JTable table;
	private JComboBox<String> cbMajor, cbClass;
	Connection cn;
	Statement st;
	PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentProfile frame = new StudentProfile();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentProfile() {
		setResizable(false);
		setTitle("Student Profile");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNewLabel.setBounds(46, 33, 95, 14);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(198, 27, 148, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		lblRollNo = new JLabel("Roll No.");
		lblRollNo.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblRollNo.setBounds(46, 60, 95, 14);
		contentPane.add(lblRollNo);
		
		txtRollNo = new JTextField();
		txtRollNo.setColumns(10);
		txtRollNo.setBounds(198, 54, 148, 20);
		contentPane.add(txtRollNo);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblGender.setBounds(46, 87, 95, 14);
		contentPane.add(lblGender);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(new Color(128, 128, 255));
		buttonGroup.add(rbMale);
		rbMale.setBounds(198, 81, 54, 23);
		contentPane.add(rbMale);
		rbMale.setActionCommand("Male");
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBackground(new Color(128, 128, 255));
		buttonGroup.add(rbFemale);
		rbFemale.setBounds(254, 81, 72, 23);
		contentPane.add(rbFemale);
		rbFemale.setActionCommand("Female");
		
		JRadioButton rbOther = new JRadioButton("Other");
		rbOther.setBackground(new Color(128, 128, 255));
		rbOther.setSelected(true);
		buttonGroup.add(rbOther);
		rbOther.setBounds(323, 81, 63, 23);
		contentPane.add(rbOther);
		rbOther.setActionCommand("Other");
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblAddress.setBounds(442, 33, 95, 14);
		contentPane.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(594, 27, 148, 20);
		contentPane.add(txtAddress);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblMajor.setBounds(442, 59, 95, 14);
		contentPane.add(lblMajor);
		
		cbMajor = new JComboBox<String>();
		cbMajor.setModel(new DefaultComboBoxModel(new String[] {"ITPEC", "NCC"}));
		cbMajor.setBounds(594, 52, 148, 22);
		contentPane.add(cbMajor);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblClass.setBounds(442, 87, 95, 14);
		contentPane.add(lblClass);
		
		cbClass = new JComboBox<String>();
		cbClass.setModel(new DefaultComboBoxModel(new String[] {"First Year", "Second Year", "Third Year", "Fouth Year"}));
		cbClass.setBounds(594, 79, 148, 22);
		contentPane.add(cbClass);
		
		JLabel lblPMark1 = new JLabel("Project 1 Mark");
		lblPMark1.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblPMark1.setBounds(46, 114, 117, 14);
		contentPane.add(lblPMark1);
		
		txtPMark1 = new JTextField();
		txtPMark1.setColumns(10);
		txtPMark1.setBounds(198, 112, 148, 20);
		contentPane.add(txtPMark1);
		
		txtPMark2 = new JTextField();
		txtPMark2.setColumns(10);
		txtPMark2.setBounds(594, 112, 148, 20);
		contentPane.add(txtPMark2);
		
		JLabel lblPMark2 = new JLabel("Project 2 Mark");
		lblPMark2.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblPMark2.setBounds(442, 114, 117, 14);
		contentPane.add(lblPMark2);
		
		txtPMark3 = new JTextField();
		txtPMark3.setColumns(10);
		txtPMark3.setBounds(198, 139, 148, 20);
		contentPane.add(txtPMark3);
		
		JLabel lblPMark3 = new JLabel("Project 3 Mark");
		lblPMark3.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblPMark3.setBounds(46, 141, 117, 14);
		contentPane.add(lblPMark3);
		
		JButton btnInfo = new JButton("Show Student Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				reloadDB();
			}

		});
		btnInfo.setBounds(46, 464, 139, 23);
		contentPane.add(btnInfo);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getConnection();
				try {
					st = cn.createStatement();
					st.execute("use studentprofile");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					int getRow = table.getSelectedRow();
					int getRollNo = Integer.parseInt(model.getValueAt(getRow, 1).toString());
					
					pst = cn.prepareStatement("update student set name = ?, rollno = ?, gender = ?, address = ?, major = ?, class = ?, p1mark = ?, p2mark = ?, p3mark = ? where rollno = ?");
					pst.setString(1, txtName.getText());
					pst.setInt(2, Integer.parseInt(txtRollNo.getText()));
					pst.setString(3, buttonGroup.getSelection().getActionCommand());
					pst.setString(4, txtAddress.getText());
					pst.setString(5, cbMajor.getSelectedItem().toString());
					pst.setString(6, cbClass.getSelectedItem().toString());
					pst.setDouble(7, Double.parseDouble(txtPMark1.getText()));
					pst.setDouble(8, Double.parseDouble(txtPMark2.getText()));
					pst.setDouble(9, Double.parseDouble(txtPMark3.getText()));
					pst.setInt(10, getRollNo);
					pst.executeUpdate();

					JOptionPane.showMessageDialog(null, "Updated!","Notify",JOptionPane.INFORMATION_MESSAGE);
					reloadDB();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(189, 464, 82, 23);
		contentPane.add(btnUpdate);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getConnection();
				try {
					st = cn.createStatement();
					st.execute("use studentprofile");
				
					pst = cn.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?)");
					pst.setString(1, txtName.getText());
					pst.setInt(2, Integer.parseInt(txtRollNo.getText()));
					pst.setString(3, buttonGroup.getSelection().getActionCommand());
					pst.setString(4, txtAddress.getText());
					pst.setString(5, cbMajor.getSelectedItem().toString());
					pst.setString(6, cbClass.getSelectedItem().toString());
					pst.setDouble(7, Double.parseDouble(txtPMark1.getText()));
					pst.setDouble(8, Double.parseDouble(txtPMark2.getText()));
					pst.setDouble(9, Double.parseDouble(txtPMark3.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Insert Success!","Notify",JOptionPane.INFORMATION_MESSAGE);
					reloadDB();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnInsert.setBounds(364, 464, 82, 23);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getConnection();
				try {
					st = cn.createStatement();
					st.execute("use studentprofile");
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int getSelectRow = table.getSelectedRow();
					int getRollNo = Integer.parseInt(model.getValueAt(getSelectRow, 1).toString());
					
					pst = cn.prepareStatement("delete from student where rollno = ?");
					pst.setInt(1, getRollNo);
					pst.executeUpdate();
					//noti
					JOptionPane.showMessageDialog(null, "Deleted!","Notify",JOptionPane.INFORMATION_MESSAGE);
					reloadDB();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(277, 464, 82, 23);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 180, 839, 273);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getConnection();
				try {
					st = cn.createStatement();
					st.execute("use studentprofile");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					int getRow = table.getSelectedRow();
					int getRollNo = Integer.parseInt(model.getValueAt(getRow, 1).toString());
					
					//name
					txtName.setText(model.getValueAt(getRow, 0).toString());
					//roll no
					txtRollNo.setText(model.getValueAt(getRow, 1).toString());
					//radio
					if(model.getValueAt(getRow, 2).toString().equalsIgnoreCase(rbMale.getActionCommand())) {
						rbMale.setSelected(true);
					}
					else if(model.getValueAt(getRow, 2).toString().equalsIgnoreCase(rbFemale.getActionCommand())){
						rbFemale.setSelected(true);
					}
					else {
						rbOther.setSelected(true);
					}
					//address
					txtAddress.setText(model.getValueAt(getRow, 3).toString());
					//major combo box	
					if(model.getValueAt(getRow, 4).toString().equalsIgnoreCase("itpec")) {
						cbMajor.setSelectedIndex(0);
					}
					else {
						cbMajor.setSelectedIndex(1);
					}
					//class combo box
					switch(model.getValueAt(getRow, 5).toString()) {
					case "First Year":
						cbClass.setSelectedIndex(0);
						break;
					case "Second Year":
						cbClass.setSelectedIndex(1);
						break;
					case "Third Year":
						cbClass.setSelectedIndex(2);
						break;
					case "Fouth Year":
						cbClass.setSelectedIndex(3);
						break;
					default:
						cbClass.setSelectedIndex(1);
					}
					//p1 mark
					txtPMark1.setText(model.getValueAt(getRow, 6).toString());
					//p2 mark
					txtPMark2.setText(model.getValueAt(getRow, 7).toString());
					//p3 mark
					txtPMark3.setText(model.getValueAt(getRow, 8).toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {		
			},
			new String[] {
				"Name", "Roll No.", "Gender", "Address", "Major", "Class", "Project 1 Mark", "Project 2 Mark", "Project 3 Mark"
			}
		));
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
	}
	private void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void reloadDB() {
		try {
			getConnection();
			st = cn.createStatement();
			st.execute("use studentprofile");
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			
			model.setRowCount(0);
			//clear the textfield
			txtName.setText(null);
			txtRollNo.setText(null);
			txtAddress.setText(null);
			txtPMark1.setText(null);
			txtPMark2.setText(null);
			txtPMark3.setText(null);
			
			pst = cn.prepareStatement("select * from student order by rollno");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Object[] row = new Object[table.getColumnCount()];
				row[0] = rs.getString(1);
				row[1] = rs.getInt(2);
				row[2] = rs.getString(3);
				row[3] = rs.getString(4);
				row[4] = rs.getString(5);
				row[5] = rs.getString(6);
				row[6] = rs.getDouble(7);
				row[7] = rs.getDouble(8);
				row[8] = rs.getDouble(9);
				model.addRow(row);
			}			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
