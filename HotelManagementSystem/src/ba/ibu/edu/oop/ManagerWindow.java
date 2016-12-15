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
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Component;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.BorderFactory;
import javax.swing.Box;
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

public class ManagerWindow extends JFrame {

	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField nameTxt;
	private JTextField surnameTxt;
	private JTextField ageTxt;
	private JTextField mailTxt;
	private JTextField cityField;
	private JTextField unField;

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
	private JTable tableEmp;
	
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
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1010, 543);
		contentPane.add(tabbedPane);
		
		JPanel memberPanel = new JPanel();
		memberPanel.setToolTipText("Members");
		tabbedPane.addTab("Members", null, memberPanel, null);
		Image emp = new ImageIcon(this.getClass().getResource("/Emp1.png")).getImage();
		
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
				
				try {
					
					String query = "INSERT INTO Employees (Emp_Name, Emp_Surname, Emp_Age, Emp_Mail, Emp_City, UserName) VALUES (?, ?, ?, ?, ?, ?)";
					PreparedStatement pps = connect.prepareStatement(query);
					//ResultSet rs = pps.executeQuery();
					pps.setString(1, nameTxt.getText());
					pps.setString(2, surnameTxt.getText());
					pps.setString(3, ageTxt.getText());
					pps.setString(4, mailTxt.getText());
					pps.setString(5, cityField.getText());
					pps.setString(6, unField.getText());
					
					pps.execute();
					
					pps.close();
					//rs.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSave.setBounds(187, 400, 103, 37);
		empPanel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnUpdate.setBounds(305, 400, 103, 37);
		empPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDelete.setBounds(423, 400, 103, 37);
		empPanel.add(btnDelete);
		
		JLabel lblUn = new JLabel("User Name:");
		lblUn.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblUn.setBounds(187, 291, 162, 32);
		empPanel.add(lblUn);
				
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCity.setBounds(187, 248, 46, 32);
		empPanel.add(lblCity);
				
		cityField = new JTextField();
		cityField.setBounds(400, 250, 126, 32);
		empPanel.add(cityField);
		cityField.setColumns(10);
				
		unField = new JTextField();
		unField.setBounds(400, 293, 126, 32);
		empPanel.add(unField);
		unField.setColumns(10);
				
		JLabel pictLbl = new JLabel("");
		pictLbl.setBounds(10, 33, 151, 152);
		empPanel.add(pictLbl);
		pictLbl.setIcon(new ImageIcon(emp));
				
		JButton btnLoadEmployeeData = new JButton("Load Employee Data");
		btnLoadEmployeeData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String query = "SELECT Emp_Name, Emp_Surname, Emp_Age, Emp_City, UserName FROM Employees";
					PreparedStatement pps = connect.prepareStatement(query);
					ResultSet rs = pps.executeQuery();
					tableEmp .setModel(DbUtils.resultSetToTableModel(rs));
					
					pps.close();
					rs.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnLoadEmployeeData.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnLoadEmployeeData.setBounds(649, 448, 255, 32);
		empPanel.add(btnLoadEmployeeData);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(560, 33, 417, 404);
		empPanel.add(scrollPane);
				
		tableEmp = new JTable();
		tableEmp.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
				}
			));
		tableEmp.setToolTipText("");
		tableEmp.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane.setViewportView(tableEmp);
		
		JPanel equipPanel = new JPanel();
		tabbedPane.addTab("Equipment", null, equipPanel, null);
	}
}
