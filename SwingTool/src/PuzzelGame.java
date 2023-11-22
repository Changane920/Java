import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PuzzelGame extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzelGame frame = new PuzzelGame();
					frame.setVisible(true);
					frame.setRandom();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btnSpace,btnClick,btnCount,btnSolution,btnReset,btnExit;
	/**
	 * Create the frame.
	 */
	public PuzzelGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Puzzel Game");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(333, 11, 206, 26);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 70, 418, 341);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 4, 10, 10));
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn9);
		
		btn10 = new JButton("10");
		btn10.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn10);
		
		btn11 = new JButton("11");
		btn11.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btn11);
		
		btnSpace = new JButton("");
		btnSpace.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btnSpace);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(473, 70, 169, 341);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 10, 10));
		
		btnClick = new JButton("Clicks");
		btnClick.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel_1.add(btnClick);
		
		btnCount = new JButton("0");
		btnCount.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel_1.add(btnCount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(652, 70, 169, 341);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 1, 10, 10));
		
		btnSolution = new JButton("Solution");
		btnSolution.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel_2.add(btnSolution);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel_2.add(btnReset);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel_2.add(btnExit);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btnSpace.addActionListener(this);
		btnReset.addActionListener(this);
		btnSolution.addActionListener(this);
	}
	int count = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		btnCount.setText(String.valueOf(count++));
		
		if(e.getSource() == btn1) {
			checkSpace(btn1,btn2);
			checkSpace(btn1,btn5);
		}
		else if(e.getSource() == btn2){
			checkSpace(btn2,btn1);
			checkSpace(btn2,btn3);
			checkSpace(btn2,btn6);
		}
		else if(e.getSource() == btn3) {
			checkSpace(btn3,btn2);
			checkSpace(btn3,btn4);
			checkSpace(btn3,btn7);
		}
		else if(e.getSource() == btn4) {
			checkSpace(btn4,btn3);
			checkSpace(btn4,btn8);
		}
		else if(e.getSource() == btn5) {
			checkSpace(btn5,btn1);
			checkSpace(btn5,btn6);
			checkSpace(btn5,btn9);
		}
		else if(e.getSource() == btn6) {
			checkSpace(btn6,btn2);
			checkSpace(btn6,btn5);
			checkSpace(btn6,btn7);
			checkSpace(btn6,btn10);
		}
		else if(e.getSource() == btn7) {
			checkSpace(btn7,btn3);
			checkSpace(btn7,btn6);
			checkSpace(btn7,btn8);
			checkSpace(btn7,btn11);
		}
		else if(e.getSource() == btn8) {
			checkSpace(btn8,btn4);
			checkSpace(btn8,btn7);
			checkSpace(btn8,btnSpace);
		}
		else if(e.getSource() == btn9) {
			checkSpace(btn9,btn10);
			checkSpace(btn9,btn5);
		}
		else if(e.getSource() == btn10) {
			checkSpace(btn10,btn6);
			checkSpace(btn10,btn9);
			checkSpace(btn10,btn11);
		}
		else if(e.getSource() == btn11) {
			checkSpace(btn11,btn7);
			checkSpace(btn11,btn10);
			checkSpace(btn11,btnSpace);
		}
		else if(e.getSource() == btnSpace) {
			checkSpace(btnSpace,btn8);
			checkSpace(btnSpace,btn11);
		}
		else if(e.getSource() == btnSolution) {
			btn1.setText("1");	btn2.setText("2");	btn3.setText("3");	btn4.setText("4");
			btn5.setText("5");	btn6.setText("6");	btn7.setText("7");	btn8.setText("8");
			btn9.setText("9");	btn10.setText("10");	btn11.setText("11"); btnSpace.setText("");
			btnCount.setText(String.valueOf(0));
		}
		else if(e.getSource() == btnReset) {
			setRandom();
			btnCount.setText(String.valueOf(0));
		}
		checkVictory();
	}
	private void checkSpace(JButton b1, JButton b2) {
		String str = b2.getText();
		if(str == "") {
			b2.setText(b1.getText());
			b1.setText("");
		}
	}
	private void setRandom() {
		int[] arr = new int[12];
		Random r = new Random();
		int pos = 1;
		while(pos < arr.length) {
			int value = r.nextInt(11) + 1;
			if(!checkValue(arr,value)) {
				arr[pos++] = value;
			}
		}
		
		btn1.setText(String.valueOf(arr[1]));
		btn2.setText(String.valueOf(arr[2]));
		btn3.setText(String.valueOf(arr[3]));
		btn4.setText(String.valueOf(arr[4]));
		btn5.setText(String.valueOf(arr[5]));
		btn6.setText(String.valueOf(arr[6]));
		btn7.setText(String.valueOf(arr[7]));
		btn8.setText(String.valueOf(arr[8]));
		btn9.setText(String.valueOf(arr[9]));
		btn10.setText(String.valueOf(arr[10]));
		btn11.setText(String.valueOf(arr[11]));
		btnSpace.setText("");
	}
	private boolean checkValue(int[] arr, int value) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		return false;
	}
	private void checkVictory() {
		if(
				btn1.getText().equals("1") &&  
				btn2.getText().equals("2") &&
				btn3.getText().equals("3") &&  
				btn4.getText().equals("4") &&
				btn5.getText().equals("5") &&  
				btn6.getText().equals("6") &&
				btn7.getText().equals("7") &&  
				btn8.getText().equals("8") &&
				btn9.getText().equals("9") &&  
				btn10.getText().equals("10") &&
				btn11.getText().equals("11") &&  
				btnSpace.getText().equals("") 
			) {
			JOptionPane.showMessageDialog(null, "Victory!","Noti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
