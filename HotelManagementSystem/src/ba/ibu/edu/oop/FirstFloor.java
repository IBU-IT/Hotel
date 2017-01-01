package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFloor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void First() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFloor window = new FirstFloor();
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
	public FirstFloor() {
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
		
		JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SelectTime aa=new SelectTime();
				aa.Time();
			}
		});
		button.setBounds(1154, 598, 188, 73);
		frame.getContentPane().add(button);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Downloads\\qqq.jpg"));
		label_7.setBounds(10, 149, 405, 522);
		frame.getContentPane().add(label_7);
		
		JButton button_1 = new JButton("At The Top");
		button_1.setBounds(425, 337, 156, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("In The Middle");
		button_2.setBounds(425, 424, 156, 50);
		frame.getContentPane().add(button_2);
		
		JButton btnInTheBottom = new JButton("At The Bottom");
		btnInTheBottom.setForeground(new Color(0, 0, 0));
		btnInTheBottom.setBackground(Color.LIGHT_GRAY);
		btnInTheBottom.setBounds(425, 507, 156, 50);
		frame.getContentPane().add(btnInTheBottom);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Room 101");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(640, 141, 98, 38);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxRoom = new JCheckBox("Room 102");
		chckbxRoom.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom.setBounds(878, 149, 97, 23);
		frame.getContentPane().add(chckbxRoom);
		
		JCheckBox chckbxRoom_1 = new JCheckBox("Room 103");
		chckbxRoom_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_1.setBounds(1126, 149, 97, 23);
		frame.getContentPane().add(chckbxRoom_1);
		
		JCheckBox chckbxRoom_2 = new JCheckBox("Room 104");
		chckbxRoom_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_2.setBounds(640, 247, 97, 23);
		frame.getContentPane().add(chckbxRoom_2);
		
		JCheckBox chckbxExclusive = new JCheckBox("Exclusive 101");
		chckbxExclusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive.setBounds(640, 351, 97, 23);
		frame.getContentPane().add(chckbxExclusive);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v.jpg"));
		lblNewLabel.setBounds(738, 132, 107, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v2.jpg"));
		label_8.setBounds(981, 132, 119, 67);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v3.jpg"));
		label_9.setBounds(1223, 132, 119, 67);
		frame.getContentPane().add(label_9);
		
		JCheckBox chckbxRoom_3 = new JCheckBox("Room 105");
		chckbxRoom_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_3.setBounds(878, 247, 97, 23);
		frame.getContentPane().add(chckbxRoom_3);
		
		JCheckBox chckbxRoom_4 = new JCheckBox("Room 106");
		chckbxRoom_4.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_4.setBounds(1126, 247, 97, 23);
		frame.getContentPane().add(chckbxRoom_4);
		
		JCheckBox chckbxExlusive = new JCheckBox("Exlusive 103");
		chckbxExlusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExlusive.setBounds(1126, 351, 97, 23);
		frame.getContentPane().add(chckbxExlusive);
		
		JCheckBox chckbxExclusive_1 = new JCheckBox("Exclusive 102");
		chckbxExclusive_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive_1.setBounds(878, 351, 97, 23);
		frame.getContentPane().add(chckbxExclusive_1);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v4.jpg"));
		label_10.setBounds(738, 230, 107, 67);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e.jpg"));
		label_11.setBounds(738, 337, 107, 67);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v5.jpg"));
		label_12.setBounds(981, 230, 119, 73);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v6_1.jpg"));
		label_13.setBounds(1223, 230, 119, 73);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e2.jpg"));
		label_14.setBounds(981, 337, 107, 67);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e3.png"));
		label_15.setBounds(1223, 337, 107, 67);
		frame.getContentPane().add(label_15);
		
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
		label_3.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("VIEW PROMOTIONS");
		label_4.setForeground(SystemColor.activeCaption);
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("SELECT ATTRACTION");
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_16 = new JLabel("WELCOME");
		label_16.setForeground(Color.BLACK);
		label_16.setBackground(Color.BLACK);
		label_16.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_16);
	}
}
