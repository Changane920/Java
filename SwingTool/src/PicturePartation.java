import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PicturePartation extends JFrame {

	private JPanel contentPane;
	JPanel panelFullImage;
	JLabel lblFullImage,lblNewFile;
	File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PicturePartation frame = new PicturePartation();
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
	public PicturePartation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewFile = new JLabel("");
		lblNewFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser filechooser = new JFileChooser();
				filechooser.setDialogTitle("Choose Your File");
				filechooser.setFileSelectionMode(filechooser.FILES_ONLY);
				int returnval = filechooser.showOpenDialog(filechooser);
				if(returnval == JFileChooser.APPROVE_OPTION) {
					file = filechooser.getSelectedFile();
					BufferedImage bi;
					try {
						bi = ImageIO.read(file);
						Image img = new ImageIcon(bi).getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT);
						ImageIcon icon = new ImageIcon(img);
						lblFullImage.setIcon(icon);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
				}
			}
		});
		lblNewFile.setBounds(10, 11, 46, 28);
		contentPane.add(lblNewFile);
		lblNewFile.setIcon(new ImageIcon("Image\\new.png"));
		
		lblFullImage = new JLabel("New label");
		lblFullImage.setBounds(538, 96, 200, 200);
		contentPane.add(lblFullImage);
		
		panelFullImage = new JPanel();
		panelFullImage.setBounds(10, 96, 514, 465);
		contentPane.add(panelFullImage);
		panelFullImage.setLayout(new GridLayout(3, 3, 10, 10));
		
		JLabel lbl1 = new JLabel("New Label");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl2);
		
		JLabel lbl3 = new JLabel("New label");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl3);
		
		JLabel lbl4 = new JLabel("New label");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl4);
		
		JLabel lbl5 = new JLabel("New label");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl5);
		
		JLabel lbl6 = new JLabel("New label");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl6);
		
		JLabel lbl7 = new JLabel("New label");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl7);
		
		JLabel lbl8 = new JLabel("New label");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl8);
		
		JLabel lbl9 = new JLabel("New label");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		panelFullImage.add(lbl9);
	}
}
