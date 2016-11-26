package ba.ibu.edu.oop;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class WelcomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
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
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1370, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Room Cheif", "Restaurant Cheif", "Pool Cheif", "Gym Cheif", "Information Cheif"}));
		comboBox_2.setBounds(581, 111, 117, 33);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnCoffee = new JButton("COFFEE");
		btnCoffee.setBounds(813, 175, 117, 33);
		frame.getContentPane().add(btnCoffee);
		
		JButton btnGym = new JButton("GYM");
		btnGym.setBounds(813, 143, 117, 33);
		frame.getContentPane().add(btnGym);
		
		JButton btnNewButton_2 = new JButton("RESTAURANT");
		btnNewButton_2.setBounds(813, 111, 117, 33);
		frame.getContentPane().add(btnNewButton_2);
		Image img=new ImageIcon(this.getClass().getResource("/naslovna.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Trajan Pro", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(185, 0, 139, 56);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setVerticalAlignment(SwingConstants.TOP);
		lblTo.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblTo.setBounds(257, 28, 25, 28);
		frame.getContentPane().add(lblTo);
		
		JLabel lblOnlineHotelReservation = new JLabel("ONLINE HOTEL RESERVATION ");
		lblOnlineHotelReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlineHotelReservation.setForeground(new Color(255, 255, 51));
		lblOnlineHotelReservation.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblOnlineHotelReservation.setBounds(528, 537, 517, 56);
		frame.getContentPane().add(lblOnlineHotelReservation);
		
		JLabel lblManao = new JLabel("MANAO ");
		lblManao.setForeground(new Color(0, 0, 0));
		lblManao.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblManao.setBounds(290, 46, 159, 42);
		frame.getContentPane().add(lblManao);
		
		JLabel lblManagmentSystem = new JLabel("MANAGMENT SYSTEM");
		lblManagmentSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagmentSystem.setForeground(new Color(255, 255, 51));
		lblManagmentSystem.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblManagmentSystem.setBounds(582, 579, 424, 42);
		frame.getContentPane().add(lblManagmentSystem);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior", "Room ***", "Room ****", "Room *****", "Restaurant", "Coffee", "Gym", "Sauna", "Pool", "Parking"}));
		comboBox_1.setBounds(697, 111, 117, 33);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Room room= new Room();
				room.setVisible(true);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Room ***", "Room ****", "Room *****", "Exclusive Room"}));
		comboBox.setBounds(465, 111, 117, 33);
		frame.getContentPane().add(comboBox);
		
		JLabel lblReservation = new JLabel("Reservation");
		lblReservation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblReservation.setForeground(new Color(153, 255, 153));
		lblReservation.setBounds(465, 97, 77, 14);
		frame.getContentPane().add(lblReservation);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblContact.setForeground(new Color(51, 255, 0));
		lblContact.setBounds(581, 97, 46, 14);
		frame.getContentPane().add(lblContact);
		
		JLabel lblNewLabel_2 = new JLabel("Gallery");
		lblNewLabel_2.setForeground(new Color(51, 255, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(698, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Backgorung");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -12, 1354, 682);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Reservation");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRoom = new JMenuItem("Room ***");
		mntmRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Room room= new Room();
				room.setVisible(true);
			}
		});
		mnNewMenu.add(mntmRoom);
		
		JMenuItem mntmRoom_1 = new JMenuItem("Room ****");
		mntmRoom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Room4 room= new Room4();
				room.setVisible(true);
			}
		});
		mnNewMenu.add(mntmRoom_1);
		
		JMenuItem mntmRoom_2 = new JMenuItem("Room *****");
		mntmRoom_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Room5 room= new Room5();
				room.setVisible(true);
			}
		});
		mnNewMenu.add(mntmRoom_2);
		
		JMenuItem mntmExclusiveRoom = new JMenuItem("Exclusive Room");
		mntmExclusiveRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ExclusiveR room= new ExclusiveR();
				room.setVisible(true);
			}
		});
		mnNewMenu.add(mntmExclusiveRoom);
		
		JMenu mnContact = new JMenu("Contact");
		menuBar.add(mnContact);
		
		JMenuItem mntmRoomCheif = new JMenuItem("Room Cheif");
		mntmRoomCheif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AbuContact con= new AbuContact();
				con.setVisible(true);
			}
		});
		mnContact.add(mntmRoomCheif);
		
		JMenuItem mntmRestaurantCoffee = new JMenuItem("Restaurant & Coffee Cheif");
		mntmRestaurantCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ObadaContact con= new ObadaContact();
				con.setVisible(true);
			}
		});
		mnContact.add(mntmRestaurantCoffee);
		
		JMenuItem mntmPoolSauna = new JMenuItem("Pool & Sauna Cheif");
		mntmPoolSauna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NedzadKontakt con= new NedzadKontakt();
				con.setVisible(true);
			}
		});
		mnContact.add(mntmPoolSauna);
		
		JMenuItem mntmInformationData = new JMenuItem("Information & Data Cheif");
		mntmInformationData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AminaKontakt con= new AminaKontakt();
				con.setVisible(true);
			}
		});
		mnContact.add(mntmInformationData);
		
		JMenuItem mntmGymParking = new JMenuItem("Gym & Parking Cheif");
		mntmGymParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MujoKontakt con= new MujoKontakt();
				con.setVisible(true);
			}
		});
		mnContact.add(mntmGymParking);
		
		JMenu mnGallery = new JMenu("Gallery");
		menuBar.add(mnGallery);
		
		JMenuItem mntmInterior = new JMenuItem("Interior");
		mnGallery.add(mntmInterior);
		
		JMenuItem mntmExterior = new JMenuItem("Exterior");
		mnGallery.add(mntmExterior);
		
		JMenu mnRoom = new JMenu("Room");
		mnGallery.add(mnRoom);
		
		JMenuItem mntmStars_1 = new JMenuItem("3 stars");
		mnRoom.add(mntmStars_1);
		
		JMenuItem mntmStars = new JMenuItem("4 stars");
		mnRoom.add(mntmStars);
		
		JMenuItem mntmStars_2 = new JMenuItem("5 stars");
		mnRoom.add(mntmStars_2);
		
		JMenuItem mntmExclusive = new JMenuItem("Exclusive");
		mnRoom.add(mntmExclusive);
		
		JMenu mnOther = new JMenu("Other");
		mnGallery.add(mnOther);
		
		JMenuItem mntmRestaurant = new JMenuItem("Restaurant");
		mnOther.add(mntmRestaurant);
		
		JMenuItem mntmCoffee = new JMenuItem("Coffee");
		mnOther.add(mntmCoffee);
		
		JMenuItem mntmGym = new JMenuItem("Gym");
		mnOther.add(mntmGym);
		
		JMenuItem mntmPool = new JMenuItem("Pool");
		mnOther.add(mntmPool);
		
		JMenuItem mntmSauna = new JMenuItem("Sauna");
		mnOther.add(mntmSauna);
		
		JMenuItem mntmParking = new JMenuItem("Parking");
		mnOther.add(mntmParking);
		
		JMenu mnNewMenu_1 = new JMenu("Fun");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Billiards");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Darts");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmCasino = new JMenuItem("Casino");
		mnNewMenu_1.add(mntmCasino);
	}
}
