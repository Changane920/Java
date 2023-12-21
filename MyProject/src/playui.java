import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class playui extends JFrame implements MouseListener {
	Image img;
	private JPanel contentPane;
	private JLabel img1, img2, img3, img4, img5, img6;
	private File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playui frame = new playui();
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
	public playui() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Changane\\Downloads\\puzzle.png"));
		setTitle("Image Box");
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose the image to play!");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Changane\\Downloads\\puzzle(1).png"));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(266, 0, 454, 81);
		contentPane.add(lblNewLabel);

		img1 = new JLabel("");
		img1.setBounds(62, 83, 250, 250);
		contentPane.add(img1);
		img1.addMouseListener(this);

		img2 = new JLabel("");
		img2.setBounds(370, 83, 250, 250);
		contentPane.add(img2);
		img2.addMouseListener(this);

		img3 = new JLabel("");
		img3.setBounds(678, 83, 250, 250);
		contentPane.add(img3);
		img3.addMouseListener(this);

		img4 = new JLabel("");
		img4.setBounds(62, 376, 250, 250);
		contentPane.add(img4);
		img4.addMouseListener(this);

		img5 = new JLabel("");
		img5.setBounds(370, 376, 250, 250);
		contentPane.add(img5);
		img5.addMouseListener(this);

		img6 = new JLabel("");
		img6.setBackground(Color.LIGHT_GRAY);
		img6.setOpaque(true);
		img6.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				img6.setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				img6.setBackground(Color.LIGHT_GRAY);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser filechooser = new JFileChooser();
				filechooser.setDialogTitle("Choose Your File");
				filechooser.setFileSelectionMode(filechooser.FILES_ONLY);
				int returnval = filechooser.showOpenDialog(filechooser);
				if (returnval == JFileChooser.APPROVE_OPTION) {
					file = filechooser.getSelectedFile();					
					getData data = new getData();
					data.setImgPath(file.getPath());
					BufferedImage img = null;
					try {
						img = ImageIO.read(file);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					data.setImg(img);
					game game = new game();
					game.setVisible(true);
				}
			}
		});
		img6.setBounds(678, 376, 250, 250);
		contentPane.add(img6);

		// ImageIcon backgroundimg1 = new
		// ImageIcon(this.getClass().getResource("image/image1.jpg"));
		backgroundimg1 = new ImageIcon("image/image1.jpg");
		logoclose1 = backgroundimg1.getImage();
		Image scaleclose1 = logoclose1.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose1 = new ImageIcon(scaleclose1);
		img1.setIcon(scaledclose1);

		// ImageIcon backgroundimg2 = new
		// ImageIcon(this.getClass().getResource("image/image1.jpg"));
		ImageIcon backgroundimg2 = new ImageIcon("image/image2.jpg");
		Image logoclose2 = backgroundimg2.getImage();
		Image scaleclose2 = logoclose2.getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose2 = new ImageIcon(scaleclose2);
		img2.setIcon(scaledclose2);

		// ImageIcon backgroundimg3 = new
		// ImageIcon(this.getClass().getResource("image/image1.jpg"));
		ImageIcon backgroundimg3 = new ImageIcon("image/image3.jpg");
		Image logoclose3 = backgroundimg3.getImage();
		Image scaleclose3 = logoclose3.getScaledInstance(img3.getWidth(), img3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose3 = new ImageIcon(scaleclose3);
		img3.setIcon(scaledclose3);

		// ImageIcon backgroundimg4= new
		// ImageIcon(this.getClass().getResource("image/image1.jpg"));
		ImageIcon backgroundimg4 = new ImageIcon("image/image4.jpg");
		Image logoclose4 = backgroundimg4.getImage();
		Image scaleclose4 = logoclose4.getScaledInstance(img4.getWidth(), img4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose4 = new ImageIcon(scaleclose4);
		img4.setIcon(scaledclose4);

		// ImageIcon backgroundimg5 = new
		// ImageIcon(this.getClass().getResource("image/image1.jpg"));
		ImageIcon backgroundimg5 = new ImageIcon("image/image5.jpg");
		Image logoclose5 = backgroundimg5.getImage();
		Image scaleclose5 = logoclose5.getScaledInstance(img5.getWidth(), img5.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose5 = new ImageIcon(scaleclose5);
		img5.setIcon(scaledclose5);

		// ImageIcon backgroundimg6 = new
		// ImageIcon(this.getClass().getResource("image/addImage.png"));
		ImageIcon backgroundimg6 = new ImageIcon("image/addImage.png");
		Image logoclose6 = backgroundimg6.getImage();
		Image scaleclose6 = logoclose6.getScaledInstance(img6.getWidth(), img6.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledclose6 = new ImageIcon(scaleclose6);
		img6.setIcon(scaledclose6);

		JButton btnLeaderBoard = new JButton("Leaderboard");
		btnLeaderBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLeaderBoard.setBackground(new Color(255, 255, 255));
		btnLeaderBoard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLeaderBoard.setBackground(Color.black);
				btnLeaderBoard.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnLeaderBoard.setBackground(Color.white);
				btnLeaderBoard.setForeground(Color.black);
			}
		});
		btnLeaderBoard.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnLeaderBoard.setBounds(409, 658, 167, 35);
		contentPane.add(btnLeaderBoard);
	}

	public void imageload() {

		// System.out.println(backgroundimg1);
	}

	private void getFile(String path) {
		getData data = new getData();
		data.setImgPath(path);
		file = new File(data.getImgPath());
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(data.getImgPath()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		data.setImg(img);
		game game = new game();
		game.setVisible(true);
		this.dispose();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == img1) {
			getFile("image/image1.jpg");
		} else if (e.getSource() == img2) {
			getFile("image/image2.jpg");
		} else if (e.getSource() == img3) {
			getFile("image/image3.jpg");
		} else if (e.getSource() == img4) {
			getFile("image/image4.jpg");
		} else if (e.getSource() == img5) {
			getFile("image/image5.jpg");
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
	
	private ImageIcon backgroundimg1;
	private Image logoclose1;
}
