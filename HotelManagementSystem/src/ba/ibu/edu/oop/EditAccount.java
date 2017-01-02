package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TexturePaint;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class EditAccount extends EmployeeWindow {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JPasswordField textFieldPass;
	private JPasswordField textFieldPass2;
	private PreparedStatement pps;
	
	public static void EditAccount() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditAccount frame = new EditAccount();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EditAccount() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(25, 30, 99, 32);
		contentPane.add(lblId);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setBounds(25, 73, 99, 32);
		contentPane.add(lblNewPassword);
		
		JLabel lblRetypePassword = new JLabel("Re-Type Password:");
		lblRetypePassword.setBounds(25, 119, 99, 32);
		contentPane.add(lblRetypePassword);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(197, 36, 86, 20);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldPass = new JPasswordField();
		textFieldPass.setBounds(197, 79, 86, 20);
		contentPane.add(textFieldPass);
		textFieldPass.setColumns(10);
		
		textFieldPass2 = new JPasswordField();
		textFieldPass2.setBounds(197, 125, 86, 20);
		contentPane.add(textFieldPass2);
		textFieldPass2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "UPDATE Employees SET Emp_ID = '"+ textFieldID.getText() +"', Password = '"+ textFieldPass2.getText() +"' WHERE Emp_ID = '"+ textFieldID.getText() +"'";
				String pass1 = textFieldPass.getText();
				String pass2 = textFieldPass2.getText();
				
				if(textFieldID.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter your ID!");
				}
				else if(textFieldPass.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter new password!");
				}
				else if(textFieldPass2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please re-type your password!");
				}
				
				if(pass1.equals(pass2))
				{
					updateRecord(query);
					JOptionPane.showMessageDialog(null, "You have succesfully changed your password!");
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Passwords do not match, please re-type!");
				}
			}
		});
		btnSubmit.setBounds(116, 173, 89, 23);
		contentPane.add(btnSubmit);
	}
}
