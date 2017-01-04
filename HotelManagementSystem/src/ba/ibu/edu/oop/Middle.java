package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Middle {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Midle() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Middle window = new Middle();
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
	public Middle() {
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
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Downloads\\qqq.jpg"));
		label_7.setBounds(10, 149, 405, 522);
		frame.getContentPane().add(label_7);
		
		JButton button = new JButton("At The Top");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Top aa=new Top();
				aa.t();
			}
		});
		button.setBounds(425, 337, 156, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("In The Middle");
		button_1.setBackground(SystemColor.activeCaptionText);
		button_1.setForeground(SystemColor.window);
		button_1.setBounds(425, 424, 156, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("At The Bottom");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Botom aa=new Botom();
				aa.BotomA();
			}
		});
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(UIManager.getColor("Button.background"));
		button_2.setBounds(425, 507, 156, 50);
		frame.getContentPane().add(button_2);
		
		JCheckBox chckbxRoom = new JCheckBox("Room 301");
		chckbxRoom.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom.setBounds(629, 77, 98, 38);
		frame.getContentPane().add(chckbxRoom);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3a.jpg"));
		label_8.setBounds(727, 71, 107, 67);
		frame.getContentPane().add(label_8);
		
		JCheckBox chckbxRoom_1 = new JCheckBox("Room 302");
		chckbxRoom_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_1.setBounds(867, 85, 97, 23);
		frame.getContentPane().add(chckbxRoom_1);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3b.jpg"));
		label_9.setBounds(970, 71, 119, 67);
		frame.getContentPane().add(label_9);
		
		JCheckBox chckbxRoom_2 = new JCheckBox("Room 303");
		chckbxRoom_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_2.setBounds(1115, 85, 97, 23);
		frame.getContentPane().add(chckbxRoom_2);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3c.jpg"));
		label_10.setBounds(1212, 71, 119, 67);
		frame.getContentPane().add(label_10);
		
		JCheckBox chckbxRoom_3 = new JCheckBox("Room 304");
		chckbxRoom_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_3.setBounds(629, 176, 97, 23);
		frame.getContentPane().add(chckbxRoom_3);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3d.jpg"));
		label_11.setBounds(727, 149, 107, 67);
		frame.getContentPane().add(label_11);
		
		JCheckBox chckbxRoom_4 = new JCheckBox("Room 305");
		chckbxRoom_4.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_4.setBounds(867, 176, 97, 23);
		frame.getContentPane().add(chckbxRoom_4);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3e.jpg"));
		label_12.setBounds(970, 149, 119, 73);
		frame.getContentPane().add(label_12);
		
		JCheckBox chckbxRoom_5 = new JCheckBox("Room 306");
		chckbxRoom_5.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_5.setBounds(1115, 176, 97, 23);
		frame.getContentPane().add(chckbxRoom_5);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\3f.jpg"));
		label_13.setBounds(1212, 149, 119, 73);
		frame.getContentPane().add(label_13);
		
		JCheckBox chckbxExclusive = new JCheckBox("Exclusive 301");
		chckbxExclusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive.setBounds(629, 251, 97, 23);
		frame.getContentPane().add(chckbxExclusive);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\eee1.jpg"));
		label_14.setBounds(727, 233, 107, 67);
		frame.getContentPane().add(label_14);
		
		JCheckBox chckbxExclusive_1 = new JCheckBox("Exclusive 302");
		chckbxExclusive_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive_1.setBounds(867, 251, 97, 23);
		frame.getContentPane().add(chckbxExclusive_1);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\eee2.jpg"));
		label_15.setBounds(970, 233, 119, 67);
		frame.getContentPane().add(label_15);
		
		JCheckBox chckbxExlusive = new JCheckBox("Exlusive 303");
		chckbxExlusive.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExlusive.setBounds(1115, 251, 97, 23);
		frame.getContentPane().add(chckbxExlusive);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\eee3.jpg"));
		label_16.setBounds(1212, 233, 119, 67);
		frame.getContentPane().add(label_16);
		
		JCheckBox chckbxRoom_6 = new JCheckBox("Room 401");
		chckbxRoom_6.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_6.setBounds(621, 343, 98, 38);
		frame.getContentPane().add(chckbxRoom_6);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p.jpg"));
		label_17.setBounds(727, 335, 107, 73);
		frame.getContentPane().add(label_17);
		
		JCheckBox chckbxRoom_7 = new JCheckBox("Room 402");
		chckbxRoom_7.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_7.setBounds(867, 351, 97, 23);
		frame.getContentPane().add(chckbxRoom_7);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p2.jpg"));
		label_18.setBounds(970, 337, 119, 73);
		frame.getContentPane().add(label_18);
		
		JCheckBox chckbxRoom_8 = new JCheckBox("Room 403");
		chckbxRoom_8.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_8.setBounds(1115, 351, 97, 23);
		frame.getContentPane().add(chckbxRoom_8);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p3.jpg"));
		label_19.setBounds(1212, 335, 119, 73);
		frame.getContentPane().add(label_19);
		
		JCheckBox chckbxRoom_9 = new JCheckBox("Room 404");
		chckbxRoom_9.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_9.setBounds(622, 438, 97, 23);
		frame.getContentPane().add(chckbxRoom_9);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p4.jpg"));
		label_20.setBounds(727, 419, 107, 67);
		frame.getContentPane().add(label_20);
		
		JCheckBox chckbxRoom_10 = new JCheckBox("Room 405");
		chckbxRoom_10.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_10.setBounds(857, 436, 97, 23);
		frame.getContentPane().add(chckbxRoom_10);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p5.jpg"));
		label_21.setBounds(970, 419, 119, 67);
		frame.getContentPane().add(label_21);
		
		JCheckBox chckbxRoom_11 = new JCheckBox("Room 406");
		chckbxRoom_11.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRoom_11.setBounds(1105, 436, 97, 23);
		frame.getContentPane().add(chckbxRoom_11);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\p6.jpg"));
		label_22.setBounds(1212, 419, 119, 67);
		frame.getContentPane().add(label_22);
		
		JCheckBox chckbxExclusive_2 = new JCheckBox("Exclusive 401");
		chckbxExclusive_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive_2.setBounds(622, 521, 97, 23);
		frame.getContentPane().add(chckbxExclusive_2);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\4e.jpg"));
		label_23.setBounds(727, 507, 107, 67);
		frame.getContentPane().add(label_23);
		
		JCheckBox chckbxExclusive_3 = new JCheckBox("Exclusive 402");
		chckbxExclusive_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExclusive_3.setBounds(867, 521, 97, 23);
		frame.getContentPane().add(chckbxExclusive_3);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\4ee.jpg"));
		label_24.setBounds(970, 507, 119, 67);
		frame.getContentPane().add(label_24);
		
		JCheckBox chckbxExlusive_1 = new JCheckBox("Exlusive 403");
		chckbxExlusive_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExlusive_1.setBounds(1115, 521, 97, 23);
		frame.getContentPane().add(chckbxExlusive_1);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\4eee.jpg"));
		label_25.setBounds(1214, 507, 117, 67);
		frame.getContentPane().add(label_25);
		
		JButton button_3 = new JButton("NEXT");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SelectTime aa=new SelectTime();
				aa.Time();
			}
		});
		button_3.setBounds(1154, 609, 188, 73);
		frame.getContentPane().add(button_3);
		
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
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_26 = new JLabel("WELCOME");
		label_26.setForeground(Color.BLACK);
		label_26.setBackground(Color.BLACK);
		label_26.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_26);
	}

}
