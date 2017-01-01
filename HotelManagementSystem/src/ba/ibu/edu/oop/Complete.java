package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class Complete {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Finish() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complete window = new Complete();
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
	public Complete() {
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
		
		JLabel lblComplete = new JLabel("COMPLETE");
		lblComplete.setForeground(SystemColor.activeCaption);
		lblComplete.setBounds(970, 11, 134, 50);
		frame.getContentPane().add(lblComplete);
		
		JLabel label_1 = new JLabel("SELECT NO. OF TICKETS");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setBounds(798, 11, 188, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("PERSONAL INFORMATION");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(621, 11, 182, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("SELECT TIME");
		label_3.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("VIEW PROMOTIONS");
		label_4.setForeground(Color.BLACK);
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(364, 11, 134, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("SELECT ATTRACTION");
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setForeground(Color.BLACK);
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("WELCOME");
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_7);
		
		JLabel lblReservationIsCompleted = new JLabel("RESERVATION IS COMPLETED!! THANK YOU!! SEE YOU SOON!!");
		lblReservationIsCompleted.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblReservationIsCompleted.setBounds(130, 171, 1008, 205);
		frame.getContentPane().add(lblReservationIsCompleted);
		
		JLabel lblForMoreInformtaion = new JLabel("FOR MORE INFORMTAION CONTACT: ");
		lblForMoreInformtaion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblForMoreInformtaion.setBounds(913, 486, 429, 41);
		frame.getContentPane().add(lblForMoreInformtaion);
		
		JLabel lblNedadGrbo = new JLabel("Ned\u017Ead Grbo- 061-222/333");
		lblNedadGrbo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNedadGrbo.setBounds(913, 519, 200, 26);
		frame.getContentPane().add(lblNedadGrbo);
		
		JLabel lblAminaMehanovi = new JLabel("Amina Mehanovi\u0107- 062-555/444");
		lblAminaMehanovi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAminaMehanovi.setBounds(913, 542, 200, 26);
		frame.getContentPane().add(lblAminaMehanovi);
		
		JLabel lblMujoHadimehanovi = new JLabel("Mujo Had\u017Eimehanovi\u0107- 062-369/963");
		lblMujoHadimehanovi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMujoHadimehanovi.setBounds(913, 568, 250, 26);
		frame.getContentPane().add(lblMujoHadimehanovi);
		
		JLabel lblAbdurahmanAlmonajed = new JLabel("Abdurahman Almonajed- 061-091/675");
		lblAbdurahmanAlmonajed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAbdurahmanAlmonajed.setBounds(913, 593, 278, 26);
		frame.getContentPane().add(lblAbdurahmanAlmonajed);
		
		JLabel lblObadaAlmonajed = new JLabel("Obada Almonajed- 062-318/378");
		lblObadaAlmonajed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObadaAlmonajed.setBounds(913, 619, 200, 26);
		frame.getContentPane().add(lblObadaAlmonajed);
	}

}
