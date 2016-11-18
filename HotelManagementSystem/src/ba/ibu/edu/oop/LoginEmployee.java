package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class LoginEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void loginEmployee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEmployee frame = new LoginEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connect = null;
	
	/**
	 * Create the frame.
	 */
	public LoginEmployee() {
		setResizable(false);
		setTitle("Employee Login");
		setBounds(100, 100, 368, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(10, 23, 329, 88);
		contentPane.add(labelLogo);
		Image logo = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		labelLogo.setIcon(new ImageIcon(logo));
		
		JLabel labelPict = new JLabel(" ");
		labelPict.setBounds(10, 96, 150, 176);
		contentPane.add(labelPict);
		Image emp = new ImageIcon(this.getClass().getResource("/Employee.png")).getImage();
		labelPict.setIcon(new ImageIcon(emp));
		
		JLabel labelUn = new JLabel("UserName");
		labelUn.setBounds(130, 148, 69, 22);
		contentPane.add(labelUn);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(209, 147, 103, 25);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 192, 103, 25);
		contentPane.add(passwordField);
		
		JLabel labelPw = new JLabel("Password");
		labelPw.setBounds(130, 193, 69, 22);
		contentPane.add(labelPw);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				connect = DatabaseConnector.databaseConnector();
			}
		});
		loginBtn.setBounds(130, 250, 110, 32);
		contentPane.add(loginBtn);
		Image ok = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		loginBtn.setIcon(new ImageIcon(ok));
	}

}
