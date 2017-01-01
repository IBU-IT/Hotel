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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JCheckBox;


public class Page1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1 window = new Page1();
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
	public Page1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(0,0, 1370, 804);
		frame.getContentPane().setLayout(null);
		Image img=new ImageIcon(this.getClass().getResource("/naslovna.png")).getImage();
		
		JLabel lblTo = new JLabel("WELCOME TO MANAO HOTEL");
		lblTo.setForeground(new Color(153, 255, 0));
		lblTo.setVerticalAlignment(SwingConstants.TOP);
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblTo.setBounds(571, 11, 535, 35);
		frame.getContentPane().add(lblTo);
		
		JLabel lblGawadf = new JLabel("slike ");
		lblGawadf.setFont(new Font("Tahoma", Font.PLAIN, 71));
		lblGawadf.setBounds(273, 73, 730, 312);
		frame.getContentPane().add(lblGawadf);
		
		JLabel lblRezervacija = new JLabel("Rezervacija");
		lblRezervacija.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRezervacija.setForeground(new Color(255, 255, 153));
		lblRezervacija.setBounds(1059, 106, 285, 279);
		frame.getContentPane().add(lblRezervacija);
		
		JLabel lblHotelFeatures = new JLabel("Hotel Features");
		lblHotelFeatures.setForeground(new Color(255, 255, 102));
		lblHotelFeatures.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHotelFeatures.setBounds(22, 100, 219, 285);
		frame.getContentPane().add(lblHotelFeatures);
		
		JLabel lblTekstOHotelu = new JLabel("O NAMA:\r\n\r\nHotel MANAO...neki tekst");
		lblTekstOHotelu.setForeground(new Color(255, 255, 204));
		lblTekstOHotelu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTekstOHotelu.setBounds(273, 424, 424, 285);
		frame.getContentPane().add(lblTekstOHotelu);
		
		JLabel lblMap = new JLabel("MAP");
		Image img2= new ImageIcon(this.getClass().getResource("/mapa--.jpg")).getImage();
		lblMap.setIcon(new ImageIcon(img2));
		lblMap.setBounds(0, 422, 231, 296);
		frame.getContentPane().add(lblMap);
		
		JLabel lblOcjena = new JLabel("Search:");
		lblOcjena.setForeground(new Color(255, 255, 102));
		lblOcjena.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblOcjena.setBounds(1106, 57, 55, 35);
		frame.getContentPane().add(lblOcjena);
		
		JLabel lblOcjena_1 = new JLabel("Ocjena :");
		lblOcjena_1.setForeground(new Color(255, 255, 51));
		lblOcjena_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblOcjena_1.setBounds(1033, 392, 66, 42);
		frame.getContentPane().add(lblOcjena_1);
		
		JLabel lblGuestReviews = new JLabel("Guest\r\n\r\n\r\n");
		lblGuestReviews.setForeground(new Color(255, 255, 102));
		lblGuestReviews.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblGuestReviews.setBounds(1033, 552, 66, 23);
		frame.getContentPane().add(lblGuestReviews);
		
		JLabel lblWhoStayHere = new JLabel("Who stay here\r\n\r\nSolo Travels...ostali");
		lblWhoStayHere.setForeground(new Color(255, 255, 204));
		lblWhoStayHere.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhoStayHere.setBounds(719, 426, 284, 285);
		frame.getContentPane().add(lblWhoStayHere);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(22, 39, 89, 23);
		frame.getContentPane().add(btnHome);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rooms Reservation", "Room ***", "Room ****", "Room *****", "Exclusive Room"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(108, 39, 118, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hotel's Services", "Restaurant", "Coffee", "Room Service"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(225, 39, 106, 23);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Other", "Gym", "Pool", "Sauna", "Massage"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(329, 39, 72, 23);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Contacts", "Room Cheif", "Restaurant & Coffee Cheif", "Pool & Sauna Cheif", "Information & Data Chaif", "Gym & Parking Cheif"}));
		comboBox_3.setBounds(401, 39, 153, 23);
		frame.getContentPane().add(comboBox_3);
		
		JCheckBox chckbxStar = new JCheckBox("1 star");
		chckbxStar.setBounds(1106, 402, 97, 23);
		frame.getContentPane().add(chckbxStar);
		
		JCheckBox chckbxStars = new JCheckBox("2 stars");
		chckbxStars.setBounds(1106, 425, 97, 23);
		frame.getContentPane().add(chckbxStars);
		
		JCheckBox chckbxStars_1 = new JCheckBox("3 stars");
		chckbxStars_1.setBounds(1106, 448, 97, 23);
		frame.getContentPane().add(chckbxStars_1);
		
		JCheckBox chckbxStars_2 = new JCheckBox("4 stars");
		chckbxStars_2.setBounds(1106, 469, 97, 23);
		frame.getContentPane().add(chckbxStars_2);
		
		JCheckBox chckbxStars_3 = new JCheckBox("5 stars");
		chckbxStars_3.setBounds(1106, 492, 97, 23);
		frame.getContentPane().add(chckbxStars_3);
		
		JCheckBox chckbxCleanlinness = new JCheckBox("Cleanlinness");
		chckbxCleanlinness.setBounds(1105, 552, 97, 23);
		frame.getContentPane().add(chckbxCleanlinness);
		
		JCheckBox chckbxDining = new JCheckBox("Dining");
		chckbxDining.setBounds(1105, 575, 97, 23);
		frame.getContentPane().add(chckbxDining);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setBounds(1105, 598, 97, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox chckbxRooms = new JCheckBox("Rooms");
		chckbxRooms.setBounds(1105, 621, 97, 23);
		frame.getContentPane().add(chckbxRooms);
		
		JLabel lblReviews = new JLabel("Reviews");
		lblReviews.setForeground(new Color(255, 255, 102));
		lblReviews.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblReviews.setBounds(1033, 570, 66, 28);
		frame.getContentPane().add(lblReviews);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 102));
		textField.setBounds(1159, 66, 151, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setForeground(new Color(255, 255, 102));
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(1211, 0, 36, 14);
		frame.getContentPane().add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1250, -1, 104, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Backgorung");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 1380, 720);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmHome = new JMenuItem("Home ");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnHome.add(mntmHome);
		
		JMenu mnContact_1 = new JMenu("Contact");
		mnHome.add(mnContact_1);
		
		JMenuItem mntmRoomCheif_1 = new JMenuItem("Room Cheif");
		mntmRoomCheif_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				KontaktAbu con= new KontaktAbu();
				con.setVisible(true);
			}
		});
		mnContact_1.add(mntmRoomCheif_1);
		
		JMenuItem mntmRestaurantCoffe = new JMenuItem("Restaurant & Coffe Cheif");
		mntmRestaurantCoffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KontaktObada con= new KontaktObada();
				con.setVisible(true);
			}
		});
		mnContact_1.add(mntmRestaurantCoffe);
		
		JMenuItem mntmInformationData_1 = new JMenuItem("Information & Data Cheif");
		mntmInformationData_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KontaktAmina con= new KontaktAmina();
				con.setVisible(true);
			}
		});
		mnContact_1.add(mntmInformationData_1);
		
		JMenuItem mntmPoolSauna_1 = new JMenuItem("Pool & Sauna Cheif");
		mntmPoolSauna_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KontaktNedzad con= new KontaktNedzad();
				con.setVisible(true);
			}
		});
		mnContact_1.add(mntmPoolSauna_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Gym & Parking Cheif");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KontaktMujo con= new KontaktMujo();
				con.setVisible(true);
			}
		});
		mnContact_1.add(mntmNewMenuItem);
		
		JMenuItem mntmMap = new JMenuItem("Map");
		mnHome.add(mntmMap);
		
		JMenu mnNewMenu = new JMenu("Reservation");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRoom = new JMenuItem("Room ***");
		mntmRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Room3 room= new Room3();
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
		
		JMenu mnServices = new JMenu("Services");
		menuBar.add(mnServices);
		
		JMenuItem mntmRestaurant = new JMenuItem("Restaurant");
		mnServices.add(mntmRestaurant);
		
		JMenuItem mntmCoffee = new JMenuItem("Coffee");
		mnServices.add(mntmCoffee);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Room Service");
		mnServices.add(mntmNewMenuItem_1);
		
		JMenu mnOther = new JMenu("Other");
		menuBar.add(mnOther);
		
		JMenuItem mntmPool = new JMenuItem("Pool");
		mnOther.add(mntmPool);
		
		JMenuItem mntmGym = new JMenuItem("Gym");
		mnOther.add(mntmGym);
		
		JMenuItem mntmMassage = new JMenuItem("Massage");
		mnOther.add(mntmMassage);
		
		JMenuItem mntmSauna = new JMenuItem("Sauna");
		mnOther.add(mntmSauna);
	}
}
