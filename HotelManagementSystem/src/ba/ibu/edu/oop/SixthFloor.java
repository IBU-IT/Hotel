package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SixthFloor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Sixth() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SixthFloor window = new SixthFloor();
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
	public SixthFloor() {
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
		button.setBounds(1154, 609, 188, 73);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Downloads\\qqq.jpg"));
		label.setBounds(10, 149, 405, 522);
		frame.getContentPane().add(label);
		
		JButton button_1 = new JButton("At The Bottom");
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_1.setBounds(425, 507, 156, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("In The Middle");
		button_2.setBackground(UIManager.getColor("Button.background"));
		button_2.setBounds(425, 424, 156, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("At The Top");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(425, 337, 156, 50);
		frame.getContentPane().add(button_3);
		
		JCheckBox chckbxRoom = new JCheckBox("Room 601");
		chckbxRoom.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom.setBounds(640, 124, 98, 38);
		frame.getContentPane().add(chckbxRoom);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6a.jpg"));
		label_8.setBounds(744, 109, 107, 73);
		frame.getContentPane().add(label_8);
		
		JCheckBox chckbxRoom_1 = new JCheckBox("Room 602");
		chckbxRoom_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_1.setBounds(878, 132, 97, 23);
		frame.getContentPane().add(chckbxRoom_1);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6b.jpg"));
		label_9.setBounds(981, 109, 107, 73);
		frame.getContentPane().add(label_9);
		
		JCheckBox chckbxRoom_2 = new JCheckBox("Room 603");
		chckbxRoom_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_2.setBounds(1126, 132, 97, 23);
		frame.getContentPane().add(chckbxRoom_2);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6c.jpg"));
		label_10.setBounds(1229, 109, 107, 73);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6f.jpg"));
		label_11.setBounds(1223, 213, 119, 73);
		frame.getContentPane().add(label_11);
		
		JCheckBox chckbxRoom_5 = new JCheckBox("Room 606");
		chckbxRoom_5.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_5.setBounds(1126, 230, 97, 23);
		frame.getContentPane().add(chckbxRoom_5);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6e.jpg"));
		label_12.setBounds(981, 213, 119, 73);
		frame.getContentPane().add(label_12);
		
		JCheckBox chckbxRoom_4 = new JCheckBox("Room 605");
		chckbxRoom_4.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_4.setBounds(878, 230, 97, 23);
		frame.getContentPane().add(chckbxRoom_4);
		
		JCheckBox chckbxRoom_3 = new JCheckBox("Room 604");
		chckbxRoom_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_3.setBounds(640, 230, 97, 23);
		frame.getContentPane().add(chckbxRoom_3);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6d.jpg"));
		label_13.setBounds(738, 213, 107, 67);
		frame.getContentPane().add(label_13);
		
		JCheckBox chckbxExclusive = new JCheckBox("Exclusive 601");
		chckbxExclusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive.setBounds(640, 334, 97, 23);
		frame.getContentPane().add(chckbxExclusive);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6ee.jpg"));
		label_14.setBounds(738, 320, 107, 67);
		frame.getContentPane().add(label_14);
		
		JCheckBox chckbxExclusive_1 = new JCheckBox("Exclusive 602");
		chckbxExclusive_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive_1.setBounds(878, 334, 97, 23);
		frame.getContentPane().add(chckbxExclusive_1);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6ee1.jpg"));
		label_15.setBounds(981, 320, 107, 67);
		frame.getContentPane().add(label_15);
		
		JCheckBox chckbxExlusive = new JCheckBox("Exlusive 603");
		chckbxExlusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExlusive.setBounds(1126, 334, 97, 23);
		frame.getContentPane().add(chckbxExlusive);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\6ee2.jpg"));
		label_16.setBounds(1223, 320, 107, 67);
		frame.getContentPane().add(label_16);
		
		JLabel label_1 = new JLabel("COMPLETE PURCHASE");
		label_1.setBounds(970, 11, 134, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("SELECT NO. OF TICKETS");
		label_2.setBounds(798, 11, 188, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("PERSONAL INFORMATION");
		label_3.setBounds(621, 11, 182, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("SELECT TIME");
		label_4.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("VIEW PROMOTIONS");
		label_5.setForeground(SystemColor.activeCaption);
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT ATTRACTION");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("SELECT DATE");
		label_7.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_7);
		
		JLabel label_17 = new JLabel("WELCOME");
		label_17.setForeground(Color.BLACK);
		label_17.setBackground(Color.BLACK);
		label_17.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_17);
	}

}
