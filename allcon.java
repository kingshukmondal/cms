package practice1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class allcon {

	private JFrame frmAllCoontact;
	private JTable table;
	static allcon window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new allcon();
					window.frmAllCoontact.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public allcon() {
		initialize();
		allFun();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAllCoontact = new JFrame();
		frmAllCoontact.setTitle("ALL CONTACT");
		frmAllCoontact.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\images (2).png"));
		frmAllCoontact.setBounds(100, 100, 786, 734);
		frmAllCoontact.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAllCoontact.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('A');
			}
		});
		btnNewButton.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setBounds(31, 80, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('B');
			}
		});
		btnB.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnB.setBackground(new Color(102, 153, 255));
		btnB.setBounds(91, 80, 43, 37);
		frmAllCoontact.getContentPane().add(btnB);
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('C');
			}
		});
		btnNewButton_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1.setBounds(156, 80, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("D");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('D');
			}
		});
		btnNewButton_1_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_1.setBounds(224, 80, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("E");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('E');
			}
		});
		btnNewButton_1_1_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2.setBounds(31, 134, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("F");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('F');
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_1.setBounds(91, 134, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("G");
		btnNewButton_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('G');
			}
		});
		btnNewButton_1_1_2_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_1_1.setBounds(156, 134, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_1_1);
		
		JButton btnNewButton_1_1_2_1_1_1 = new JButton("H");
		btnNewButton_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('H');
			}
		});
		btnNewButton_1_1_2_1_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_1_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_1_1_1.setBounds(224, 134, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_1_1_1);
		
		JButton btnNewButton_1_1_2_2 = new JButton("I");
		btnNewButton_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('I');
			}
		});
		btnNewButton_1_1_2_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2.setBounds(31, 191, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_1_1_2_2_1 = new JButton("J");
		btnNewButton_1_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('J');
			}
		});
		btnNewButton_1_1_2_2_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_1.setBounds(91, 191, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_1);
		
		JButton btnNewButton_1_1_2_2_1_1 = new JButton("K");
		btnNewButton_1_1_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('K');
			}
		});
		btnNewButton_1_1_2_2_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_1_1.setBounds(156, 191, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_1_1);
		
		JButton btnNewButton_1_1_2_2_1_1_1 = new JButton("L");
		btnNewButton_1_1_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('L');
			}
		});
		btnNewButton_1_1_2_2_1_1_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_1_1_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_1_1_1.setBounds(224, 191, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_1_1_1);
		
		JButton btnNewButton_1_1_2_2_2 = new JButton("M");
		btnNewButton_1_1_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('M');
			}
		});
		btnNewButton_1_1_2_2_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_2.setBounds(31, 249, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_2);
		
		JButton btnNewButton_1_1_2_2_3 = new JButton("N");
		btnNewButton_1_1_2_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('N');
			}
		});
		btnNewButton_1_1_2_2_3.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_3.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_3.setBounds(91, 249, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_3);
		
		JButton btnNewButton_1_1_2_2_4 = new JButton("O\r\n");
		btnNewButton_1_1_2_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('O');
			}
		});
		btnNewButton_1_1_2_2_4.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_4.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_4.setBounds(156, 249, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_4);
		
		JButton btnNewButton_1_1_2_2_5 = new JButton("P\r\n");
		btnNewButton_1_1_2_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('P');
			}
		});
		btnNewButton_1_1_2_2_5.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5.setBounds(224, 249, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5);
		
		JButton btnNewButton_1_1_2_2_5_1 = new JButton("Q");
		btnNewButton_1_1_2_2_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('Q');
			}
		});
		btnNewButton_1_1_2_2_5_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_1.setBounds(31, 306, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_1);
		
		JButton btnNewButton_1_1_2_2_5_2 = new JButton("R");
		btnNewButton_1_1_2_2_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('R');
			}
		});
		btnNewButton_1_1_2_2_5_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_2.setBounds(91, 306, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_2);
		
		JButton btnNewButton_1_1_2_2_5_3 = new JButton("S\r\n");
		btnNewButton_1_1_2_2_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('S');
			}
		});
		btnNewButton_1_1_2_2_5_3.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_3.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_3.setBounds(156, 306, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_3);
		
		JButton btnNewButton_1_1_2_2_5_4 = new JButton("T\r\n");
		btnNewButton_1_1_2_2_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('T');
			}
		});
		btnNewButton_1_1_2_2_5_4.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_4.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_4.setBounds(224, 306, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_4);
		
		JButton btnNewButton_1_1_2_2_5_5 = new JButton("U");
		btnNewButton_1_1_2_2_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('U');
			}
		});
		btnNewButton_1_1_2_2_5_5.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_5.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_5.setBounds(31, 365, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_5);
		
		JButton btnNewButton_1_1_2_2_5_6 = new JButton("V");
		btnNewButton_1_1_2_2_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('V');
			}
		});
		btnNewButton_1_1_2_2_5_6.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_6.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_6.setBounds(91, 365, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_6);
		
		JButton btnNewButton_1_1_2_2_5_7 = new JButton("W");
		btnNewButton_1_1_2_2_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('W');
			}
		});
		btnNewButton_1_1_2_2_5_7.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_7.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_7.setBounds(156, 365, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_7);
		
		JButton btnNewButton_1_1_2_2_5_8 = new JButton("X");
		btnNewButton_1_1_2_2_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('X');
			}
		});
		btnNewButton_1_1_2_2_5_8.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8.setBounds(224, 365, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8);
		
		JButton btnNewButton_1_1_2_2_5_8_1 = new JButton("Y");
		btnNewButton_1_1_2_2_5_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('Y');
			}
		});
		btnNewButton_1_1_2_2_5_8_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_1.setBounds(31, 430, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_1);
		
		JButton btnNewButton_1_1_2_2_5_8_2 = new JButton("Z");
		btnNewButton_1_1_2_2_5_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('Z');
			}
		});
		btnNewButton_1_1_2_2_5_8_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_2.setBounds(91, 430, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_2);
		
		JButton btnNewButton_1_1_2_2_5_8_3 = new JButton("0");
		btnNewButton_1_1_2_2_5_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('0');
				create('0');
			}
		});
		btnNewButton_1_1_2_2_5_8_3.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_3.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_3.setBounds(156, 430, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_3);
		
		JButton btnNewButton_1_1_2_2_5_8_4 = new JButton("1");
		btnNewButton_1_1_2_2_5_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('1');
				create('1');
			}
		});
		btnNewButton_1_1_2_2_5_8_4.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_4.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_4.setBounds(224, 430, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_4);
		
		JButton btnNewButton_1_1_2_2_5_8_5 = new JButton("2");
		btnNewButton_1_1_2_2_5_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('2');
				create('2');
			}
		});
		btnNewButton_1_1_2_2_5_8_5.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_5.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_5.setBounds(31, 492, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_5);
		
		JButton btnNewButton_1_1_2_2_5_8_6 = new JButton("3");
		btnNewButton_1_1_2_2_5_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('3');
				create('3');
			}
		});
		btnNewButton_1_1_2_2_5_8_6.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_6.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_6.setBounds(91, 492, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_6);
		
		JButton btnNewButton_1_1_2_2_5_8_7 = new JButton("4");
		btnNewButton_1_1_2_2_5_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('4');
				create('4');
			}
		});
		btnNewButton_1_1_2_2_5_8_7.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_7.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_7.setBounds(156, 492, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_7);
		
		JButton btnNewButton_1_1_2_2_5_8_8 = new JButton("5");
		btnNewButton_1_1_2_2_5_8_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('5');
				create('5');
			}
		});
		btnNewButton_1_1_2_2_5_8_8.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_8.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_8.setBounds(224, 492, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_8);
		
		JButton btnNewButton_1_1_2_2_5_8_9 = new JButton("6");
		btnNewButton_1_1_2_2_5_8_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('6');
				create('6');
			}
		});
		btnNewButton_1_1_2_2_5_8_9.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_9.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_9.setBounds(31, 545, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_9);
		
		JButton btnNewButton_1_1_2_2_5_8_10 = new JButton("7");
		btnNewButton_1_1_2_2_5_8_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('7');
				create('7');
			}
		});
		btnNewButton_1_1_2_2_5_8_10.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_10.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_10.setBounds(91, 545, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_10);
		
		JButton btnNewButton_1_1_2_2_5_8_10_1 = new JButton("8");
		btnNewButton_1_1_2_2_5_8_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('8');
				create('8');
			}
		});
		btnNewButton_1_1_2_2_5_8_10_1.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_10_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_10_1.setBounds(156, 545, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_10_1);
		
		JButton btnNewButton_1_1_2_2_5_8_10_2 = new JButton("9");
		btnNewButton_1_1_2_2_5_8_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createTable('9');
				create('9');
			}
		});
		btnNewButton_1_1_2_2_5_8_10_2.setFont(new Font("OCR A Std", Font.BOLD, 12));
		btnNewButton_1_1_2_2_5_8_10_2.setBackground(new Color(102, 153, 255));
		btnNewButton_1_1_2_2_5_8_10_2.setBounds(224, 545, 43, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_1_2_2_5_8_10_2);
		
		JLabel lblNewLabel = new JLabel("INDEX.....");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(31, 23, 126, 48);
		frmAllCoontact.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("SHOW ALL\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allFun();
			}
		});
		btnNewButton_1.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(51, 204, 51));
		btnNewButton_1.setBounds(31, 605, 103, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("BACK");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new contactpage().main(null);
				window.frmAllCoontact.setVisible(false);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tekton Pro", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(new Color(255, 51, 0));
		btnNewButton_1_2.setBounds(156, 605, 111, 37);
		frmAllCoontact.getContentPane().add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 53, 395, 588);
		frmAllCoontact.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
		table.setForeground(new Color(255, 0, 51));
		table.setBackground(new Color(204, 204, 255));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "NUMBER"
			}
		));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 67, 236, 23);
		frmAllCoontact.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\abstract-background-design-vector-green.jpg"));
		lblNewLabel_1.setBounds(0, 1, 772, 696);
		frmAllCoontact.getContentPane().add(lblNewLabel_1);
	}
	
	
 void allFun()
	{
		DefaultTableModel def=(DefaultTableModel)table.getModel();
		def.setRowCount(0);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
	        Statement st = con.createStatement();
	        String query="Select * from contactnew Order by Name";   
	        int count =0;
	      
	        ResultSet rs=st.executeQuery(query);
	        while(rs.next())
	        {
	        	String name =rs.getString(2);
	        	String number =rs.getString(3);
	        	 def.addRow(new Object[] {name,number});
	        	 count++;
	        }
	        if(count==0)
	        {
	        	def.addRow(new Object[] {"NULL","NULL"});
	        }
	       
		}
		catch(Exception E)
		{
			
		}
	}
 
 
 void createTable(char ch)
 {
	 DefaultTableModel def=(DefaultTableModel)table.getModel();
	def.setRowCount(0);
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
        Statement st = con.createStatement();
        String query="select * from contactnew where Name like '"+ch+"%' order by Name;";   
        
      
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
        	String name =rs.getString(2);
        	String number =rs.getString(3);
        	def.addRow(new Object[] {name,number});
        }
        
       
	}
	catch(Exception E)
	{
		
	}
 }
 
 void create(char ch)
 {
	 DefaultTableModel def=(DefaultTableModel)table.getModel();
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
        Statement st = con.createStatement();
        String query="select * from contactnew where Number like '"+ch+"%' order by Name;";   
        
      
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
        	String name =rs.getString(2);
        	String number =rs.getString(3);
        	def.addRow(new Object[] {name,number});
        }
        
       
	}
	catch(Exception E)
	{
		
	}
 }
}
