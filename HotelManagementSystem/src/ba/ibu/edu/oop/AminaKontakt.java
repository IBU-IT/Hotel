package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class AminaKontakt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AminaKontakt frame = new AminaKontakt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AminaKontakt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblAminaOsmanovic = new JLabel("Amina Osmanovic");
		lblAminaOsmanovic.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAminaOsmanovic.setBounds(175, 11, 144, 26);
		contentPane.add(lblAminaOsmanovic);
		
		JLabel lblHotelManao = new JLabel("HOTEL MANAO");
		lblHotelManao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHotelManao.setBounds(175, 33, 144, 14);
		contentPane.add(lblHotelManao);
		
		JLabel lblSarajevoCity = new JLabel("Sarajevo | City");
		lblSarajevoCity.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSarajevoCity.setBounds(175, 48, 144, 14);
		contentPane.add(lblSarajevoCity);

		
		JLabel label_1 = new JLabel("-------------------------------------------------------------------------------------------------------------");
		label_1.setBounds(0, 148, 462, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		Image imgs = new ImageIcon(this.getClass().getResource("/logo-hotel.png")).getImage();
		label_2.setIcon(new ImageIcon(imgs));
		label_2.setBounds(310, 50, 124, 98);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("Full Address:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 173, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFracncuskeRevolucijeBb = new JLabel("Safeta Hadzica 3, Sarajevo, Bosna");
		lblFracncuskeRevolucijeBb.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblFracncuskeRevolucijeBb.setBounds(108, 173, 210, 14);
		contentPane.add(lblFracncuskeRevolucijeBb);
		
		JLabel lblNewLabel_1 = new JLabel("Phone:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 192, 39, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("+387(61) 513486");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setBounds(108, 192, 113, 14);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("Fax:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 210, 22, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("+387(33) 154863");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_4.setBounds(108, 210, 93, 14);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 225, 30, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblAminaOsmanovichotmailcom = new JLabel("amina_osmanovic@hotmail.com");
		lblAminaOsmanovichotmailcom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblAminaOsmanovichotmailcom.setBounds(108, 225, 171, 14);
		contentPane.add(lblAminaOsmanovichotmailcom);
		
		JLabel lblRoomsCheif = new JLabel("Inf & Data Cheif");
		lblRoomsCheif.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblRoomsCheif.setBounds(175, 63, 119, 14);
		contentPane.add(lblRoomsCheif);
	}
	
	

}
