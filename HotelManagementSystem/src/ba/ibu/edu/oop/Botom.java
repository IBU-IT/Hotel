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

public class Botom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void BotomA() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botom window = new Botom();
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
	public Botom() {
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Middle aa=new Middle();
				aa.Midle();
			}
		});
		button_1.setBounds(425, 424, 156, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("At The Bottom");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setBounds(425, 507, 156, 50);
		frame.getContentPane().add(button_2);
		
		JCheckBox checkBox = new JCheckBox("Room 101");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBounds(629, 77, 98, 38);
		frame.getContentPane().add(checkBox);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v.jpg"));
		label_8.setBounds(727, 71, 107, 67);
		frame.getContentPane().add(label_8);
		
		JCheckBox checkBox_1 = new JCheckBox("Room 102");
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_1.setBounds(867, 85, 97, 23);
		frame.getContentPane().add(checkBox_1);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v2.jpg"));
		label_9.setBounds(970, 71, 119, 67);
		frame.getContentPane().add(label_9);
		
		JCheckBox checkBox_2 = new JCheckBox("Room 103");
		checkBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_2.setBounds(1115, 85, 97, 23);
		frame.getContentPane().add(checkBox_2);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v3.jpg"));
		label_10.setBounds(1212, 71, 119, 67);
		frame.getContentPane().add(label_10);
		
		JCheckBox checkBox_3 = new JCheckBox("Room 104");
		checkBox_3.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_3.setBounds(629, 159, 97, 23);
		frame.getContentPane().add(checkBox_3);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v4.jpg"));
		label_11.setBounds(727, 149, 107, 67);
		frame.getContentPane().add(label_11);
		
		JCheckBox checkBox_4 = new JCheckBox("Room 105");
		checkBox_4.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_4.setBounds(867, 176, 97, 23);
		frame.getContentPane().add(checkBox_4);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v5.jpg"));
		label_12.setBounds(970, 149, 119, 73);
		frame.getContentPane().add(label_12);
		
		JCheckBox checkBox_5 = new JCheckBox("Room 106");
		checkBox_5.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_5.setBounds(1115, 176, 97, 23);
		frame.getContentPane().add(checkBox_5);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\v6_1.jpg"));
		label_13.setBounds(1212, 149, 119, 73);
		frame.getContentPane().add(label_13);
		
		JCheckBox checkBox_6 = new JCheckBox("Exclusive 101");
		checkBox_6.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_6.setBounds(629, 251, 97, 23);
		frame.getContentPane().add(checkBox_6);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e.jpg"));
		label_14.setBounds(727, 233, 107, 67);
		frame.getContentPane().add(label_14);
		
		JCheckBox checkBox_7 = new JCheckBox("Exclusive 102");
		checkBox_7.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_7.setBounds(867, 251, 97, 23);
		frame.getContentPane().add(checkBox_7);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e2.jpg"));
		label_15.setBounds(970, 233, 119, 67);
		frame.getContentPane().add(label_15);
		
		JCheckBox checkBox_8 = new JCheckBox("Exlusive 103");
		checkBox_8.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_8.setBounds(1115, 251, 97, 23);
		frame.getContentPane().add(checkBox_8);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\e3.png"));
		label_16.setBounds(1212, 233, 119, 67);
		frame.getContentPane().add(label_16);
		
		JCheckBox checkBox_9 = new JCheckBox("Room 201");
		checkBox_9.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_9.setBounds(621, 343, 98, 38);
		frame.getContentPane().add(checkBox_9);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2a.jpg"));
		label_17.setBounds(727, 335, 107, 73);
		frame.getContentPane().add(label_17);
		
		JCheckBox checkBox_10 = new JCheckBox("Room 202");
		checkBox_10.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_10.setBounds(867, 338, 97, 23);
		frame.getContentPane().add(checkBox_10);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2b_2.jpg"));
		label_18.setBounds(970, 335, 119, 73);
		frame.getContentPane().add(label_18);
		
		JCheckBox checkBox_11 = new JCheckBox("Room 203");
		checkBox_11.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_11.setBounds(1115, 337, 97, 23);
		frame.getContentPane().add(checkBox_11);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2c.jpg"));
		label_19.setBounds(1212, 314, 119, 73);
		frame.getContentPane().add(label_19);
		
		JCheckBox checkBox_12 = new JCheckBox("Room 204");
		checkBox_12.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_12.setBounds(622, 438, 97, 23);
		frame.getContentPane().add(checkBox_12);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2d.jpg"));
		label_20.setBounds(727, 419, 107, 67);
		frame.getContentPane().add(label_20);
		
		JCheckBox checkBox_13 = new JCheckBox("Room 205");
		checkBox_13.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_13.setBounds(857, 436, 97, 23);
		frame.getContentPane().add(checkBox_13);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2e.png"));
		label_21.setBounds(970, 419, 119, 67);
		frame.getContentPane().add(label_21);
		
		JCheckBox checkBox_14 = new JCheckBox("Room 206");
		checkBox_14.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_14.setBounds(1105, 436, 97, 23);
		frame.getContentPane().add(checkBox_14);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\2f.jpg"));
		label_22.setBounds(1212, 413, 119, 73);
		frame.getContentPane().add(label_22);
		
		JCheckBox checkBox_15 = new JCheckBox("Exclusive 201");
		checkBox_15.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_15.setBounds(622, 521, 97, 23);
		frame.getContentPane().add(checkBox_15);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\ee1.jpg"));
		label_23.setBounds(727, 507, 107, 67);
		frame.getContentPane().add(label_23);
		
		JCheckBox checkBox_16 = new JCheckBox("Exclusive 202");
		checkBox_16.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_16.setBounds(867, 521, 97, 23);
		frame.getContentPane().add(checkBox_16);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\ee2.jpg"));
		label_24.setBounds(970, 507, 119, 67);
		frame.getContentPane().add(label_24);
		
		JCheckBox checkBox_17 = new JCheckBox("Exlusive 203");
		checkBox_17.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_17.setBounds(1115, 521, 97, 23);
		frame.getContentPane().add(checkBox_17);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("C:\\Users\\Toshiba\\Desktop\\ee3.jpg"));
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
