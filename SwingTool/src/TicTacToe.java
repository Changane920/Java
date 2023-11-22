import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TicTacToe extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	int count = 1;
	String player;
	JLabel lblPlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// choose player turn
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 10, 10));

		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn1);

		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn2);

		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn3);

		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn4);

		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn5);

		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn6);

		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn7);

		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn8);

		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btn9);

		lblPlayer = new JLabel("Player Turn: ");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblPlayer, BorderLayout.SOUTH);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
	}
	private void checkPlayer() {
		if(count % 2 == 0) {
			player = "O";
			lblPlayer.setText("Player Turn: X");
		}
		else {
			player = "X";
			lblPlayer.setText("Player Turn: O");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		checkPlayer();
		count++;
		if (e.getSource() == btn1) {
			btn1.setText(player);
			checkPattern();
		}
		else if (e.getSource() == btn2) {
			btn2.setText(player);
			checkPattern();
		}
		else if (e.getSource() == btn3) {
			btn3.setText(player);
			checkPattern();
		}
		else if (e.getSource() == btn4) {
			btn4.setText(player);
			checkPattern();
		}
		else if (e.getSource() == btn5) {
			btn5.setText(player);
			checkPattern();
		}
		else if (e.getSource() == btn6) {
			btn6.setText(player);
			checkPattern();
		} 
		else if (e.getSource() == btn7) {
			btn7.setText(player);
			checkPattern();
		} 
		else if (e.getSource() == btn8) {
			btn8.setText(player);
			checkPattern();
		} 
		else if (e.getSource() == btn9) {
			btn9.setText(player);
			checkPattern();
		}
	}
	
	private void checkPattern() {
		if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "Player O win!","Noti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
