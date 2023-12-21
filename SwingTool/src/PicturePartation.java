import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PicturePartation extends JFrame implements MouseListener {

	private JPanel contentPane;
	JPanel panelSplit;
	JLabel lblFullImage,lblNewFile;
	File file;
	JLabel[] imgLabel;
	int row, col, space, size;
	String imgPath;
	JLabel[][] testArray;
	
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
						splitImage(file);
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
		lblFullImage.setBounds(538, 61, 200, 200);
		contentPane.add(lblFullImage);
		
		panelSplit = new JPanel();
		panelSplit.setBounds(20, 61, 500, 500);
		contentPane.add(panelSplit);
		
		JButton btnRandom = new JButton("Random");
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				panelSplit.repaint();
				panelSplit.revalidate();
				
				Integer[] numArray = {0,1,2,3,4,5,6,7,8};
				List<Integer> numList = Arrays.asList(numArray);
				Collections.shuffle(numList);
				for(int i = 0; i < numList.size()-2; i++) {
					//panelSplit.add(imgLabel[numList.get(i)]);
				}
				
				for(int r = 0; r < numList.size(); r++) {
					for(int c = 0; c < numList.size(); c++) {
						panelSplit.add(testArray[numList.get(r)][numList.get(c)]);
					}
				}
				
				/*List<JLabel> listLabel = Arrays.asList(imgLabel);
				Collections.shuffle(listLabel);
				for(int i = 0; i < listLabel.size()-1;i++) {
					panelSplit.add(listLabel.get(i));
				}*/
				//imgLabel[imgLabel.length-1].setIcon(null);
			}
		});
		btnRandom.setBounds(598, 377, 89, 23);
		contentPane.add(btnRandom);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSplit.repaint();
				panelSplit.revalidate();
				
				for(int i = 0; i < imgLabel.length; i++) {
					panelSplit.add(imgLabel[i]);
				}
			}
		});
		btnReset.setBounds(598, 411, 89, 23);
		contentPane.add(btnReset);
	}
	 private BufferedImage[] getImages() {
		 row = 3; col = 3;
		 size = row * col;
		 space = 5;
	
		 panelSplit.setLayout(new GridLayout(row, col, space, space));
		 
		 File file = new File(imgPath); 
		 FileInputStream fis = null;
		 try {
			 fis = new FileInputStream(file);
		 } catch (FileNotFoundException ex) {
            Logger.getLogger(PicturePartation.class.getName()).log(Level.SEVERE, null, ex);
		 }
		 BufferedImage image = null;
		 try {
            image = ImageIO.read(fis); //reading the image file 
		 } catch (IOException ex) {
            Logger.getLogger(PicturePartation.class.getName()).log(Level.SEVERE, null, ex);
		 }
		 int chunkWidth = image.getWidth() / col; // determines the chunk width and height
		 int chunkHeight = image.getHeight() / row;
		 int count = 0;
		 
		 BufferedImage imgs[] = new BufferedImage[size]; //Image array to hold image chunks

		 for (int x = 0; x < row; x++) {
			 for (int y = 0; y < col; y++) {
                //Initialize the image array with image chunks
                imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());

                // draws the image chunk
                Graphics2D gr = imgs[count++].createGraphics();
                gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
                gr.dispose();
			 }
		 }
		 return imgs;
	   }
	private void splitImage(File f) {
		
		imgPath = f.getPath();
		
		BufferedImage[] img = getImages();
		imgLabel = new JLabel[img.length];
		
		for(int i = 0; i < imgLabel.length; i++) {
			imgLabel[i] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img[i].getSource())));
			if(i == imgLabel.length-1) {
				imgLabel[i].setIcon(null);
			}
			panelSplit.add(imgLabel[i]);
		}
		
		//split image to be clickable	
		for(int i = 0; i < imgLabel.length; i++) {
			imgLabel[i].addMouseListener(this);			
		}
	}
	private void gameControl(int i) {
		
	}
	private void swap(JLabel b1, JLabel b2) {
		Icon temp;
		temp = b1.getIcon();
		b1.setIcon(null);
		b2.setIcon(temp);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < imgLabel.length; i++) {
			//get the clicked label index
			if(e.getSource() == imgLabel[i]) {
				gameControl(i);		
				System.out.println(i);
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
