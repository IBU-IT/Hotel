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
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

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
	private JComboBox comboBox;
	private JLabel timeLbl;
	private JTable tableEmp;
	private JTextField txtSearchBy;
	private PreparedStatement pps;
	private ResultSet rs;
	private JEditorPane itemDescription;
	/**
	 * Launch the application.
	 */
	public static void managerWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerWindow frame = new ManagerWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
	private JTable tableMember;
	private JTextField textFieldSearch;
	private String gender;
	private String status;
	private ButtonGroup bgGender = new ButtonGroup();
	private ButtonGroup bgStatus = new ButtonGroup();
	private ButtonGroup bg = new ButtonGroup();
	private ButtonGroup bg1 = new ButtonGroup();
	private JTextField textFieldSrc;
	private JTable tableItems;
	private JTextField textFieldItemCode;
	private JTextField textFieldItemName;
	private JTextField textFieldPrice;
	private JTable tableAllInfo;
	private JTextField textFieldQty;
	
	public void refresh(String query, JTable table)
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
	
	public void fillFieldsEmp()
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
	
	public void fillFieldsMem()
	{
		try {
			
			String query = "SELECT * FROM Members WHERE Mem_ID =?";
			pps = connect.prepareStatement(query);
			pps.setString(1, textFieldID.getText());
			rs = pps.executeQuery();
			
			while(rs.next())
			{
				textFieldName.setText(rs.getString("Mem_Name"));
				textFieldSurname.setText(rs.getString("Mem_Surname"));
				textFieldAge.setText(rs.getString("Mem_Age"));
				textFieldCity.setText(rs.getString("Mem_City"));
				textFieldMail.setText(rs.getString("Mem_Mail"));
				
			}
			
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillFieldsItem()
	{
		try {
			
			String query = "SELECT * FROM Items WHERE Item_Code =?";
			pps = connect.prepareStatement(query);
			pps.setString(1, textFieldItemCode.getText());
			rs = pps.executeQuery();
			
			while(rs.next())
			{
				textFieldItemName.setText(rs.getString("Item_Name"));
				textFieldPrice.setText(rs.getString("Item_Price"));
				textFieldQty.setText(rs.getString("Item_Qty"));
				itemDescription.setText(rs.getString("Item_Description"));
			}
			
			pps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clearFieldsEmp()
	{
		idTxt.setText("");
		nameTxt.setText("");
		surnameTxt.setText("");
		ageTxt.setText("");
		mailTxt.setText("");
		cityField.setText("");
		unField.setText("");
	}
	
	public void clearFieldsMem()
	{
		textFieldID.setText("");
		textFieldName.setText("");
		textFieldSurname.setText("");
		textFieldAge.setText("");
		textFieldCity.setText("");
		textFieldMail.setText("");
	}
	
	public void clearFieldsItem()
	{
		textFieldItemCode.setText("");
		textFieldItemName.setText("");
		textFieldPrice.setText("");
		textFieldQty.setText("");
		itemDescription.setText("");
	}
	
	private void saveRecordEmp()
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
		JOptionPane.showMessageDialog(null, "Data Succesfully Saved!");
	}
	
	private void saveRecordMem()
	{
		try {
			
			String query = "INSERT INTO Members (Mem_Name, Mem_Surname, Mem_Age, Mem_Mail, Mem_City, Mem_Gender, Mem_Status) VALUES (?, ?, ?, ?, ?, ?, ?)";
			pps = connect.prepareStatement(query);
			pps.setString(1, textFieldName.getText());
			pps.setString(2, textFieldSurname.getText());
			pps.setString(3, textFieldAge.getText());
			pps.setString(4, textFieldMail.getText());
			pps.setString(5, textFieldCity.getText());
			pps.setString(6, gender);
			pps.setString(7, status);
			
			pps.execute();
			pps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Data Succesfully Saved!");
	}
	
	private void saveRecordItem()
	{
		try {
			
			String query = "INSERT INTO Items (Item_Name, Item_Price , Item_Qty , Item_Description) VALUES (?, ?, ?, ?)";
			pps = connect.prepareStatement(query);
			pps.setString(1, textFieldItemName.getText());
			pps.setString(2, textFieldPrice.getText());
			pps.setString(3, textFieldQty.getText());
			pps.setString(4, itemDescription.getText());
			
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
		String queryRefresh = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City, UserName FROM Employees";
		int deleteAction = JOptionPane.showConfirmDialog(null, "Do you really want to delete record ?", "Delete", JOptionPane.YES_NO_OPTION );
		if(deleteAction == 0){
		try {
			
			pps = connect.prepareStatement(query);
			
			pps.execute();
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		refresh(queryRefresh, tableEmp);
		clearFieldsEmp();
	}
		JOptionPane.showMessageDialog(null, "Data Succesfully Deleted!");
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
	
	private void comboGetsFromDB(String query, JTable table, JTextField textField)
	{
		try {
			
			pps = connect.prepareStatement(query);
			pps.setString(1, textField.getText());
			rs = pps.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			pps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	/**
	 * Create the frame.
	 */
	public ManagerWindow() {
		
		setResizable(false);
		
		connect = DatabaseConnector.databaseConnector();
		
		setTitle("Gym Management Software");
		setBounds(100, 100, 1046, 625);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(EXIT_ON_CLOSE);
			}
		});
		fileMenu.add(exitMenuItem);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		JMenuItem mntmHowToUse = new JMenuItem("How To Use");
		mntmHowToUse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HowTo use = new HowTo();
				use.HowToUse();
			}
		});
		helpMenu.add(mntmHowToUse);
		
		JMenuItem mntmAbout = new JMenuItem("About GMS");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				About about = new About();
				about.About();
			}
		});
		helpMenu.add(mntmAbout);
		
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
		lblMemberGender.setBounds(187, 293, 145, 32);
		memberPanel.add(lblMemberGender);
		
		JLabel labelCity = new JLabel("Member City:");
		labelCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelCity.setBounds(187, 248, 122, 32);
		memberPanel.add(labelCity);
		
		textFieldID = new JTextField();
		textFieldID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				fillFieldsMem();
			}
			@Override
			public void keyPressed(KeyEvent event) {
				
				char ch = event.getKeyChar();
				
				if(ch == 8)
				{
					//clearFieldsMem();
					textFieldName.setText("");
					textFieldSurname.setText("");
					textFieldAge.setText("");
					textFieldCity.setText("");
					textFieldMail.setText("");
				}
			}
		});
		
		textFieldID.setFont(new Font("Arial", Font.PLAIN, 12));
		
		textFieldID.setBounds(400, 33, 126, 32);
		memberPanel.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldName.setBounds(400, 78, 126, 32);
		memberPanel.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldSurname.setBounds(400, 121, 126, 32);
		memberPanel.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldAge.setBounds(400, 164, 126, 32);
		memberPanel.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMail.setBounds(400, 207, 126, 32);
		memberPanel.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldCity.setBounds(400, 250, 126, 32);
		memberPanel.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		
		JButton saveButton = new JButton("SAVE");
		saveButton.setToolTipText("Saves Data To Database");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				saveRecordMem();
				refresh(queryRefresh, tableMember);
			}
		});
		saveButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		saveButton.setBounds(187, 400, 103, 37);
		memberPanel.add(saveButton);
		
		JButton updateButton = new JButton("UPDATE");
		updateButton.setToolTipText("Updates Data in Database");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				String queryUpdate = "UPDATE Members SET Mem_ID = '"+ textFieldID.getText() +"', Mem_Name = '"+ textFieldName.getText() +"', Mem_Surname = '"+ textFieldSurname.getText() +"', Mem_Age = '"+ textFieldAge.getText() +"', Mem_Mail = '"+ textFieldMail.getText() +"', Mem_City = '"+ textFieldCity.getText() +"', Mem_Gender = '"+ gender +"', Mem_Status = '"+ status +"' WHERE Mem_ID = '"+ textFieldID.getText() +"'";
				updateRecord(queryUpdate);
				refresh(queryRefresh, tableMember);
			}
		});
		updateButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		updateButton.setBounds(305, 400, 103, 37);
		memberPanel.add(updateButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.setToolTipText("Deletes Data From Database");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				String queryDelete = "DELETE FROM Members WHERE Mem_ID = '"+ textFieldID.getText() +"'";
				deleteRecord(queryDelete);
				refresh(queryRefresh, tableMember);
			}
		});
		deleteButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		deleteButton.setBounds(423, 400, 103, 37);
		memberPanel.add(deleteButton);
		
		JButton clearFieldButton = new JButton("CLEAR FIELDS");
		clearFieldButton.setToolTipText("Clears Fields ");
		clearFieldButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clearFieldsMem();
			}
		});
		clearFieldButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		clearFieldButton.setBounds(187, 448, 339, 37);
		memberPanel.add(clearFieldButton);
		
		JButton btnButton = new JButton("Load Member Data");
		btnButton.setToolTipText("Loads Data of Members");
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
		scrollPaneMember.setBounds(560, 33, 435, 404);
		memberPanel.add(scrollPaneMember);
		
		tableMember = new JTable();
		tableMember.setFont(new Font("Arial", Font.PLAIN, 11));
		tableMember.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
				}
			));
		scrollPaneMember.setViewportView(tableMember);
		
		JLabel lblSearchBy_1 = new JLabel("Search by:");
		lblSearchBy_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchBy_1.setBounds(586, 8, 79, 22);
		memberPanel.add(lblSearchBy_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Surname", "City"}));
		comboBox.setBounds(675, 8, 132, 22);
		memberPanel.add(comboBox);

		textFieldSearch = new JTextField();
		textFieldSearch.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				String search = (String)comboBox.getSelectedItem();
				String querySearch = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members WHERE "+ search +" =?";
				comboGetsFromDB(querySearch, tableMember, textFieldSearch);
			}
		});
		textFieldSearch.setToolTipText("Search by Fields");
		textFieldSearch.setBounds(817, 8, 132, 22);
		memberPanel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender = "Male";
			}
		});
		rdbtnMale.setBounds(390, 300, 69, 23);
		memberPanel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender = "Female";
			}
		});
		rdbtnFemale.setBounds(457, 300, 69, 23);
		memberPanel.add(rdbtnFemale);
		bgGender.add(rdbtnMale);
		bgGender.add(rdbtnFemale);
		
		JRadioButton rdbtnActive = new JRadioButton("Active");
		rdbtnActive.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnActive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				status = "Active";
			}
		});
		rdbtnActive.setBounds(390, 343, 69, 23);
		memberPanel.add(rdbtnActive);
		
		bgStatus.add(rdbtnActive);
		
		JRadioButton rdbtnInactive = new JRadioButton("Inactive");
		rdbtnInactive.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnInactive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				status = "Inactive";
			}
		});
		rdbtnInactive.setBounds(457, 343, 69, 23);
		memberPanel.add(rdbtnInactive);
		bgStatus.add(rdbtnInactive);
		
		JLabel lblMemberStatus = new JLabel("Member Status:");
		lblMemberStatus.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMemberStatus.setBounds(187, 336, 145, 32);
		memberPanel.add(lblMemberStatus);
		
		// START OF EMPLOYEE PANEL
		
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
			public void keyReleased(KeyEvent e) {
				
				fillFieldsEmp();
			}
			@Override
			public void keyPressed(KeyEvent event) {
				
				char ch = event.getKeyChar();
				
				if(ch == 8)
				{
					nameTxt.setText("");
					surnameTxt.setText("");
					ageTxt.setText("");
					mailTxt.setText("");
					cityField.setText("");
					unField.setText("");
				}
			}
		});
		
		
		idTxt.setFont(new Font("Arial", Font.PLAIN, 12));
		
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
		Image emp = new ImageIcon(this.getClass().getResource("/gymEmployee.png")).getImage();
		pictLbl.setIcon(new ImageIcon(emp));
		
		JLabel lblSearchBy = new JLabel("Search by:");
		lblSearchBy.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchBy.setBounds(586, 8, 79, 22);
		empPanel.add(lblSearchBy);
		idTxt.setBounds(400, 33, 126, 32);
		empPanel.add(idTxt);
		idTxt.setColumns(10);
		
		nameTxt = new JTextField();
		nameTxt.setFont(new Font("Arial", Font.PLAIN, 12));
		nameTxt.setBounds(400, 78, 126, 32);
		empPanel.add(nameTxt);
		nameTxt.setColumns(10);
		
		surnameTxt = new JTextField();
		surnameTxt.setFont(new Font("Arial", Font.PLAIN, 12));
		surnameTxt.setBounds(400, 121, 126, 32);
		empPanel.add(surnameTxt);
		surnameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setFont(new Font("Arial", Font.PLAIN, 12));
		ageTxt.setBounds(400, 164, 126, 32);
		empPanel.add(ageTxt);
		ageTxt.setColumns(10);
		
		mailTxt = new JTextField();
		mailTxt.setFont(new Font("Arial", Font.PLAIN, 12));
		mailTxt.setBounds(400, 207, 126, 32);
		empPanel.add(mailTxt);
		mailTxt.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setToolTipText("Saves Data To Database");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryRefresh = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City FROM Employees";
				saveRecordEmp();
				refresh(queryRefresh, tableEmp);
				clearFieldsEmp();
			}
		});
		
		cityField = new JTextField();
		cityField.setFont(new Font("Arial", Font.PLAIN, 12));
		cityField.setBounds(400, 250, 126, 32);
		empPanel.add(cityField);
		cityField.setColumns(10);
		
		unField = new JTextField();
		unField.setFont(new Font("Arial", Font.PLAIN, 12));
		unField.setBounds(400, 293, 126, 32);
		empPanel.add(unField);
		unField.setColumns(10);
		btnSave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSave.setBounds(187, 400, 103, 37);
		empPanel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setToolTipText("Updates Data In Database");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String queryUpdate = "UPDATE Employees set Emp_ID = '"+ idTxt.getText() +"', Emp_Name = '"+ nameTxt.getText() +"', Emp_Surname = '"+ surnameTxt.getText() +"', Emp_Age = '"+ ageTxt.getText() +"', Emp_Mail = '"+ mailTxt.getText() +"', Emp_City = '"+cityField.getText()+"' WHERE Emp_ID = '"+ idTxt.getText() +"'";
				String queryRefresh = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City FROM Employees";
				updateRecord(queryUpdate);
				refresh(queryRefresh, tableEmp);
				clearFieldsEmp();
			}
		});
		btnUpdate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnUpdate.setBounds(305, 400, 103, 37);
		empPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setToolTipText("Deletes Data From Database");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryDelete = "DELETE FROM Employees WHERE Emp_ID = '"+ idTxt.getText() +"'";
				deleteRecord(queryDelete);
			}
		});
		btnDelete.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDelete.setBounds(423, 400, 103, 37);
		empPanel.add(btnDelete);
		
		JButton btnLoadEmployeeData = new JButton("Load Employee Data");
		btnLoadEmployeeData.setToolTipText("Loads Employee Data");
		btnLoadEmployeeData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryLoad = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City FROM Employees";
				loadData(queryLoad, tableEmp);
			}
		});
		btnLoadEmployeeData.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnLoadEmployeeData.setBounds(649, 448, 255, 32);
		empPanel.add(btnLoadEmployeeData);
		
		JScrollPane scrollPaneEmp = new JScrollPane();
		scrollPaneEmp.setBounds(560, 33, 435, 404);
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
		btnClear.setToolTipText("Clears Fields");
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clearFieldsEmp();
			}
		});
		btnClear.setBounds(187, 447, 339, 37);
		empPanel.add(btnClear);
		
		txtSearchBy = new JTextField();
		txtSearchBy.setFont(new Font("Arial", Font.PLAIN, 11));
		txtSearchBy.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				String searchBy = (String)comboBoxSearch.getSelectedItem();
				String querySearch = "SELECT Emp_ID AS ID, Emp_Name AS Name, Emp_Surname AS Surname, Emp_Age AS Age, Emp_City AS City FROM Employees WHERE "+ searchBy +" =?";
				comboGetsFromDB(querySearch, tableEmp, txtSearchBy);
			}
		});
		txtSearchBy.setToolTipText("Search by Fields");
		txtSearchBy.setBounds(817, 8, 132, 22);
		empPanel.add(txtSearchBy);
		txtSearchBy.setColumns(10);
		
		comboBoxSearch = new JComboBox();
		comboBoxSearch.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxSearch.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Surname", "City", "UserName"}));
		comboBoxSearch.setBounds(675, 8, 132, 22);
		empPanel.add(comboBoxSearch);
		
		//Items Panel Start
		
		JPanel itemPanel = new JPanel();
		tabbedPane.addTab("Items", null, itemPanel, null);
		itemPanel.setLayout(null);
		
		JLabel labelPict = new JLabel("");
		labelPict.setBounds(10, 33, 151, 152);
		itemPanel.add(labelPict);
		Image equipment = new ImageIcon(this.getClass().getResource("/gymItems.png")).getImage();
		labelPict.setIcon(new ImageIcon(equipment));
		
		JButton buttonSave = new JButton("SAVE");
		buttonSave.setToolTipText("Saves Data To Database");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				String queryRefresh = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items";
				saveRecordItem();
				refresh(queryRefresh, tableItems);
				clearFieldsItem();
			}
		});
		buttonSave.setBounds(187, 400, 103, 37);
		buttonSave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		itemPanel.add(buttonSave);
		
		JButton buttonUpdate = new JButton("UPDATE");
		buttonUpdate.setToolTipText("Updates Data in Database");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryUpdate = "UPDATE Items SET Item_Code = '"+ textFieldItemCode.getText() +"', Item_Name = '"+ textFieldItemName.getText() +"', Item_Description = '"+ itemDescription.getText() +"', Item_Price = '"+ textFieldPrice.getText() +"', Item_Qty = '"+ textFieldQty.getText() +"' WHERE Item_Code = '"+ textFieldItemCode.getText() +"'";
				String queryRefresh = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items";
				updateRecord(queryUpdate);
				refresh(queryRefresh, tableItems);
				clearFieldsItem();
			}
		});
		buttonUpdate.setBounds(305, 400, 103, 37);
		buttonUpdate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		itemPanel.add(buttonUpdate);
		
		JButton buttonDelete = new JButton("DELETE");
		buttonDelete.setToolTipText("Deletes Data From Database");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryRefresh = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items";
				String queryDelete = "DELETE FROM Items WHERE Item_Code = '"+ textFieldItemCode.getText() +"'";
				deleteRecord(queryDelete);
				refresh(queryRefresh, tableItems);
				clearFieldsItem();
			}
		});
		buttonDelete.setBounds(423, 400, 103, 37);
		buttonDelete.setFont(new Font("Arial Black", Font.PLAIN, 11));
		itemPanel.add(buttonDelete);
		
		JButton buttonClear = new JButton("CLEAR FIELDS");
		buttonClear.setToolTipText("Clears Fields");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearFieldsItem();
			}
		});
		buttonClear.setBounds(187, 447, 339, 37);
		buttonClear.setFont(new Font("Arial Black", Font.PLAIN, 11));
		itemPanel.add(buttonClear);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(545, 0, 2, 515);
		separator_1.setForeground(SystemColor.scrollbar);
		separator_1.setBackground(SystemColor.scrollbar);
		itemPanel.add(separator_1);
		
		JLabel labelSrchBy = new JLabel("Search by:");
		labelSrchBy.setBounds(586, 8, 79, 22);
		labelSrchBy.setFont(new Font("Arial", Font.PLAIN, 12));
		itemPanel.add(labelSrchBy);
		
		JComboBox comboBoxSrc = new JComboBox();
		comboBoxSrc.setModel(new DefaultComboBoxModel(new String[] {"Code", "Name"}));
		comboBoxSrc.setBounds(675, 8, 132, 22);
		comboBoxSrc.setFont(new Font("Arial", Font.PLAIN, 12));
		itemPanel.add(comboBoxSrc);
		
		textFieldSrc = new JTextField();
		textFieldSrc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				String searchBy = (String)comboBoxSrc.getSelectedItem();
				String querySearch = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items WHERE "+ searchBy +" =?";
				comboGetsFromDB(querySearch, tableItems, textFieldSrc);
			}
		});
		textFieldSrc.setBounds(817, 8, 132, 22);
		textFieldSrc.setToolTipText("Search by Fields");
		textFieldSrc.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldSrc.setColumns(10);
		itemPanel.add(textFieldSrc);
		
		JButton buttonLoad = new JButton("Load Item Data");
		buttonLoad.setToolTipText("Loads Item Data");
		buttonLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryLoad = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items";
				loadData(queryLoad, tableItems);
			}
		});
		buttonLoad.setBounds(649, 448, 255, 32);
		buttonLoad.setFont(new Font("Arial Black", Font.BOLD, 14));
		itemPanel.add(buttonLoad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(560, 33, 435, 404);
		itemPanel.add(scrollPane);
		
		tableItems = new JTable();
		tableItems.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane.setViewportView(tableItems);
		
		JLabel lblEquipmentCode = new JLabel("Item Code:");
		lblEquipmentCode.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblEquipmentCode.setBounds(187, 33, 159, 32);
		itemPanel.add(lblEquipmentCode);
		
		JLabel lblName = new JLabel("Item Name:");
		lblName.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblName.setBounds(187, 74, 132, 32);
		itemPanel.add(lblName);
		
		textFieldItemCode = new JTextField();
		textFieldItemCode.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldItemCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				fillFieldsItem();
			}
			@Override
			public void keyPressed(KeyEvent event) {
				
				char ch = event.getKeyChar();
				
				if(ch == 8)
				{
					textFieldItemCode.setText("");
					textFieldItemName.setText("");
					textFieldQty.setText("");
					textFieldPrice.setText("");
					itemDescription.setText("");
				}
			}
		});
		textFieldItemCode.setBounds(400, 33, 126, 32);
		itemPanel.add(textFieldItemCode);
		textFieldItemCode.setColumns(10);
		
		textFieldItemName = new JTextField();
		textFieldItemName.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldItemName.setBounds(400, 78, 126, 32);
		itemPanel.add(textFieldItemName);
		textFieldItemName.setColumns(10);
		
		JLabel lblItemDescription = new JLabel("Detailed Item Description:");
		lblItemDescription.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblItemDescription.setBounds(187, 212, 267, 32);
		itemPanel.add(lblItemDescription);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(188, 251, 327, 138);
		itemPanel.add(scrollPane_1);
		
		itemDescription = new JEditorPane();
		itemDescription.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane_1.setViewportView(itemDescription);
		itemDescription.setContentType("Description");
		
		JLabel lblItemPrice = new JLabel("Item Price:");
		lblItemPrice.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblItemPrice.setBounds(187, 117, 132, 32);
		itemPanel.add(lblItemPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldPrice.setBounds(400, 121, 126, 32);
		itemPanel.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblQuantity.setBounds(187, 160, 132, 32);
		itemPanel.add(lblQuantity);
		
		textFieldQty = new JTextField();
		textFieldQty.setBounds(400, 165, 126, 32);
		itemPanel.add(textFieldQty);
		textFieldQty.setColumns(10);
		
		// ALL INFO PANEL START
		
		JPanel allInfoPanel = new JPanel();
		tabbedPane.addTab("All Information", null, allInfoPanel, null);
		allInfoPanel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(202, 11, 793, 488);
		allInfoPanel.add(scrollPane_2);
		
		tableAllInfo = new JTable();
		tableAllInfo.setFont(new Font("Arial", Font.PLAIN, 12));
		scrollPane_2.setViewportView(tableAllInfo);
		
		JButton btnMembers = new JButton("MEMBERS");
		btnMembers.setToolTipText("Gives Sort By Popup");
		btnMembers.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int option;
				
				option = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select sort method \n\n 1.MALE MEMBERS \t      2.FEMALE MEMBERS \n\n 3.ACTIVE MEMBERS \t   4.INACTIVE MEMBERS \n ", "Members", JOptionPane.OK_CANCEL_OPTION));
				
				switch (option) {
				case 1:
					String queryMale = "SELECT Mem_ID AS ID, Mem_Name AS NAME, Mem_Surname AS SURNAME, Mem_Age AS AGE, Mem_Mail AS EMAIL, Mem_City AS CITY, Mem_Gender AS GENDER, Mem_Status AS STATUS FROM Members WHERE Mem_Gender = 'Male'";
					loadData(queryMale, tableAllInfo);
					break;
				case 2:
					String queryFemale = "SELECT Mem_ID AS ID, Mem_Name AS NAME, Mem_Surname AS SURNAME, Mem_Age AS AGE, Mem_Mail AS EMAIL, Mem_City AS CITY, Mem_Gender AS GENDER, Mem_Status AS STATUS FROM Members WHERE Mem_Gender = 'Female'";
					loadData(queryFemale, tableAllInfo);
					break;
				case 3:
					String queryActive = "SELECT Mem_ID AS ID, Mem_Name AS NAME, Mem_Surname AS SURNAME, Mem_Age AS AGE, Mem_Mail AS EMAIL, Mem_City AS CITY, Mem_Gender AS GENDER, Mem_Status AS STATUS FROM Members WHERE Mem_Status = 'Active'";
					loadData(queryActive, tableAllInfo);
					break;
				case 4:
					String queryInActive = "SELECT Mem_ID AS ID, Mem_Name AS NAME, Mem_Surname AS SURNAME, Mem_Age AS AGE, Mem_Mail AS EMAIL, Mem_City AS CITY, Mem_Gender AS GENDER, Mem_Status AS STATUS FROM Members WHERE Mem_Status = 'Inactive'";
					loadData(queryInActive, tableAllInfo);
					break;
				default:
					break;
				}
			}
		});
		btnMembers.setBounds(29, 209, 147, 45);
		allInfoPanel.add(btnMembers);
		
		JButton btnEmployees = new JButton("EMPLOYEES");
		btnEmployees.setToolTipText("Loads All Employee Data");
		btnEmployees.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "SELECT Emp_ID AS ID, Emp_Name AS NAME, Emp_Surname AS SURNAME, Emp_Age AS AGE, Emp_Mail AS EMAIL, Emp_City AS CITY, UserName AS USERNAME FROM Employees";
				loadData(query, tableAllInfo);
			}
		});
		btnEmployees.setBounds(29, 131, 147, 45);
		allInfoPanel.add(btnEmployees);
		
		JButton btnItems = new JButton("ITEMS");
		btnItems.setToolTipText("Gives Sort By Popup");
		btnItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int option;
				
				option = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select sort method \n\n 1.LIST ALL ITEMS \t      2.NAME \n\n 3.PRICE ASCENDING \t   4.PRICE DESCENDING \n ", "Items", JOptionPane.OK_CANCEL_OPTION));
				
				switch (option) {
				case 1:
					String queryAll = "SELECT * FROM Items";
					loadData(queryAll, tableAllInfo);
					break;
				case 2:
					String queryName = "SELECT Item_Code AS CODE, Item_Name AS NAME, Item_Description AS DESCRIPTION, Item_Price AS PRICE FROM Items ORDER BY Item_Name";
					loadData(queryName, tableAllInfo);
					break;
				case 3:
					String queryPriceAsc = "SELECT Item_Code AS CODE, Item_Name AS NAME, Item_Description AS DESCRIPTION, Item_Price AS PRICE FROM Items ORDER BY Item_Price ASC";
					loadData(queryPriceAsc, tableAllInfo);
					break;
				case 4:
					String queryPriceDesc = "SELECT Item_Code AS CODE, Item_Name AS NAME, Item_Description AS DESCRIPTION, Item_Price AS PRICE FROM Items ORDER BY Item_Price DESC";
					loadData(queryPriceDesc, tableAllInfo);
				default:
					break;
				}
			}
		});
		btnItems.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnItems.setBounds(29, 283, 147, 45);
		allInfoPanel.add(btnItems);
		
		timeLbl = new JLabel();
		timeLbl.setToolTipText("Today's Date and Time");
		timeLbl.setFont(new Font("Tahoma", Font.ITALIC, 11));
		timeLbl.setBounds(821, 552, 199, 16);
		contentPane.add(timeLbl);
		
		timeMethod();
	}
}
