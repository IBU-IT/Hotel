package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

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
	
	Connection connect = null;
	/**
	 * Create the frame.
	 */
	public LoginManager() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		
		ManagerWindow manWind = new ManagerWindow();
		
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
		
		JLabel labelPictManager = new JLabel(" ");
		labelPictManager.setBounds(10, 96, 150, 176);
		contentPane.add(labelPictManager);
		Image logoPict = new ImageIcon(this.getClass().getResource("/Manageri.png")).getImage();
		labelPictManager.setIcon(new ImageIcon(logoPict));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 192, 103, 25);
		contentPane.add(passwordField);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
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
						manWind.managerWindow();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong UserName or Password. Please, try again");
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		loginBtn.setBounds(130, 250, 110, 32);
		contentPane.add(loginBtn);
		Image ok = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		loginBtn.setIcon(new ImageIcon(ok));
	}
}
