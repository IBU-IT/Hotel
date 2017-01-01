package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;

public class EmployeeWindow extends ManagerWindow {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldMail;
	private JTextField textFieldCity;
	private JTextField textFieldSearch;
	private JTextField textFieldSearchBy;
	private JTextField textFieldItemCode;
	private JTextField textFieldItemName;
	private JTextField textFieldPrice;
	private JTextField textFieldQty;
	private JEditorPane itemDescription;
	private JTable tableMember;
	private PreparedStatement pps;
	private ResultSet rs;
	private String gender;
	private String status;
	private ButtonGroup bgGender = new ButtonGroup();
	private ButtonGroup bgStatus = new ButtonGroup();
	private JComboBox comboBoxSBy;
	private JComboBox comboBoxSearch;
	private JTable tableItem;
	
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
	
	private void clearFieldsMem()
	{
		textFieldID.setText("");
		textFieldName.setText("");
		textFieldSurname.setText("");
		textFieldAge.setText("");
		textFieldCity.setText("");
		textFieldMail.setText("");
	}
	
	private void fillFieldsMem()
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
	
	private void fillFieldsItem()
	{
		try {
			
			String query = "SELECT * FROM Items WHERE Item_Code =?";
			pps = connect.prepareStatement(query);
			pps.setString(1, textFieldItemCode.getText());
			rs = pps.executeQuery();
			
			while(rs.next())
			{
				textFieldItemName.setText(rs.getString("Item_Name"));
				textFieldPrice.setText(rs.getString("Item_Price") + " KM");
				textFieldQty.setText(rs.getString("Item_Qty") + " PCS");
				itemDescription.setText(rs.getString("Item_Description"));
			}
			
			pps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeWindow frame = new EmployeeWindow();
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
	public EmployeeWindow() {
		
		setTitle("Employee Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 625);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(exitMenuItem);
		
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edit Account");
		editMenu.add(mntmNewMenuItem);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		JMenuItem mntmHowToUse = new JMenuItem("How To Use");
		helpMenu.add(mntmHowToUse);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		helpMenu.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1010, 538);
		contentPane.add(tabbedPane);
		
		JPanel panelMembers = new JPanel();
		panelMembers.setLayout(null);
		panelMembers.setToolTipText("Members");
		tabbedPane.addTab("Members", null, panelMembers, null);
		
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setForeground(SystemColor.scrollbar);
		separator.setBackground(SystemColor.scrollbar);
		separator.setBounds(545, 0, 2, 515);
		panelMembers.add(separator);
		
		JLabel labelPict = new JLabel("");
		labelPict.setBounds(10, 33, 151, 152);
		panelMembers.add(labelPict);
		Image pic = new ImageIcon(this.getClass().getResource("/gymMember.png")).getImage();
		labelPict.setIcon(new ImageIcon(pic));
		
		JLabel labelID = new JLabel("Member ID:");
		labelID.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelID.setBounds(187, 33, 162, 32);
		panelMembers.add(labelID);
		
		JLabel labelName = new JLabel("Member Name:");
		labelName.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelName.setBounds(187, 76, 142, 32);
		panelMembers.add(labelName);
		
		JLabel labelSurname = new JLabel("Member Surname:");
		labelSurname.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelSurname.setBounds(187, 119, 168, 32);
		panelMembers.add(labelSurname);
		
		JLabel labelAge = new JLabel("Member Age:");
		labelAge.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelAge.setBounds(187, 162, 126, 32);
		panelMembers.add(labelAge);
		
		JLabel labelMail = new JLabel("Member Mail:");
		labelMail.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelMail.setBounds(187, 205, 130, 32);
		panelMembers.add(labelMail);
		
		JLabel labelGender = new JLabel("Member Gender:");
		labelGender.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelGender.setBounds(187, 293, 145, 32);
		panelMembers.add(labelGender);
		
		JLabel labelCity = new JLabel("Member City:");
		labelCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelCity.setBounds(187, 248, 122, 32);
		panelMembers.add(labelCity);
		
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
		panelMembers.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldName.setBounds(400, 78, 126, 32);
		panelMembers.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldSurname.setBounds(400, 121, 126, 32);
		panelMembers.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldAge.setBounds(400, 164, 126, 32);
		panelMembers.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMail.setBounds(400, 207, 126, 32);
		panelMembers.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldCity.setBounds(400, 250, 126, 32);
		panelMembers.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		JButton buttonSave = new JButton("SAVE");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				saveRecordMem();
				refresh(queryRefresh, tableMember);
			}
		});
		buttonSave.setToolTipText("Saves Data To Database");
		buttonSave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonSave.setBounds(187, 400, 103, 37);
		panelMembers.add(buttonSave);
		
		JButton buttonUpdate = new JButton("UPDATE");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				String queryUpdate = "UPDATE Members SET Mem_ID = '"+ textFieldID.getText() +"', Mem_Name = '"+ textFieldName.getText() +"', Mem_Surname = '"+ textFieldSurname.getText() +"', Mem_Age = '"+ textFieldAge.getText() +"', Mem_Mail = '"+ textFieldMail.getText() +"', Mem_City = '"+ textFieldCity.getText() +"', Mem_Gender = '"+ gender +"', Mem_Status = '"+ status +"' WHERE Mem_ID = '"+ textFieldID.getText() +"'";
				updateRecord(queryUpdate);
				refresh(queryRefresh, tableMember);
			}
		});
		buttonUpdate.setToolTipText("Updates Data in Database");
		buttonUpdate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonUpdate.setBounds(305, 400, 103, 37);
		panelMembers.add(buttonUpdate);
		
		JButton buttonDelete = new JButton("DELETE");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryRefresh = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				String queryDelete = "DELETE FROM Members WHERE Mem_ID = '"+ textFieldID.getText() +"'";
				deleteRecord(queryDelete);
				refresh(queryRefresh, tableMember);
			}
		});
		buttonDelete.setToolTipText("Deletes Data From Database");
		buttonDelete.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonDelete.setBounds(423, 400, 103, 37);
		panelMembers.add(buttonDelete);
		
		JButton buttonCFields = new JButton("CLEAR FIELDS");
		buttonCFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearFieldsMem();
			}
		});
		buttonCFields.setToolTipText("Clears Fields ");
		buttonCFields.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonCFields.setBounds(187, 448, 339, 37);
		panelMembers.add(buttonCFields);
		
		JButton buttonLoadData = new JButton("Load Member Data");
		buttonLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members";
				loadData(query, tableMember);
			}
		});
		buttonLoadData.setToolTipText("Loads Data of Members");
		buttonLoadData.setFont(new Font("Arial Black", Font.BOLD, 14));
		buttonLoadData.setBounds(649, 448, 255, 32);
		panelMembers.add(buttonLoadData);
		
		JLabel labelSearchBy = new JLabel("Search by:");
		labelSearchBy.setFont(new Font("Arial", Font.PLAIN, 12));
		labelSearchBy.setBounds(586, 8, 79, 22);
		panelMembers.add(labelSearchBy);
		
		comboBoxSBy = new JComboBox();
		comboBoxSBy.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Surname", "City"}));
		comboBoxSBy.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxSBy.setBounds(675, 8, 132, 22);
		panelMembers.add(comboBoxSBy);
		
		textFieldSearch = new JTextField();
		textFieldSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				String search = (String)comboBoxSBy.getSelectedItem();
				String querySearch = "SELECT Mem_ID AS ID, Mem_Name AS Name, Mem_Surname AS Surname, Mem_Age AS Age, Mem_City AS City FROM Members WHERE "+ search +" =?";
				comboGetsFromDB(querySearch, tableMember, textFieldSearch);
			}
		});
		textFieldSearch.setToolTipText("Search by Fields");
		textFieldSearch.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(817, 8, 132, 22);
		panelMembers.add(textFieldSearch);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender = "Male";
			}
		});
		rdbtnMale.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnMale.setBounds(390, 300, 69, 23);
		panelMembers.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender = "Female";
			}
		});
		rdbtnFemale.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnFemale.setBounds(457, 300, 69, 23);
		panelMembers.add(rdbtnFemale);
		
		bgGender.add(rdbtnMale);
		bgGender.add(rdbtnFemale);
		
		JRadioButton rdbtnActive = new JRadioButton("Active");
		rdbtnActive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				status = "Active";
			}
		});
		rdbtnActive.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnActive.setBounds(390, 343, 69, 23);
		panelMembers.add(rdbtnActive);
		
		JRadioButton rdbtnInactive = new JRadioButton("Inactive");
		rdbtnInactive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				status = "Inactive";
			}
		});
		rdbtnInactive.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnInactive.setBounds(457, 343, 69, 23);
		panelMembers.add(rdbtnInactive);
		
		bgStatus.add(rdbtnActive);
		bgStatus.add(rdbtnInactive);
		
		JLabel labelStatus = new JLabel("Member Status:");
		labelStatus.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelStatus.setBounds(187, 336, 145, 32);
		panelMembers.add(labelStatus);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(560, 33, 435, 404);
		panelMembers.add(scrollPane);
		
		tableMember = new JTable();
		scrollPane.setViewportView(tableMember);
		
		JPanel panelPShop = new JPanel();
		panelPShop.setLayout(null);
		tabbedPane.addTab("Protein Shop", null, panelPShop, null);
		
		JLabel labelPSPic = new JLabel("");
		labelPSPic.setBounds(10, 33, 151, 152);
		panelPShop.add(labelPSPic);
		Image itemPic = new ImageIcon(this.getClass().getResource("/gymItems.png")).getImage();
		labelPSPic.setIcon(new ImageIcon(itemPic));
		
		JButton btnSell = new JButton("SELL");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnSell.setToolTipText("Clears Fields");
		btnSell.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSell.setBounds(187, 423, 339, 37);
		panelPShop.add(btnSell);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setForeground(SystemColor.scrollbar);
		separator_1.setBackground(SystemColor.scrollbar);
		separator_1.setBounds(545, 0, 2, 515);
		panelPShop.add(separator_1);
		
		JLabel labelSearch = new JLabel("Search by:");
		labelSearch.setFont(new Font("Arial", Font.PLAIN, 12));
		labelSearch.setBounds(586, 8, 79, 22);
		panelPShop.add(labelSearch);
		
		comboBoxSearch = new JComboBox();
		comboBoxSearch.setModel(new DefaultComboBoxModel(new String[] {"Code", "Name"}));
		comboBoxSearch.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxSearch.setBounds(675, 8, 132, 22);
		panelPShop.add(comboBoxSearch);
		
		textFieldSearchBy = new JTextField();
		textFieldSearchBy.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String searchBy = (String)comboBoxSearch.getSelectedItem();
				String querySearch = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items WHERE "+ searchBy +" =?";
				comboGetsFromDB(querySearch, tableItem, textFieldSearchBy);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
				String searchBy = (String)comboBoxSearch.getSelectedItem();
				String querySearch = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items WHERE "+ searchBy +" =?";
				comboGetsFromDB(querySearch, tableItem, textFieldSearchBy);
			}
		});
		textFieldSearchBy.setToolTipText("Search by Fields");
		textFieldSearchBy.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldSearchBy.setColumns(10);
		textFieldSearchBy.setBounds(817, 8, 132, 22);
		panelPShop.add(textFieldSearchBy);
		
		JButton btnLoadData = new JButton("Load Item Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String queryLoad = "SELECT Item_Code AS Code, Item_Name AS Name, Item_Price AS Price, Item_Qty AS Quantity FROM Items";
				loadData(queryLoad, tableItem);
			}
		});
		btnLoadData.setToolTipText("Loads Item Data");
		btnLoadData.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnLoadData.setBounds(649, 448, 255, 32);
		panelPShop.add(btnLoadData);
		
		JLabel labelCode = new JLabel("Item Code:");
		labelCode.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelCode.setBounds(187, 33, 159, 32);
		panelPShop.add(labelCode);
		
		JLabel labelPCName = new JLabel("Item Name:");
		labelPCName.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelPCName.setBounds(187, 74, 132, 32);
		panelPShop.add(labelPCName);
		
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
		panelPShop.add(textFieldItemCode);
		textFieldItemCode.setColumns(10);
		
		textFieldItemName = new JTextField();
		textFieldItemName.setEditable(false);
		textFieldItemName.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldItemName.setColumns(10);
		textFieldItemName.setBounds(400, 78, 126, 32);
		panelPShop.add(textFieldItemName);
		
		JLabel labelDescription = new JLabel("Detailed Item Description:");
		labelDescription.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelDescription.setBounds(187, 212, 267, 32);
		panelPShop.add(labelDescription);
		
		JLabel labelPrice = new JLabel("Item Price:");
		labelPrice.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelPrice.setBounds(187, 117, 132, 32);
		panelPShop.add(labelPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setEditable(false);
		textFieldPrice.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(400, 121, 126, 32);
		panelPShop.add(textFieldPrice);
		
		JLabel labelQty = new JLabel("Quantity:");
		labelQty.setFont(new Font("Arial Black", Font.BOLD, 14));
		labelQty.setBounds(187, 160, 132, 32);
		panelPShop.add(labelQty);
		
		textFieldQty = new JTextField();
		textFieldQty.setEditable(false);
		textFieldQty.setColumns(10);
		textFieldQty.setBounds(400, 165, 126, 32);
		panelPShop.add(textFieldQty);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(188, 251, 327, 138);
		panelPShop.add(scrollPane_2);
		
		itemDescription = new JEditorPane();
		itemDescription.setEditable(false);
		scrollPane_2.setViewportView(itemDescription);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(560, 33, 435, 404);
		panelPShop.add(scrollPane_1);
		
		tableItem = new JTable();
		scrollPane_1.setViewportView(tableItem);
	}
}
