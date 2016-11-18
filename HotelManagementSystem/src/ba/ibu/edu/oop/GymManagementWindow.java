package ba.ibu.edu.oop;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class GymManagementWindow {

	private JFrame frmLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GymManagementWindow window = new GymManagementWindow();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public GymManagementWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 410, 324);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel welcomeLbl = new JLabel("Welcome to \"Body Fit\"");
		welcomeLbl.setFont(new Font("Arial Black", Font.PLAIN, 14));
		welcomeLbl.setBounds(106, 127, 181, 23);
		frmLogin.getContentPane().add(welcomeLbl);
		
		JLabel loginMsg = new JLabel("Login as:");
		loginMsg.setFont(new Font("Arial", Font.BOLD, 12));
		loginMsg.setBounds(167, 175, 70, 14);
		frmLogin.getContentPane().add(loginMsg);
		
		JButton Empbutton = new JButton("Employee");
		Empbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginEmployee loginEmp = new LoginEmployee();
				loginEmp.loginEmployee();
			}
		});
		Empbutton.setBounds(59, 200, 104, 41);
		frmLogin.getContentPane().add(Empbutton);
		
		JButton Manbutton = new JButton("Manager");
		Manbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LoginManager newMan = new LoginManager();
				newMan.loginManager();
			}
		});
		Manbutton.setBounds(229, 200, 104, 41);
		frmLogin.getContentPane().add(Manbutton);
		
		JLabel labelPict = new JLabel(" ");
		labelPict.setBounds(30, 28, 335, 85);
		frmLogin.getContentPane().add(labelPict);
		Image img = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		labelPict.setIcon(new ImageIcon(img));
		
	}
}
