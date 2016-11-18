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
import java.awt.event.ActionEvent;

public class LoginManager extends JFrame {

	private JPanel contentPane;
	private JTextField uN;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void loginManager() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginManager frame = new LoginManager();
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
	public LoginManager() {
		setResizable(false);
		setTitle("Manager Login");
		setBounds(100, 100, 368, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logoLbl = new JLabel("");
		logoLbl.setBounds(10, 23, 329, 88);
		contentPane.add(logoLbl);
		Image logo = new ImageIcon(this.getClass().getResource("/GymLogo.png")).getImage();
		logoLbl.setIcon(new ImageIcon(logo));
		
		uN = new JTextField();
		uN.setToolTipText("");
		uN.setForeground(Color.BLACK);
		uN.setColumns(10);
		uN.setBackground(Color.WHITE);
		uN.setBounds(209, 147, 103, 25);
		contentPane.add(uN);
		
		JLabel labelUn = new JLabel("UserName");
		labelUn.setBounds(130, 148, 69, 22);
		contentPane.add(labelUn);
		
		JLabel labelPw = new JLabel("Password");
		labelPw.setBounds(130, 193, 69, 22);
		contentPane.add(labelPw);
		
		JLabel labelPict = new JLabel(" ");
		labelPict.setBounds(10, 96, 150, 176);
		contentPane.add(labelPict);
		Image logoPict = new ImageIcon(this.getClass().getResource("/Manageri.png")).getImage();
		labelPict.setIcon(new ImageIcon(logoPict));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 192, 103, 25);
		contentPane.add(passwordField);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(130, 250, 110, 32);
		contentPane.add(loginBtn);
		Image ok = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		loginBtn.setIcon(new ImageIcon(ok));
	}
}
