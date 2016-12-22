package ba.ibu.edu.oop;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class BeerBar {

	private JFrame frame;
	private JTextField Heineken_2;
	private JTextField Amstel_2;
	private JTextField Stella_2;
	private JTextField Guinness_2;
	private JTextField Karlovacko_2;
	private JTextField Marquesa_2;
	private JTextField Palos_2;
	private JTextField Blossom_2;
	private JTextField Tres_2;
	private JTextField ElBurro_2;
	private JTextField Barefoot_2;
	private JTextField Red_2;
	private JTextField Johnny_2;
	private JTextField Jack_2;
	private JTextField Bushmills_2;
	private JTextField Jim_2;
	private JTextField Skyy_2;
	private JTextField Ciroc_2;
	private JTextField Grey_2;
	private JTextField Smirnoff_2;
	private JTextField Vigor_2;
	private JTextField Moet_2;
	private JTextField Lasnon_2;
	private JTextField Laurent_2;
	private JTextField Piper_2;
	private JTextField Pommery_2;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeerBar window = new BeerBar();
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
	public BeerBar() {
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
		
		JLabel lblNewLabel = new JLabel("BEER BAR MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 1342, 97);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 68));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(525, 108, 331, 313);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(866, 108, 476, 459);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(525, 432, 331, 239);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
        frame.getContentPane().add(panel_3);
        panel_3.setLayout(null);
        
        JLabel Tax = new JLabel("TAX");
        Tax.setFont(new Font("Tahoma", Font.BOLD, 24));
        Tax.setBounds(10, 20, 108, 40);
        panel_3.add(Tax);
        
        JLabel SubTotal = new JLabel("Sub Total");
        SubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
        SubTotal.setBounds(10, 100, 158, 40);
        panel_3.add(SubTotal);
        
        JLabel Total = new JLabel("Total");
        Total.setFont(new Font("Tahoma", Font.BOLD, 24));
        Total.setBounds(10, 180, 158, 40);
        panel_3.add(Total);
        
        JLabel Tax_2 = new JLabel("");
        Tax_2.setBounds(163, 20, 158, 40);
        Tax_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_3.add(Tax_2);
        
        JLabel SubTotal_2 = new JLabel("");
        SubTotal_2.setBounds(163, 100, 158, 40);
        SubTotal_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_3.add(SubTotal_2);
        
        JLabel totalaObada = new JLabel("");
        totalaObada.setBounds(163, 180, 158, 40);
        totalaObada.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_3.add(totalaObada);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBounds(10, 432, 499, 239);
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
        frame.getContentPane().add(panel_4);
        panel_4.setLayout(null);
        
        JLabel CostOfBeer = new JLabel("Cost of Beer");
        CostOfBeer.setFont(new Font("Tahoma", Font.BOLD, 16));
        CostOfBeer.setBounds(10, 10, 158, 40);
        panel_4.add(CostOfBeer);
        
        JLabel CostOfWine = new JLabel("Cost of Wine");
        CostOfWine.setFont(new Font("Tahoma", Font.BOLD, 16));
        CostOfWine.setBounds(10, 55, 158, 40);
        panel_4.add(CostOfWine);
        
        JLabel CostOfWh = new JLabel("Cost of Whiskey");
        CostOfWh.setFont(new Font("Tahoma", Font.BOLD, 16));
        CostOfWh.setBounds(10, 100, 158, 40);
        panel_4.add(CostOfWh);
        
        JLabel CostOfVodka = new JLabel("Cost of Vodka");
        CostOfVodka.setFont(new Font("Tahoma", Font.BOLD, 16));
        CostOfVodka.setBounds(10, 145, 158, 40);
        panel_4.add(CostOfVodka);
        
        JLabel CostOfCh = new JLabel("Cost of Champagne");
        CostOfCh.setFont(new Font("Tahoma", Font.BOLD, 16));
        CostOfCh.setBounds(10, 190, 158, 40);
        panel_4.add(CostOfCh);
        
        JLabel CostOfBeer_2 = new JLabel("");
        CostOfBeer_2.setBounds(331, 10, 158, 40);
        CostOfBeer_2.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_4.add(CostOfBeer_2);
        
        JLabel CostOfWine_2 = new JLabel("");
        CostOfWine_2.setBounds(331, 55, 158, 40);
        CostOfWine_2.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_4.add(CostOfWine_2);
        
        JLabel CostOfWh_2 = new JLabel("");
        CostOfWh_2.setBounds(331, 100, 158, 40);
        CostOfWh_2.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_4.add(CostOfWh_2);
        
        JLabel CostOfVodka_2 = new JLabel("");
        CostOfVodka_2.setBounds(331, 145, 158, 40);
        CostOfVodka_2.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_4.add(CostOfVodka_2);
        
        JLabel CostOfCh_2 = new JLabel("");
        CostOfCh_2.setBounds(331, 190, 158, 40);
        CostOfCh_2.setBorder(new LineBorder(new Color(0, 0, 0),2));
        panel_4.add(CostOfCh_2);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBounds(10, 108, 499, 313);
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
        frame.getContentPane().add(panel_5);
        panel_5.setLayout(null);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 160, 479, 6);
        panel_5.add(separator);
        
        JLabel Beer = new JLabel("BEER");
        Beer.setFont(new Font("Tahoma", Font.BOLD, 16));
        Beer.setBounds(10, 11, 63, 25);
        panel_5.add(Beer);
        
        JLabel Wine = new JLabel("WINE");
        Wine.setFont(new Font("Tahoma", Font.BOLD, 16));
        Wine.setBounds(244, 11, 63, 25);
        panel_5.add(Wine);
        
        JLabel Whiskey = new JLabel("WHISKEY");
        Whiskey.setFont(new Font("Tahoma", Font.BOLD, 16));
        Whiskey.setBounds(10, 160, 90, 31);
        panel_5.add(Whiskey);
        
        JLabel lblNewLabel_3 = new JLabel("VODKA");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_3.setBounds(244, 160, 107, 31);
        panel_5.add(lblNewLabel_3);
        
        JLabel Heineken = new JLabel("Heineken");
        Heineken.setBounds(10, 35, 90, 25);
        panel_5.add(Heineken);
        
        JLabel Stella = new JLabel("Stella Artois");
        Stella.setBounds(10, 85, 90, 25);
        panel_5.add(Stella);
        
        JLabel Guinness = new JLabel("Guinness");
        Guinness.setBounds(10, 110, 90, 25);
        panel_5.add(Guinness);
        
        JLabel Karlovacko = new JLabel("Karlovacko");
        Karlovacko.setBounds(10, 135, 90, 25);
        panel_5.add(Karlovacko);
        
        JLabel Amstel = new JLabel("Amstel");
        Amstel.setBounds(10, 60, 90, 25);
        panel_5.add(Amstel);
        
        JLabel Johnny = new JLabel("Johnny Walker");
        Johnny.setBounds(10, 195, 90, 25);
        panel_5.add(Johnny);
        
        JLabel Jack = new JLabel("Jack Daniels");
        Jack.setBounds(10, 220, 63, 25);
        panel_5.add(Jack);
        
        JLabel Bushmills = new JLabel("Bushmills");
        Bushmills.setBounds(10, 245, 63, 25);
        panel_5.add(Bushmills);
        
        JLabel Jim = new JLabel("Jim Beam");
        Jim.setBounds(10, 270, 63, 25);
        panel_5.add(Jim);
        
        JLabel ElBurro = new JLabel("El Burro");
        ElBurro.setBounds(244, 33, 90, 25);
        panel_5.add(ElBurro);
        
        JLabel Marquesa = new JLabel("Marquesa");
        Marquesa.setBounds(244, 50, 107, 25);
        panel_5.add(Marquesa);
        
        JLabel Red = new JLabel("Red rock");
        Red.setBounds(244, 135, 107, 25);
        panel_5.add(Red);
        
        JLabel Barefoot = new JLabel("Barefoot");
        Barefoot.setBounds(244, 118, 90, 25);
        panel_5.add(Barefoot);
        
        JLabel Blossom = new JLabel("Blossom hill");
        Blossom.setBounds(244, 84, 90, 25);
        panel_5.add(Blossom);
        
        JLabel Tres = new JLabel("Tres Barcos");
        Tres.setBounds(244, 101, 107, 25);
        panel_5.add(Tres);
        
        JLabel Palos = new JLabel("Palos");
        Palos.setBounds(244, 67, 90, 25);
        panel_5.add(Palos);
        
        JLabel Skyy = new JLabel("Skyy");
        Skyy.setBounds(244, 192, 54, 31);
        panel_5.add(Skyy);
        
        JLabel Grey = new JLabel("Grey goose");
        Grey.setBounds(244, 230, 79, 31);
        panel_5.add(Grey);
        
        JLabel Ciroc = new JLabel("Ciroc");
        Ciroc.setBounds(244, 211, 54, 31);
        panel_5.add(Ciroc);
        
        JLabel Smirnoff = new JLabel("Smirnoff");
        Smirnoff.setBounds(244, 249, 54, 31);
        panel_5.add(Smirnoff);
        
        JLabel Vigor = new JLabel("Vigor");
        Vigor.setBounds(244, 270, 54, 31);
        panel_5.add(Vigor);
        
        Heineken_2 = new JTextField();
        Heineken_2.setBounds(125, 37, 86, 20);
        panel_5.add(Heineken_2);
        Heineken_2.setColumns(10);
        
        Amstel_2 = new JTextField();
        Amstel_2.setColumns(10);
        Amstel_2.setBounds(125, 62, 86, 20);
        panel_5.add(Amstel_2);
        
        Stella_2 = new JTextField();
        Stella_2.setColumns(10);
        Stella_2.setBounds(125, 87, 86, 20);
        panel_5.add(Stella_2);
        
        Guinness_2 = new JTextField();
        Guinness_2.setColumns(10);
        Guinness_2.setBounds(125, 112, 86, 20);
        panel_5.add(Guinness_2);
        
        Karlovacko_2 = new JTextField();
        Karlovacko_2.setColumns(10);
        Karlovacko_2.setBounds(125, 137, 86, 20);
        panel_5.add(Karlovacko_2);
        
        Marquesa_2 = new JTextField();
        Marquesa_2.setColumns(10);
        Marquesa_2.setBounds(371, 54, 86, 15);
        panel_5.add(Marquesa_2);
        
        Palos_2 = new JTextField();
        Palos_2.setColumns(10);
        Palos_2.setBounds(371, 71, 86, 15);
        panel_5.add(Palos_2);
        
        Blossom_2 = new JTextField();
        Blossom_2.setColumns(10);
        Blossom_2.setBounds(371, 88, 86, 15);
        panel_5.add(Blossom_2);
        
        Tres_2 = new JTextField();
        Tres_2.setColumns(10);
        Tres_2.setBounds(371, 105, 86, 15);
        panel_5.add(Tres_2);
        
        ElBurro_2 = new JTextField();
        ElBurro_2.setColumns(10);
        ElBurro_2.setBounds(371, 37, 86, 15);
        panel_5.add(ElBurro_2);
        
        Barefoot_2 = new JTextField();
        Barefoot_2.setColumns(10);
        Barefoot_2.setBounds(371, 122, 86, 15);
        panel_5.add(Barefoot_2);
        
        Red_2 = new JTextField();
        Red_2.setColumns(10);
        Red_2.setBounds(371, 139, 86, 15);
        panel_5.add(Red_2);
        
        Johnny_2 = new JTextField();
        Johnny_2.setColumns(10);
        Johnny_2.setBounds(125, 197, 86, 20);
        panel_5.add(Johnny_2);
        
        Jack_2 = new JTextField();
        Jack_2.setColumns(10);
        Jack_2.setBounds(125, 222, 86, 20);
        panel_5.add(Jack_2);
        
        Bushmills_2 = new JTextField();
        Bushmills_2.setColumns(10);
        Bushmills_2.setBounds(125, 247, 86, 20);
        panel_5.add(Bushmills_2);
        
        Jim_2 = new JTextField();
        Jim_2.setColumns(10);
        Jim_2.setBounds(125, 272, 86, 20);
        panel_5.add(Jim_2);
        
        Skyy_2 = new JTextField();
        Skyy_2.setColumns(10);
        Skyy_2.setBounds(371, 197, 86, 17);
        panel_5.add(Skyy_2);
        
        Ciroc_2 = new JTextField();
        Ciroc_2.setColumns(10);
        Ciroc_2.setBounds(371, 216, 86, 17);
        panel_5.add(Ciroc_2);
        
        Grey_2 = new JTextField();
        Grey_2.setColumns(10);
        Grey_2.setBounds(371, 235, 86, 17);
        panel_5.add(Grey_2);
        
        Smirnoff_2 = new JTextField();
        Smirnoff_2.setColumns(10);
        Smirnoff_2.setBounds(371, 254, 86, 17);
        panel_5.add(Smirnoff_2);
        
        Vigor_2 = new JTextField();
        Vigor_2.setColumns(10);
        Vigor_2.setBounds(371, 275, 86, 17);
        panel_5.add(Vigor_2);
	

		
		JLabel Champagne = new JLabel("CHAMPAGNE");
		Champagne.setFont(new Font("Tahoma", Font.BOLD, 24));
		Champagne.setBounds(20, 11, 187, 52);
		panel.add(Champagne);
		
		JLabel Moet = new JLabel("Moet & Chandon");
		Moet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Moet.setBounds(20, 77, 172, 20);
		panel.add(Moet);
		
		JLabel Lasnon = new JLabel("Lasnon");
		Lasnon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Lasnon.setBounds(20, 127, 140, 14);
		panel.add(Lasnon);
		
		JLabel Laurent = new JLabel("Laurent-Perrier");
		Laurent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Laurent.setBounds(20, 177, 159, 14);
		panel.add(Laurent);
		
		JLabel Piper = new JLabel("Piper-Heidsheck");
		Piper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Piper.setBounds(20, 227, 172, 17);
		panel.add(Piper);
		
		JLabel Pommery = new JLabel("Pommery");
		Pommery.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pommery.setBounds(20, 277, 159, 20);
		panel.add(Pommery);
		
		Moet_2 = new JTextField();
		Moet_2.setColumns(10);
		Moet_2.setBounds(202, 77, 102, 23);
		panel.add(Moet_2);
		
		Lasnon_2 = new JTextField();
		Lasnon_2.setColumns(10);
		Lasnon_2.setBounds(202, 118, 102, 23);
		panel.add(Lasnon_2);
		
		Laurent_2 = new JTextField();
		Laurent_2.setColumns(10);
		Laurent_2.setBounds(202, 170, 102, 23);
		panel.add(Laurent_2);
		
		Piper_2 = new JTextField();
		Piper_2.setColumns(10);
		Piper_2.setBounds(202, 224, 102, 23);
		panel.add(Piper_2);
		
		Pommery_2 = new JTextField();
		Pommery_2.setColumns(10);
		Pommery_2.setBounds(202, 274, 102, 23);
		panel.add(Pommery_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(867, 574, 475, 97);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Heineken=Double.parseDouble(Heineken_2.getText());
				double iHeineken=4.50;
				double H;
				H=(Heineken*iHeineken);
				String aBeer=String.format("%.2f", H);
				CostOfBeer_2.setText(aBeer);
				
				double Amstel=Double.parseDouble(Amstel_2.getText());
				double iAmstel=5.50;
				double A;
				A=(Amstel*iAmstel);
				String bBeer=String.format("%.2f", H+A);
				CostOfBeer_2.setText(bBeer);
				
				double Stella=Double.parseDouble(Stella_2.getText());
				double iStella=6.50;
				double S;
				S=(Stella*iStella);
				String cBeer=String.format("%.2f", H+A+S);
				CostOfBeer_2.setText(cBeer);
				
				double Guinness=Double.parseDouble(Guinness_2.getText());
				double iGuinness=6.00;
				double G;
				G=(Guinness*iGuinness);
				String dBeer=String.format("%.2f", H+A+S+G);
				CostOfBeer_2.setText(dBeer);
				
				double Karlovacko=Double.parseDouble(Karlovacko_2.getText());
				double iKarlovacko=3.50;
				double K;
				K=(Karlovacko*iKarlovacko);
				String eBeer=String.format("%.2f", H+A+S+G+K);
				CostOfBeer_2.setText(eBeer);
				
				double ElBurro=Double.parseDouble(ElBurro_2.getText());
				double iElBurro=5.50;
				double EB;
				EB=(ElBurro*iElBurro);
				String aWine=String.format("%.2f", EB);
				CostOfWine_2.setText(aWine);
				
				double Marquesa=Double.parseDouble(Marquesa_2.getText());
				double iMarquesa=5.50;
				double M;
				M=(Marquesa*iMarquesa);
				String bWine=String.format("%.2f", EB+M);
				CostOfWine_2.setText(bWine);
				
				double Palos=Double.parseDouble(Palos_2.getText());
				double iPalos=5.50;
				double P;
				P=(Palos*iPalos);
				String cWine=String.format("%.2f", EB+M+P);
				CostOfWine_2.setText(cWine);
				
				double Blossom=Double.parseDouble(Blossom_2.getText());
				double iBlossom=5.50;
				double B;
				B=(Blossom*iBlossom);
				String dWine=String.format("%.2f", EB+M+P+B);
				CostOfWine_2.setText(dWine);
				
				double Tres=Double.parseDouble(Tres_2.getText());
				double iTres=5.50;
				double T;
				T=(Tres*iTres);
				String eWine=String.format("%.2f", EB+M+P+B+T);
				CostOfWine_2.setText(eWine);
				
				double Barefoot=Double.parseDouble(Barefoot_2.getText());
				double iBarefoot=5.50;
				double BF;
				BF=(Barefoot*iBarefoot);
				String fWine=String.format("%.2f", EB+M+P+B+BF);
				CostOfWine_2.setText(fWine);
				
				double Red=Double.parseDouble(Red_2.getText());
				double iRed=5.50;
				double R;
				R=(Red*iRed);
				String gWine=String.format("%.2f", EB+M+P+B+BF+R);
				CostOfWine_2.setText(gWine);
				
				double Johnny=Double.parseDouble(Johnny_2.getText());
				double iJohnny=5.50;
				double J;
				J=(Johnny*iJohnny);
				String aWhiskey=String.format("%.2f", J);
				CostOfWh_2.setText(aWhiskey);
				
				double Jack=Double.parseDouble(Jack_2.getText());
				double iJack=5.50;
				double JJ;
				JJ=(Jack*iJack);
				String bWhiskey=String.format("%.2f", J+JJ);
				CostOfWh_2.setText(bWhiskey);
				
				double Bushmills=Double.parseDouble(Bushmills_2.getText());
				double iBushmills=5.50;
				double BM;
				BM=(Bushmills*iBushmills);
				String cWhiskey=String.format("%.2f", J+JJ+BM);
				CostOfWh_2.setText(cWhiskey);
				

				double Jim=Double.parseDouble(Jim_2.getText());
				double iJim=5.50;
				double JI;
				JI=(Jim*iJim);
				String dWhiskey=String.format("%.2f", J+JJ+BM+JI);
				CostOfWh_2.setText(dWhiskey);
				
				double Skyy=Double.parseDouble(Skyy_2.getText());
				double iSkyy=5.50;
				double SK;
				SK=(Skyy*iSkyy);
				String aVodka=String.format("%.2f", SK);
				CostOfVodka_2.setText(aVodka);

				double Ciroc=Double.parseDouble(Ciroc_2.getText());
				double iCiroc=5.50;
				double C;
				C=(Ciroc*iCiroc);
				String bVodka=String.format("%.2f", SK+C);
				CostOfVodka_2.setText(bVodka);

				double Grey=Double.parseDouble(Grey_2.getText());
				double iGrey=5.50;
				double GR;
				GR=(Grey*iGrey);
				String cVodka=String.format("%.2f", SK+C+GR);
				CostOfVodka_2.setText(cVodka);
				
				double Smirnoff=Double.parseDouble(Smirnoff_2.getText());
				double iSmirnoff=5.50;
				double SM;
				SM=(Smirnoff*iSmirnoff);
				String dVodka=String.format("%.2f", SK+C+GR+SM);
				CostOfVodka_2.setText(dVodka);
				
				double Vigor=Double.parseDouble(Vigor_2.getText());
				double iVigor=5.50;
				double V;
				V=(Vigor*iVigor);
				String eVodka=String.format("%.2f", SK+C+GR+SM+V);
				CostOfVodka_2.setText(eVodka);
				
				double Moet=Double.parseDouble(Moet_2.getText());
				double iMoet=5.50;
				double MO;
				MO=(Moet*iMoet);
				String aCh=String.format("%.2f", MO);
				CostOfCh_2.setText(aCh);
				
				double Lasnon=Double.parseDouble(Lasnon_2.getText());
				double iLasnon=5.50;
				double L;
				L=(Lasnon*iLasnon);
				String bCh=String.format("%.2f", MO+L);
				CostOfCh_2.setText(bCh);
				
				double Laurent=Double.parseDouble(Laurent_2.getText());
				double iLaurent=5.50;
				double LA;
				LA=(Laurent*iLaurent);
				String cCh=String.format("%.2f", MO+L+LA);
				CostOfCh_2.setText(cCh);
				
				double Piper=Double.parseDouble(Piper_2.getText());
				double iPiper=5.50;
				double PI;
				PI=(Piper*iPiper);
				String dCh=String.format("%.2f", MO+L+LA+PI);
				CostOfCh_2.setText(dCh);
				
				double Pommery=Double.parseDouble(Pommery_2.getText());
				double iPommery=5.50;
				double PO;
				PO=(Pommery*iPommery);
				String eCh=String.format("%.2f", MO+L+LA+PI+PO);
				CostOfCh_2.setText(eCh);

				double Total_1=Double.parseDouble(CostOfBeer_2.getText());
				double Total_2=Double.parseDouble(CostOfWine_2.getText());
				double Total_3=Double.parseDouble(CostOfWh_2.getText());
				double Total_4=Double.parseDouble(CostOfVodka_2.getText());
				double Total_5=Double.parseDouble(CostOfCh_2.getText());
				
				double Tax_1;
				Tax_1=(Total_1 +Total_2+Total_3+Total_4+Total_5)/100;
				String tax=String.format("%.2f", Tax_1);
				Tax_2.setText(tax);
				
				double SubTotal;
				SubTotal=(Total_1 +Total_2+Total_3+Total_4+Total_5);
				String subtotal=String.format("%.2f", SubTotal);
				SubTotal_2.setText(subtotal);
				
				
				double ctotal=Double.parseDouble(Tax_2.getText());
				double ctotal1=Double.parseDouble(SubTotal_2.getText());
				double total;
				total=(ctotal+ctotal1);
				String total_2= String.format("%.2f", total);
				totalaObada.setText(total_2);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 37, 107, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RECEEIPT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(125, 37, 107, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Heineken_2.setText(null);
				Amstel_2.setText(null);
				Stella_2.setText(null);
				Guinness_2.setText(null);
				Karlovacko_2.setText(null);
				ElBurro_2.setText(null);
				Marquesa_2.setText(null);
				Palos_2.setText(null);
				Blossom_2.setText(null);
				Tres_2.setText(null);
				Barefoot_2.setText(null);
				Red_2.setText(null);
				Johnny_2.setText(null);
				Jack_2.setText(null);
				Bushmills_2.setText(null);
				Jim_2.setText(null);
				Skyy_2.setText(null);
				Ciroc_2.setText(null);
				Grey_2.setText(null);
				Smirnoff_2.setText(null);
				Vigor_2.setText(null);
				Moet_2.setText(null);
				Lasnon_2.setText(null);
				Laurent_2.setText(null);
				Piper_2.setText(null);
				Pommery_2.setText(null);
				CostOfBeer_2.setText(null);
				CostOfWine_2.setText(null);
				CostOfWh_2.setText(null);
				CostOfVodka_2.setText(null);
				CostOfCh_2.setText(null);
				Tax_2.setText(null);
				SubTotal_2.setText(null);
				totalaObada.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(240, 37, 107, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(355, 37, 107, 23);
		panel_1.add(btnNewButton_3);
	}
}
		
		
