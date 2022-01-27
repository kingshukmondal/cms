package practice1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class editPage {

	private JFrame frmEdit;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	//DefaultTableModel def=(DefaultTableModel)table.getModel();
	DefaultTableModel def;
	String nn="";
	String num="";
	int p=0;
	static editPage window ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new editPage();
					window.frmEdit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public editPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdit = new JFrame();
		frmEdit.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\65548-200.png"));
		frmEdit.setTitle("EDIT");
		frmEdit.setBounds(100, 100, 728, 576);
		frmEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEdit.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("HOME\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frmEdit.setVisible(false);
				new contactpage().main(null);
			}
		});
		btnNewButton_3.setSelectedIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\20-208395_home-family-house-icon-home-icon-png-ios.png"));
		btnNewButton_3.setBackground(new Color(204, 255, 51));
		btnNewButton_3.setBounds(290, 471, 94, 29);
		frmEdit.getContentPane().add(btnNewButton_3);
		scrollPane.setBounds(369, 76, 310, 363);
		frmEdit.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(204, 255, 204));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				p=i;
				nn=def.getValueAt(i, 0).toString();
				num=def.getValueAt(i, 1).toString();
				textField.setText(def.getValueAt(i, 0).toString());
				textField_1.setText(def.getValueAt(i, 1).toString());	
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "NUMBER"
			}
		));
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(39, 144, 67, 32);
		frmEdit.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(115, 149, 197, 29);
		frmEdit.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NUMBER");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(27, 223, 79, 21);
		frmEdit.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 212, 197, 32);
		frmEdit.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBackground(new Color(0, 204, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String o_name =textField.getText();
				String o_number=textField_1.getText();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
			        Statement st = con.createStatement();
			        String query="update contactnew set Name ='"+o_name+"', Number ='"+o_number+"' where Name ='"+nn+"' and Number='"+num+"';";
			        st.executeUpdate(query);
			        def.setValueAt(o_name,p,0);
			        def.setValueAt(o_number,p,1);
			        textField_1.setText("");
			        textField.setText("");
			        
				}
				catch(Exception E)
				{
					System.out.println(E);
				}
				
				
			}
		});
		
				
		btnNewButton.setBounds(115, 301, 84, 32);
		frmEdit.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(0, 204, 153));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int i=table.getSelectedRow();
				if(i>=0 || !textField.getText().equals("") || !textField_1.getText().equals(""))
					
				{String name =textField.getText();
				String number=textField_1.getText();
				def.removeRow(i);
				

					Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newcontact", "root", "root");
			        Statement st = con.createStatement();
			        String query="delete from contactnew where Name ='"+name+"' and Number ='"+number+"';";
			        st.executeUpdate(query);
			        textField_1.setText("");
			        textField.setText("");
			        JOptionPane.showMessageDialog(null, "DELETED!!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "EMPTY!!!");
				}
				}
				
				catch(Exception E)
				{
			System.out.println(E);
			}
		}});
		btnDelete.setBounds(209, 301, 103, 32);
		frmEdit.getContentPane().add(btnDelete);
		
		JLabel lblNewLabel_2 = new JLabel("DETAILS\r\n");
		lblNewLabel_2.setBackground(new Color(102, 255, 0));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Minion Pro Cond", Font.BOLD, 27));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 80, 211, 59);
		frmEdit.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(81, 114, 231, 10);
		frmEdit.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setBackground(new Color(0, 204, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				def=(DefaultTableModel)table.getModel();
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
		btnNewButton_1.setBounds(114, 343, 85, 32);
		frmEdit.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CLEAR");
		btnNewButton_2.setBackground(new Color(0, 204, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_2.setBounds(209, 343, 103, 32);
		frmEdit.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Kingshuk Mondal\\Desktop\\photos\\Butterfly_and_Flower_Design_Background.jpg"));
		lblNewLabel_3.setBounds(0, 0, 714, 539);
		frmEdit.getContentPane().add(lblNewLabel_3);
	}
	public JScrollPane getScrollPane() {
		return getScrollPane();
	}
}
