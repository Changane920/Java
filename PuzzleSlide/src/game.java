import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class game extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JPanel mainPanel, functionPanel;
	private JLabel lblShowImage, lblTimer;
	private String imgPath = null, level = null;
	private File image1;
	private Timer timer;
	private List<JLabel> orgList;
	private List<JLabel> imgList;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbEasy, rdbMedium, rdbHard;
	private int row, col, size, index, minute = 0, second = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game();
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
	public game() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/puzzle(1).png"));
		setTitle("Puzzle Sliding Game");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 698);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setBounds(10, 52, 600, 600);
		contentPane.add(mainPanel);

		lblShowImage = new JLabel("");
		lblShowImage.setBounds(620, 52, 300, 300);
		contentPane.add(lblShowImage);

		functionPanel = new JPanel();
		functionPanel.setBackground(Color.GRAY);
		functionPanel.setBounds(620, 363, 289, 289);
		contentPane.add(functionPanel);
		functionPanel.setLayout(null);

		lblTimer = new JLabel("00:00");
		lblTimer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTimer.setBounds(154, 109, 67, 35);
		functionPanel.add(lblTimer);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				mainPanel.repaint();
				mainPanel.revalidate();
				try {
					splitImage();
					checkVictory();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnReset.setBackground(new Color(255, 255, 255));
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReset.setBackground(Color.black);
				btnReset.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnReset.setBackground(Color.white);
				btnReset.setForeground(Color.black);
			}
		});
		btnReset.setBounds(10, 243, 123, 35);
		functionPanel.add(btnReset);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				playui ui = new playui();
				ui.setVisible(true);
			}
		});
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBack.setBackground(Color.black);
				btnBack.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setBackground(Color.white);
				btnBack.setForeground(Color.black);
			}
		});
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setBounds(154, 243, 123, 35);
		functionPanel.add(btnBack);

		rdbEasy = new JRadioButton("Easy");
		rdbEasy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbEasy.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbEasy);
		rdbEasy.setBounds(17, 11, 60, 23);
		contentPane.add(rdbEasy);
		rdbEasy.addActionListener(this);

		rdbMedium = new JRadioButton("Medium");
		rdbMedium.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbMedium.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbMedium);
		rdbMedium.setBounds(79, 11, 73, 23);
		contentPane.add(rdbMedium);
		rdbMedium.addActionListener(this);

		rdbHard = new JRadioButton("Hard");
		rdbHard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbHard.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbHard);
		rdbHard.setBounds(154, 11, 109, 23);
		contentPane.add(rdbHard);
		rdbHard.addActionListener(this);

		// start the game
		// get data from getData class
		getData data = new getData();
		imgPath = data.getImgPath();
		image1 = new File(imgPath);

		JLabel lblText = new JLabel("Timer:");
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblText.setBounds(67, 109, 77, 35);
		functionPanel.add(lblText);

		// reload the panel
		refreshPanel(mainPanel);

		try {
			BufferedImage bi = ImageIO.read(image1);
			Image img = new ImageIcon(bi).getImage().getScaledInstance(290, 290, DO_NOTHING_ON_CLOSE);
			Image img1 = new ImageIcon(bi).getImage().getScaledInstance(600, 600, DO_NOTHING_ON_CLOSE);
			ImageIcon icon = new ImageIcon(img);
			ImageIcon icon1 = new ImageIcon(img1);
			lblShowImage.setIcon(icon);
			mainPanel.add(new JLabel(icon1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private BufferedImage[] getImages() throws IOException {

		mainPanel.setLayout(new GridLayout(row, col, 5, 5));

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(imgPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, e);
		}
		BufferedImage image = null;
		int chunkWidth = 0, chunkHeight = 0;
		int count = 0;
		try {
			image = ImageIO.read(fis);
			image = resizeImage(image, 600, 600);
			chunkWidth = image.getWidth() / col;
			chunkHeight = image.getHeight() / row;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedImage img[] = new BufferedImage[size];

		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				img[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());

				Graphics2D gr = img[count++].createGraphics();
				gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x,
						(chunkWidth * y) + chunkWidth, (chunkHeight * x) + chunkHeight, null);
				gr.dispose();
			}
		}
		return img;
	}

	private void splitImage() throws IOException {
		mainPanel.repaint();
		mainPanel.revalidate();
		mainPanel.removeAll();

		BufferedImage[] img = getImages();
		imgList = new ArrayList<JLabel>();
		orgList = new ArrayList<JLabel>();

		for (int i = 0; i < img.length; i++) {
			if (i == img.length - 1) {
				JLabel temp = new JLabel();
				temp.setIcon(null);
				imgList.add(temp);
				orgList.add(temp);
				mainPanel.add(temp);
				temp.addMouseListener(this);
				continue;
			}
			JLabel piece = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img[i].getSource())));
			imgList.add(piece);
			orgList.add(piece);
			piece.addMouseListener(this);
			mainPanel.add(piece);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (rdbEasy.isSelected()) {
			startTimer();
			level = "Easy";
			row = 3;
			col = 3;
			size = row * col;
			try {
				splitImage();
				shuffleImage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (rdbMedium.isSelected()) {
			startTimer();
			level = "Medium";
			row = 4;
			col = 4;
			size = row * col;
			try {
				splitImage();
				shuffleImage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (rdbHard.isSelected()) {
			startTimer();
			level = "Hard";
			row = 5;
			col = 5;
			size = row * col;
			try {
				splitImage();
				shuffleImage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private void startTimer() {
		lblTimer.setText("00:00");
		// check if the timer is running
		if (timer != null && timer.isRunning()) {
			timer.stop();
			second = 0;
			minute = 0;

			// Format the time with leading zeros
			String formattedTime = String.format("%02d:%02d", minute, second);

			// Display the formatted time
			lblTimer.setText(formattedTime);
		}

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateTimer();
			}
		});
		timer.start();
	}

	private void stopTimer() {
		if (timer != null) {
			timer.stop();
		}
	}

	private void updateTimer() {
		second++;
		if (second == 60) {
			second = 0;
			minute++;
		}

		String formattedTime = String.format("%02d:%02d", minute, second);
		lblTimer.setText(formattedTime);
	}

	private void shuffleImage() {
		Collections.shuffle(imgList);
		refreshPanel(mainPanel);
	}

	public int getNullIndex() {
		for (int i = 0; i < imgList.size(); i++) {
			if (imgList.get(i).getIcon() == null) {
				return i;
			}
		}
		return -1;
	}

	private Point getPosition(JLabel l) {
		int index = mainPanel.getComponentZOrder(l);
		int getRow = index / row;
		int getCol = index % col;
		return new Point(getRow, getCol);
	}

	private boolean isVictory() {
		for (int i = 0; i < orgList.size(); i++) {
			JLabel temp = orgList.get(i);
			int getRow = i / row;
			int getCol = i % col;
			if (getPosition(temp).x != getRow || getPosition(temp).y != getCol) {
				return false;
			}
		}
		return true;
	}

	private boolean checkAdjacent(int ix1, int ix2) {
		if (ix1 / row == ix2 / row && Math.abs(ix1 - ix2) == 1) {
			return true;
		}
		if (ix1 % row == ix2 % row && Math.abs(ix1 - ix2) == row) {
			return true;
		}
		return false;
	}

	public void refreshPanel(JPanel p) {
		p.removeAll();
		p.repaint();
		p.revalidate();
		if (row != 0 && col != 0) {
			mainPanel.setLayout(new GridLayout(row, col, 2, 2));
			for (JLabel l : imgList) {
				mainPanel.add(l);
			}
		}
	}

	// Resize Image Pieces
	private BufferedImage resizeImage(BufferedImage old, int width, int height) {
		BufferedImage resize = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = resize.createGraphics();
		g2d.drawImage(old, 0, 0, width, height, null);
		g2d.dispose();
		return resize;
	}

	private void checkVictory() throws IOException {
		if (isVictory()) {
			stopTimer();
			if (JOptionPane.showConfirmDialog(null, "Do you want to save your score!", "Notify",
					JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				JTextField uName = new JTextField();
				Object[] nameTF = { "Username: ", uName, };
				JOptionPane.showMessageDialog(null, nameTF, "MessageBox", JOptionPane.NO_OPTION);
				System.out.println("Your name is " + uName.getText() + ". Your score is " + lblTimer.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", null);

					Statement st = cn.createStatement();
					st.execute("use puzzleslide");
					ResultSet rs = st.executeQuery("select * from player where name =\"" + uName.getText() + "\"");
					if (!rs.next()) {
						st.execute("insert into player (name,minute,second,level) values (\"" + uName.getText() + "\",'"
								+ minute + "','" + second + "',\"" + level + "\")");
						System.out.println("Insert Success!");
					} else {
						int getId = rs.getInt("id");
						st.execute("update player set name = \"" + uName.getText() + "\", minute=" + minute + ",second="
								+ second + ",level=\"" + level + "\" where id = " + getId + "");
						System.out.println("Update success!");
					}
					rs.close();
					st.close();
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (int i = 0; i < imgList.size(); i++) {
			if (e.getSource() == imgList.get(i)) {
				index = i;
			}
		}
		if (checkAdjacent(index, getNullIndex())) {
			Collections.swap(imgList, index, getNullIndex());
			refreshPanel(mainPanel);
			try {
				checkVictory();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
