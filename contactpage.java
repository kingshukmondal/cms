package practice1;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class contactpage {

	 static JFrame frmHome;
	 static Connection con=null;
	    static Statement st;
	    static contactpage window;
	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new contactpage();
					window.frmHome.setVisible(true);
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/king", "root", "root");
			            st = con.createStatement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public contactpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\20-208395_home-family-house-icon-home-icon-png-ios.png"));
		frmHome.setTitle("HOME");
		frmHome.getContentPane().setBackground(Color.WHITE);
		frmHome.getContentPane().setLayout(null);
		Icon ic =new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\125118-200.png");
		JButton btnNewButton = new JButton(ic);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addContact().main(null);
			}
		});
	
		
		btnNewButton.setBounds(66, 67, 134, 140);
		frmHome.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new searchPage().main(null);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\magnifying-glass-search-icon-flat-260nw-738763579.jpg"));
		btnNewButton_1.setBounds(345, 67, 151, 140);
		frmHome.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ADD CONTACT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 217, 151, 34);
		frmHome.getContentPane().add(lblNewLabel);
		
		JLabel lblSearch = new JLabel("SEARCH");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tekton Pro", Font.PLAIN, 16));
		lblSearch.setBounds(345, 204, 151, 34);
		frmHome.getContentPane().add(lblSearch);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\65548-200.png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new editPage().main(null);
			}
		});
		btnNewButton_2.setBounds(64, 261, 136, 140);
		frmHome.getContentPane().add(btnNewButton_2);
		
		JLabel lblEdit = new JLabel("UPDATE CONTACT");
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setFont(new Font("Tekton Pro", Font.PLAIN, 16));
		lblEdit.setBounds(49, 411, 151, 34);
		frmHome.getContentPane().add(lblEdit);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new allcon().main(null);
			}
			
			
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\images (2).png"));
		btnNewButton_3.setSelectedIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\trash-can-icon-recycle-bin-260nw-1906423219.jpg"));
		btnNewButton_3.setBounds(345, 248, 151, 140);
		frmHome.getContentPane().add(btnNewButton_3);
		
		JLabel lblDelete = new JLabel("ALL CONTACTS\r\n");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setFont(new Font("Tekton Pro", Font.PLAIN, 16));
		lblDelete.setBounds(344, 399, 151, 34);
		frmHome.getContentPane().add(lblDelete);
		
		JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(181, 0, 172, 46);
		frmHome.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(168, 40, 189, 16);
		frmHome.getContentPane().add(separator);
		
		JButton btnNewButton_4 = new JButton("LOG OUT");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frmHome.setVisible(false);
				new page1().main(null);
			}
		});
		btnNewButton_4.setBounds(226, 414, 108, 34);
		frmHome.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\12-129241_vector-creative-design-background-milky-way-stars-pakistan.png"));
		lblNewLabel_2.setBounds(0, 0, 586, 463);
		frmHome.getContentPane().add(lblNewLabel_2);
		frmHome.setBounds(100, 100, 600, 500);
		frmHome.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
