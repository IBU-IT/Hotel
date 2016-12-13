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

public class ManagerWindow extends JFrame {

	private JPanel contentPane;

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
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1178, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1162, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Members");
		menuBar.add(mnNewMenu);
		
		JMenuItem addOrRemove = new JMenuItem("Add/Remove");
		addOrRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Welcome");
			}
		});
		mnNewMenu.add(addOrRemove);
		
		JMenuItem listMembers = new JMenuItem("List Members");
		mnNewMenu.add(listMembers);
		
		JMenu mnEmployees = new JMenu("Employees");
		menuBar.add(mnEmployees);
		
		JMenuItem mntmAddremove = new JMenuItem("Add/Remove ");
		mnEmployees.add(mntmAddremove);
		
		JMenuItem mntmCheckEmployees = new JMenuItem("Check Employees");
		mnEmployees.add(mntmCheckEmployees);
		
		JMenu mnNewMenu_1 = new JMenu("Equipment");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem addEquip = new JMenuItem("Add Gym Equipment");
		mnNewMenu_1.add(addEquip);
		
		JMenuItem checkEquip = new JMenuItem("Check Items");
		mnNewMenu_1.add(checkEquip);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem welcome = new JMenuItem("Welcome");
		mnHelp.add(welcome);
		
		JMenuItem helpContent = new JMenuItem("Help Contents");
		mnHelp.add(helpContent);
		
		JMenuItem aboutSoftware = new JMenuItem("About Software...");
		mnHelp.add(aboutSoftware);
	}
}
