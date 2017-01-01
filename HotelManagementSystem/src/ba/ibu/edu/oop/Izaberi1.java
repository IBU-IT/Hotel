package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Izaberi1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Izaberi1 window = new Izaberi1();
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
	public Izaberi1() {
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
		
		JButton btnNewButton = new JButton("At The Top");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Top aa=new Top();
				aa.t();
			}
		});
		btnNewButton.setBounds(420, 336, 156, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnInTheMiddle = new JButton("In The Middle");
		btnInTheMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Middle aa=new Middle();
				aa.Midle();
			}
		});
		btnInTheMiddle.setBounds(420, 423, 156, 50);
		frame.getContentPane().add(btnInTheMiddle);
		
		JButton btnIntheBottom = new JButton("In The Bottom");
		btnIntheBottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Botom aa=new Botom();
				aa.BotomA();
			}
		});
		btnIntheBottom.setBounds(420, 506, 156, 50);
		frame.getContentPane().add(btnIntheBottom);
		
		JButton btnNewButton_1 = new JButton("First Floor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FirstFloor aa= new FirstFloor();
				aa.First();
			}
		});
		btnNewButton_1.setBounds(629, 105, 670, 73);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSecondFloor = new JButton("Second Floor");
		btnSecondFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SecondFloor aa=new SecondFloor();
				aa.Second();
			}
		});
		btnSecondFloor.setBounds(629, 189, 670, 73);
		frame.getContentPane().add(btnSecondFloor);
		
		JButton btnThirdFloor = new JButton("Third Floor");
		btnThirdFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ThirdFloor aa=new ThirdFloor();
				aa.Third();
			}
		});
		btnThirdFloor.setBounds(629, 273, 670, 73);
		frame.getContentPane().add(btnThirdFloor);
		
		JButton btnFourthFloor = new JButton("Fourth Floor");
		btnFourthFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FourthFloor aa=new FourthFloor();
				aa.Fourth();
			}
		});
		btnFourthFloor.setBounds(629, 357, 670, 73);
		frame.getContentPane().add(btnFourthFloor);
		
		JButton btnFifthFloor = new JButton("Fifth Floor");
		btnFifthFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FifthFloor aa=new FifthFloor();
				aa.Fifth();
			}
		});
		btnFifthFloor.setBounds(629, 441, 670, 73);
		frame.getContentPane().add(btnFifthFloor);
		
		JButton btnSixthFloor = new JButton("Sixth Floor");
		btnSixthFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SixthFloor aa=new SixthFloor();
				aa.Sixth();
			}
		});
		btnSixthFloor.setBounds(629, 520, 670, 73);
		frame.getContentPane().add(btnSixthFloor);
		
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
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("SELECT ATTRACTION");
		label_5.setForeground(SystemColor.activeCaption);
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_8 = new JLabel("WELCOME");
		label_8.setForeground(Color.BLACK);
		label_8.setBackground(Color.BLACK);
		label_8.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_8);
	}
}
