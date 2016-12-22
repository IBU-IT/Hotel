package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Rectangle;
import javax.swing.JToolBar;
import java.awt.Window.Type;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Component;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class ManagerWindow extends JFrame {

	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField nameTxt;
	private JTextField surnameTxt;
	private JTextField ageTxt;
	private JTextField mailTxt;
	private JTextField cityField;
	private JTextField unField;
	private JComboBox comboBoxSearch;
	private JLabel timeLbl;
	private JTable tableEmp;
	private JTextField txtSearchByName;
	private PreparedStatement pps;
	private ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerWindow frame = new ManagerWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connect = null;
	private JTextField textFieldID;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldMail;
	private JTextField textFieldCity;
	private JTextField textFieldUn;
	private JTable tableMember;
	private JTextField textField;
	private ButtonGroup bg = new ButtonGroup();
	
	public void refresh()
	{
		try {
			
			String query = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City, UserName FROM Employees";
			pps = connect.prepareStatement(query);
			rs = pps.executeQuery();
			tableEmp.setModel(DbUtils.resultSetToTableModel(rs));
			
			pps.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillFields()
	{
		try {
			
			String query = "SELECT * FROM Employees WHERE Emp_ID =?";
			pps = connect.prepareStatement(query);
			pps.setString(1, idTxt.getText());
			rs = pps.executeQuery();
			
			while(rs.next())
			{
				nameTxt.setText(rs.getString("Emp_Name"));
				surnameTxt.setText(rs.getString("Emp_Surname"));
				ageTxt.setText(rs.getString("Emp_Age"));
				mailTxt.setText(rs.getString("Emp_Mail"));
				cityField.setText(rs.getString("Emp_City"));
				unField.setText(rs.getString("UserName"));
			}
			
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clearFields()
	{
		idTxt.setText("");
		nameTxt.setText("");
		surnameTxt.setText("");
		ageTxt.setText("");
		mailTxt.setText("");
		cityField.setText("");
		unField.setText("");
	}
	
	public void timeMethod()
	{
		Thread clock = new Thread()
		{
			public void run()
			{
				try {
					for(;;)
					{
						Calendar calendar = new GregorianCalendar();
						
						int hour = calendar.get(Calendar.HOUR);
						int minute = calendar.get(Calendar.MINUTE);
						int second = calendar.get(Calendar.SECOND);
						
						int day = calendar.get(Calendar.DAY_OF_MONTH);
						int month = calendar.get(Calendar.MONTH);
						int year = calendar.get(Calendar.YEAR);
						
						timeLbl.setText("Time: " + hour + ":" + minute + ":" + second + "     " + "Date: " + day + "/" + month + "/" + year);
						
						sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}
	
	private void saveRecord()
	{
		try {
			
			String query = "INSERT INTO Employees (Emp_Name, Emp_Surname, Emp_Age, Emp_Mail, Emp_City, UserName) VALUES (?, ?, ?, ?, ?, ?)";
			pps = connect.prepareStatement(query);
			pps.setString(1, nameTxt.getText());
			pps.setString(2, surnameTxt.getText());
			pps.setString(3, ageTxt.getText());
			pps.setString(4, mailTxt.getText());
			pps.setString(5, cityField.getText());
			pps.setString(6, unField.getText());
			
			pps.execute();
			
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void updateRecord(String query)
	{
		try {
		
			pps = connect.prepareStatement(query);
			
			pps.execute();
			pps.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	private void deleteRecord(String query)
	{
		int deleteAction = JOptionPane.showConfirmDialog(null, "Do you really want to delete record ?", "Delete", JOptionPane.YES_NO_OPTION );
		if(deleteAction == 0){
		try {
			
			pps = connect.prepareStatement(query);
			
			pps.execute();
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh();
		clearFields();
	}
	}
	
	private void loadData(String query, JTable table)
	{
		try {
			
			
			pps = connect.prepareStatement(query);
			rs = pps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			pps.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void comboGetsFromDB()
	{
		try {
			
			String searchBy = (String)comboBoxSearch.getSelectedItem();
			String query = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City, UserName FROM Employees WHERE "+ searchBy +" =?";
			pps = connect.prepareStatement(query);
			pps.setString(1, txtSearchByName.getText());
			rs = pps.executeQuery();
			
			tableEmp.setModel(DbUtils.resultSetToTableModel(rs));
			
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the frame.
	 */
	public ManagerWindow() {
		
		connect = DatabaseConnector.databaseConnector();
		
		setTitle("Manager Editor");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 625);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		fileMenu.add(mntmNewMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(EXIT_ON_CLOSE);
			}
		});
		fileMenu.add(exitMenuItem);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		helpMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		helpMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1010, 538);
		contentPane.add(tabbedPane);
		
		JPanel memberPanel = new JPanel();
		memberPanel.setToolTipText("Members");
		tabbedPane.addTab("Members", null, memberPanel, null);
		memberPanel.setLayout(null);
		JSeparator separator1 = new JSeparator(SwingConstants.VERTICAL);
		separator1.setForeground(SystemColor.scrollbar);
		separator1.setBackground(SystemColor.scrollbar);
		separator1.setSize(2, 515);
		separator1.setLocation(545, 0);
		memberPanel.add(separator1);
		
		JLabel pictLabel = new JLabel("");
		pictLabel.setBounds(10, 33, 151, 152);
		memberPanel.add(pictLabel);
		Image member = new ImageIcon(this.getClass().getResource("/gymMember.png")).getImage();
		pictLabel.setIcon(new ImageIcon(member));
		
		JLabel lblNewLabel = new JLabel("Member ID:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(187, 33, 162, 32);
		memberPanel.add(lblNewLabel);
		
		JLabel lblMemberName = new JLabel("Member Name:");
		lblMemberName.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberName.setBounds(187, 76, 142, 32);
		memberPanel.add(lblMemberName);
		
		JLabel lblMemberSurname = new JLabel("Member Surname:");
		lblMemberSurname.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberSurname.setBounds(187, 119, 168, 32);
		memberPanel.add(lblMemberSurname);
		
		JLabel lblMemberAge = new JLabel("Member Age:");
		lblMemberAge.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberAge.setBounds(187, 162, 126, 32);
		memberPanel.add(lblMemberAge);
		
		JLabel lblMemberMail = new JLabel("Member Mail:");
		lblMemberMail.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberMail.setBounds(187, 205, 130, 32);
		memberPanel.add(lblMemberMail);
		
		JLabel lblMemberGender = new JLabel("Member Gender:");
		lblMemberGender.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberGender.setBounds(187, 340, 145, 32);
		memberPanel.add(lblMemberGender);
		
		JLabel labelCity = new JLabel("Member City:");
		labelCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelCity.setBounds(187, 248, 122, 32);
		memberPanel.add(labelCity);
		
		JLabel lblMemberUsername = new JLabel("Member UserName:");
		lblMemberUsername.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberUsername.setBounds(187, 293, 172, 32);
		memberPanel.add(lblMemberUsername);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(400, 33, 126, 32);
		memberPanel.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(400, 78, 126, 32);
		memberPanel.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(400, 121, 126, 32);
		memberPanel.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(400, 164, 126, 32);
		memberPanel.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(400, 207, 126, 32);
		memberPanel.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(400, 250, 126, 32);
		memberPanel.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		textFieldUn = new JTextField();
		textFieldUn.setBounds(400, 293, 126, 32);
		memberPanel.add(textFieldUn);
		textFieldUn.setColumns(10);
		
		
		JButton saveButton = new JButton("SAVE");
		saveButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		saveButton.setBounds(187, 400, 103, 37);
		memberPanel.add(saveButton);
		
		JButton updateButton = new JButton("UPDATE");
		updateButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		updateButton.setBounds(305, 400, 103, 37);
		memberPanel.add(updateButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		deleteButton.setBounds(423, 400, 103, 37);
		memberPanel.add(deleteButton);
		
		JButton clearFieldButton = new JButton("CLEAR FIELDS");
		clearFieldButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		clearFieldButton.setBounds(187, 448, 339, 37);
		memberPanel.add(clearFieldButton);
		
		JButton btnButton = new JButton("Load Member Data");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String query = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				loadData(query, tableMember);
			}
		});
		btnButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnButton.setBounds(649, 448, 255, 32);
		memberPanel.add(btnButton);
		
		JScrollPane scrollPaneMember = new JScrollPane();
		scrollPaneMember.setBounds(560, 33, 417, 404);
		memberPanel.add(scrollPaneMember);
		
		tableMember = new JTable();
		scrollPaneMember.setViewportView(tableMember);
		
		JLabel lblSearchBy_1 = new JLabel("Search by:");
		lblSearchBy_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchBy_1.setBounds(586, 8, 79, 22);
		memberPanel.add(lblSearchBy_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Surname", "City", "UserName", "Gender"}));
		comboBox.setBounds(675, 8, 132, 22);
		memberPanel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(817, 8, 132, 22);
		memberPanel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(396, 347, 59, 23);
		memberPanel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(457, 347, 69, 23);
		memberPanel.add(rdbtnFemale);
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employees", null, empPanel, null);
		empPanel.setLayout(null);
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setForeground(SystemColor.scrollbar);
		separator.setBackground(SystemColor.scrollbar);
		separator.setSize(2, 515);
		separator.setLocation(545, 0);
		empPanel.add(separator);
		
		JLabel idLbl = new JLabel("Employee ID: ");
		idLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		idLbl.setBounds(187, 33, 162, 32);
		empPanel.add(idLbl);
		
		JLabel nameLbl = new JLabel("Employee Name:");
		nameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		nameLbl.setBounds(187, 76, 142, 32);
		empPanel.add(nameLbl);
		
		JLabel surnameLbl = new JLabel("Employee Surname:");
		surnameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		surnameLbl.setBounds(187, 119, 168, 32);
		empPanel.add(surnameLbl);
		
		JLabel ageLbl = new JLabel("Employee Age:");
		ageLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		ageLbl.setBounds(187, 162, 126, 32);
		empPanel.add(ageLbl);
		
		JLabel mailLbl = new JLabel("E-Mail:");
		mailLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		mailLbl.setBounds(187, 205, 103, 32);
		empPanel.add(mailLbl);
		
		idTxt = new JTextField();
		idTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				fillFields();
			}
		});
		
		JLabel lblUn = new JLabel("User Name:");
		lblUn.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblUn.setBounds(187, 291, 162, 32);
		empPanel.add(lblUn);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCity.setBounds(187, 248, 46, 32);
		empPanel.add(lblCity);
		
		JLabel pictLbl = new JLabel("");
		pictLbl.setBounds(10, 33, 151, 152);
		empPanel.add(pictLbl);
		Image emp = new ImageIcon(this.getClass().getResource("/Emp1.png")).getImage();
		pictLbl.setIcon(new ImageIcon(emp));
		
		JLabel lblSearchBy = new JLabel("Search by:");
		lblSearchBy.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchBy.setBounds(586, 8, 79, 22);
		empPanel.add(lblSearchBy);
		idTxt.setBounds(400, 33, 126, 32);
		empPanel.add(idTxt);
		idTxt.setColumns(10);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(400, 78, 126, 32);
		empPanel.add(nameTxt);
		nameTxt.setColumns(10);
		
		surnameTxt = new JTextField();
		surnameTxt.setBounds(400, 121, 126, 32);
		empPanel.add(surnameTxt);
		surnameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(400, 164, 126, 32);
		empPanel.add(ageTxt);
		ageTxt.setColumns(10);
		
		mailTxt = new JTextField();
		mailTxt.setBounds(400, 207, 126, 32);
		empPanel.add(mailTxt);
		mailTxt.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				saveRecord();
				refresh();
				clearFields();
			}
		});
		
		cityField = new JTextField();
		cityField.setBounds(400, 250, 126, 32);
		empPanel.add(cityField);
		cityField.setColumns(10);
		
		unField = new JTextField();
		unField.setBounds(400, 293, 126, 32);
		empPanel.add(unField);
		unField.setColumns(10);
		btnSave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSave.setBounds(187, 400, 103, 37);
		empPanel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query = "UPDATE Employees set Emp_ID = '"+ idTxt.getText() +"', Emp_Name = '"+ nameTxt.getText() +"', Emp_Surname = '"+ surnameTxt.getText() +"', Emp_Age = '"+ ageTxt.getText() +"', Emp_Mail = '"+ mailTxt.getText() +"', Emp_City = '"+cityField.getText()+"', UserName = '"+unField.getText()+"' WHERE Emp_ID = '"+ idTxt.getText() +"'";
				updateRecord(query);
				refresh();
				clearFields();
			}
		});
		btnUpdate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnUpdate.setBounds(305, 400, 103, 37);
		empPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String query = "DELETE FROM Employees WHERE Emp_ID = '"+ idTxt.getText() +"'";
				deleteRecord(query);
			}
		});
		btnDelete.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDelete.setBounds(423, 400, 103, 37);
		empPanel.add(btnDelete);
		
		JButton btnLoadEmployeeData = new JButton("Load Employee Data");
		btnLoadEmployeeData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String query = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City, UserName FROM Employees";
				loadData(query, tableEmp);
			}
		});
		btnLoadEmployeeData.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnLoadEmployeeData.setBounds(649, 448, 255, 32);
		empPanel.add(btnLoadEmployeeData);
		
		JScrollPane scrollPaneEmp = new JScrollPane();
		scrollPaneEmp.setBounds(560, 33, 417, 404);
		empPanel.add(scrollPaneEmp);
		
		tableEmp = new JTable();
		tableEmp.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
				}
			));
		tableEmp.setToolTipText("");
		tableEmp.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPaneEmp.setViewportView(tableEmp);
		
		JButton btnClear = new JButton("CLEAR FIELDS");
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clearFields();
			}
		});
		btnClear.setBounds(187, 447, 339, 37);
		empPanel.add(btnClear);
		
		txtSearchByName = new JTextField();
		txtSearchByName.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSearchByName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				comboGetsFromDB();
			}
		});
		txtSearchByName.setToolTipText("");
		txtSearchByName.setBounds(817, 8, 132, 22);
		empPanel.add(txtSearchByName);
		txtSearchByName.setColumns(10);
		
		comboBoxSearch = new JComboBox();
		comboBoxSearch.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxSearch.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Surname", "City", "UserName"}));
		comboBoxSearch.setBounds(675, 8, 132, 22);
		empPanel.add(comboBoxSearch);
		
		JPanel equipPanel = new JPanel();
		tabbedPane.addTab("Equipment", null, equipPanel, null);
		
		timeLbl = new JLabel();
		timeLbl.setToolTipText("Today's Date and Time");
		timeLbl.setFont(new Font("Tahoma", Font.ITALIC, 11));
		timeLbl.setBounds(813, 549, 199, 16);
		contentPane.add(timeLbl);
		timeMethod();
	}
}
