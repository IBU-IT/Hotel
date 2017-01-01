package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoOfTic {

	private JFrame frame;
	private JTextField prvi;
	private JTextField drugi;
	private JTextField treci;

	/**
	 * Launch the application.
	 */
	public static void No() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoOfTic window = new NoOfTic();
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
	public NoOfTic() {
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
		label_1.setForeground(SystemColor.activeCaption);
		label_1.setBounds(798, 11, 188, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("PERSONAL INFORMATION");
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBounds(621, 11, 182, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("SELECT TIME");
		label_3.setBounds(508, 11, 134, 50);
		frame.getContentPane().add(label_3);
		
		JLabel kraj = new JLabel("");
		kraj.setFont(new Font("Tahoma", Font.BOLD, 15));
		kraj.setBounds(1096, 545, 109, 41);
		frame.getContentPane().add(kraj);
		
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
		
		JLabel lblTicketInformation = new JLabel("TICKET INFORMATION");
		lblTicketInformation.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTicketInformation.setBounds(10, 136, 457, 306);
		frame.getContentPane().add(lblTicketInformation);
		
		JLabel lblToContinuePlease = new JLabel("To continue, please key in the required number of tickets for each ticket type. ");
		lblToContinuePlease.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToContinuePlease.setBounds(645, 113, 590, 32);
		frame.getContentPane().add(lblToContinuePlease);
		
		JLabel lblPleaseNoteDue = new JLabel("Please note due to the current availability you can now book up to  10 tickets.");
		lblPleaseNoteDue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseNoteDue.setBounds(645, 156, 554, 21);
		frame.getContentPane().add(lblPleaseNoteDue);
		
		JLabel lblPleaseSelectAt = new JLabel("Please select at least one Adult ticket when purchasing a Child or Infant ticket. You may book up to 5 ");
		lblPleaseSelectAt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseSelectAt.setBounds(645, 200, 679, 21);
		frame.getContentPane().add(lblPleaseSelectAt);
		
		JLabel lblInfantTickets = new JLabel("Infant tickets.");
		lblInfantTickets.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInfantTickets.setBounds(645, 219, 174, 21);
		frame.getContentPane().add(lblInfantTickets);
		
		JLabel lblType = new JLabel("TYPE");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblType.setBounds(645, 267, 98, 32);
		frame.getContentPane().add(lblType);
		
		JLabel lblSunriseAdult = new JLabel("Sunrise Adult");
		lblSunriseAdult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSunriseAdult.setBounds(645, 310, 109, 41);
		frame.getContentPane().add(lblSunriseAdult);
		
		JLabel lblYears = new JLabel("(12 years+)");
		lblYears.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYears.setBounds(645, 341, 98, 32);
		frame.getContentPane().add(lblYears);
		
		JLabel lblSunriseChild = new JLabel("Sunrise Child");
		lblSunriseChild.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSunriseChild.setBounds(645, 384, 98, 32);
		frame.getContentPane().add(lblSunriseChild);
		
		JLabel label_8 = new JLabel("(4 - 12 years)");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(645, 415, 98, 26);
		frame.getContentPane().add(label_8);
		
		JLabel lblSunriseInfant = new JLabel("Sunrise Infant ");
		lblSunriseInfant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSunriseInfant.setBounds(645, 464, 92, 26);
		frame.getContentPane().add(lblSunriseInfant);
		
		JLabel lblbelowYears = new JLabel("(Below 4 years)");
		lblbelowYears.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblbelowYears.setBounds(645, 501, 109, 21);
		frame.getContentPane().add(lblbelowYears);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setBounds(790, 267, 98, 32);
		frame.getContentPane().add(lblQuantity);
		
		prvi = new JTextField();
		prvi.setBounds(798, 329, 60, 32);
		frame.getContentPane().add(prvi);
		prvi.setColumns(10);
		
		drugi = new JTextField();
		drugi.setColumns(10);
		drugi.setBounds(798, 398, 60, 32);
		frame.getContentPane().add(drugi);
		
		treci = new JTextField();
		treci.setColumns(10);
		treci.setBounds(798, 480, 60, 32);
		frame.getContentPane().add(treci);
		
		JLabel lblPricePerTicket = new JLabel("PRICE PER TICKET");
		lblPricePerTicket.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPricePerTicket.setBounds(929, 267, 141, 32);
		frame.getContentPane().add(lblPricePerTicket);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(889, 330, 22, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_9 = new JLabel("X");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(889, 400, 22, 26);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("X");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(889, 480, 22, 26);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("130.00");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(970, 330, 60, 32);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("100.00");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(970, 400, 60, 32);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("00.00");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(970, 480, 60, 32);
		frame.getContentPane().add(label_13);
		
		JLabel lblFeePerTicket = new JLabel("FEE PER TICKET");
		lblFeePerTicket.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFeePerTicket.setBounds(1096, 267, 141, 32);
		frame.getContentPane().add(lblFeePerTicket);
		
		JLabel label_14 = new JLabel("+");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBounds(1069, 330, 22, 26);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("+");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setBounds(1069, 400, 22, 26);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("+");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_16.setBounds(1069, 480, 22, 26);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("05.00");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(1133, 330, 60, 32);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("05.00");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(1133, 400, 60, 32);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("00.00");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(1133, 480, 60, 32);
		frame.getContentPane().add(label_19);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double jedan=Double.parseDouble(prvi.getText());
				double dva=Double.parseDouble(drugi.getText());
				
				double rezultat=(jedan*130);
				double rezultat2=(dva*100);
				double rezultat_1=(jedan*5);
				double rezultat2_1=(dva*5);
				double total_1=rezultat_1+rezultat2_1;
				double total=rezultat+rezultat2;
				double tt=total_1+total;
				String tot=String.format("%.2f", tt);
				kraj.setText(tot);
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTotal.setBounds(1203, 391, 139, 50);
		frame.getContentPane().add(btnTotal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(641, 540, 558, 10);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(645, 545, 109, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Complete aa=new Complete();
				aa.Finish();
			}
		});
		button.setBounds(1154, 597, 188, 73);
		frame.getContentPane().add(button);
		
		
	}
}
