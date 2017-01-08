package ba.ibu.edu.oop;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jewerly {

	private JFrame frame;
	private JTextField FireN_2;
	private JTextField ForN_2;
	private JTextField FortN_2;
	private JTextField FlameN_2;
	private JTextField FoamN_2;
	private JTextField FunkN_2;
	private JTextField FantN_2;
	private JTextField FolioP_2;
	private JTextField ForP_2;
	private JTextField FireP_2;
	private JTextField BalP_2;
	private JTextField FortP_2;
	private JTextField FizzyP_2;
	private JTextField AngelicP_2;
	private JTextField ForPE_2;
	private JTextField EPE_2;
	private JTextField FirePE_2;
	private JTextField FlamePE_2;
	private JTextField FortPE_2;
	private JTextField FoamPE_2;
	private JTextField GaletPE_2;
	private JTextField FireB_2;
	private JTextField CrysC_2;
	private JTextField EngB_2;
	private JTextField FreshB_2;
	private JTextField SwanB_2;
	private JTextField SubB_2;
	private JTextField AngB_2;
	private JTextField FCL_2;
	private JTextField FN_2;
	private JTextField FireCL_2;
	private JTextField RCL_2;
	private JTextField EB_2;
	private JTextField ESS_2;
	private JTextField DBL_2;
	private JTextField ES_2;
	private JTextField FOS_2;
	private JTextField FS_2;
	private JTextField AnS_2;
	private JTextField AtS_2;
	private JTextField FunkS_2;
	private JTextField NudeS_2;
	private JTextField ISW_2;
	private JTextField FreshRing_2;
	private JTextField DynamicRing_2;
	private JTextField FunRing_2;
	private JTextField FictionRing_2;
	private JTextField FrissonRing_2;
	private JTextField VittoreRing_2;

	/**
	 * Launch the application.
	 */
	public static void qq() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jewerly window = new Jewerly();
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
	public Jewerly() {
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
		
		JPanel Necklaces = new JPanel();
		Necklaces.setBounds(10, 11, 325, 318);
		Necklaces.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(Necklaces);
		Necklaces.setLayout(null);
		
		JLabel Neckales = new JLabel("Neckales");
		Neckales.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Neckales.setBounds(10, 11, 142, 48);
		Necklaces.add(Neckales);
		
		JLabel FireN = new JLabel("Firework Necklace");
		FireN.setBounds(10, 73, 167, 24);
		Necklaces.add(FireN);
		
		JLabel ForN = new JLabel("Formidable Large Necklace");
		ForN.setBounds(10, 108, 167, 24);
		Necklaces.add(ForN);
		
		JLabel FortN = new JLabel("Fortunately Necklace");
		FortN.setBounds(10, 143, 167, 24);
		Necklaces.add(FortN);
		
		JLabel FlameN = new JLabel("Flame Necklase");
		FlameN.setBounds(10, 178, 167, 24);
		Necklaces.add(FlameN);
		
		JLabel FoamN = new JLabel("Foam Necklase");
		FoamN.setBounds(10, 213, 167, 24);
		Necklaces.add(FoamN);
		
		JLabel FunkN = new JLabel("Funk Necklase");
		FunkN.setBounds(10, 248, 167, 24);
		Necklaces.add(FunkN);
		
		JLabel FantN = new JLabel("Fantastic Necklase");
		FantN.setBounds(10, 283, 167, 24);
		Necklaces.add(FantN);
		
		FireN_2 = new JTextField();
		FireN_2.setBounds(177, 75, 120, 22);
		Necklaces.add(FireN_2);
		FireN_2.setColumns(10);
		
		ForN_2 = new JTextField();
		ForN_2.setColumns(10);
		ForN_2.setBounds(177, 110, 120, 22);
		Necklaces.add(ForN_2);
		
		FortN_2 = new JTextField();
		FortN_2.setColumns(10);
		FortN_2.setBounds(177, 145, 120, 22);
		Necklaces.add(FortN_2);
		
		FlameN_2 = new JTextField();
		FlameN_2.setColumns(10);
		FlameN_2.setBounds(177, 180, 120, 22);
		Necklaces.add(FlameN_2);
		
		FoamN_2 = new JTextField();
		FoamN_2.setColumns(10);
		FoamN_2.setBounds(177, 215, 120, 22);
		Necklaces.add(FoamN_2);
		
		FunkN_2 = new JTextField();
		FunkN_2.setColumns(10);
		FunkN_2.setBounds(177, 250, 120, 22);
		Necklaces.add(FunkN_2);
		
		FantN_2 = new JTextField();
		FantN_2.setColumns(10);
		FantN_2.setBounds(177, 285, 120, 22);
		Necklaces.add(FantN_2);
		
		JPanel Pendants = new JPanel();
		Pendants.setBounds(349, 11, 325, 318);
		frame.getContentPane().add(Pendants);
		Pendants.setLayout(null);
		Pendants.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		
		JLabel PENDANTS = new JLabel("Pendants");
		PENDANTS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PENDANTS.setBounds(10, 11, 142, 48);
		Pendants.add(PENDANTS);
		
		JLabel FolioP = new JLabel("Folio Pendant");
		FolioP.setBounds(10, 73, 167, 24);
		Pendants.add(FolioP);
		
		JLabel ForP = new JLabel("Formidable Pendant");
		ForP.setBounds(10, 108, 167, 24);
		Pendants.add(ForP);
		
		JLabel FireP = new JLabel("Firework Pendant");
		FireP.setBounds(10, 143, 167, 24);
		Pendants.add(FireP);
		
		JLabel BalP = new JLabel("Balthazar Pendant");
		BalP.setBounds(10, 178, 167, 24);
		Pendants.add(BalP);
		
		JLabel FortP = new JLabel("Fortunately Pendant");
		FortP.setBounds(10, 213, 167, 24);
		Pendants.add(FortP);
		
		JLabel FizzyP = new JLabel("Fizzy Pendant");
		FizzyP.setBounds(10, 248, 167, 24);
		Pendants.add(FizzyP);
		
		JLabel AngelicP = new JLabel("Angelic Pendant");
		AngelicP.setBounds(10, 283, 167, 24);
		Pendants.add(AngelicP);
		
		FolioP_2 = new JTextField();
		FolioP_2.setColumns(10);
		FolioP_2.setBounds(177, 75, 120, 22);
		Pendants.add(FolioP_2);
		
		ForP_2 = new JTextField();
		ForP_2.setColumns(10);
		ForP_2.setBounds(177, 110, 120, 22);
		Pendants.add(ForP_2);
		
		FireP_2 = new JTextField();
		FireP_2.setColumns(10);
		FireP_2.setBounds(177, 145, 120, 22);
		Pendants.add(FireP_2);
		
		BalP_2 = new JTextField();
		BalP_2.setColumns(10);
		BalP_2.setBounds(177, 180, 120, 22);
		Pendants.add(BalP_2);
		
		FortP_2 = new JTextField();
		FortP_2.setColumns(10);
		FortP_2.setBounds(177, 215, 120, 22);
		Pendants.add(FortP_2);
		
		FizzyP_2 = new JTextField();
		FizzyP_2.setColumns(10);
		FizzyP_2.setBounds(177, 250, 120, 22);
		Pendants.add(FizzyP_2);
		
		AngelicP_2 = new JTextField();
		AngelicP_2.setColumns(10);
		AngelicP_2.setBounds(177, 285, 120, 22);
		Pendants.add(AngelicP_2);
		
		JPanel EARRINGS = new JPanel();
		EARRINGS.setLayout(null);
		EARRINGS.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		EARRINGS.setBounds(684, 11, 325, 318);
		frame.getContentPane().add(EARRINGS);
		
		JLabel Earrings = new JLabel("Earrings");
		Earrings.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Earrings.setBounds(10, 11, 142, 48);
		EARRINGS.add(Earrings);
		
		JLabel ForPE = new JLabel("Formidable Pierced Earrings");
		ForPE.setBounds(10, 73, 168, 24);
		EARRINGS.add(ForPE);
		
		JLabel EPE = new JLabel("Engaged Pierced Earrings");
		EPE.setBounds(10, 108, 168, 24);
		EARRINGS.add(EPE);
		
		JLabel FirePE = new JLabel("Firework Pierced Earring");
		FirePE.setBounds(10, 143, 142, 24);
		EARRINGS.add(FirePE);
		
		JLabel FlamePE = new JLabel("Flame Pierced Earrings");
		FlamePE.setBounds(10, 178, 142, 24);
		EARRINGS.add(FlamePE);
		
		JLabel FortPE = new JLabel("Fortunately Pierced Earrings");
		FortPE.setBounds(10, 213, 142, 24);
		EARRINGS.add(FortPE);
		
		JLabel FoamPE = new JLabel("Foam Pierced Earrings");
		FoamPE.setBounds(10, 248, 120, 24);
		EARRINGS.add(FoamPE);
		
		JLabel GaletPE = new JLabel("Galet Pierced Earrings");
		GaletPE.setBounds(10, 283, 142, 24);
		EARRINGS.add(GaletPE);
		
		ForPE_2 = new JTextField();
		ForPE_2.setColumns(10);
		ForPE_2.setBounds(177, 75, 120, 22);
		EARRINGS.add(ForPE_2);
		
		EPE_2 = new JTextField();
		EPE_2.setColumns(10);
		EPE_2.setBounds(177, 110, 120, 22);
		EARRINGS.add(EPE_2);
		
		FirePE_2 = new JTextField();
		FirePE_2.setColumns(10);
		FirePE_2.setBounds(177, 145, 120, 22);
		EARRINGS.add(FirePE_2);
		
		FlamePE_2 = new JTextField();
		FlamePE_2.setColumns(10);
		FlamePE_2.setBounds(177, 180, 120, 22);
		EARRINGS.add(FlamePE_2);
		
		FortPE_2 = new JTextField();
		FortPE_2.setColumns(10);
		FortPE_2.setBounds(177, 215, 120, 22);
		EARRINGS.add(FortPE_2);
		
		FoamPE_2 = new JTextField();
		FoamPE_2.setColumns(10);
		FoamPE_2.setBounds(177, 250, 120, 22);
		EARRINGS.add(FoamPE_2);
		
		GaletPE_2 = new JTextField();
		GaletPE_2.setColumns(10);
		GaletPE_2.setBounds(177, 285, 120, 22);
		EARRINGS.add(GaletPE_2);
		
		JPanel BRACELETS = new JPanel();
		BRACELETS.setLayout(null);
		BRACELETS.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		BRACELETS.setBounds(1017, 11, 325, 318);
		frame.getContentPane().add(BRACELETS);
		
		JLabel Bracelets = new JLabel("Bracelets");
		Bracelets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Bracelets.setBounds(10, 11, 142, 48);
		BRACELETS.add(Bracelets);
		
		JLabel FireB = new JLabel("Firework Bracelet");
		FireB.setBounds(10, 73, 142, 24);
		BRACELETS.add(FireB);
		
		JLabel CrysC = new JLabel("Crystaldust Cuff");
		CrysC.setBounds(10, 108, 156, 24);
		BRACELETS.add(CrysC);
		
		JLabel EngB = new JLabel("Engaged Bangle");
		EngB.setBounds(10, 143, 142, 24);
		BRACELETS.add(EngB);
		
		JLabel FreshB = new JLabel("Fresh Bangle");
		FreshB.setBounds(10, 178, 80, 24);
		BRACELETS.add(FreshB);
		
		JLabel SwanB = new JLabel("Swan Bangle");
		SwanB.setBounds(10, 213, 80, 24);
		BRACELETS.add(SwanB);
		
		JLabel SubB = new JLabel("Subtle Bracelet");
		SubB.setBounds(10, 248, 80, 24);
		BRACELETS.add(SubB);
		
		JLabel AngB = new JLabel("Angelic Bracelet");
		AngB.setBounds(10, 283, 142, 24);
		BRACELETS.add(AngB);
		
		FireB_2 = new JTextField();
		FireB_2.setColumns(10);
		FireB_2.setBounds(177, 75, 120, 22);
		BRACELETS.add(FireB_2);
		
		CrysC_2 = new JTextField();
		CrysC_2.setColumns(10);
		CrysC_2.setBounds(177, 110, 120, 22);
		BRACELETS.add(CrysC_2);
		
		EngB_2 = new JTextField();
		EngB_2.setColumns(10);
		EngB_2.setBounds(177, 145, 120, 22);
		BRACELETS.add(EngB_2);
		
		FreshB_2 = new JTextField();
		FreshB_2.setColumns(10);
		FreshB_2.setBounds(177, 180, 120, 22);
		BRACELETS.add(FreshB_2);
		
		SwanB_2 = new JTextField();
		SwanB_2.setColumns(10);
		SwanB_2.setBounds(177, 215, 120, 22);
		BRACELETS.add(SwanB_2);
		
		SubB_2 = new JTextField();
		SubB_2.setColumns(10);
		SubB_2.setBounds(177, 250, 120, 22);
		BRACELETS.add(SubB_2);
		
		AngB_2 = new JTextField();
		AngB_2.setColumns(10);
		AngB_2.setBounds(177, 285, 120, 22);
		BRACELETS.add(AngB_2);
		
		JPanel MENSCOLLECTION = new JPanel();
		MENSCOLLECTION.setLayout(null);
		MENSCOLLECTION.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		MENSCOLLECTION.setBounds(682, 360, 325, 318);
		frame.getContentPane().add(MENSCOLLECTION);
		
		JLabel MensCollection = new JLabel("Men's Collection");
		MensCollection.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MensCollection.setBounds(10, 11, 142, 48);
		MENSCOLLECTION.add(MensCollection);
		
		JLabel FCL = new JLabel("Fasten Cuff Links");
		FCL.setBounds(10, 73, 142, 24);
		MENSCOLLECTION.add(FCL);
		
		JLabel FN = new JLabel("Flare Necklace");
		FN.setBounds(10, 108, 156, 24);
		MENSCOLLECTION.add(FN);
		
		JLabel FireCL = new JLabel("Fire Cuff Links");
		FireCL.setBounds(10, 143, 142, 24);
		MENSCOLLECTION.add(FireCL);
		
		JLabel RCL = new JLabel("Round Cuff Links");
		RCL.setBounds(10, 178, 120, 24);
		MENSCOLLECTION.add(RCL);
		
		JLabel EB = new JLabel("Express Bracelet");
		EB.setBounds(10, 213, 120, 24);
		MENSCOLLECTION.add(EB);
		
		JLabel ESS = new JLabel("Effect Square Set");
		ESS.setBounds(10, 248, 130, 24);
		MENSCOLLECTION.add(ESS);
		
		JLabel DBL = new JLabel("Diagonal Bracelet Leather");
		DBL.setBounds(10, 283, 142, 24);
		MENSCOLLECTION.add(DBL);
		
		FCL_2 = new JTextField();
		FCL_2.setColumns(10);
		FCL_2.setBounds(177, 75, 120, 22);
		MENSCOLLECTION.add(FCL_2);
		
		FN_2 = new JTextField();
		FN_2.setColumns(10);
		FN_2.setBounds(177, 110, 120, 22);
		MENSCOLLECTION.add(FN_2);
		
		FireCL_2 = new JTextField();
		FireCL_2.setColumns(10);
		FireCL_2.setBounds(177, 144, 120, 22);
		MENSCOLLECTION.add(FireCL_2);
		
		RCL_2 = new JTextField();
		RCL_2.setColumns(10);
		RCL_2.setBounds(177, 180, 120, 22);
		MENSCOLLECTION.add(RCL_2);
		
		EB_2 = new JTextField();
		EB_2.setColumns(10);
		EB_2.setBounds(177, 215, 120, 22);
		MENSCOLLECTION.add(EB_2);
		
		ESS_2 = new JTextField();
		ESS_2.setColumns(10);
		ESS_2.setBounds(177, 250, 120, 22);
		MENSCOLLECTION.add(ESS_2);
		
		DBL_2 = new JTextField();
		DBL_2.setColumns(10);
		DBL_2.setBounds(177, 285, 120, 22);
		MENSCOLLECTION.add(DBL_2);
		
		JPanel SETS = new JPanel();
		SETS.setLayout(null);
		SETS.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		SETS.setBounds(349, 360, 325, 318);
		frame.getContentPane().add(SETS);
		
		JLabel Sets = new JLabel("Sets");
		Sets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Sets.setBounds(10, 11, 142, 48);
		SETS.add(Sets);
		
		JLabel ES = new JLabel("Engaged Set");
		ES.setBounds(10, 73, 142, 24);
		SETS.add(ES);
		
		JLabel FOS = new JLabel("Flame Open Set");
		FOS.setBounds(10, 108, 156, 24);
		SETS.add(FOS);
		
		JLabel FS = new JLabel("Folio Set");
		FS.setBounds(10, 143, 142, 24);
		SETS.add(FS);
		
		JLabel AnS = new JLabel("Angelic Set");
		AnS.setBounds(10, 178, 80, 24);
		SETS.add(AnS);
		
		JLabel AtS = new JLabel("Attract Heart Set");
		AtS.setBounds(10, 213, 112, 24);
		SETS.add(AtS);
		
		JLabel FunkS = new JLabel("Funk Set");
		FunkS.setBounds(10, 248, 80, 24);
		SETS.add(FunkS);
		
		JLabel NudeS = new JLabel("Nude Set");
		NudeS.setBounds(10, 283, 142, 24);
		SETS.add(NudeS);
		
		ES_2 = new JTextField();
		ES_2.setColumns(10);
		ES_2.setBounds(177, 75, 120, 22);
		SETS.add(ES_2);
		
		FOS_2 = new JTextField();
		FOS_2.setColumns(10);
		FOS_2.setBounds(177, 110, 120, 22);
		SETS.add(FOS_2);
		
		FS_2 = new JTextField();
		FS_2.setColumns(10);
		FS_2.setBounds(177, 145, 120, 22);
		SETS.add(FS_2);
		
		AnS_2 = new JTextField();
		AnS_2.setColumns(10);
		AnS_2.setBounds(177, 180, 120, 22);
		SETS.add(AnS_2);
		
		AtS_2 = new JTextField();
		AtS_2.setColumns(10);
		AtS_2.setBounds(177, 215, 120, 22);
		SETS.add(AtS_2);
		
		FunkS_2 = new JTextField();
		FunkS_2.setColumns(10);
		FunkS_2.setBounds(177, 250, 120, 22);
		SETS.add(FunkS_2);
		
		NudeS_2 = new JTextField();
		NudeS_2.setColumns(10);
		NudeS_2.setBounds(177, 285, 120, 22);
		SETS.add(NudeS_2);
		
		JPanel RINGS = new JPanel();
		RINGS.setLayout(null);
		RINGS.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		RINGS.setBounds(10, 360, 325, 318);
		frame.getContentPane().add(RINGS);
		
		JLabel rings = new JLabel("Rings");
		rings.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rings.setBounds(10, 11, 142, 48);
		RINGS.add(rings);
		
		JLabel ISW = new JLabel("Iconic Swan Ring");
		ISW.setBounds(10, 73, 142, 24);
		RINGS.add(ISW);
		
		JLabel FreshRing = new JLabel("Fresh Ring");
		FreshRing.setBounds(10, 108, 156, 24);
		RINGS.add(FreshRing);
		
		JLabel DynamicRing = new JLabel("Dynamic Ring");
		DynamicRing.setBounds(10, 143, 142, 24);
		RINGS.add(DynamicRing);
		
		JLabel FunRing = new JLabel("Fun Ring");
		FunRing.setBounds(10, 178, 80, 24);
		RINGS.add(FunRing);
		
		JLabel FictionRing = new JLabel("Fiction Ring");
		FictionRing.setBounds(10, 213, 80, 24);
		RINGS.add(FictionRing);
		
		JLabel FrissonRing = new JLabel("Frisson Ring");
		FrissonRing.setBounds(10, 248, 80, 24);
		RINGS.add(FrissonRing);
		
		JLabel VittoreRing = new JLabel("Vittore Ring");
		VittoreRing.setBounds(10, 283, 142, 24);
		RINGS.add(VittoreRing);
		
		ISW_2 = new JTextField();
		ISW_2.setColumns(10);
		ISW_2.setBounds(177, 75, 120, 22);
		RINGS.add(ISW_2);
		
		FreshRing_2 = new JTextField();
		FreshRing_2.setColumns(10);
		FreshRing_2.setBounds(177, 110, 120, 22);
		RINGS.add(FreshRing_2);
		
		DynamicRing_2 = new JTextField();
		DynamicRing_2.setColumns(10);
		DynamicRing_2.setBounds(177, 145, 120, 22);
		RINGS.add(DynamicRing_2);
		
		FunRing_2 = new JTextField();
		FunRing_2.setColumns(10);
		FunRing_2.setBounds(177, 180, 120, 22);
		RINGS.add(FunRing_2);
		
		FictionRing_2 = new JTextField();
		FictionRing_2.setColumns(10);
		FictionRing_2.setBounds(177, 215, 120, 22);
		RINGS.add(FictionRing_2);
		
		FrissonRing_2 = new JTextField();
		FrissonRing_2.setColumns(10);
		FrissonRing_2.setBounds(177, 250, 120, 22);
		RINGS.add(FrissonRing_2);
		
		VittoreRing_2 = new JTextField();
		VittoreRing_2.setColumns(10);
		VittoreRing_2.setBounds(177, 285, 120, 22);
		RINGS.add(VittoreRing_2);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.setBounds(994, 493, 175, 63);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FireN_2.setText(null);
				ForN_2.setText(null);
				FortN_2.setText(null);
				FlameN_2.setText(null);
				FoamN_2.setText(null);
				FunkN_2.setText(null);
				FantN_2.setText(null);
				FolioP_2.setText(null);
				ForP_2.setText(null);
				FireP_2.setText(null);
				BalP_2.setText(null);
				FortP_2.setText(null);
				FizzyP_2.setText(null);
				AngelicP_2.setText(null);
				ForPE_2.setText(null);
				EPE_2.setText(null);
				FirePE_2.setText(null);
				FlamePE_2.setText(null);
				FortPE_2.setText(null);
				FoamPE_2.setText(null);
				GaletPE_2.setText(null);
				FireB_2.setText(null);
				CrysC_2.setText(null);
				EngB_2.setText(null);
				FreshB_2.setText(null);
				SwanB_2.setText(null);
				SubB_2.setText(null);
				AngB_2.setText(null);
				FCL_2.setText(null);
				FN_2.setText(null);
				FireCL_2.setText(null);
				RCL_2.setText(null);
				EB_2.setText(null);
				ESS_2.setText(null);
				DBL_2.setText(null);
				ES_2.setText(null);
				FOS_2.setText(null);
				FS_2.setText(null);
				AnS_2.setText(null);
				AtS_2.setText(null);
				FunkS_2.setText(null);
				NudeS_2.setText(null);
				ISW_2.setText(null);
				FreshRing_2.setText(null);
				DynamicRing_2.setText(null);
				FunRing_2.setText(null);
				FictionRing_2.setText(null);
				FrissonRing_2.setText(null);
				VittoreRing_2.setText(null);
			}
		});
		btnReset.setBounds(1179, 493, 175, 63);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(1096, 567, 175, 63);
		frame.getContentPane().add(btnExit);
		
		
	}

}
