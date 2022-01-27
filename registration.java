package practice1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;

public class registration {

	private JFrame frmRegistration;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	static Connection con;
	static Statement st;
	static registration window ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new registration();
					window.frmRegistration.setVisible(true);
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/king", "root", "root");
					st=con.createStatement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistration = new JFrame();
		frmRegistration.setTitle("REGISTRATION");
		frmRegistration.setBounds(100, 100, 450, 300);
		frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(78, 63, 77, 28);
		frmRegistration.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(134, 68, 190, 19);
		frmRegistration.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(64, 101, 77, 25);
		frmRegistration.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 104, 190, 19);
		frmRegistration.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("PHONE");
		lblNewLabel_2.setBounds(74, 136, 60, 23);
		frmRegistration.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 138, 190, 19);
		frmRegistration.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=textField.getText();
				String s2=passwordField.getText();
				String s3=textField_1.getText();
				if(s1.trim().length()==0|| s2.trim().length()==0||s3.trim().length()==0)
				{
					JOptionPane.showMessageDialog(null, "Retry!!!");
				}
				else
				{
					 String s = "insert into details values('" + s1+ "','" + s2 + "','"+s3+"')";
			            try {
							st.executeUpdate(s);
							JOptionPane.showMessageDialog(frmRegistration, "Registered!!!");
							textField.setText("");
							passwordField.setText("");
							textField_1.setText("");
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(frmRegistration, "Retry!!!");
							e1.printStackTrace();
						}
				}
			}
		});
		btnNewButton.setBounds(134, 180, 97, 28);
		frmRegistration.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("REGISTRATION");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setBackground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(134, 19, 156, 34);
		frmRegistration.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(134, 56, 165, 12);
		frmRegistration.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new page1().main(null);
			window.frmRegistration.setVisible(false);
			frmRegistration.setDefaultCloseOperation(1);
			}
		});
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(241, 182, 106, 26);
		frmRegistration.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\wp3303819.jpg"));
		lblNewLabel_4.setBounds(0, 10, 436, 253);
		frmRegistration.getContentPane().add(lblNewLabel_4);
	}

}
