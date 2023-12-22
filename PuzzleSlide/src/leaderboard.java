import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class leaderboard extends JFrame {

	private JPanel contentPane;
	private Connection cn;
	private JTable table;
	private Statement st;
	private PreparedStatement pst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leaderboard frame = new leaderboard();
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
	public leaderboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/puzzle(1).png"));
		setResizable(false);
		setTitle("Leaderboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 452);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnEasy = new JMenuItem("Easy");
		mnEasy.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		mnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reloadDB("Easy");
			}
		});
		mnEasy.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnEasy);
		
		JMenuItem mnMedium = new JMenuItem("Medium");
		mnMedium.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		mnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reloadDB("Medium");
			}
		});
		mnMedium.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnMedium);
		
		JMenuItem mnHard = new JMenuItem("Hard");
		mnHard.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		mnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reloadDB("Hard");
			}
		});
		mnHard.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnHard);
		
		JMenuItem mnBack = new JMenuItem("Back");
		mnBack.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		mnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				playui ui = new playui();
				ui.setVisible(true);
			}
		});
		mnBack.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnBack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(30, 10));
		
		table = new JTable();
		table.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Score"
			}
		));
		//contentPane.add(table, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.NORTH);
	}
	private Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root",null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
	private void reloadDB(String str) {
		getConnection();
		try {
			st = cn.createStatement();
			st.execute("use puzzleslide");
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			
			pst = cn.prepareStatement("select name, minute, second from player where level = \""+str+"\" order by concat(minute,second)");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Object[] row = new Object[table.getColumnCount()];
				row[0] = rs.getString("name");
				row[1] = rs.getString("minute") + ":" + rs.getString("second");
				model.addRow(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
