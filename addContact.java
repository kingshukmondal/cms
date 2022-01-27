package practice1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class addContact {

	private JFrame frmAddContact;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	static Connection con;
	static Statement st;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addContact window = new addContact();
					window.frmAddContact.setVisible(true);
					Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
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
	public addContact() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddContact = new JFrame();
		frmAddContact.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\125118-200.png"));
		frmAddContact.setTitle("ADD CONTACT");
		frmAddContact.getContentPane().setBackground(Color.WHITE);
		frmAddContact.setBounds(100, 100, 450, 300);
		frmAddContact.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmAddContact.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD");
		lblNewLabel.setFont(new Font("OCR A Std", Font.PLAIN, 20));
		lblNewLabel.setBounds(212, 14, 101, 40);
		frmAddContact.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(84, 79, 53, 24);
		frmAddContact.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NUMBER");
		lblNewLabel_2.setBounds(75, 138, 62, 30);
		frmAddContact.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(147, 79, 210, 25);
		frmAddContact.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 141, 210, 25);
		frmAddContact.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JButton btnNewButton_1 = new JButton("ADD ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().length()==0 || textField_1.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(frmAddContact, "Empty!!");
				}
				else {
					
					        try
					        {
					        	/*Class.forName("com.mysql.jdbc.Driver");
					            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
						        Statement st = con.createStatement();
						        System.out.println(textField.getText() +"  "+ textField_1.getText() );
					            String s = "insert into contactnew(Name,Number) values('"+textField.getText()+"','"+textField_1.getText()+"');";
					            st.executeUpdate(s);*/
					        	addContact(textField.getText(),textField_1.getText());
					        	JOptionPane.showMessageDialog(frmAddContact, "successful");
					        }
					        catch (Exception E)
					        {
					            E.printStackTrace();
					        }
					    }
				}
			
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(102, 255, 0));
		btnNewButton_1.setBounds(170, 194, 143, 24);
		frmAddContact.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(147, 64, 166, -10);
		frmAddContact.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(184, 44, 101, 10);
		frmAddContact.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\images (7).jfif"));
		lblNewLabel_3.setBounds(0, 0, 436, 263);
		frmAddContact.getContentPane().add(lblNewLabel_3);
	}
	 public static void addContact(String name, String number)
	    {
	        try
	        {	
	            String s = "insert into contactnew(Name,Number) values('" + name + "','" + number + "')";
	            st.executeUpdate(s);
	            
	        }
	        catch (Exception E)
	        {
	            E.printStackTrace();
	        }
	    }
}
