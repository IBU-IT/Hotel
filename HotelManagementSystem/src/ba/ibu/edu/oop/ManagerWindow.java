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
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManagerWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		idLbl.setBounds(10, 44, 162, 26);
		empPanel.add(idLbl);
		
		JLabel nameLbl = new JLabel("Employee Name:");
		nameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		nameLbl.setBounds(10, 99, 142, 26);
		empPanel.add(nameLbl);
		
		JLabel surnameLbl = new JLabel("Employee Surname:");
		surnameLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		surnameLbl.setBounds(10, 153, 168, 26);
		empPanel.add(surnameLbl);
		
		JLabel ageLbl = new JLabel("Employee Age:");
		ageLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		ageLbl.setBounds(10, 207, 126, 26);
		empPanel.add(ageLbl);
		
		JLabel creationLbl = new JLabel("Date Of Creation:");
		creationLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		creationLbl.setBounds(10, 262, 162, 26);
		empPanel.add(creationLbl);
		
		JLabel mailLbl = new JLabel("E-Mail:");
		mailLbl.setFont(new Font("Arial Black", Font.BOLD, 14));
		mailLbl.setBounds(10, 314, 103, 26);
		empPanel.add(mailLbl);
		
		textField = new JTextField();
		textField.setBounds(219, 43, 126, 32);
		empPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 98, 126, 32);
		empPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(219, 152, 126, 32);
		empPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(219, 206, 126, 32);
		empPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(219, 261, 126, 32);
		empPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(219, 313, 126, 32);
		empPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(10, 413, 103, 37);
		empPanel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(123, 413, 103, 37);
		empPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(236, 413, 103, 37);
		empPanel.add(btnDelete);
		
		JPanel equipPanel = new JPanel();
		tabbedPane.addTab("Equipment", null, equipPanel, null);
	}
}
