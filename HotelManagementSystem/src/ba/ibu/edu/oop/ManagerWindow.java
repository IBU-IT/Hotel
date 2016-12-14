package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManagerWindow extends JFrame {

	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField nameTxt;
	private JTextField surnameTxt;
	private JTextField ageTxt;
	private JTextField creationTxt;
	private JTextField mailTxt;
	private JTextField cityField;
	private JTextField unField;
	private JTextField pwField;

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

	/**
	 * Create the frame.
	 */
	public ManagerWindow() {
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
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employees", null, empPanel, null);
		empPanel.setLayout(null);
		
		JLabel idLbl = new JLabel("Employee ID: ");
		idLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		idLbl.setBounds(225, 44, 162, 26);
		empPanel.add(idLbl);
		
		JLabel nameLbl = new JLabel("Employee Name:");
		nameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		nameLbl.setBounds(225, 99, 142, 26);
		empPanel.add(nameLbl);
		
		JLabel surnameLbl = new JLabel("Employee Surname:");
		surnameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		surnameLbl.setBounds(225, 153, 168, 26);
		empPanel.add(surnameLbl);
		
		JLabel ageLbl = new JLabel("Employee Age:");
		ageLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		ageLbl.setBounds(225, 207, 126, 26);
		empPanel.add(ageLbl);
		
		JLabel creationLbl = new JLabel("Date Of Creation:");
		creationLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		creationLbl.setBounds(225, 262, 162, 26);
		empPanel.add(creationLbl);
		
		JLabel mailLbl = new JLabel("E-Mail:");
		mailLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		mailLbl.setBounds(225, 314, 103, 26);
		empPanel.add(mailLbl);
		
		idTxt = new JTextField();
		idTxt.setBounds(438, 43, 126, 32);
		empPanel.add(idTxt);
		idTxt.setColumns(10);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(438, 98, 126, 32);
		empPanel.add(nameTxt);
		nameTxt.setColumns(10);
		
		surnameTxt = new JTextField();
		surnameTxt.setBounds(438, 152, 126, 32);
		empPanel.add(surnameTxt);
		surnameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(438, 206, 126, 32);
		empPanel.add(ageTxt);
		ageTxt.setColumns(10);
		
		creationTxt = new JTextField();
		creationTxt.setBounds(438, 261, 126, 32);
		empPanel.add(creationTxt);
		creationTxt.setColumns(10);
		
		mailTxt = new JTextField();
		mailTxt.setBounds(438, 313, 126, 32);
		empPanel.add(mailTxt);
		mailTxt.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(64, 340, 103, 37);
		empPanel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(64, 388, 103, 37);
		empPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(64, 436, 103, 37);
		empPanel.add(btnDelete);

		JLabel lblUn = new JLabel("User Name:");
		lblUn.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblUn.setBounds(225, 415, 162, 26);
		empPanel.add(lblUn);
		
		JLabel lblPw = new JLabel("Password:");
		lblPw.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblPw.setBounds(225, 465, 103, 26);
		empPanel.add(lblPw);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCity.setBounds(225, 364, 46, 26);
		empPanel.add(lblCity);
		
		cityField = new JTextField();
		cityField.setBounds(438, 363, 126, 32);
		empPanel.add(cityField);
		cityField.setColumns(10);
		
		unField = new JTextField();
		unField.setBounds(438, 414, 126, 32);
		empPanel.add(unField);
		unField.setColumns(10);
		
		pwField = new JTextField();
		pwField.setBounds(438, 464, 126, 32);
		empPanel.add(pwField);
		pwField.setColumns(10);
		
		JLabel pictLbl = new JLabel("");
		pictLbl.setBounds(38, 70, 154, 195);
		empPanel.add(pictLbl);
		Image emp = new ImageIcon(this.getClass().getResource("/Emp.png")).getImage();
		pictLbl.setIcon(new ImageIcon(emp));
		
		JPanel equipPanel = new JPanel();
		tabbedPane.addTab("Equipment", null, equipPanel, null);
	}
}
