package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonalInformation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void Personal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalInformation window = new PersonalInformation();
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
	public PersonalInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("COMPLETE PURCHASE");
		label.setBounds(970, 11, 134, 50);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("SELECT NO. OF TICKETS");
		label_1.setBounds(798, 11, 188, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("PERSONAL INFORMATION");
		label_2.setForeground(SystemColor.activeCaption);
		label_2.setBounds(621, 11, 182, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("SELECT TIME");
		label_3.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("VIEW PROMOTIONS");
		label_4.setForeground(Color.BLACK);
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("SELECT ATTRACTION");
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("WELCOME");
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_7);
		
		JLabel lblNewLabel = new JLabel("PERSONAL INFORMATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 104, 436, 329);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseFillIn = new JLabel("Please fill in your details below");
		lblPleaseFillIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPleaseFillIn.setBounds(777, 93, 380, 50);
		frame.getContentPane().add(lblPleaseFillIn);
		
		JLabel lblFieldsMarkedWith = new JLabel("Fields marked with (*) are compulsory");
		lblFieldsMarkedWith.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFieldsMarkedWith.setBounds(635, 149, 339, 30);
		frame.getContentPane().add(lblFieldsMarkedWith);
		
		JLabel lblFirstName = new JLabel("First Name (*)");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(645, 190, 158, 35);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(813, 190, 373, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name (*)");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(635, 236, 98, 30);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(813, 236, 373, 35);
		frame.getContentPane().add(textField_1);
		
		JLabel lblContactNo = new JLabel("Contact No (*)");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContactNo.setBounds(635, 289, 143, 35);
		frame.getContentPane().add(lblContactNo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select code", "Afganistan(+93)", "Albania(+355)", "Algeria(+213)", "Argenita(+54)", "Armenia(+374)", "Austria(+43)", "Bahrain(+973)", "Belgiun(+32)", "Bosnia and Hercegovina(+387)", "Brazil(+55)", "Bulgaria(+359)", "Canada(+1)", "Chad(+235)", "Chile(+56)", "Taiwan(+886)", "Colombia(+57)", "Croatia(+385)", "Cuba(+53)", "Egypt(+20)", "France(+33)", "Germany(+49)", "Greece(+30)", "Hungary(+36)", "Iceland(+354)", "India(+91)", "Iran(+98)", "Iraq(+964)", "Italy(+39)", "Japan(+81)", "Jordan(+962)", "Kuwait(+965)", "Lebanon(+961)", "Libya(+218)", "Luxembourg(+352)", "Macedonia(+389)", "Malawi(+265)", "Malaysia(+60)", "Qatar(+974)", "Russia(+7)", "Spain(+34)", "Saudi Arabio(+966)", "Slovenia(+386)", "Sweden(+46)", "Syria(+963)", "Tunisia(+216)", "Turkey(+90)", "Ukraine(+380)", "United Arab Emirates(+971)", "USA(+1)", "Other"}));
		comboBox.setBounds(813, 282, 134, 30);
		frame.getContentPane().add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(970, 282, 216, 35);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmailAddress = new JLabel("Email Address (*)");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailAddress.setBounds(635, 335, 128, 30);
		frame.getContentPane().add(lblEmailAddress);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(813, 328, 373, 35);
		frame.getContentPane().add(textField_3);
		
		JLabel lblConfirmEmail = new JLabel("Confirm Email (*)");
		lblConfirmEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmEmail.setBounds(635, 376, 158, 30);
		frame.getContentPane().add(lblConfirmEmail);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(813, 374, 373, 35);
		frame.getContentPane().add(textField_4);
		
		JLabel lblHomeAddress = new JLabel("Home Address");
		lblHomeAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHomeAddress.setBounds(635, 417, 143, 30);
		frame.getContentPane().add(lblHomeAddress);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(813, 424, 373, 35);
		frame.getContentPane().add(textField_5);
		
		JLabel lblCountry = new JLabel("Country (*)");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCountry.setBounds(639, 482, 139, 30);
		frame.getContentPane().add(lblCountry);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(813, 482, 373, 35);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(813, 539, 182, 40);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\sss.png"));
		lblNewLabel_1.setBounds(1005, 539, 188, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NoOfTic aa=new NoOfTic();
				aa.No();
			}
		});
		button.setBounds(1154, 598, 188, 73);
		frame.getContentPane().add(button);
	}
}
