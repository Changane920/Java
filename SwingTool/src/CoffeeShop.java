import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CoffeeShop extends JFrame implements ChangeListener {

	private JPanel contentPane;
	JTextArea txtOutput;
	JSpinner spinCapSmall,spinCapMedium,spinCapLarge,spinEsSmall,spinEsMedium,spinEsLarge,spinKSmall,spinKMedium,spinKLarge;
	double getCapSmallPrice,getCapMediumPrice,getCapLargePrice,getEsSmallPrice,getEsMediumPrice,getEsLargePrice,getKSmallPrice,getKMediumPrice,getKLargePrice,total;
	int totalQuantity;
	int qCapSmall,qCapMedium,qCapLarge,qEsSmall,qEsMedium,qEsLarge,qKSmall,qKMedium,qKLarge;
	String[] menu = new String[9];
	int id = 1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeShop frame = new CoffeeShop();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoffeeShop() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblheader = new JLabel("Coffee Shop");
		lblheader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblheader.setHorizontalAlignment(SwingConstants.CENTER);
		lblheader.setBounds(380, 11, 172, 33);
		contentPane.add(lblheader);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 139, 139));
		panelMenu.setBounds(35, 62, 553, 403);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(1, 3, 5, 5));
		
		JPanel panelSubMenu1 = new JPanel();
		panelSubMenu1.setBackground(new Color(0, 128, 128));
		panelMenu.add(panelSubMenu1);
		panelSubMenu1.setLayout(new GridLayout(2, 1, 5, 5));
		
		JPanel panelItem1 = new JPanel();
		panelItem1.setBackground(new Color(0, 139, 139));
		panelSubMenu1.add(panelItem1);
		panelItem1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Capaccino");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 161, 26);
		panelItem1.add(lblNewLabel);
		
		JLabel lblImage1 = new JLabel("");
		lblImage1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage1.setIcon(new ImageIcon("Image\\capaccino (1).png"));
		lblImage1.setBounds(10, 36, 161, 152);
		panelItem1.add(lblImage1);
		
		JPanel panelPrice1 = new JPanel();
		panelPrice1.setBackground(new Color(135, 206, 235));
		panelSubMenu1.add(panelPrice1);
		panelPrice1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Small $ 1.5");
		lblNewLabel_1.setBounds(26, 24, 86, 14);
		panelPrice1.add(lblNewLabel_1);
		
		spinCapSmall = new JSpinner();
		spinCapSmall.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinCapSmall.setBounds(109, 21, 46, 20);
		panelPrice1.add(spinCapSmall);
		
		spinCapMedium = new JSpinner();
		spinCapMedium.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinCapMedium.setBounds(109, 86, 46, 20);
		panelPrice1.add(spinCapMedium);
		
		JLabel lblNewLabel_1_1 = new JLabel("Medium $ 2.0");
		lblNewLabel_1_1.setBounds(26, 89, 86, 14);
		panelPrice1.add(lblNewLabel_1_1);
		
		spinCapLarge = new JSpinner();
		spinCapLarge.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinCapLarge.setBounds(109, 153, 46, 20);
		panelPrice1.add(spinCapLarge);
		
		JLabel lblNewLabel_1_2 = new JLabel("Large $ 2.5");
		lblNewLabel_1_2.setBounds(26, 156, 86, 14);
		panelPrice1.add(lblNewLabel_1_2);
		
		JPanel panelSubMenu2 = new JPanel();
		panelSubMenu2.setBackground(new Color(0, 139, 139));
		panelMenu.add(panelSubMenu2);
		panelSubMenu2.setLayout(new GridLayout(2, 1, 5, 5));
		
		JPanel panelItem2 = new JPanel();
		panelItem2.setBackground(new Color(0, 139, 139));
		panelSubMenu2.add(panelItem2);
		panelItem2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Espresso");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 11, 161, 26);
		panelItem2.add(lblNewLabel_2);
		
		JLabel lblImage2 = new JLabel("");
		lblImage2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage2.setBounds(10, 36, 161, 152);
		lblImage2.setIcon(new ImageIcon("Image\\espresso (1).png"));
		panelItem2.add(lblImage2);
		
		JPanel panelPrice2 = new JPanel();
		panelPrice2.setBackground(new Color(135, 206, 235));
		panelSubMenu2.add(panelPrice2);
		panelPrice2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Small $ 2.0");
		lblNewLabel_1_3.setBounds(23, 23, 86, 14);
		panelPrice2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Medium $ 2.5");
		lblNewLabel_1_1_1.setBounds(23, 88, 86, 14);
		panelPrice2.add(lblNewLabel_1_1_1);
		
		spinEsMedium = new JSpinner();
		spinEsMedium.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinEsMedium.setBounds(106, 85, 46, 20);
		panelPrice2.add(spinEsMedium);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Large $ 3.0");
		lblNewLabel_1_2_1.setBounds(23, 155, 86, 14);
		panelPrice2.add(lblNewLabel_1_2_1);
		
		spinEsLarge = new JSpinner();
		spinEsLarge.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinEsLarge.setBounds(106, 152, 46, 20);
		panelPrice2.add(spinEsLarge);
		
		spinEsSmall = new JSpinner();
		spinEsSmall.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinEsSmall.setBounds(106, 20, 46, 20);
		panelPrice2.add(spinEsSmall);
		
		JPanel panelSubMenu3 = new JPanel();
		panelSubMenu3.setBackground(new Color(0, 139, 139));
		panelMenu.add(panelSubMenu3);
		panelSubMenu3.setLayout(new GridLayout(2, 1, 5, 5));
		
		JPanel panelItem3 = new JPanel();
		panelItem3.setBackground(new Color(0, 139, 139));
		panelSubMenu3.add(panelItem3);
		panelItem3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Black");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 11, 161, 26);
		panelItem3.add(lblNewLabel_3);
		
		JLabel lblImage3 = new JLabel("");
		lblImage3.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage3.setBounds(10, 36, 161, 152);
		lblImage3.setIcon(new ImageIcon("Image\\black (1).png"));
		panelItem3.add(lblImage3);
		
		JPanel panelPrice3 = new JPanel();
		panelPrice3.setBackground(new Color(135, 206, 235));
		panelSubMenu3.add(panelPrice3);
		panelPrice3.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Small $ 2.5");
		lblNewLabel_1_3_1.setBounds(30, 24, 86, 14);
		panelPrice3.add(lblNewLabel_1_3_1);
		
		spinKSmall = new JSpinner();
		spinKSmall.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinKSmall.setBounds(113, 21, 46, 20);
		panelPrice3.add(spinKSmall);
		
		spinKMedium = new JSpinner();
		spinKMedium.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinKMedium.setBounds(113, 86, 46, 20);
		panelPrice3.add(spinKMedium);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Medium $ 3.0");
		lblNewLabel_1_1_1_1.setBounds(30, 89, 86, 14);
		panelPrice3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Large $ 3.5");
		lblNewLabel_1_2_1_1.setBounds(30, 156, 86, 14);
		panelPrice3.add(lblNewLabel_1_2_1_1);
		
		spinKLarge = new JSpinner();
		spinKLarge.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinKLarge.setBounds(113, 153, 46, 20);
		panelPrice3.add(spinKLarge);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(598, 62, 294, 353);
		contentPane.add(scrollPane);
		
		txtOutput = new JTextArea();
		scrollPane.setViewportView(txtOutput);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				
				txtOutput.append("============================================\n");
				txtOutput.append("\t         Coffee Studio\t\n");
				txtOutput.append("============================================\n");
				txtOutput.append(" Name\t\tUnit Price\tQuantity\n");
			
				//black coffee
				if(Double.parseDouble(spinKSmall.getValue().toString()) > 0) {
					txtOutput.append("Black Coffee Small\t$" + getKSmallPrice + "\t" + spinKSmall.getValue().toString() + "\n");
					menu[0] = "Black Coffee Small";
				}
				if(Double.parseDouble(spinKMedium.getValue().toString()) > 0) {
					txtOutput.append("Black Coffee Medium\t$" + getKMediumPrice + "\t" + spinKMedium.getValue().toString() + "\n");
					menu[1] = "Black Coffee Medium";
				}
				if(Double.parseDouble(spinKLarge.getValue().toString()) > 0) {
					txtOutput.append("Black Coffee Large\t$" + getKLargePrice + "\t" + spinKLarge.getValue().toString() + "\n");
					menu[2] = "Black Coffee Large";
				}
				//capaccino
				if(Double.parseDouble(spinCapSmall.getValue().toString()) > 0) {
					txtOutput.append("Capaccino Small\t$" + getCapSmallPrice + "\t" + spinCapSmall.getValue().toString() + "\n");
					menu[3] = "Capaccino Small";
				}
				if(Double.parseDouble(spinCapMedium.getValue().toString()) > 0){
					txtOutput.append("Capaccino Medium\t$" + getCapMediumPrice + "\t" + spinCapMedium.getValue().toString() + "\n");
					menu[4] = "Capaccino Medium";
				}
				if(Double.parseDouble(spinCapLarge.getValue().toString()) > 0) {
					txtOutput.append("Capaccino Large\t$" + getCapLargePrice + "\t" + spinCapLarge.getValue().toString() + "\n");
					menu[5] = "Capaccino Large";
				}
				//Espresso
				if(Double.parseDouble(spinEsSmall.getValue().toString()) > 0) {
					txtOutput.append("Espresso Small\t$" + getEsSmallPrice + "\t" + spinEsSmall.getValue().toString() + "\n");
					menu[6] = "Espresso Small";
				}
				if(Double.parseDouble(spinEsMedium.getValue().toString()) > 0) {
					txtOutput.append("Espresso Medium\t$" + getEsMediumPrice + "\t" + spinEsMedium.getValue().toString() + "\n");
					menu[7] = "Espresso Medium";
				}
				if(Double.parseDouble(spinEsLarge.getValue().toString()) > 0) {
					txtOutput.append("Espresso Large\t$" + getEsLargePrice + "\t" + spinEsLarge.getValue().toString() + "\n");
					menu[8] = "Espresso Large";
				}
				//total
				txtOutput.append("Total:\t\t$" + total + "\t" + totalQuantity);
			}
		});
		btnCheckOut.setBounds(598, 424, 126, 41);
		contentPane.add(btnCheckOut);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField username = new JTextField();
				Object[] getUsername = {
						"Username: ", username
				};
				
				int opt = JOptionPane.showConfirmDialog(null, getUsername,"Order Box",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(opt == JOptionPane.OK_OPTION) {
					try {
						JOptionPane.showMessageDialog(null, "Order Complete","Notify",JOptionPane.INFORMATION_MESSAGE);
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
						Statement st = cn.createStatement();
						PreparedStatement pst;
						
						st.execute("use coffeeshop");
						for(int i = 0; i < menu.length; i++) {
							if(menu[i] != null) {
								pst = cn.prepareStatement("insert into customer values (?,?,?,?,?,?)");
								pst.setInt(1, id++);
								pst.setString(2, username.getText());							
								pst.setString(3, menu[i]);
							
								switch(menu[i]) {
								case "Capaccino Small":
									pst.setInt(4, qCapSmall);
									pst.setDouble(5, 1.5);
									pst.setDouble(6, getCapSmallPrice);
									break;								
								case "Capaccino Medium":
									pst.setInt(4, qCapMedium);
									pst.setDouble(5, 2.0);
									pst.setDouble(6, getCapMediumPrice);
									break;
								case "Capaccino Large":
									pst.setInt(4, qCapLarge);
									pst.setDouble(5, 2.5);
									pst.setDouble(6, getCapLargePrice);
									break;
								case "Espresso Small":
									pst.setInt(4, qEsSmall);
									pst.setDouble(5, 2.0);
									pst.setDouble(6, getEsSmallPrice);
									break;
								case "Espresso Medium":
									pst.setInt(4, qEsMedium);
									pst.setDouble(5, 2.5);
									pst.setDouble(6, getEsMediumPrice);
									break;
								case "Espresso Large":
									pst.setInt(4, qEsLarge);
									pst.setDouble(5, 3.0);
									pst.setDouble(6, getEsLargePrice);
									break;
								case "Black Coffee Small":
									pst.setInt(4, qKSmall);
									pst.setDouble(5, 2.5);
									pst.setDouble(6, getKSmallPrice);
									break;
								case "Black Coffee Medium":
									pst.setInt(4, qKMedium);
									pst.setDouble(5, 3.0);
									pst.setDouble(6, getKMediumPrice);
									break;
								case "Black Coffee Large":
									pst.setInt(4, qKLarge);
									pst.setDouble(5, 3.5);
									pst.setDouble(6, getKLargePrice);
									break;
								}
								pst.executeUpdate();
							}
						}
						//make all back to original
						refresh();						
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnOrder.setBounds(767, 424, 126, 41);
		contentPane.add(btnOrder);
		
		spinCapSmall.addChangeListener(this);
		spinCapMedium.addChangeListener(this);
		spinCapLarge.addChangeListener(this);
		spinEsSmall.addChangeListener(this);
		spinEsMedium.addChangeListener(this);
		spinEsLarge.addChangeListener(this);
		spinKSmall.addChangeListener(this);
		spinKMedium.addChangeListener(this);
		spinKLarge.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		qCapSmall = Integer.parseInt(spinCapSmall.getValue().toString());
		qCapMedium = Integer.parseInt(spinCapMedium.getValue().toString());
		qCapLarge = Integer.parseInt(spinCapLarge.getValue().toString());
		qEsSmall = Integer.parseInt(spinEsSmall.getValue().toString());
		qEsMedium = Integer.parseInt(spinEsMedium.getValue().toString());
		qEsLarge = Integer.parseInt(spinEsLarge.getValue().toString());
		qKSmall = Integer.parseInt(spinKSmall.getValue().toString());
		qKMedium = Integer.parseInt(spinKMedium.getValue().toString());
		qKLarge = Integer.parseInt(spinKLarge.getValue().toString());
		
		getCapSmallPrice = 1.5 * Double.parseDouble(spinCapSmall.getValue().toString());
		getCapMediumPrice = 2.0 * Double.parseDouble(spinCapMedium.getValue().toString());
		getCapLargePrice = 2.5 * Double.parseDouble(spinCapLarge.getValue().toString());
		
		getEsSmallPrice = 2.0 * Double.parseDouble(spinEsSmall.getValue().toString());
		getEsMediumPrice = 2.5 * Double.parseDouble(spinEsMedium.getValue().toString());
		getEsLargePrice = 3.0 * Double.parseDouble(spinEsLarge.getValue().toString());
		
		getKSmallPrice = 2.5 * Double.parseDouble(spinKSmall.getValue().toString());
		getKMediumPrice = 3.0 * Double.parseDouble(spinKMedium.getValue().toString());
		getKLargePrice = 3.5 * Double.parseDouble(spinKLarge.getValue().toString());
		
		total = getCapSmallPrice + getCapMediumPrice + getCapLargePrice + getEsSmallPrice + getEsMediumPrice + getEsLargePrice + getKSmallPrice + getKMediumPrice + getKLargePrice;
		totalQuantity = qCapSmall + qCapMedium + qCapLarge + qEsSmall + qEsMedium + qEsLarge + qKSmall + qKMedium + qKLarge;
	}
	private void refresh() {
		spinCapSmall.setValue(0);
		spinCapMedium.setValue(0);
		spinCapLarge.setValue(0);
		spinEsSmall.setValue(0);
		spinEsMedium.setValue(0);
		spinEsLarge.setValue(0);
		spinKSmall.setValue(0);
		spinKMedium.setValue(0);
		spinKLarge.setValue(0);
		txtOutput.setText(null);
	}
}
