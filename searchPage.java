package practice1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class searchPage {

	private JFrame frmSearch;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	static searchPage window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new searchPage();
					window.frmSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public searchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearch = new JFrame();
		frmSearch.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\magnifying-glass-search-icon-flat-260nw-738763579.jpg"));
		frmSearch.setTitle("SEARCH");
		frmSearch.setBounds(100, 100, 619, 453);
		frmSearch.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSearch.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(32, 38, 179, 25);
		frmSearch.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(264, 37, 179, 26);
		frmSearch.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 0, 78, 39);
		frmSearch.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NUMBER");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(264, 0, 78, 39);
		frmSearch.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-16, 74, 621, 20);
		frmSearch.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel def=(DefaultTableModel)table.getModel();
				def.setRowCount(0);
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
			        Statement st = con.createStatement();
			        String query="Select * from contactnew Order by Name";   
			        String sname =textField.getText();
			        String snum=textField_1.getText();
			        int f=0;
			        ResultSet rs=st.executeQuery(query);
			        while(rs.next())
			        {
			        	String name =rs.getString(2);
			        	String number =rs.getString(3);
			        	if(sname.trim().length()!=0 && snum.trim().length()!=0)
			        	{
			        		if( number.contains(snum) &&   name.contains(sname))
			        		{
			        			def.addRow(new Object[] {name,number});
			        			f=1;
			        		}
			        		continue;
			        	}
			        	else if(sname.trim().length()!=0 &&  name.contains(sname)) { def.addRow(new Object[] {name,number});f=1;}
			        	else if(snum.trim().length()!=0 &&  number.contains(snum)) { def.addRow(new Object[] {name,number});f=1;}
			        }
			        
			        if(f==0)
			        {
			        	def.addRow(new Object[] {"NO RESULT FOUND","NO RESULT FOUND"});
			        }
				}
				catch(Exception E)
				{
					
				}
			}
		});
		btnNewButton.setBounds(470, 31, 86, 28);
		frmSearch.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 585, 299);
		frmSearch.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NUMBER", "NUMBER"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(78);
		
		JLabel lblNewLabel = new JLabel("(OR)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(221, 40, 48, 23);
		frmSearch.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setBackground(new Color(204, 255, 51));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frmSearch.setVisible(false);
				new contactpage().main(null);
			}
		});
		btnNewButton_1.setBounds(251, 390, 85, 26);
		frmSearch.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\5c5a6c4f2e202-Vector Artistic Background Design.jpg"));
		lblNewLabel_2.setBounds(0, 0, 605, 416);
		frmSearch.getContentPane().add(lblNewLabel_2);
	}
}
