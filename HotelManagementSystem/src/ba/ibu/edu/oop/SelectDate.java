package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class SelectDate {

	private JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectDate window = new SelectDate();
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
	public SelectDate() {
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
		
		JLabel Dan = new JLabel("01");
		Dan.setForeground(SystemColor.desktop);
		Dan.setBackground(Color.WHITE);
		Dan.setFont(new Font("Tahoma", Font.BOLD, 60));
		Dan.setHorizontalAlignment(SwingConstants.CENTER);
		Dan.setBounds(10, 268, 148, 151);
		frame.getContentPane().add(Dan);
		
		JLabel Datum = new JLabel("JAN");
		Datum.setForeground(SystemColor.desktop);
		Datum.setHorizontalAlignment(SwingConstants.CENTER);
		Datum.setFont(new Font("Tahoma", Font.BOLD, 60));
		Datum.setBounds(183, 268, 148, 151);
		frame.getContentPane().add(Datum);
		
		JLabel lblS = new JLabel("P");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setBounds(388, 72, 76, 36);
		frame.getContentPane().add(lblS);
		
		JLabel lblM = new JLabel("U");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblM.setBounds(474, 72, 76, 36);
		frame.getContentPane().add(lblM);
		
		JLabel lblT = new JLabel("S");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblT.setBounds(560, 72, 76, 36);
		frame.getContentPane().add(lblT);
		
		JLabel lblW = new JLabel("\u010C");
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		lblW.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblW.setBounds(646, 72, 76, 36);
		frame.getContentPane().add(lblW);
		
		JLabel lblT_1 = new JLabel("P");
		lblT_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblT_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblT_1.setBounds(732, 72, 76, 36);
		frame.getContentPane().add(lblT_1);
		
		JLabel lblF = new JLabel("S");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblF.setBounds(818, 72, 76, 36);
		frame.getContentPane().add(lblF);
		
		JLabel lblN = new JLabel("N");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN.setBounds(904, 72, 76, 36);
		frame.getContentPane().add(lblN);
		
		JButton prvi = new JButton("01");
		prvi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		prvi.setForeground(new Color(0, 0, 0));
		prvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("01");
			}
		});
		prvi.setBounds(914, 119, 66, 50);
		frame.getContentPane().add(prvi);
		
		JButton drugi = new JButton("02");
		drugi.setForeground(new Color(0, 0, 0));
		drugi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("02");
			}
		});
		drugi.setBounds(398, 180, 66, 50);
		frame.getContentPane().add(drugi);
		
		JButton treci = new JButton("03");
		treci.setForeground(new Color(0, 0, 0));
		treci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("03");
			}
		});
		treci.setBounds(484, 180, 66, 50);
		frame.getContentPane().add(treci);
		
		JButton cetvri = new JButton("04");
		cetvri.setForeground(new Color(0, 0, 0));
		cetvri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("04");
			}
		});
		cetvri.setBounds(570, 180, 66, 50);
		frame.getContentPane().add(cetvri);
		
		JButton peti = new JButton("05");
		peti.setForeground(new Color(0, 0, 0));
		peti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("05");
			}
		});
		peti.setBounds(656, 180, 66, 50);
		frame.getContentPane().add(peti);
		
		JButton sesti = new JButton("06");
		sesti.setForeground(new Color(0, 0, 0));
		sesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("06");
			}
		});
		sesti.setBounds(742, 180, 66, 50);
		frame.getContentPane().add(sesti);
		
		JButton sedmi = new JButton("07");
		sedmi.setForeground(new Color(0, 0, 0));
		sedmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("07");
			}
		});
		sedmi.setBounds(828, 180, 66, 50);
		frame.getContentPane().add(sedmi);
		
		JButton osmi = new JButton("08");
		osmi.setForeground(new Color(0, 0, 0));
		osmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("08");
			}
		});
		osmi.setBounds(914, 180, 66, 50);
		frame.getContentPane().add(osmi);
		
		JButton deveti = new JButton("09");
		deveti.setForeground(new Color(0, 0, 0));
		deveti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("09");
			}
		});
		deveti.setBounds(398, 246, 66, 50);
		frame.getContentPane().add(deveti);
		
		JButton deseti = new JButton("10");
		deseti.setForeground(new Color(0, 0, 0));
		deseti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("10");
			}
		});
		deseti.setBounds(484, 246, 66, 50);
		frame.getContentPane().add(deseti);
		
		JButton jedanaesti = new JButton("11");
		jedanaesti.setForeground(new Color(0, 0, 0));
		jedanaesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("11");
			}
		});
		jedanaesti.setBounds(570, 246, 66, 50);
		frame.getContentPane().add(jedanaesti);
		
		JButton dvanaesti = new JButton("12");
		dvanaesti.setForeground(new Color(0, 0, 0));
		dvanaesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("12");
			}
		});
		dvanaesti.setBounds(656, 246, 66, 50);
		frame.getContentPane().add(dvanaesti);
		
		JButton trinaesti = new JButton("13");
		trinaesti.setForeground(new Color(0, 0, 0));
		trinaesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("13");
			}
		});
		trinaesti.setBounds(742, 246, 66, 50);
		frame.getContentPane().add(trinaesti);
		
		JButton cetrnaesti = new JButton("14");
		cetrnaesti.setForeground(new Color(0, 0, 0));
		cetrnaesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("14");
			}
		});
		cetrnaesti.setBounds(828, 246, 66, 50);
		frame.getContentPane().add(cetrnaesti);
		
		JButton petnaesti = new JButton("15");
		petnaesti.setForeground(new Color(0, 0, 0));
		petnaesti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("15");
			}
		});
		petnaesti.setBounds(914, 246, 66, 50);
		frame.getContentPane().add(petnaesti);
		
		JButton sestanest = new JButton("16");
		sestanest.setForeground(new Color(0, 0, 0));
		sestanest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("16");
			}
		});
		sestanest.setBounds(398, 316, 66, 50);
		frame.getContentPane().add(sestanest);
		
		JButton sedamnaest = new JButton("17");
		sedamnaest.setForeground(new Color(0, 0, 0));
		sedamnaest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("17");
			}
		});
		sedamnaest.setBounds(484, 316, 66, 50);
		frame.getContentPane().add(sedamnaest);
		
		JButton omsanaest = new JButton("18");
		omsanaest.setForeground(new Color(0, 0, 0));
		omsanaest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("18");
			}
		});
		omsanaest.setBounds(570, 316, 66, 50);
		frame.getContentPane().add(omsanaest);
		
		JButton devetnaest = new JButton("19");
		devetnaest.setForeground(new Color(0, 0, 0));
		devetnaest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("19");
			}
		});
		devetnaest.setBounds(656, 316, 66, 50);
		frame.getContentPane().add(devetnaest);
		
		JButton dvadeset = new JButton("20");
		dvadeset.setForeground(new Color(0, 0, 0));
		dvadeset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("20");
			}
		});
		dvadeset.setBounds(742, 316, 66, 50);
		frame.getContentPane().add(dvadeset);
		
		JButton dvadesetjedan = new JButton("21");
		dvadesetjedan.setForeground(new Color(0, 0, 0));
		dvadesetjedan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("21");
			}
		});
		dvadesetjedan.setBounds(828, 316, 66, 50);
		frame.getContentPane().add(dvadesetjedan);
		
		JButton dvadesetdva = new JButton("22");
		dvadesetdva.setForeground(new Color(0, 0, 0));
		dvadesetdva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("22");
			}
		});
		dvadesetdva.setBounds(914, 316, 66, 50);
		frame.getContentPane().add(dvadesetdva);
		
		JButton dvadesettri = new JButton("23");
		dvadesettri.setForeground(new Color(0, 0, 0));
		dvadesettri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("23");
			}
		});
		dvadesettri.setBounds(398, 387, 66, 50);
		frame.getContentPane().add(dvadesettri);
		
		JButton dvadesetcetri = new JButton("24");
		dvadesetcetri.setForeground(new Color(0, 0, 0));
		dvadesetcetri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("24");
			}
		});
		dvadesetcetri.setBounds(484, 387, 66, 50);
		frame.getContentPane().add(dvadesetcetri);
		
		JButton dvadesetpet = new JButton("25");
		dvadesetpet.setForeground(new Color(0, 0, 0));
		dvadesetpet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("25");
			}
		});
		dvadesetpet.setBounds(570, 387, 66, 50);
		frame.getContentPane().add(dvadesetpet);
		
		JButton dvadesetsest = new JButton("26");
		dvadesetsest.setForeground(new Color(0, 0, 0));
		dvadesetsest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("26");
			}
		});
		dvadesetsest.setBounds(656, 387, 66, 50);
		frame.getContentPane().add(dvadesetsest);
		
		JButton dvadesetsedam = new JButton("27");
		dvadesetsedam.setForeground(new Color(0, 0, 0));
		dvadesetsedam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("27");
			}
		});
		dvadesetsedam.setBounds(742, 387, 66, 50);
		frame.getContentPane().add(dvadesetsedam);
		
		JButton dvadesetosam = new JButton("28");
		dvadesetosam.setForeground(new Color(0, 0, 0));
		dvadesetosam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("28");
			}
		});
		dvadesetosam.setBounds(828, 387, 66, 50);
		frame.getContentPane().add(dvadesetosam);
		
		JButton dvadesetdevet = new JButton("29");
		dvadesetdevet.setForeground(new Color(0, 0, 0));
		dvadesetdevet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("29");
			}
		});
		dvadesetdevet.setBounds(914, 387, 66, 50);
		frame.getContentPane().add(dvadesetdevet);
		
		JButton trideset = new JButton("30");
		trideset.setForeground(new Color(0, 0, 0));
		trideset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("30");
			}
		});
		trideset.setBounds(398, 448, 66, 50);
		frame.getContentPane().add(trideset);
		
		JButton tridesetjedan = new JButton("31");
		tridesetjedan.setForeground(new Color(0, 0, 0));
		tridesetjedan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dan.setText("31");
			}
		});
		tridesetjedan.setBounds(484, 448, 66, 50);
		frame.getContentPane().add(tridesetjedan);
		
		JButton button_2 = new JButton("NEXT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Izaberi1 nw= new Izaberi1();
				nw.NewScreen2();
			}
		});
		button_2.setBounds(1154, 598, 188, 73);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("MONTH");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1044, 72, 208, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton januar = new JButton("January");
		januar.setForeground(new Color(102, 102, 102));
		januar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi.setBounds(914, 119, 66, 50);
				drugi.setBounds(398, 180, 66, 50);
				treci.setBounds(484, 180, 66, 50);
				cetvri.setBounds(570, 180, 66, 50);
				peti.setBounds(656, 180, 66, 50);
				sesti.setBounds(742, 180, 66, 50);
				sedmi.setBounds(828, 180, 66, 50);
				osmi.setBounds(914, 180, 66, 50);
				
				deveti.setBounds(398, 246, 66, 50);
				deseti.setBounds(484, 246, 66, 50);
				jedanaesti.setBounds(570, 246, 66, 50);
				dvanaesti.setBounds(656, 246, 66, 50);
				trinaesti.setBounds(742, 246, 66, 50);
				cetrnaesti.setBounds(828, 246, 66, 50);
				petnaesti.setBounds(914, 246, 66, 50);
				
				sestanest.setBounds(398, 316, 66, 50);
				sedamnaest.setBounds(484, 316, 66, 50);
				omsanaest.setBounds(570, 316, 66, 50);
				devetnaest.setBounds(656, 316, 66, 50);
				dvadeset.setBounds(742, 316, 66, 50);
				dvadesetjedan.setBounds(828, 316, 66, 50);
				dvadesetdva.setBounds(914, 316, 66, 50);
				
				dvadesettri.setBounds(398, 387, 66, 50);
				dvadesetcetri.setBounds(484, 387, 66, 50);
				dvadesetpet.setBounds(570, 387, 66, 50);
				dvadesetsest.setBounds(656, 387, 66, 50);
				dvadesetsedam.setBounds(742, 387, 66, 50);
				dvadesetosam.setBounds(828, 387, 66, 50);
				dvadesetdevet.setBounds(914, 387, 66, 50);
				
				trideset.setBounds(398, 448, 66, 50);
				tridesetjedan.setBounds(484, 448, 66, 50);
				
				Datum.setText("JAN");

  
			}
		});
		januar.setFont(new Font("Tahoma", Font.BOLD, 15));
		januar.setBounds(1078, 120, 134, 30);
		frame.getContentPane().add(januar);
		
		JButton februar = new JButton("February ");
		februar.setForeground(new Color(102, 102, 102));
		februar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(570, 119, 66, 50);
				drugi.setBounds(656, 119, 66, 50);
				treci.setBounds(742, 119, 66, 50);
				cetvri.setBounds(828, 119, 66, 50);
				peti.setBounds(914, 119, 66, 50);
				sesti.setBounds(398, 180, 66, 50);
				sedmi.setBounds(484, 180, 66, 50);
				osmi.setBounds(570, 180, 66, 50);
				deveti.setBounds(656, 180, 66, 50);
				deseti.setBounds(742, 180, 66, 50);
				jedanaesti.setBounds(828, 180, 66, 50);
				dvanaesti.setBounds(914, 180, 66, 50);
				trinaesti.setBounds(398, 246, 66, 50);
				cetrnaesti.setBounds(484, 246, 66, 50);
				petnaesti.setBounds(570, 246, 66, 50);
				sestanest.setBounds(656, 246, 66, 50);
				sedamnaest.setBounds(742, 246, 66, 50);
				omsanaest.setBounds(828, 246, 66, 50);
				devetnaest.setBounds(914, 246, 66, 50);
				dvadeset.setBounds(398, 316, 66, 50);
				dvadesetjedan.setBounds(484, 316, 66, 50);
				dvadesetdva.setBounds(570, 316, 66, 50);
				dvadesettri.setBounds(656, 316, 66, 50);
				dvadesetcetri.setBounds(742, 316, 66, 50);
				dvadesetpet.setBounds(828, 316, 66, 50);
				dvadesetsest.setBounds(914, 316, 66, 50);
				dvadesetsedam.setBounds(398, 387, 66, 50);
				dvadesetosam.setBounds(484, 387, 66, 50);
				dvadesetdevet.setBounds(570, 387, 0, 0);
				trideset.setBounds(656, 448, 0, 0);
				tridesetjedan.setBounds(742, 448, 0, 0);
				Datum.setText("Feb");
				Dan.setText("01");
			}
		});
		februar.setFont(new Font("Tahoma", Font.BOLD, 15));
		februar.setBounds(1078, 155, 134, 30);
		frame.getContentPane().add(februar);
		
		JButton mart = new JButton("March ");
		mart.setForeground(new Color(102, 102, 102));
		mart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi.setBounds(570, 119, 66, 50);
				drugi.setBounds(656, 119, 66, 50);
				treci.setBounds(742, 119, 66, 50);
				cetvri.setBounds(828, 119, 66, 50);
				peti.setBounds(914, 119, 66, 50);
				sesti.setBounds(398, 180, 66, 50);
				sedmi.setBounds(484, 180, 66, 50);
				osmi.setBounds(570, 180, 66, 50);
				deveti.setBounds(656, 180, 66, 50);
				deseti.setBounds(742, 180, 66, 50);
				jedanaesti.setBounds(828, 180, 66, 50);
				dvanaesti.setBounds(914, 180, 66, 50);
				trinaesti.setBounds(398, 246, 66, 50);
				cetrnaesti.setBounds(484, 246, 66, 50);
				petnaesti.setBounds(570, 246, 66, 50);
				sestanest.setBounds(656, 246, 66, 50);
				sedamnaest.setBounds(742, 246, 66, 50);
				omsanaest.setBounds(828, 246, 66, 50);
				devetnaest.setBounds(914, 246, 66, 50);
				dvadeset.setBounds(398, 316, 66, 50);
				dvadesetjedan.setBounds(484, 316, 66, 50);
				dvadesetdva.setBounds(570, 316, 66, 50);
				dvadesettri.setBounds(656, 316, 66, 50);
				dvadesetcetri.setBounds(742, 316, 66, 50);
				dvadesetpet.setBounds(828, 316, 66, 50);
				dvadesetsest.setBounds(914, 316, 66, 50);
				dvadesetsedam.setBounds(398, 387, 66, 50);
				dvadesetosam.setBounds(484, 387, 66, 50);
				dvadesetdevet.setBounds(570, 387, 66, 50);
				trideset.setBounds(656, 387, 66, 50);
				tridesetjedan.setBounds(742, 387, 66, 50);
				Datum.setText("Mar");
				Dan.setText("01");
			}
		});
		mart.setFont(new Font("Tahoma", Font.BOLD, 15));
		mart.setBounds(1078, 190, 134, 30);
		frame.getContentPane().add(mart);
		
		JButton april = new JButton("April");
		april.setForeground(new Color(102, 102, 102));
		april.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(828, 119, 66, 50);
				drugi.setBounds(914, 119, 66, 50);
				treci.setBounds(398, 180, 66, 50);
				cetvri.setBounds(484, 180, 66, 50);
				peti.setBounds(570, 180, 66, 50);
				sesti.setBounds(656, 180, 66, 50);
				sedmi.setBounds(742, 180, 66, 50);
				osmi.setBounds(828, 180, 66, 50);
				deveti.setBounds(914, 180, 66, 50);
				deseti.setBounds(398, 246, 66, 50);
				jedanaesti.setBounds(484, 246, 66, 50);
				dvanaesti.setBounds(570, 246, 66, 50);
				trinaesti.setBounds(656, 246, 66, 50);
				cetrnaesti.setBounds(740, 246, 66, 50);
				petnaesti.setBounds(828, 246, 66, 50);
				sestanest.setBounds(914, 246, 66, 50);
				sedamnaest.setBounds(398, 316, 66, 50);
				omsanaest.setBounds(484, 316, 66, 50);
				devetnaest.setBounds(570, 316, 66, 50);
				dvadeset.setBounds(656, 316, 66, 50);
				dvadesetjedan.setBounds(740, 316, 66, 50);
				dvadesetdva.setBounds(828, 316, 66, 50);
				dvadesettri.setBounds(914, 316, 66, 50);
				dvadesetcetri.setBounds(398, 387, 66, 50);
				dvadesetpet.setBounds(484, 387, 66, 50);
				dvadesetsest.setBounds(570, 387, 66, 50);
				dvadesetsedam.setBounds(656, 387, 66, 50);
				dvadesetosam.setBounds(742, 387, 66, 50);
				dvadesetdevet.setBounds(828, 387, 66, 50);
				trideset.setBounds(914, 387, 66, 50);
				tridesetjedan.setBounds(398, 387, 0, 0);
				Datum.setText("Apr");
				Dan.setText("01");
			}
		});
		april.setFont(new Font("Tahoma", Font.BOLD, 15));
		april.setBounds(1078, 225, 134, 30);
		frame.getContentPane().add(april);
		
		JButton maj = new JButton("May");
		maj.setForeground(new Color(102, 102, 102));
		maj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(398, 119, 66, 50);
				drugi.setBounds(484, 119, 66, 50);
				treci.setBounds(570, 119, 66, 50);
				cetvri.setBounds(656, 119, 66, 50);
				peti.setBounds(742, 119, 66, 50);
				sesti.setBounds(828, 119, 66, 50);
				sedmi.setBounds(914, 119, 66, 50);
				osmi.setBounds(398, 180, 66, 50);
				deveti.setBounds(484, 180, 66, 50);
				deseti.setBounds(570, 180, 66, 50);
				jedanaesti.setBounds(656, 180, 66, 50);
				dvanaesti.setBounds(742, 180, 66, 50);
				trinaesti.setBounds(828, 180, 66, 50);
				cetrnaesti.setBounds(914, 180, 66, 50);
				petnaesti.setBounds(398, 246, 66, 50);
				sestanest.setBounds(484, 246, 66, 50);
				sedamnaest.setBounds(570, 246, 66, 50);
				omsanaest.setBounds(656, 246, 66, 50);
				devetnaest.setBounds(742, 246, 66, 50);
				dvadeset.setBounds(828, 246, 66, 50);
				dvadesetjedan.setBounds(914, 246, 66, 50);
				dvadesetdva.setBounds(398, 316, 66, 50);
				dvadesettri.setBounds(484, 316, 66, 50);
				dvadesetcetri.setBounds(570, 316, 66, 50);
				dvadesetpet.setBounds(656, 316, 66, 50);
				dvadesetsest.setBounds(742, 316, 66, 50);
				dvadesetsedam.setBounds(828, 316, 66, 50);
				dvadesetosam.setBounds(914, 316, 66, 50);
				dvadesetdevet.setBounds(398, 387, 66, 50);
				trideset.setBounds(484, 387, 66, 50);
				tridesetjedan.setBounds(570, 387, 66, 50);
				Datum.setText("May");
				Dan.setText("01");
			}
		});
		maj.setFont(new Font("Tahoma", Font.BOLD, 15));
		maj.setBounds(1078, 260, 134, 30);
		frame.getContentPane().add(maj);
		
		JButton juni = new JButton("June");
		juni.setForeground(new Color(102, 102, 102));
		juni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(656, 119, 66, 50);
				drugi.setBounds(742, 119, 66, 50);
				treci.setBounds(828, 119, 66, 50);
				cetvri.setBounds(914, 119, 66, 50);
				peti.setBounds(398, 180, 66, 50);
				sesti.setBounds(484, 180, 66, 50);
				sedmi.setBounds(570, 180, 66, 50);
				osmi.setBounds(656, 180, 66, 50);
				deveti.setBounds(742, 180, 66, 50);
				deseti.setBounds(828, 180, 66, 50);
				jedanaesti.setBounds(914, 180, 66, 50);
				dvanaesti.setBounds(398, 246, 66, 50);
				trinaesti.setBounds(484, 246, 66, 50);
				cetrnaesti.setBounds(570, 246, 66, 50);
				petnaesti.setBounds(656, 246, 66, 50);
				sestanest.setBounds(742, 246, 66, 50);
				sedamnaest.setBounds(828, 246, 66, 50);
				omsanaest.setBounds(914, 246, 66, 50);
				devetnaest.setBounds(398, 316, 66, 50);
				dvadeset.setBounds(484, 316, 66, 50);
				dvadesetjedan.setBounds(570, 316, 66, 50);
				dvadesetdva.setBounds(656, 316, 66, 50);
				dvadesettri.setBounds(742, 316, 66, 50);
				dvadesetcetri.setBounds(828, 316, 66, 50);
				dvadesetpet.setBounds(914, 316, 66, 50);
				dvadesetsest.setBounds(398, 387, 66, 50);
				dvadesetsedam.setBounds(484, 387, 66, 50);
				dvadesetosam.setBounds(570, 387, 66, 50);
				dvadesetdevet.setBounds(656, 387, 66, 50);
				trideset.setBounds(742, 387, 66, 50);
				tridesetjedan.setBounds(828, 387, 0, 0);
				Datum.setText("Jun");
				Dan.setText("01");
			}
		});
		juni.setFont(new Font("Tahoma", Font.BOLD, 15));
		juni.setBounds(1078, 295, 134, 30);
		frame.getContentPane().add(juni);
		
		JButton juli = new JButton("July");
		juli.setForeground(new Color(102, 102, 102));
		juli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(828, 119, 66, 50);
				drugi.setBounds(914, 119, 66, 50);
				treci.setBounds(398, 180, 66, 50);
				cetvri.setBounds(484, 180, 66, 50);
				peti.setBounds(570, 180, 66, 50);
				sesti.setBounds(656, 180, 66, 50);
				sedmi.setBounds(742, 180, 66, 50);
				osmi.setBounds(828, 180, 66, 50);
				deveti.setBounds(914, 180, 66, 50);
				deseti.setBounds(398, 246, 66, 50);
				jedanaesti.setBounds(484, 246, 66, 50);
				dvanaesti.setBounds(570, 246, 66, 50);
				trinaesti.setBounds(656, 246, 66, 50);
				cetrnaesti.setBounds(742, 246, 66, 50);
				petnaesti.setBounds(828, 246, 66, 50);
				sestanest.setBounds(914, 246, 66, 50);
				sedamnaest.setBounds(398, 316, 66, 50);
				omsanaest.setBounds(484, 316, 66, 50);
				devetnaest.setBounds(570, 316, 66, 50);
				dvadeset.setBounds(656, 316, 66, 50);
				dvadesetjedan.setBounds(742, 316, 66, 50);
				dvadesetdva.setBounds(828, 316, 66, 50);
				dvadesettri.setBounds(914, 316, 66, 50);
				dvadesetcetri.setBounds(398, 387, 66, 50);
				dvadesetpet.setBounds(484, 387, 66, 50);
				dvadesetsest.setBounds(570, 387, 66, 50);
				dvadesetsedam.setBounds(656, 387, 66, 50);
				dvadesetosam.setBounds(742, 387, 66, 50);
				dvadesetdevet.setBounds(828, 387, 66, 50);
				trideset.setBounds(914, 387, 66, 50);
				tridesetjedan.setBounds(398, 448, 66, 50);
				Datum.setText("Jul");
				Dan.setText("01");
			}
		});
		juli.setFont(new Font("Tahoma", Font.BOLD, 15));
		juli.setBounds(1078, 330, 134, 30);
		frame.getContentPane().add(juli);
		
		JButton august = new JButton("August ");
		august.setForeground(new Color(102, 102, 102));
		august.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(484, 119, 66, 50);
				drugi.setBounds(570, 119, 66, 50);
				treci.setBounds(656, 119, 66, 50);
				cetvri.setBounds(742, 119, 66, 50);
				peti.setBounds(828, 119, 66, 50);
				sesti.setBounds(914, 119, 66, 50);
				sedmi.setBounds(398, 180, 66, 50);
				osmi.setBounds(484, 180, 66, 50);
				deveti.setBounds(570, 180, 66, 50);
				deseti.setBounds(656, 180, 66, 50);
				jedanaesti.setBounds(742, 180, 66, 50);
				dvanaesti.setBounds(828, 180, 66, 50);
				trinaesti.setBounds(914, 180, 66, 50);
				cetrnaesti.setBounds(398, 246, 66, 50);
				petnaesti.setBounds(484, 246, 66, 50);
				sestanest.setBounds(570, 246, 66, 50);
				sedamnaest.setBounds(656, 246, 66, 50);
				omsanaest.setBounds(742, 246, 66, 50);
				devetnaest.setBounds(828, 246, 66, 50);
				dvadeset.setBounds(914, 246, 66, 50);
				dvadesetjedan.setBounds(398, 316, 66, 50);
				dvadesetdva.setBounds(484, 316, 66, 50);
				dvadesettri.setBounds(570, 316, 66, 50);
				dvadesetcetri.setBounds(656, 316, 66, 50);
				dvadesetpet.setBounds(742, 316, 66, 50);
				dvadesetsest.setBounds(828, 316, 66, 50);
				dvadesetsedam.setBounds(914, 316, 66, 50);
				dvadesetosam.setBounds(398, 387, 66, 50);
				dvadesetdevet.setBounds(484, 387, 66, 50);
				trideset.setBounds(570, 387, 66, 50);
				tridesetjedan.setBounds(656, 387, 66, 50);
				Datum.setText("Aug");
				Dan.setText("01");
			}
		});
		august.setFont(new Font("Tahoma", Font.BOLD, 15));
		august.setBounds(1078, 365, 134, 30);
		frame.getContentPane().add(august);
		
		JButton septembar = new JButton("September");
		septembar.setForeground(new Color(102, 102, 102));
		septembar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(742, 119, 66, 50);
				drugi.setBounds(828, 119, 66, 50);
				treci.setBounds(914, 119, 66, 50);
				cetvri.setBounds(398, 180, 66, 50);
				peti.setBounds(484, 180, 66, 50);
				sesti.setBounds(570, 180, 66, 50);
				sedmi.setBounds(656, 180, 66, 50);
				osmi.setBounds(742, 180, 66, 50);
				deveti.setBounds(828, 180, 66, 50);
				deseti.setBounds(914, 180, 66, 50);
				jedanaesti.setBounds(398, 246, 66, 50);
				dvanaesti.setBounds(484, 246, 66, 50);
				trinaesti.setBounds(570, 246, 66, 50);
				cetrnaesti.setBounds(656, 246, 66, 50);
				petnaesti.setBounds(740, 246, 66, 50);
				sestanest.setBounds(828, 246, 66, 50);
				sedamnaest.setBounds(914, 246, 66, 50);
				omsanaest.setBounds(398, 316, 66, 50);
				devetnaest.setBounds(484, 316, 66, 50);
				dvadeset.setBounds(570, 316, 66, 50);
				dvadesetjedan.setBounds(656, 316, 66, 50);
				dvadesetdva.setBounds(742, 316, 66, 50);
				dvadesettri.setBounds(828, 316, 66, 50);
				dvadesetcetri.setBounds(914, 316, 66, 50);
				dvadesetpet.setBounds(398, 387, 66, 50);
				dvadesetsest.setBounds(484, 387, 66, 50);
				dvadesetsedam.setBounds(570, 387, 66, 50);
				dvadesetosam.setBounds(656, 387, 66, 50);
				dvadesetdevet.setBounds(742, 387, 66, 50);
				trideset.setBounds(828, 387, 66, 50);
				tridesetjedan.setBounds(914, 387, 0, 0);
				Datum.setText("Sep");
				Dan.setText("01");
			}
		});
		septembar.setFont(new Font("Tahoma", Font.BOLD, 15));
		septembar.setBounds(1078, 400, 134, 30);
		frame.getContentPane().add(septembar);
		
		JButton oktobar = new JButton("October ");
		oktobar.setForeground(new Color(102, 102, 102));
		oktobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(914, 119, 66, 50);
				drugi.setBounds(398, 180, 66, 50);
				treci.setBounds(484, 180, 66, 50);
				cetvri.setBounds(570, 180, 66, 50);
				peti.setBounds(656, 180, 66, 50);
				sesti.setBounds(742, 180, 66, 50);
				sedmi.setBounds(828, 180, 66, 50);
				osmi.setBounds(914, 180, 66, 50);
				deveti.setBounds(398, 246, 66, 50);
				deseti.setBounds(484, 246, 66, 50);
				jedanaesti.setBounds(570, 246, 66, 50);
				dvanaesti.setBounds(656, 246, 66, 50);
				trinaesti.setBounds(742, 246, 66, 50);
				cetrnaesti.setBounds(828, 246, 66, 50);
				petnaesti.setBounds(914, 246, 66, 50);
				sestanest.setBounds(398, 316, 66, 50);
				sedamnaest.setBounds(484, 316, 66, 50);
				omsanaest.setBounds(570, 316, 66, 50);
				devetnaest.setBounds(656, 316, 66, 50);
				dvadeset.setBounds(742, 316, 66, 50);
				dvadesetjedan.setBounds(828, 316, 66, 50);
				dvadesetdva.setBounds(914, 316, 66, 50);
				dvadesettri.setBounds(398, 387, 66, 50);
				dvadesetcetri.setBounds(484, 387, 66, 50);
				dvadesetpet.setBounds(570, 387, 66, 50);
				dvadesetsest.setBounds(656, 387, 66, 50);
				dvadesetsedam.setBounds(742, 387, 66, 50);
				dvadesetosam.setBounds(828, 387, 66, 50);
				dvadesetdevet.setBounds(914, 387, 66, 50);
				trideset.setBounds(398, 448, 66, 50);
				tridesetjedan.setBounds(484, 448, 66, 50);
				Datum.setText("Oct");
				Dan.setText("01");
			}
		});
		oktobar.setFont(new Font("Tahoma", Font.BOLD, 15));
		oktobar.setBounds(1078, 435, 134, 30);
		frame.getContentPane().add(oktobar);
		
		JButton novembar = new JButton("November ");
		novembar.setForeground(new Color(102, 102, 102));
		novembar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(570, 119, 66, 50);
				drugi.setBounds(656, 119, 66, 50);
				treci.setBounds(742, 119, 66, 50);
				cetvri.setBounds(828, 119, 66, 50);
				peti.setBounds(914, 119, 66, 50);
				sesti.setBounds(398, 180, 66, 50);
				sedmi.setBounds(484, 180, 66, 50);
				osmi.setBounds(570, 180, 66, 50);
				deveti.setBounds(656, 180, 66, 50);
				deseti.setBounds(742, 180, 66, 50);
				jedanaesti.setBounds(828, 180, 66, 50);
				dvanaesti.setBounds(914, 180, 66, 50);
				trinaesti.setBounds(398, 246, 66, 50);
				cetrnaesti.setBounds(484, 246, 66, 50);
				petnaesti.setBounds(570, 246, 66, 50);
				sestanest.setBounds(656, 246, 66, 50);
				sedamnaest.setBounds(742, 246, 66, 50);
				omsanaest.setBounds(828, 246, 66, 50);
				devetnaest.setBounds(914, 246, 66, 50);
				dvadeset.setBounds(398, 316, 66, 50);
				dvadesetjedan.setBounds(484, 316, 66, 50);
				dvadesetdva.setBounds(570, 316, 66, 50);
				dvadesettri.setBounds(656, 316, 66, 50);
				dvadesetcetri.setBounds(742, 316, 66, 50);
				dvadesetpet.setBounds(828, 316, 66, 50);
				dvadesetsest.setBounds(914, 316, 66, 50);
				dvadesetsedam.setBounds(398, 387, 66, 50);
				dvadesetosam.setBounds(484, 387, 66, 50);
				dvadesetdevet.setBounds(570, 387, 66, 50);
				trideset.setBounds(656, 387, 66, 50);
				tridesetjedan.setBounds(742, 448, 0, 0);
				Datum.setText("Nov");
				Dan.setText("01");
			}
		});
		novembar.setFont(new Font("Tahoma", Font.BOLD, 15));
		novembar.setBounds(1078, 470, 134, 30);
		frame.getContentPane().add(novembar);
		
		JButton decembar = new JButton("December ");
		decembar.setForeground(new Color(102, 102, 102));
		decembar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prvi.setBounds(742, 119, 66, 50);
				drugi.setBounds(828, 119, 66, 50);
				treci.setBounds(914, 119, 66, 50);
				cetvri.setBounds(398, 180, 66, 50);
				peti.setBounds(484, 180, 66, 50);
				sesti.setBounds(570, 180, 66, 50);
				sedmi.setBounds(656, 180, 66, 50);
				osmi.setBounds(742, 180, 66, 50);
				deveti.setBounds(828, 180, 66, 50);
				deseti.setBounds(914, 180, 66, 50);
				jedanaesti.setBounds(398, 246, 66, 50);
				dvanaesti.setBounds(484, 246, 66, 50);
				trinaesti.setBounds(570, 246, 66, 50);
				cetrnaesti.setBounds(656, 246, 66, 50);
				petnaesti.setBounds(740, 246, 66, 50);
				sestanest.setBounds(828, 246, 66, 50);
				sedamnaest.setBounds(914, 246, 66, 50);
				omsanaest.setBounds(398, 316, 66, 50);
				devetnaest.setBounds(484, 316, 66, 50);
				dvadeset.setBounds(570, 316, 66, 50);
				dvadesetjedan.setBounds(656, 316, 66, 50);
				dvadesetdva.setBounds(742, 316, 66, 50);
				dvadesettri.setBounds(828, 316, 66, 50);
				dvadesetcetri.setBounds(914, 316, 66, 50);
				dvadesetpet.setBounds(398, 387, 66, 50);
				dvadesetsest.setBounds(484, 387, 66, 50);
				dvadesetsedam.setBounds(570, 387, 66, 50);
				dvadesetosam.setBounds(656, 387, 66, 50);
				dvadesetdevet.setBounds(742, 387, 66, 50);
				trideset.setBounds(828, 387, 66, 50);
				tridesetjedan.setBounds(914, 387, 66, 50);
				Datum.setText("Sep");
				Dan.setText("01");
			}
		});
		decembar.setFont(new Font("Tahoma", Font.BOLD, 15));
		decembar.setBounds(1078, 505, 134, 30);
		frame.getContentPane().add(decembar);
		
		JLabel lblNewLabel_1 = new JLabel("Day");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(14, 399, 134, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(Color.GRAY);
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonth.setBounds(185, 399, 134, 30);
		frame.getContentPane().add(lblMonth);
		
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
		label_5.setBounds(222, 11, 134, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("SELECT DATE");
		label_6.setForeground(SystemColor.activeCaption);
		label_6.setBounds(116, 11, 98, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("WELCOME");
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(10, 11, 98, 50);
		frame.getContentPane().add(label_7);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	

}
