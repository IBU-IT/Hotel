package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class GymManagementMain {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField uN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GymManagementMain window = new GymManagementMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	Connection connect = null;
	private JTextField uNEmp;
	private JPasswordField passwordFieldEmp;
	private JPanel panelManager;
	private JPanel panelEmployee;
	private JPanel panelMain;
	
	public GymManagementMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ManagerWindow manWind = new ManagerWindow();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelMain = new JPanel();
		frame.getContentPane().add(panelMain, "name_60623277072290");
		panelMain.setLayout(null);
		
		JLabel labelLogoMain = new JLabel(" ");
		labelLogoMain.setBounds(10, 22, 335, 85);
		panelMain.add(labelLogoMain);
		Image img = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		labelLogoMain.setIcon(new ImageIcon(img));
		
		JLabel labelWelcome = new JLabel("Welcome to \"Body Fit\"");
		labelWelcome.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelWelcome.setBounds(79, 127, 181, 23);
		panelMain.add(labelWelcome);
		
		JLabel labelLogAs = new JLabel("Login as:");
		labelLogAs.setFont(new Font("Arial", Font.BOLD, 12));
		labelLogAs.setBounds(140, 175, 70, 14);
		panelMain.add(labelLogAs);
		
		JButton buttonEmp = new JButton("Employee");
		buttonEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelMain.setVisible(false);
				panelEmployee.setVisible(true);
			}
		});
		buttonEmp.setBounds(32, 200, 104, 41);
		panelMain.add(buttonEmp);
		
		JButton buttonMan = new JButton("Manager");
		buttonMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelMain.setVisible(false);
				panelManager.setVisible(true);
			}
		});
		buttonMan.setBounds(202, 200, 104, 41);
		panelMain.add(buttonMan);
		
		panelManager = new JPanel();
		frame.getContentPane().add(panelManager, "name_60529189693506");
		panelManager.setLayout(null);
		
		JLabel labelLogoMan = new JLabel("");
		labelLogoMan.setBounds(10, 23, 329, 88);
		panelManager.add(labelLogoMan);
		Image logo = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		labelLogoMan.setIcon(new ImageIcon(logo));
		
		JLabel labelPicMan = new JLabel(" ");
		labelPicMan.setBounds(10, 110, 103, 135);
		panelManager.add(labelPicMan);
		Image logoPict = new ImageIcon(this.getClass().getResource("/Manageri.png")).getImage();
		labelPicMan.setIcon(new ImageIcon(logoPict));
		
		JLabel labelUnMan = new JLabel("UserName");
		labelUnMan.setBounds(130, 136, 69, 22);
		panelManager.add(labelUnMan);
		
		JLabel labelPassMan = new JLabel("Password");
		labelPassMan.setBounds(130, 181, 69, 22);
		panelManager.add(labelPassMan);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 180, 103, 25);
		panelManager.add(passwordField);
		
		uN = new JTextField();
		uN.setToolTipText("");
		uN.setForeground(Color.BLACK);
		uN.setColumns(10);
		uN.setBackground(Color.WHITE);
		uN.setBounds(209, 135, 103, 25);
		panelManager.add(uN);
		
		JButton buttonLoginMan = new JButton("Login");
		buttonLoginMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				connect = DatabaseConnector.databaseConnector();
				
				try {
					
					String query = "select * from Managers where UserName =? and Password =?";
					PreparedStatement pps = connect.prepareStatement(query);
					pps.setString(1, uN.getText());
					pps.setString(2, passwordField.getText());
					ResultSet res = pps.executeQuery();
					
					int counter = 0;
					
					while(res.next())
					{
						counter++;
					}
					
					if(counter == 1)
					{
						JOptionPane.showMessageDialog(null, "Thank you, succesfully logged in as manager.");
						uN.setText("");
						passwordField.setText("");
						manWind.managerWindow();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong username or password. Please, try again.");
						uN.setText("");
						passwordField.setText("");
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		buttonLoginMan.setBounds(51, 256, 110, 32);
		panelManager.add(buttonLoginMan);
		Image ok = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		buttonLoginMan.setIcon(new ImageIcon(ok));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelManager.setVisible(false);
				panelMain.setVisible(true);
				uN.setText("");
				passwordField.setText("");
			}
		});
		btnBack.setBounds(199, 256, 110, 32);
		panelManager.add(btnBack);
		Image backMan = new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		btnBack.setIcon(new ImageIcon(backMan));
		
		panelEmployee = new JPanel();
		frame.getContentPane().add(panelEmployee, "name_60522479502094");
		panelEmployee.setLayout(null);
		
		JLabel labelLogoEmp = new JLabel("");
		labelLogoEmp.setBounds(10, 23, 329, 88);
		panelEmployee.add(labelLogoEmp);
		Image logoEmp = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		labelLogoEmp.setIcon(new ImageIcon(logo));
		
		JLabel labelPicEmp = new JLabel(" ");
		labelPicEmp.setBounds(10, 110, 103, 135);
		panelEmployee.add(labelPicEmp);
		Image emp = new ImageIcon(this.getClass().getResource("/Employee.png")).getImage();
		labelPicEmp.setIcon(new ImageIcon(emp));
		
		JLabel labelPassEmp = new JLabel("Password");
		labelPassEmp.setBounds(130, 181, 69, 22);
		panelEmployee.add(labelPassEmp);
		
		JLabel labelUnEmp = new JLabel("UserName");
		labelUnEmp.setBounds(130, 136, 69, 22);
		panelEmployee.add(labelUnEmp);
		
		uNEmp = new JTextField();
		uNEmp.setToolTipText("");
		uNEmp.setForeground(Color.BLACK);
		uNEmp.setColumns(10);
		uNEmp.setBackground(Color.WHITE);
		uNEmp.setBounds(209, 135, 103, 25);
		panelEmployee.add(uNEmp);
		
		passwordFieldEmp = new JPasswordField();
		passwordFieldEmp.setBounds(209, 180, 103, 25);
		panelEmployee.add(passwordFieldEmp);
		
		JButton buttonLoginEmp = new JButton("Login");
		buttonLoginEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				connect = DatabaseConnector.databaseConnector();
				try {
					
					String query = "select * from Employees where UserName =? and Password =?";
					PreparedStatement pps = connect.prepareStatement(query);
					pps.setString(1, uNEmp.getText());
					pps.setString(2, passwordFieldEmp.getText());
					ResultSet res = pps.executeQuery();
					
					int counter = 0;
					while(res.next())
					{
						counter+=1;
					}
					
					if(counter == 1)
					{
						JOptionPane.showMessageDialog(null, "Thank you, succesfully logged in as employee");
						uNEmp.setText("");
						passwordFieldEmp.setText("");
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong username and password. Please, try again.");
						uNEmp.setText("");
						passwordFieldEmp.setText("");
					}

					res.close();
					pps.close();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		buttonLoginEmp.setBounds(51, 256, 110, 32);
		panelEmployee.add(buttonLoginEmp);
		Image okEmp = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		buttonLoginEmp.setIcon(new ImageIcon(ok));
		
		JButton buttonBck = new JButton("Back");
		buttonBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelEmployee.setVisible(false);
				panelMain.setVisible(true);
				uNEmp.setText("");
				passwordFieldEmp.setText("");
			}
		});
		buttonBck.setBounds(199, 256, 110, 32);
		panelEmployee.add(buttonBck);
		Image back = new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		buttonBck.setIcon(new ImageIcon(back
				));
	}

}
