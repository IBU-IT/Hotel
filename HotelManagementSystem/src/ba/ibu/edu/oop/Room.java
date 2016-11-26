package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.DefaultComboBoxModel;

public class Room extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
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
	public Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBooking = new JLabel("Booking");
		lblBooking.setForeground(new Color(51, 204, 255));
		lblBooking.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBooking.setBounds(26, 11, 59, 18);
		contentPane.add(lblBooking);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(new Color(51, 204, 255));
		lblFirstName.setBounds(51, 44, 76, 14);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(147, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Last Name:");
		lblNewLabel.setForeground(new Color(51, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(41, 69, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 63, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Room No.:");
		lblNewLabel_1.setForeground(new Color(51, 204, 255));
		lblNewLabel_1.setBounds(51, 94, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDateIn = new JLabel("Date in:");
		lblDateIn.setForeground(new Color(51, 204, 255));
		lblDateIn.setBounds(51, 122, 46, 14);
		contentPane.add(lblDateIn);
		
		textField_3 = new JTextField();
		textField_3.setBounds(147, 116, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNoOfDays = new JLabel("No. of Days:");
		lblNoOfDays.setForeground(new Color(51, 204, 255));
		lblNoOfDays.setBounds(51, 147, 76, 14);
		contentPane.add(lblNoOfDays);
		
		textField_4 = new JTextField();
		textField_4.setBounds(147, 141, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNoofAdults = new JLabel("No.of Adults:");
		lblNoofAdults.setForeground(new Color(51, 204, 255));
		lblNoofAdults.setBounds(51, 172, 76, 14);
		contentPane.add(lblNoofAdults);
		
		textField_5 = new JTextField();
		textField_5.setBounds(147, 166, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("No. of Childrens:");
		lblNewLabel_2.setForeground(new Color(51, 204, 255));
		lblNewLabel_2.setBounds(51, 197, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(147, 191, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.setBounds(323, 38, 116, 23);
		contentPane.add(chckbxGym);
		
		JCheckBox chckbxPool = new JCheckBox("Pool");
		chckbxPool.setBounds(323, 63, 116, 23);
		contentPane.add(chckbxPool);
		
		JCheckBox chckbxSauna = new JCheckBox("Sauna");
		chckbxSauna.setBounds(323, 88, 116, 23);
		contentPane.add(chckbxSauna);
		Image img=new ImageIcon(this.getClass().getResource("/3-star-hotel.png")).getImage();
		
		textField_7 = new JTextField();
		textField_7.setBounds(283, 275, 136, 41);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(new Color(255, 255, 51));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrice.setBounds(227, 275, 46, 14);
		contentPane.add(lblPrice);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Normal View", "210", "211", "213", "213", "214", "414", "415", "416", "Better View", "221", "222", "223", "224", "225"}));
		comboBox.setBounds(147, 89, 86, 20);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 0));
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 459, 357);
		contentPane.add(label);
	}
}
