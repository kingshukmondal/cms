package practice1;

 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class page1 {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static Connection con;
	static Statement st;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 window = new page1();
					window.frmLogin.setVisible(true);
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
	public page1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\images.png"));
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(50, 72, 81, 34);
		frmLogin.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(143, 80, 184, 19);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(50, 116, 81, 13);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(143, 113, 184, 19);
		frmLogin.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{try{
				String s1=textField.getText();
				String s2=passwordField_1.getText();
				ResultSet rs=st.executeQuery("Select * from details");
				int t=0;
				while(rs.next())
				{
				if(s1.equals(rs.getString(1)) && s2.equals(rs.getString(2)))
				{
					new contactpage().main(null);
					t=1;
					frmLogin.setVisible(false);
					break;
				}
			    }
				
				if(t==0)
					{
						JOptionPane.showMessageDialog(frmLogin, "Retry");
					}
				
			}
			catch(Exception E) {}
			}
		});
		btnNewButton.setBounds(143, 166, 81, 31);
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_2.setBounds(168, 10, 94, 31);
		frmLogin.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(145, 49, 153, 21);
		frmLogin.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setBackground(new Color(0, 255, 153));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 registration r=new registration();
				r.main(null);
				
			}
		});
		btnNewButton_1.setBounds(233, 166, 94, 31);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\love-and-passion-background-backgrounds-love-1-5c9b994ec8376.png"));
		lblNewLabel_3.setBounds(0, 0, 436, 263);
		frmLogin.getContentPane().add(lblNewLabel_3);
	}
}
