package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class mini_calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mini_calculator window = new mini_calculator();
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
	public mini_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(30, 11, 134, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 11, 139, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1+num2;
					textField_2.setText(Integer.toString(ans));
				}
					catch(Exception i)
					{
						JOptionPane.showMessageDialog(null, "Enter Valid Number!");
					}
				
			}
		});
		btnAdd.setBounds(30, 99, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("MINUS");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1-num2;
					
					textField_2.setText(Integer.toString(ans));
				}
				catch(Exception a)
				{
					JOptionPane.showMessageDialog(null, "Please enter Valid Number");
				}
				
			}
		});
		btnMinus.setBounds(225, 99, 89, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lblTheAnswerIs = new JLabel("The answer is");
		lblTheAnswerIs.setBounds(30, 208, 115, 31);
		frame.getContentPane().add(lblTheAnswerIs);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210, 187, 139, 48);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}