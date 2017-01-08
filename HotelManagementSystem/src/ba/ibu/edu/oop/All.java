package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import ba.ibu.edu.oop.SelectDate;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class All {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All window = new All();
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
	public All() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ROYAL HOTEL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(10, 0, 1332, 95);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Gym");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				GymManagementMain con= new GymManagementMain();
				 con.aa();
			}
		});
		btnNewButton.setBounds(10, 151, 257, 95);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Restaurant con= new Restaurant();
				 con.combe();
			}
		});
		btnRestaurant.setBounds(10, 269, 257, 95);
		frame.getContentPane().add(btnRestaurant);
		
		JButton btnCafe = new JButton("Cafe");
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Kafic con= new Kafic();
				 con.ee();
			}
		});
		btnCafe.setBounds(10, 388, 257, 95);
		frame.getContentPane().add(btnCafe);
		
		JButton btnBeerBar = new JButton("Beer Bar");
		btnBeerBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BeerBar con= new BeerBar();
				 con.ww();
			}
		});
		btnBeerBar.setBounds(414, 151, 257, 95);
		frame.getContentPane().add(btnBeerBar);
		
		JButton btnJewerlly = new JButton("Jewerlly");
		btnJewerlly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Jewerly con= new Jewerly();
				 con.qq();
			}
		});
		btnJewerlly.setBounds(414, 269, 257, 95);
		frame.getContentPane().add(btnJewerlly);
		
		JButton btnExchange = new JButton("Exchange");
		btnExchange.setBounds(414, 388, 257, 95);
		frame.getContentPane().add(btnExchange);
		
		JButton btnTrafika = new JButton("Trafika");
		
		btnTrafika.setBounds(862, 151, 257, 95);
		frame.getContentPane().add(btnTrafika);
		btnTrafika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Trafika con= new Trafika();
				 con.yy();
			}
		});
		JButton btnWatches = new JButton("Watches");
		btnWatches.setBounds(862, 269, 257, 95);
		frame.getContentPane().add(btnWatches);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.setBounds(1115, 600, 227, 71);
		frame.getContentPane().add(btnNewButton_1);
	}
}
