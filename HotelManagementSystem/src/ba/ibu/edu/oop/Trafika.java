package ba.ibu.edu.oop;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
<<<<<<< HEAD
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Trafika {

	private JFrame frame;
	private JTextField DnevniAvaz_2;
	private JTextField Oslobodenje_2;
	private JTextField DnevniList_2;
	private JTextField NezavisneNovine_2;
	private JTextField NovoVrijeme_2;
	private JTextField Marlboro_2;
	private JTextField Davidoff_2;
	private JTextField Dunhill_2;
	private JTextField Aura_2;
	private JTextField Drina_2;
	private JTextField Milka_2;
	private JTextField Dorina_2;
	private JTextField Bajadera_2;
	private JTextField Merci_2;
	private JTextField Mikado_2;
	private JTextField Napolitanke_2;
	private JTextField Plazma_2;
	private JTextField Paris_2;
	private JTextField Noblice_2;
	private JTextField Domacica_2;
	private JTextField Orbit_2;
	private JTextField Airwaves_2;
	private JTextField Eclipse_2;
	private JTextField Trident_2;
	private JTextField Extra_2;
	private JTextField Fini_2;
	private JTextField Haribo_2;
	private JTextField Skittles_2;
	private JTextField Bronhi_2;
	private JTextField Kiki_2;
	private JTextField Water_2;
	private JTextField CarbonateWater_2;
	private JTextField NonCarbonateJuice_2;
	private JTextField CarbonateJuice_2;
	private JTextField EnergyDrink_2;
	private JTextField Lays_2;
	private JTextField Pringles_2;
	private JTextField Doritos_2;
	private JTextField Cheetos_2;
	private JTextField MrChips_2;
	private JTextField Tax;
	private JTextField SubTotal;
	private JTextField Total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trafika window = new Trafika();
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
	public Trafika() {
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
		
		JPanel novine = new JPanel();
		novine.setBounds(10, 11, 284, 256);
		novine.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(novine);
		novine.setLayout(null);
		
		JLabel Oslobodenje = new JLabel("Oslobo\u0111enje");
		Oslobodenje.setBounds(10, 104, 91, 27);
		novine.add(Oslobodenje);
		
		JLabel DnevniList = new JLabel("Dnevni List");
		DnevniList.setBounds(10, 142, 91, 27);
		novine.add(DnevniList);
		
		JLabel NezavisneNovine = new JLabel("Nezavisni Novine");
		NezavisneNovine.setBounds(10, 180, 91, 27);
		novine.add(NezavisneNovine);
		
		JLabel NovoVrijeme = new JLabel("Novo Vrijeme");
		NovoVrijeme.setBounds(10, 218, 91, 27);
		novine.add(NovoVrijeme);
		
		JLabel DnevniAvaz = new JLabel("Dnevni Avaz");
		DnevniAvaz.setBounds(10, 66, 91, 27);
		novine.add(DnevniAvaz);
		
		JLabel NEWSPAPER = new JLabel("NEWSPAPER");
		NEWSPAPER.setBounds(10, 11, 120, 40);
		novine.add(NEWSPAPER);
		
		DnevniAvaz_2 = new JTextField();
		DnevniAvaz_2.setBounds(145, 69, 112, 20);
		novine.add(DnevniAvaz_2);
		DnevniAvaz_2.setColumns(10);
		
		Oslobodenje_2 = new JTextField();
		Oslobodenje_2.setColumns(10);
		Oslobodenje_2.setBounds(145, 107, 112, 20);
		novine.add(Oslobodenje_2);
		
		DnevniList_2 = new JTextField();
		DnevniList_2.setColumns(10);
		DnevniList_2.setBounds(145, 145, 112, 20);
		novine.add(DnevniList_2);
		
		NezavisneNovine_2 = new JTextField();
		NezavisneNovine_2.setColumns(10);
		NezavisneNovine_2.setBounds(145, 183, 112, 20);
		novine.add(NezavisneNovine_2);
		
		NovoVrijeme_2 = new JTextField();
		NovoVrijeme_2.setColumns(10);
		NovoVrijeme_2.setBounds(145, 221, 112, 20);
		novine.add(NovoVrijeme_2);
		
		JPanel cigare = new JPanel();
		cigare.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cigare.setBounds(359, 11, 284, 256);
		frame.getContentPane().add(cigare);
		cigare.setLayout(null);
		
		JLabel CIGARETTE = new JLabel("CIGARETTE");
		CIGARETTE.setBounds(10, 11, 120, 40);
		cigare.add(CIGARETTE);
		
		JLabel Marlboro = new JLabel("Marlboro");
		Marlboro.setBounds(10, 66, 91, 27);
		cigare.add(Marlboro);
		
		JLabel Davidoff = new JLabel("Davidoff");
		Davidoff.setBounds(10, 104, 91, 27);
		cigare.add(Davidoff);
		
		JLabel Dunhill = new JLabel("Dunhill");
		Dunhill.setBounds(10, 142, 91, 27);
		cigare.add(Dunhill);
		
		JLabel Aura = new JLabel("Aura");
		Aura.setBounds(10, 180, 91, 27);
		cigare.add(Aura);
		
		JLabel Drina = new JLabel("Drina");
		Drina.setBounds(10, 218, 91, 27);
		cigare.add(Drina);
		
		Marlboro_2 = new JTextField();
		Marlboro_2.setColumns(10);
		Marlboro_2.setBounds(162, 69, 112, 20);
		cigare.add(Marlboro_2);
		
		Davidoff_2 = new JTextField();
		Davidoff_2.setColumns(10);
		Davidoff_2.setBounds(162, 107, 112, 20);
		cigare.add(Davidoff_2);
		
		Dunhill_2 = new JTextField();
		Dunhill_2.setColumns(10);
		Dunhill_2.setBounds(162, 145, 112, 20);
		cigare.add(Dunhill_2);
		
		Aura_2 = new JTextField();
		Aura_2.setColumns(10);
		Aura_2.setBounds(162, 183, 112, 20);
		cigare.add(Aura_2);
		
		Drina_2 = new JTextField();
		Drina_2.setColumns(10);
		Drina_2.setBounds(162, 221, 112, 20);
		cigare.add(Drina_2);
		
		JPanel cokolade = new JPanel();
		cokolade.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cokolade.setBounds(708, 11, 284, 256);
		frame.getContentPane().add(cokolade);
		cokolade.setLayout(null);
		
		JLabel CHOCOLATE = new JLabel("CHOHOLATE");
		CHOCOLATE.setBounds(10, 11, 120, 40);
		cokolade.add(CHOCOLATE);
		
		JLabel Milka = new JLabel("Milka");
		Milka.setBounds(10, 66, 91, 27);
		cokolade.add(Milka);
		
		JLabel Dorina = new JLabel("Dorina");
		Dorina.setBounds(10, 104, 91, 27);
		cokolade.add(Dorina);
		
		JLabel Bajadera = new JLabel("Bajadera");
		Bajadera.setBounds(10, 142, 91, 27);
		cokolade.add(Bajadera);
		
		JLabel Merci = new JLabel("Merci");
		Merci.setBounds(10, 180, 91, 27);
		cokolade.add(Merci);
		
		JLabel Mikado = new JLabel("Mikado");
		Mikado.setBounds(10, 218, 91, 27);
		cokolade.add(Mikado);
		
		Milka_2 = new JTextField();
		Milka_2.setColumns(10);
		Milka_2.setBounds(162, 69, 112, 20);
		cokolade.add(Milka_2);
		
		Dorina_2 = new JTextField();
		Dorina_2.setColumns(10);
		Dorina_2.setBounds(162, 107, 112, 20);
		cokolade.add(Dorina_2);
		
		Bajadera_2 = new JTextField();
		Bajadera_2.setColumns(10);
		Bajadera_2.setBounds(162, 145, 112, 20);
		cokolade.add(Bajadera_2);
		
		Merci_2 = new JTextField();
		Merci_2.setColumns(10);
		Merci_2.setBounds(162, 183, 112, 20);
		cokolade.add(Merci_2);
		
		Mikado_2 = new JTextField();
		Mikado_2.setColumns(10);
		Mikado_2.setBounds(162, 221, 112, 20);
		cokolade.add(Mikado_2);
		
		JPanel keks = new JPanel();
		keks.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		keks.setBounds(1057, 11, 284, 256);
		frame.getContentPane().add(keks);
		keks.setLayout(null);
		
		JLabel COOKIES = new JLabel("COOKIES");
		COOKIES.setBounds(10, 11, 120, 40);
		keks.add(COOKIES);
		
		JLabel Napolitanke = new JLabel("Napolitanke");
		Napolitanke.setBounds(10, 66, 91, 27);
		keks.add(Napolitanke);
		
		JLabel Plazma = new JLabel("Plazma");
		Plazma.setBounds(10, 104, 91, 27);
		keks.add(Plazma);
		
		JLabel Paris = new JLabel("Paris");
		Paris.setBounds(10, 142, 91, 27);
		keks.add(Paris);
		
		JLabel Noblice = new JLabel("Noblice");
		Noblice.setBounds(10, 180, 91, 27);
		keks.add(Noblice);
		
		JLabel Domacica = new JLabel("Domacica");
		Domacica.setBounds(10, 218, 91, 27);
		keks.add(Domacica);
		
		Napolitanke_2 = new JTextField();
		Napolitanke_2.setColumns(10);
		Napolitanke_2.setBounds(162, 69, 112, 20);
		keks.add(Napolitanke_2);
		
		Plazma_2 = new JTextField();
		Plazma_2.setColumns(10);
		Plazma_2.setBounds(162, 107, 112, 20);
		keks.add(Plazma_2);
		
		Paris_2 = new JTextField();
		Paris_2.setColumns(10);
		Paris_2.setBounds(162, 145, 112, 20);
		keks.add(Paris_2);
		
		Noblice_2 = new JTextField();
		Noblice_2.setColumns(10);
		Noblice_2.setBounds(162, 183, 112, 20);
		keks.add(Noblice_2);
		
		Domacica_2 = new JTextField();
		Domacica_2.setColumns(10);
		Domacica_2.setBounds(162, 221, 112, 20);
		keks.add(Domacica_2);
		
		JPanel cips = new JPanel();
		cips.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cips.setBounds(10, 297, 284, 256);
		frame.getContentPane().add(cips);
		cips.setLayout(null);
		
		JLabel CHIPS = new JLabel("CHIPS");
		CHIPS.setBounds(10, 11, 120, 40);
		cips.add(CHIPS);
		
		JLabel Lays = new JLabel("Lays");
		Lays.setBounds(10, 66, 91, 27);
		cips.add(Lays);
		
		JLabel Pringles = new JLabel("Pringles");
		Pringles.setBounds(10, 104, 91, 27);
		cips.add(Pringles);
		
		JLabel Doritos = new JLabel("Doritos");
		Doritos.setBounds(10, 142, 91, 27);
		cips.add(Doritos);
		
		JLabel Cheetos = new JLabel("Cheetos");
		Cheetos.setBounds(10, 180, 91, 27);
		cips.add(Cheetos);
		
		JLabel MrChips = new JLabel("Mr. Chips");
		MrChips.setBounds(10, 218, 91, 27);
		cips.add(MrChips);
		
		Lays_2 = new JTextField();
		Lays_2.setColumns(10);
		Lays_2.setBounds(162, 69, 112, 20);
		cips.add(Lays_2);
		
		Pringles_2 = new JTextField();
		Pringles_2.setColumns(10);
		Pringles_2.setBounds(162, 107, 112, 20);
		cips.add(Pringles_2);
		
		Doritos_2 = new JTextField();
		Doritos_2.setColumns(10);
		Doritos_2.setBounds(162, 145, 112, 20);
		cips.add(Doritos_2);
		
		Cheetos_2 = new JTextField();
		Cheetos_2.setColumns(10);
		Cheetos_2.setBounds(162, 183, 112, 20);
		cips.add(Cheetos_2);
		
		MrChips_2 = new JTextField();
		MrChips_2.setColumns(10);
		MrChips_2.setBounds(162, 221, 112, 20);
		cips.add(MrChips_2);
		
		JPanel sokovi = new JPanel();
		sokovi.setLayout(null);
		sokovi.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		sokovi.setBounds(359, 297, 284, 256);
		frame.getContentPane().add(sokovi);
		
		JLabel DRINKS = new JLabel("DRINKS");
		DRINKS.setBounds(10, 11, 120, 40);
		sokovi.add(DRINKS);
		
		JLabel Water = new JLabel("Water");
		Water.setBounds(10, 66, 91, 27);
		sokovi.add(Water);
		
		JLabel CarbonateWater = new JLabel("Carbonate Water");
		CarbonateWater.setBounds(10, 104, 91, 27);
		sokovi.add(CarbonateWater);
		
		JLabel NonCarbonateJuice = new JLabel("Non Carbonate Juice");
		NonCarbonateJuice.setBounds(10, 142, 120, 27);
		sokovi.add(NonCarbonateJuice);
		
		JLabel CarbonateJuice = new JLabel("Carbonate Juice");
		CarbonateJuice.setBounds(10, 180, 91, 27);
		sokovi.add(CarbonateJuice);
		
		JLabel EnergyDrink = new JLabel("Energy Drink");
		EnergyDrink.setBounds(10, 218, 91, 27);
		sokovi.add(EnergyDrink);
		
		Water_2 = new JTextField();
		Water_2.setColumns(10);
		Water_2.setBounds(162, 69, 112, 20);
		sokovi.add(Water_2);
		
		CarbonateWater_2 = new JTextField();
		CarbonateWater_2.setColumns(10);
		CarbonateWater_2.setBounds(162, 107, 112, 20);
		sokovi.add(CarbonateWater_2);
		
		NonCarbonateJuice_2 = new JTextField();
		NonCarbonateJuice_2.setColumns(10);
		NonCarbonateJuice_2.setBounds(162, 145, 112, 20);
		sokovi.add(NonCarbonateJuice_2);
		
		CarbonateJuice_2 = new JTextField();
		CarbonateJuice_2.setColumns(10);
		CarbonateJuice_2.setBounds(162, 183, 112, 20);
		sokovi.add(CarbonateJuice_2);
		
		EnergyDrink_2 = new JTextField();
		EnergyDrink_2.setColumns(10);
		EnergyDrink_2.setBounds(162, 221, 112, 20);
		sokovi.add(EnergyDrink_2);
		
		JPanel zvake = new JPanel();
		zvake.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		zvake.setBounds(1057, 297, 284, 256);
		frame.getContentPane().add(zvake);
		zvake.setLayout(null);
		
		JLabel CHEWINGGUM = new JLabel("CHEWING GUM");
		CHEWINGGUM.setBounds(10, 11, 120, 40);
		zvake.add(CHEWINGGUM);
		
		JLabel Orbit = new JLabel("Orbit");
		Orbit.setBounds(10, 66, 91, 27);
		zvake.add(Orbit);
		
		JLabel Airwaves = new JLabel("Airwaves");
		Airwaves.setBounds(10, 104, 91, 27);
		zvake.add(Airwaves);
		
		JLabel Eclipse = new JLabel("Eclipse");
		Eclipse.setBounds(10, 142, 91, 27);
		zvake.add(Eclipse);
		
		JLabel Trident = new JLabel("Trident");
		Trident.setBounds(10, 180, 91, 27);
		zvake.add(Trident);
		
		JLabel Extra = new JLabel("Extra");
		Extra.setBounds(10, 218, 91, 27);
		zvake.add(Extra);
		
		Orbit_2 = new JTextField();
		Orbit_2.setColumns(10);
		Orbit_2.setBounds(162, 69, 112, 20);
		zvake.add(Orbit_2);
		
		Airwaves_2 = new JTextField();
		Airwaves_2.setColumns(10);
		Airwaves_2.setBounds(162, 107, 112, 20);
		zvake.add(Airwaves_2);
		
		Eclipse_2 = new JTextField();
		Eclipse_2.setColumns(10);
		Eclipse_2.setBounds(162, 145, 112, 20);
		zvake.add(Eclipse_2);
		
		Trident_2 = new JTextField();
		Trident_2.setColumns(10);
		Trident_2.setBounds(162, 183, 112, 20);
		zvake.add(Trident_2);
		
		Extra_2 = new JTextField();
		Extra_2.setColumns(10);
		Extra_2.setBounds(162, 221, 112, 20);
		zvake.add(Extra_2);
		
		JPanel Bobe = new JPanel();
		Bobe.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Bobe.setBounds(708, 297, 284, 256);
		frame.getContentPane().add(Bobe);
		Bobe.setLayout(null);
		
		JLabel CANDY = new JLabel("CANDY");
		CANDY.setBounds(10, 11, 120, 40);
		Bobe.add(CANDY);
		
		JLabel Fini = new JLabel("Fini");
		Fini.setBounds(10, 66, 91, 27);
		Bobe.add(Fini);
		
		JLabel Haribo = new JLabel("Haribo");
		Haribo.setBounds(10, 104, 91, 27);
		Bobe.add(Haribo);
		
		JLabel Skittles = new JLabel("Skittles");
		Skittles.setBounds(10, 142, 91, 27);
		Bobe.add(Skittles);
		
		JLabel Bronhi = new JLabel("Bronhi");
		Bronhi.setBounds(10, 180, 91, 27);
		Bobe.add(Bronhi);
		
		JLabel Kiki = new JLabel("Kiki");
		Kiki.setBounds(10, 218, 91, 27);
		Bobe.add(Kiki);
		
		Fini_2 = new JTextField();
		Fini_2.setColumns(10);
		Fini_2.setBounds(162, 69, 112, 20);
		Bobe.add(Fini_2);
		
		Haribo_2 = new JTextField();
		Haribo_2.setColumns(10);
		Haribo_2.setBounds(162, 107, 112, 20);
		Bobe.add(Haribo_2);
		
		Skittles_2 = new JTextField();
		Skittles_2.setColumns(10);
		Skittles_2.setBounds(162, 145, 112, 20);
		Bobe.add(Skittles_2);
		
		Bronhi_2 = new JTextField();
		Bronhi_2.setColumns(10);
		Bronhi_2.setBounds(162, 183, 112, 20);
		Bobe.add(Bronhi_2);
		
		Kiki_2 = new JTextField();
		Kiki_2.setColumns(10);
		Kiki_2.setBounds(162, 221, 112, 20);
		Bobe.add(Kiki_2);
		
		JButton total = new JButton("TOTAL");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Avaz=Double.parseDouble(DnevniAvaz_2.getText());
				double iAvaz=2.50;
				double DA;
				DA=(Avaz*iAvaz);
				
				double Oslobodenje=Double.parseDouble(Oslobodenje_2.getText());
				double iOslobodenje=2.50;
				double OS;
				OS=(Oslobodenje*iOslobodenje);
				
				double DnevniList=Double.parseDouble(DnevniList_2.getText());
				double iDnevniList=2.50;
				double DL;
				DL=(DnevniList*iDnevniList);
				
				double NezavisneNovine=Double.parseDouble(NezavisneNovine_2.getText());
				double iNezavisneNovine=2.50;
				double NN;
				NN=(NezavisneNovine*iNezavisneNovine);
				
				double NovoVrijeme=Double.parseDouble(NovoVrijeme_2.getText());
				double iNovoVrijeme=2.50;
				double NV;
				NV=(NovoVrijeme*iNovoVrijeme);
				
				double Marlboro=Double.parseDouble(Marlboro_2.getText());
				double iMarlboro=2.50;
				double M;
				M=(Marlboro*iMarlboro);
				
				double Davidoff=Double.parseDouble(Davidoff_2.getText());
				double iDavidoff=2.50;
				double D;
				D=(Davidoff*iDavidoff);
				
				double Dunhill=Double.parseDouble(Dunhill_2.getText());
				double iDunhill=2.50;
				double D_2;
				D_2=(Dunhill*iDunhill);
				
				double Aura=Double.parseDouble(Aura_2.getText());
				double iAura=2.50;
				double A;
				A=(Aura*iAura);
				
				double Drina=Double.parseDouble(Drina_2.getText());
				double iDrina=2.50;
				double D_3;
				D_3=(Drina*iDrina);
				
				double Milka=Double.parseDouble(Milka_2.getText());
				double iMilka=2.50;
				double MM;
				MM=(Milka*iMilka);
				
				double Dorina=Double.parseDouble(Dorina_2.getText());
				double iDorina=2.50;
				double D_4;
				D_4=(Dorina*iDorina);
				
				double Bajadera=Double.parseDouble(Bajadera_2.getText());
				double iBajadera=2.50;
				double B;
				B=(Bajadera*iBajadera);
				
				double Merci=Double.parseDouble(Merci_2.getText());
				double iMerci=2.50;
				double MM_2;
				MM_2=(Merci*iMerci);
				
				double Mikado=Double.parseDouble(Mikado_2.getText());
				double iMikado=2.50;
				double M_2;
				M_2=(Mikado*iMikado);
				
				
				double Napolitanke=Double.parseDouble(Napolitanke_2.getText());
				double iNapolitanke=2.50;
				double N;
				N=(Napolitanke*iNapolitanke);
				
				double Plazma=Double.parseDouble(Plazma_2.getText());
				double iPlazma=2.50;
				double P;
			    P=(Plazma*iPlazma);
				
				double Paris=Double.parseDouble(Paris_2.getText());
				double iParis=2.50;
				double P_1;
			    P_1=(Paris*iParis);
			
				double Noblice=Double.parseDouble(Noblice_2.getText());
				double iNoblice=2.50;
				double N_2;
			    N_2=(Noblice*iNoblice);
			
				double Domacica=Double.parseDouble(Domacica_2.getText());
				double iDomacica=2.50;
				double D_5;
			    D_5=(Domacica*iDomacica);
				
				
				double Orbit=Double.parseDouble(Orbit_2.getText());
				double iOrbit=2.50;
				double O;
			    O=(Orbit*iOrbit);
			
				double Airwaves=Double.parseDouble(Airwaves_2.getText());
				double iAirwaves=2.50;
				double A_2;
			    A_2=(Airwaves*iAirwaves);
				
				double Eclipse=Double.parseDouble(Eclipse_2.getText());
				double iEclipse=2.50;
				double E;
			    E=(Eclipse*iEclipse);
				
				double Trident=Double.parseDouble(Trident_2.getText());
				double iTrident=2.50;
				double T;
			    T=(Trident*iTrident);
			
				double Extra=Double.parseDouble(Extra_2.getText());
				double iExtra=2.50;
				double E_2;
			    E_2=(Extra*iExtra);
			
				double Fini=Double.parseDouble(Fini_2.getText());
				double iFini=2.50;
				double F;
			    F=(Fini*iFini);
			
				double Haribo=Double.parseDouble(Haribo_2.getText());
				double iHaribo=2.50;
				double H;
			    H=(Haribo*iHaribo);
			
				double Skittles=Double.parseDouble(Skittles_2.getText());
				double iSkittles=2.50;
				double S;
			    S=(Skittles*iSkittles);
			
				double Bronhi=Double.parseDouble(Bronhi_2.getText());
				double iBronhi=2.50;
				double B_2;
			    B_2=(Bronhi*iBronhi);
		
				double Kiki=Double.parseDouble(Kiki_2.getText());
				double iKiki=2.50;
				double K;
			    K=(Kiki*iKiki);
		
				double Water=Double.parseDouble(Water_2.getText());
				double iWater=2.50;
				double W;
			    W=(Water*iWater);
		
				
				double CarbonateWater=Double.parseDouble(CarbonateWater_2.getText());
				double iCarbonateWater=2.50;
				double C;
			    C=(CarbonateWater*iCarbonateWater);
			
				
				double NonCarbonateJuice=Double.parseDouble(NonCarbonateJuice_2.getText());
				double iNonCarbonateJuice=2.50;
				double NC;
			    NC=(NonCarbonateJuice*iNonCarbonateJuice);
		
				
				double CarbonateJuice=Double.parseDouble(CarbonateJuice_2.getText());
				double iCarbonateJuice=2.50;
				double CJ;
			    CJ=(CarbonateJuice*iCarbonateJuice);
		
				
				double EnergyDrink=Double.parseDouble(EnergyDrink_2.getText());
				double iEnergyDrink=2.50;
				double ED;
			    ED=(EnergyDrink*iEnergyDrink);
	
				
				double Lays=Double.parseDouble(Lays_2.getText());
				double iLays=2.50;
				double L;
			    L=(Lays*iLays);
	
				
				double Pringles=Double.parseDouble(Pringles_2.getText());
				double iPringles=2.50;
				double P_2;
			    P_2=(Pringles*iPringles);
	
				
				double Doritos=Double.parseDouble(Doritos_2.getText());
				double iDoritos=2.50;
				double D_6;
			    D_6=(Doritos*iDoritos);
			
				
				double Cheetos=Double.parseDouble(Cheetos_2.getText());
				double iCheetos=2.50;
				double C_2;
			    C_2=(Cheetos*iCheetos);
			
				
				double MrChips=Double.parseDouble(MrChips_2.getText());
				double iMrChips=2.50;
				double MC;
			    MC=(MrChips*iMrChips);
				String cips_4=String.format("%.2f", DA+OS+DL+NN+NV+M+D+D_2+A+D_3+M_2+N+MM+B+D_4+MM_2
						+P+P_1+N_2+D_5+O+A_2+E+T+E_2+F+H+S+B_2+K+W+C
						+NC+CJ+ED+L+P_2+D_6+C_2+MC);
				SubTotal.setText(cips_4);
				double subtotal=Double.parseDouble(SubTotal.getText());
				
				
				double tax=subtotal/100;
				String tax_2=String.format("%.2f",tax);
				Tax.setText(tax_2);
				
				
				double total=tax+subtotal;
				String total_2=String.format("%.2f", total);
				Total.setText(total_2);
				
				
				JOptionPane.showMessageDialog(null,"Total: "+total_2);
				
				
				
				
				
				
				
=======
import javax.swing.UIManager;

public class Trafika {

	private JFrame frame;
	private JTextField DnevniAvaz_2;
	private JTextField Oslobodenje_2;
	private JTextField DnevniList_2;
	private JTextField NezavisneNovine_2;
	private JTextField NovoVrijeme_2;
	private JTextField Marlboro_2;
	private JTextField Davidoff_2;
	private JTextField Dunhill_2;
	private JTextField Aura_2;
	private JTextField Drina_2;
	private JTextField Milka_2;
	private JTextField Dorina_2;
	private JTextField Bajadera_2;
	private JTextField Merci_2;
	private JTextField Mikado_2;
	private JTextField Napolitanke_2;
	private JTextField Plazma_2;
	private JTextField Paris_2;
	private JTextField Noblice_2;
	private JTextField Domacica_2;
	private JTextField Orbit_2;
	private JTextField Airwaves_2;
	private JTextField Eclipse_2;
	private JTextField Trident_2;
	private JTextField Extra_2;
	private JTextField Fini_2;
	private JTextField Haribo_2;
	private JTextField Skittles_2;
	private JTextField Bronhi_2;
	private JTextField Kiki_2;
	private JTextField Water_2;
	private JTextField CarbonateWater_2;
	private JTextField NonCarbonateJuice_2;
	private JTextField CarbonateJuice_2;
	private JTextField EnergyDrink_2;
	private JTextField Lays_2;
	private JTextField Pringles_2;
	private JTextField Doritos_2;
	private JTextField Cheetos_2;
	private JTextField MrChips_2;
	private JTextField Tax;
	private JTextField SubTotal;
	private JTextField Total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trafika window = new Trafika();
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
	public Trafika() {
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
		
		JPanel novine = new JPanel();
		novine.setBounds(10, 11, 284, 256);
		novine.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(novine);
		novine.setLayout(null);
		
		JLabel Oslobodenje = new JLabel("Oslobo\u0111enje");
		Oslobodenje.setBounds(10, 104, 91, 27);
		novine.add(Oslobodenje);
		
		JLabel DnevniList = new JLabel("Dnevni List");
		DnevniList.setBounds(10, 142, 91, 27);
		novine.add(DnevniList);
		
		JLabel NezavisneNovine = new JLabel("Nezavisni Novine");
		NezavisneNovine.setBounds(10, 180, 91, 27);
		novine.add(NezavisneNovine);
		
		JLabel NovoVrijeme = new JLabel("Novo Vrijeme");
		NovoVrijeme.setBounds(10, 218, 91, 27);
		novine.add(NovoVrijeme);
		
		JLabel DnevniAvaz = new JLabel("Dnevni Avaz");
		DnevniAvaz.setBounds(10, 66, 91, 27);
		novine.add(DnevniAvaz);
		
		JLabel NEWSPAPER = new JLabel("NEWSPAPER");
		NEWSPAPER.setBounds(10, 11, 120, 40);
		novine.add(NEWSPAPER);
		
		DnevniAvaz_2 = new JTextField();
		DnevniAvaz_2.setBounds(145, 69, 112, 20);
		novine.add(DnevniAvaz_2);
		DnevniAvaz_2.setColumns(10);
		
		Oslobodenje_2 = new JTextField();
		Oslobodenje_2.setColumns(10);
		Oslobodenje_2.setBounds(145, 107, 112, 20);
		novine.add(Oslobodenje_2);
		
		DnevniList_2 = new JTextField();
		DnevniList_2.setColumns(10);
		DnevniList_2.setBounds(145, 145, 112, 20);
		novine.add(DnevniList_2);
		
		NezavisneNovine_2 = new JTextField();
		NezavisneNovine_2.setColumns(10);
		NezavisneNovine_2.setBounds(145, 183, 112, 20);
		novine.add(NezavisneNovine_2);
		
		NovoVrijeme_2 = new JTextField();
		NovoVrijeme_2.setColumns(10);
		NovoVrijeme_2.setBounds(145, 221, 112, 20);
		novine.add(NovoVrijeme_2);
		
		JPanel cigare = new JPanel();
		cigare.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cigare.setBounds(359, 11, 284, 256);
		frame.getContentPane().add(cigare);
		cigare.setLayout(null);
		
		JLabel CIGARETTE = new JLabel("CIGARETTE");
		CIGARETTE.setBounds(10, 11, 120, 40);
		cigare.add(CIGARETTE);
		
		JLabel Marlboro = new JLabel("Marlboro");
		Marlboro.setBounds(10, 66, 91, 27);
		cigare.add(Marlboro);
		
		JLabel Davidoff = new JLabel("Davidoff");
		Davidoff.setBounds(10, 104, 91, 27);
		cigare.add(Davidoff);
		
		JLabel Dunhill = new JLabel("Dunhill");
		Dunhill.setBounds(10, 142, 91, 27);
		cigare.add(Dunhill);
		
		JLabel Aura = new JLabel("Aura");
		Aura.setBounds(10, 180, 91, 27);
		cigare.add(Aura);
		
		JLabel Drina = new JLabel("Drina");
		Drina.setBounds(10, 218, 91, 27);
		cigare.add(Drina);
		
		Marlboro_2 = new JTextField();
		Marlboro_2.setColumns(10);
		Marlboro_2.setBounds(162, 69, 112, 20);
		cigare.add(Marlboro_2);
		
		Davidoff_2 = new JTextField();
		Davidoff_2.setColumns(10);
		Davidoff_2.setBounds(162, 107, 112, 20);
		cigare.add(Davidoff_2);
		
		Dunhill_2 = new JTextField();
		Dunhill_2.setColumns(10);
		Dunhill_2.setBounds(162, 145, 112, 20);
		cigare.add(Dunhill_2);
		
		Aura_2 = new JTextField();
		Aura_2.setColumns(10);
		Aura_2.setBounds(162, 183, 112, 20);
		cigare.add(Aura_2);
		
		Drina_2 = new JTextField();
		Drina_2.setColumns(10);
		Drina_2.setBounds(162, 221, 112, 20);
		cigare.add(Drina_2);
		
		JPanel cokolade = new JPanel();
		cokolade.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cokolade.setBounds(708, 11, 284, 256);
		frame.getContentPane().add(cokolade);
		cokolade.setLayout(null);
		
		JLabel CHOCOLATE = new JLabel("CHOHOLATE");
		CHOCOLATE.setBounds(10, 11, 120, 40);
		cokolade.add(CHOCOLATE);
		
		JLabel Milka = new JLabel("Milka");
		Milka.setBounds(10, 66, 91, 27);
		cokolade.add(Milka);
		
		JLabel Dorina = new JLabel("Dorina");
		Dorina.setBounds(10, 104, 91, 27);
		cokolade.add(Dorina);
		
		JLabel Bajadera = new JLabel("Bajadera");
		Bajadera.setBounds(10, 142, 91, 27);
		cokolade.add(Bajadera);
		
		JLabel Merci = new JLabel("Merci");
		Merci.setBounds(10, 180, 91, 27);
		cokolade.add(Merci);
		
		JLabel Mikado = new JLabel("Mikado");
		Mikado.setBounds(10, 218, 91, 27);
		cokolade.add(Mikado);
		
		Milka_2 = new JTextField();
		Milka_2.setColumns(10);
		Milka_2.setBounds(162, 69, 112, 20);
		cokolade.add(Milka_2);
		
		Dorina_2 = new JTextField();
		Dorina_2.setColumns(10);
		Dorina_2.setBounds(162, 107, 112, 20);
		cokolade.add(Dorina_2);
		
		Bajadera_2 = new JTextField();
		Bajadera_2.setColumns(10);
		Bajadera_2.setBounds(162, 145, 112, 20);
		cokolade.add(Bajadera_2);
		
		Merci_2 = new JTextField();
		Merci_2.setColumns(10);
		Merci_2.setBounds(162, 183, 112, 20);
		cokolade.add(Merci_2);
		
		Mikado_2 = new JTextField();
		Mikado_2.setColumns(10);
		Mikado_2.setBounds(162, 221, 112, 20);
		cokolade.add(Mikado_2);
		
		JPanel keks = new JPanel();
		keks.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		keks.setBounds(1057, 11, 284, 256);
		frame.getContentPane().add(keks);
		keks.setLayout(null);
		
		JLabel COOKIES = new JLabel("COOKIES");
		COOKIES.setBounds(10, 11, 120, 40);
		keks.add(COOKIES);
		
		JLabel Napolitanke = new JLabel("Napolitanke");
		Napolitanke.setBounds(10, 66, 91, 27);
		keks.add(Napolitanke);
		
		JLabel Plazma = new JLabel("Plazma");
		Plazma.setBounds(10, 104, 91, 27);
		keks.add(Plazma);
		
		JLabel Paris = new JLabel("Paris");
		Paris.setBounds(10, 142, 91, 27);
		keks.add(Paris);
		
		JLabel Noblice = new JLabel("Noblice");
		Noblice.setBounds(10, 180, 91, 27);
		keks.add(Noblice);
		
		JLabel Domacica = new JLabel("Domacica");
		Domacica.setBounds(10, 218, 91, 27);
		keks.add(Domacica);
		
		Napolitanke_2 = new JTextField();
		Napolitanke_2.setColumns(10);
		Napolitanke_2.setBounds(162, 69, 112, 20);
		keks.add(Napolitanke_2);
		
		Plazma_2 = new JTextField();
		Plazma_2.setColumns(10);
		Plazma_2.setBounds(162, 107, 112, 20);
		keks.add(Plazma_2);
		
		Paris_2 = new JTextField();
		Paris_2.setColumns(10);
		Paris_2.setBounds(162, 145, 112, 20);
		keks.add(Paris_2);
		
		Noblice_2 = new JTextField();
		Noblice_2.setColumns(10);
		Noblice_2.setBounds(162, 183, 112, 20);
		keks.add(Noblice_2);
		
		Domacica_2 = new JTextField();
		Domacica_2.setColumns(10);
		Domacica_2.setBounds(162, 221, 112, 20);
		keks.add(Domacica_2);
		
		JPanel cips = new JPanel();
		cips.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cips.setBounds(10, 297, 284, 256);
		frame.getContentPane().add(cips);
		cips.setLayout(null);
		
		JLabel CHIPS = new JLabel("CHIPS");
		CHIPS.setBounds(10, 11, 120, 40);
		cips.add(CHIPS);
		
		JLabel Lays = new JLabel("Lays");
		Lays.setBounds(10, 66, 91, 27);
		cips.add(Lays);
		
		JLabel Pringles = new JLabel("Pringles");
		Pringles.setBounds(10, 104, 91, 27);
		cips.add(Pringles);
		
		JLabel Doritos = new JLabel("Doritos");
		Doritos.setBounds(10, 142, 91, 27);
		cips.add(Doritos);
		
		JLabel Cheetos = new JLabel("Cheetos");
		Cheetos.setBounds(10, 180, 91, 27);
		cips.add(Cheetos);
		
		JLabel MrChips = new JLabel("Mr. Chips");
		MrChips.setBounds(10, 218, 91, 27);
		cips.add(MrChips);
		
		Lays_2 = new JTextField();
		Lays_2.setColumns(10);
		Lays_2.setBounds(162, 69, 112, 20);
		cips.add(Lays_2);
		
		Pringles_2 = new JTextField();
		Pringles_2.setColumns(10);
		Pringles_2.setBounds(162, 107, 112, 20);
		cips.add(Pringles_2);
		
		Doritos_2 = new JTextField();
		Doritos_2.setColumns(10);
		Doritos_2.setBounds(162, 145, 112, 20);
		cips.add(Doritos_2);
		
		Cheetos_2 = new JTextField();
		Cheetos_2.setColumns(10);
		Cheetos_2.setBounds(162, 183, 112, 20);
		cips.add(Cheetos_2);
		
		MrChips_2 = new JTextField();
		MrChips_2.setColumns(10);
		MrChips_2.setBounds(162, 221, 112, 20);
		cips.add(MrChips_2);
		
		JPanel sokovi = new JPanel();
		sokovi.setLayout(null);
		sokovi.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		sokovi.setBounds(359, 297, 284, 256);
		frame.getContentPane().add(sokovi);
		
		JLabel DRINKS = new JLabel("DRINKS");
		DRINKS.setBounds(10, 11, 120, 40);
		sokovi.add(DRINKS);
		
		JLabel Water = new JLabel("Water");
		Water.setBounds(10, 66, 91, 27);
		sokovi.add(Water);
		
		JLabel CarbonateWater = new JLabel("Carbonate Water");
		CarbonateWater.setBounds(10, 104, 91, 27);
		sokovi.add(CarbonateWater);
		
		JLabel NonCarbonateJuice = new JLabel("Non Carbonate Juice");
		NonCarbonateJuice.setBounds(10, 142, 120, 27);
		sokovi.add(NonCarbonateJuice);
		
		JLabel CarbonateJuice = new JLabel("Carbonate Juice");
		CarbonateJuice.setBounds(10, 180, 91, 27);
		sokovi.add(CarbonateJuice);
		
		JLabel EnergyDrink = new JLabel("Energy Drink");
		EnergyDrink.setBounds(10, 218, 91, 27);
		sokovi.add(EnergyDrink);
		
		Water_2 = new JTextField();
		Water_2.setColumns(10);
		Water_2.setBounds(162, 69, 112, 20);
		sokovi.add(Water_2);
		
		CarbonateWater_2 = new JTextField();
		CarbonateWater_2.setColumns(10);
		CarbonateWater_2.setBounds(162, 107, 112, 20);
		sokovi.add(CarbonateWater_2);
		
		NonCarbonateJuice_2 = new JTextField();
		NonCarbonateJuice_2.setColumns(10);
		NonCarbonateJuice_2.setBounds(162, 145, 112, 20);
		sokovi.add(NonCarbonateJuice_2);
		
		CarbonateJuice_2 = new JTextField();
		CarbonateJuice_2.setColumns(10);
		CarbonateJuice_2.setBounds(162, 183, 112, 20);
		sokovi.add(CarbonateJuice_2);
		
		EnergyDrink_2 = new JTextField();
		EnergyDrink_2.setColumns(10);
		EnergyDrink_2.setBounds(162, 221, 112, 20);
		sokovi.add(EnergyDrink_2);
		
		JPanel zvake = new JPanel();
		zvake.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		zvake.setBounds(1057, 297, 284, 256);
		frame.getContentPane().add(zvake);
		zvake.setLayout(null);
		
		JLabel CHEWINGGUM = new JLabel("CHEWING GUM");
		CHEWINGGUM.setBounds(10, 11, 120, 40);
		zvake.add(CHEWINGGUM);
		
		JLabel Orbit = new JLabel("Orbit");
		Orbit.setBounds(10, 66, 91, 27);
		zvake.add(Orbit);
		
		JLabel Airwaves = new JLabel("Airwaves");
		Airwaves.setBounds(10, 104, 91, 27);
		zvake.add(Airwaves);
		
		JLabel Eclipse = new JLabel("Eclipse");
		Eclipse.setBounds(10, 142, 91, 27);
		zvake.add(Eclipse);
		
		JLabel Trident = new JLabel("Trident");
		Trident.setBounds(10, 180, 91, 27);
		zvake.add(Trident);
		
		JLabel Extra = new JLabel("Extra");
		Extra.setBounds(10, 218, 91, 27);
		zvake.add(Extra);
		
		Orbit_2 = new JTextField();
		Orbit_2.setColumns(10);
		Orbit_2.setBounds(162, 69, 112, 20);
		zvake.add(Orbit_2);
		
		Airwaves_2 = new JTextField();
		Airwaves_2.setColumns(10);
		Airwaves_2.setBounds(162, 107, 112, 20);
		zvake.add(Airwaves_2);
		
		Eclipse_2 = new JTextField();
		Eclipse_2.setColumns(10);
		Eclipse_2.setBounds(162, 145, 112, 20);
		zvake.add(Eclipse_2);
		
		Trident_2 = new JTextField();
		Trident_2.setColumns(10);
		Trident_2.setBounds(162, 183, 112, 20);
		zvake.add(Trident_2);
		
		Extra_2 = new JTextField();
		Extra_2.setColumns(10);
		Extra_2.setBounds(162, 221, 112, 20);
		zvake.add(Extra_2);
		
		JPanel Bobe = new JPanel();
		Bobe.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Bobe.setBounds(708, 297, 284, 256);
		frame.getContentPane().add(Bobe);
		Bobe.setLayout(null);
		
		JLabel CANDY = new JLabel("CANDY");
		CANDY.setBounds(10, 11, 120, 40);
		Bobe.add(CANDY);
		
		JLabel Fini = new JLabel("Fini");
		Fini.setBounds(10, 66, 91, 27);
		Bobe.add(Fini);
		
		JLabel Haribo = new JLabel("Haribo");
		Haribo.setBounds(10, 104, 91, 27);
		Bobe.add(Haribo);
		
		JLabel Skittles = new JLabel("Skittles");
		Skittles.setBounds(10, 142, 91, 27);
		Bobe.add(Skittles);
		
		JLabel Bronhi = new JLabel("Bronhi");
		Bronhi.setBounds(10, 180, 91, 27);
		Bobe.add(Bronhi);
		
		JLabel Kiki = new JLabel("Kiki");
		Kiki.setBounds(10, 218, 91, 27);
		Bobe.add(Kiki);
		
		Fini_2 = new JTextField();
		Fini_2.setColumns(10);
		Fini_2.setBounds(162, 69, 112, 20);
		Bobe.add(Fini_2);
		
		Haribo_2 = new JTextField();
		Haribo_2.setColumns(10);
		Haribo_2.setBounds(162, 107, 112, 20);
		Bobe.add(Haribo_2);
		
		Skittles_2 = new JTextField();
		Skittles_2.setColumns(10);
		Skittles_2.setBounds(162, 145, 112, 20);
		Bobe.add(Skittles_2);
		
		Bronhi_2 = new JTextField();
		Bronhi_2.setColumns(10);
		Bronhi_2.setBounds(162, 183, 112, 20);
		Bobe.add(Bronhi_2);
		
		Kiki_2 = new JTextField();
		Kiki_2.setColumns(10);
		Kiki_2.setBounds(162, 221, 112, 20);
		Bobe.add(Kiki_2);
		
		JButton total = new JButton("TOTAL");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Avaz=Double.parseDouble(DnevniAvaz_2.getText());
				double iAvaz=1.50;
				double DA;
				DA=(Avaz*iAvaz);
				
				double Oslobodenje=Double.parseDouble(Oslobodenje_2.getText());
				double iOslobodenje=1;
				double OS;
				OS=(Oslobodenje*iOslobodenje);
				
				double DnevniList=Double.parseDouble(DnevniList_2.getText());
				double iDnevniList=1.3;
				double DL;
				DL=(DnevniList*iDnevniList);
				
				double NezavisneNovine=Double.parseDouble(NezavisneNovine_2.getText());
				double iNezavisneNovine=1.5;
				double NN;
				NN=(NezavisneNovine*iNezavisneNovine);
				
				double NovoVrijeme=Double.parseDouble(NovoVrijeme_2.getText());
				double iNovoVrijeme=2;
				double NV;
				NV=(NovoVrijeme*iNovoVrijeme);
				
				double Marlboro=Double.parseDouble(Marlboro_2.getText());
				double iMarlboro=5;
				double M;
				M=(Marlboro*iMarlboro);
				
				double Davidoff=Double.parseDouble(Davidoff_2.getText());
				double iDavidoff=5.20;
				double D;
				D=(Davidoff*iDavidoff);
				
				double Dunhill=Double.parseDouble(Dunhill_2.getText());
				double iDunhill=5;
				double D_2;
				D_2=(Dunhill*iDunhill);
				
				double Aura=Double.parseDouble(Aura_2.getText());
				double iAura=4.30;
				double A;
				A=(Aura*iAura);
				
				double Drina=Double.parseDouble(Drina_2.getText());
				double iDrina=4;
				double D_3;
				D_3=(Drina*iDrina);
				
				double Milka=Double.parseDouble(Milka_2.getText());
				double iMilka=2.50;
				double MM;
				MM=(Milka*iMilka);
				
				double Dorina=Double.parseDouble(Dorina_2.getText());
				double iDorina=2;
				double D_4;
				D_4=(Dorina*iDorina);
				
				double Bajadera=Double.parseDouble(Bajadera_2.getText());
				double iBajadera=5;
				double B;
				B=(Bajadera*iBajadera);
				
				double Merci=Double.parseDouble(Merci_2.getText());
				double iMerci=10;
				double MM_2;
				MM_2=(Merci*iMerci);
				
				double Mikado=Double.parseDouble(Mikado_2.getText());
				double iMikado=1.50;
				double M_2;
				M_2=(Mikado*iMikado);
				
				
				double Napolitanke=Double.parseDouble(Napolitanke_2.getText());
				double iNapolitanke=2;
				double N;
				N=(Napolitanke*iNapolitanke);
				
				double Plazma=Double.parseDouble(Plazma_2.getText());
				double iPlazma=1.50;
				double P;
			    P=(Plazma*iPlazma);
				
				double Paris=Double.parseDouble(Paris_2.getText());
				double iParis=2;
				double P_1;
			    P_1=(Paris*iParis);
			
				double Noblice=Double.parseDouble(Noblice_2.getText());
				double iNoblice=2.50;
				double N_2;
			    N_2=(Noblice*iNoblice);
			
				double Domacica=Double.parseDouble(Domacica_2.getText());
				double iDomacica=2.50;
				double D_5;
			    D_5=(Domacica*iDomacica);
				
				
				double Orbit=Double.parseDouble(Orbit_2.getText());
				double iOrbit=1;
				double O;
			    O=(Orbit*iOrbit);
			
				double Airwaves=Double.parseDouble(Airwaves_2.getText());
				double iAirwaves=1;
				double A_2;
			    A_2=(Airwaves*iAirwaves);
				
				double Eclipse=Double.parseDouble(Eclipse_2.getText());
				double iEclipse=0.5;
				double E;
			    E=(Eclipse*iEclipse);
				
				double Trident=Double.parseDouble(Trident_2.getText());
				double iTrident=0.8;
				double T;
			    T=(Trident*iTrident);
			
				double Extra=Double.parseDouble(Extra_2.getText());
				double iExtra=1.5;
				double E_2;
			    E_2=(Extra*iExtra);
			
				double Fini=Double.parseDouble(Fini_2.getText());
				double iFini=1.8;
				double F;
			    F=(Fini*iFini);
			
				double Haribo=Double.parseDouble(Haribo_2.getText());
				double iHaribo=2;
				double H;
			    H=(Haribo*iHaribo);
			
				double Skittles=Double.parseDouble(Skittles_2.getText());
				double iSkittles=1;
				double S;
			    S=(Skittles*iSkittles);
			
				double Bronhi=Double.parseDouble(Bronhi_2.getText());
				double iBronhi=1.5;
				double B_2;
			    B_2=(Bronhi*iBronhi);
		
				double Kiki=Double.parseDouble(Kiki_2.getText());
				double iKiki=1.3;
				double K;
			    K=(Kiki*iKiki);
		
				double Water=Double.parseDouble(Water_2.getText());
				double iWater=1.5;
				double W;
			    W=(Water*iWater);
		
				
				double CarbonateWater=Double.parseDouble(CarbonateWater_2.getText());
				double iCarbonateWater=2;
				double C;
			    C=(CarbonateWater*iCarbonateWater);
			
				
				double NonCarbonateJuice=Double.parseDouble(NonCarbonateJuice_2.getText());
				double iNonCarbonateJuice=3;
				double NC;
			    NC=(NonCarbonateJuice*iNonCarbonateJuice);
		
				
				double CarbonateJuice=Double.parseDouble(CarbonateJuice_2.getText());
				double iCarbonateJuice=2;
				double CJ;
			    CJ=(CarbonateJuice*iCarbonateJuice);
		
				
				double EnergyDrink=Double.parseDouble(EnergyDrink_2.getText());
				double iEnergyDrink=4;
				double ED;
			    ED=(EnergyDrink*iEnergyDrink);
	
				
				double Lays=Double.parseDouble(Lays_2.getText());
				double iLays=1;
				double L;
			    L=(Lays*iLays);
	
				
				double Pringles=Double.parseDouble(Pringles_2.getText());
				double iPringles=5;
				double P_2;
			    P_2=(Pringles*iPringles);
	
				
				double Doritos=Double.parseDouble(Doritos_2.getText());
				double iDoritos=1.5;
				double D_6;
			    D_6=(Doritos*iDoritos);
			
				
				double Cheetos=Double.parseDouble(Cheetos_2.getText());
				double iCheetos=1.5;
				double C_2;
			    C_2=(Cheetos*iCheetos);
			
				
				double MrChips=Double.parseDouble(MrChips_2.getText());
				double iMrChips=2;
				double MC;
			    MC=(MrChips*iMrChips);
				String cips_4=String.format("%.2f", DA+OS+DL+NN+NV+M+D+D_2+A+D_3+M_2+N+MM+B+D_4+MM_2
						+P+P_1+N_2+D_5+O+A_2+E+T+E_2+F+H+S+B_2+K+W+C
						+NC+CJ+ED+L+P_2+D_6+C_2+MC);
				SubTotal.setText(cips_4);
				double subtotal=Double.parseDouble(SubTotal.getText());
				
				
				double tax=subtotal/100;
				String tax_2=String.format("%.2f",tax);
				Tax.setText(tax_2);
				
				
				double total=tax+subtotal;
				String total_2=String.format("%.2f", total);
				Total.setText(total_2);
				
				
				JOptionPane.showMessageDialog(null, "Total"+total_2);
>>>>>>> branch 'master' of https://github.com/IBU-IT/Hotel.git
				
				
			}
		});
		total.setBounds(235, 584, 185, 75);
		frame.getContentPane().add(total);
		
		JButton reset = new JButton("RESET");
		reset.setForeground(Color.DARK_GRAY);
		reset.setBackground(UIManager.getColor("Button.background"));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DnevniAvaz_2.setText(null);
				Oslobodenje_2.setText(null);
				DnevniList_2.setText(null);
				NezavisneNovine_2.setText(null);
				NovoVrijeme_2.setText(null);
				Marlboro_2.setText(null);
				Davidoff_2.setText(null);
				Dunhill_2.setText(null);
				Aura_2.setText(null);
				Drina_2.setText(null);
				Milka_2.setText(null);
				Dorina_2.setText(null);
				Bajadera_2.setText(null);
				Merci_2.setText(null);
				Mikado_2.setText(null);
				Napolitanke_2.setText(null);
				Plazma_2.setText(null);
				Paris_2.setText(null);
				Noblice_2.setText(null);
				Domacica_2.setText(null);
				Orbit_2.setText(null);
				Airwaves_2.setText(null);
				Eclipse_2.setText(null);
				Trident_2.setText(null);
				Extra_2.setText(null);
				Fini_2.setText(null);
				Haribo_2.setText(null);
				Skittles_2.setText(null);
				Bronhi_2.setText(null);
				Kiki_2.setText(null);
				Water_2.setText(null);
				CarbonateWater_2.setText(null);
				NonCarbonateJuice_2.setText(null);
				CarbonateJuice_2.setText(null);
				EnergyDrink_2.setText(null);
				Lays_2.setText(null);
				Pringles_2.setText(null);
				Doritos_2.setText(null);
				Cheetos_2.setText(null);
				MrChips_2.setText(null);
			}
		});
		reset.setBounds(588, 584, 185, 75);
		frame.getContentPane().add(reset);
		
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(937, 584, 185, 75);
		frame.getContentPane().add(exit);
		
		Tax = new JTextField();
		Tax.setForeground(UIManager.getColor("Button.background"));
		Tax.setBackground(UIManager.getColor("Button.background"));
		Tax.setBounds(0, 651, 5, 0);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		SubTotal = new JTextField();
		SubTotal.setForeground(UIManager.getColor("Button.background"));
		SubTotal.setBackground(UIManager.getColor("Button.background"));
		SubTotal.setBounds(10, 662, 5, 0);
		frame.getContentPane().add(SubTotal);
		SubTotal.setColumns(10);
		
		Total = new JTextField();
		Total.setForeground(UIManager.getColor("Button.background"));
		Total.setBackground(UIManager.getColor("Button.background"));
		Total.setBounds(54, 662, 5, 0);
		frame.getContentPane().add(Total);
		Total.setColumns(10);
	}
}
