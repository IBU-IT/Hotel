package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectTime {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Time() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectTime window = new SelectTime();
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
	public SelectTime() {
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
		label_2.setBounds(621, 11, 182, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("SELECT TIME");
		label_3.setForeground(SystemColor.activeCaption);
		label_3.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("VIEW PROMOTIONS");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("SELECT ATTRACTION");
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("WELCOME");
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_7);
		
		JLabel lblNewLabel = new JLabel("AVAILABILITY FOR\r\n SELECTED DAY, MONTH");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 272, 509, 199);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("08:30                                                                                                                                      YES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESERVATION AT 08:30 COMPLETED!");
				frame.dispose();
				PersonalInformation aa=new PersonalInformation();
				aa.Personal();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(686, 98, 656, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnYes = new JButton("10:00                                                                                                                                      YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESERVATION AT 10:00 COMPLETED!");
				frame.dispose();
				PersonalInformation aa=new PersonalInformation();
				aa.Personal();
			}
		});
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYes.setBounds(686, 181, 656, 72);
		frame.getContentPane().add(btnYes);
		
		JButton btnYes_1 = new JButton("13:30                                                                                                                                      YES");
		btnYes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESERVATION AT 13:30 COMPLETED!");
				frame.dispose();
				PersonalInformation aa=new PersonalInformation();
				aa.Personal();
			}
		});
		btnYes_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYes_1.setBounds(686, 272, 656, 72);
		frame.getContentPane().add(btnYes_1);
		
		JButton btnYes_2 = new JButton("17:00                                                                                                                                      YES");
		btnYes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESERVATION AT 17:00 COMPLETED!");
				frame.dispose();
				PersonalInformation aa=new PersonalInformation();
				aa.Personal();
			}
		});
		btnYes_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYes_2.setBounds(686, 355, 656, 72);
		frame.getContentPane().add(btnYes_2);
		
		JButton btnYes_3 = new JButton("20:30                                                                                                                                      YES");
		btnYes_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESERVATION AT 20:30 COMPLETED!");
				frame.dispose();
				PersonalInformation aa=new PersonalInformation();
				aa.Personal();
			}
		});
		btnYes_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYes_3.setBounds(686, 438, 656, 72);
		frame.getContentPane().add(btnYes_3);
		
		JLabel lblNewLabel_1 = new JLabel("ENTRY TIME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(686, 58, 175, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AVAILABILITY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(1154, 60, 188, 33);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
