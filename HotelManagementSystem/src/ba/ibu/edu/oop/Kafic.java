package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Label;

public class Kafic {

	private JFrame frame;
	private JTextField Text_IcedCapucino;
	private JTextField Text_AmericanCofe;
	private JTextField Text_Capucino;
	private JTextField Text_IcedLatle;
	private JTextField Text_Latle;
	private JTextField Text_Espreso;
	private JTextField Text_AngelFoodCake;
	private JTextField Text_Boston;
	private JTextField Text_Banoffee;
	private JTextField Text_BlackForest;
	private JTextField Text_Chiffon;
	private JTextField Text_ChocolateCake;
	private JTextField Text_CoconutCake;
	private JTextField Text_DobosCake;
	
	
	double[]i=new double[5];
	private JLabel label_3;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kafic window = new Kafic();
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
	public Kafic() {
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
		
		JLabel lblCaffeMenagingSystem = new JLabel("Caffee Menaging System");
		lblCaffeMenagingSystem.setBounds(10, 0, 1332, 109);
		lblCaffeMenagingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaffeMenagingSystem.setFont(new Font("Tahoma", Font.PLAIN, 90));
		frame.getContentPane().add(lblCaffeMenagingSystem);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 120, 400, 315);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Label_IcedCapucino = new JLabel("Iced- Capuucino");
		Label_IcedCapucino.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_IcedCapucino.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_IcedCapucino.setBounds(10, 11, 196, 34);
		panel.add(Label_IcedCapucino);
		
		Text_IcedCapucino = new JTextField();
		Text_IcedCapucino.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_IcedCapucino.setBounds(253, 11, 137, 34);
		panel.add(Text_IcedCapucino);
		Text_IcedCapucino.setColumns(10);
		
		JLabel Label_AmericanCofe = new JLabel("American Coffee");
		Label_AmericanCofe.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_AmericanCofe.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_AmericanCofe.setBounds(10, 56, 196, 34);
		panel.add(Label_AmericanCofe);
		
		JLabel Label_Capucino = new JLabel("Cappuccino");
		Label_Capucino.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_Capucino.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Capucino.setBounds(10, 101, 144, 34);
		panel.add(Label_Capucino);
		
		JLabel Label_IcedLattle = new JLabel("Iced Lattle");
		Label_IcedLattle.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_IcedLattle.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_IcedLattle.setBounds(10, 146, 137, 34);
		panel.add(Label_IcedLattle);
		
		Text_AmericanCofe = new JTextField();
		Text_AmericanCofe.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_AmericanCofe.setColumns(10);
		Text_AmericanCofe.setBounds(253, 56, 137, 34);
		panel.add(Text_AmericanCofe);
		
		Text_Capucino = new JTextField();
		Text_Capucino.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Capucino.setColumns(10);
		Text_Capucino.setBounds(253, 101, 137, 34);
		panel.add(Text_Capucino);
		
		Text_IcedLatle = new JTextField();
		Text_IcedLatle.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_IcedLatle.setColumns(10);
		Text_IcedLatle.setBounds(253, 146, 137, 34);
		panel.add(Text_IcedLatle);
		
		JLabel Label_Lattle = new JLabel("Lattle");
		Label_Lattle.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_Lattle.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Lattle.setBounds(10, 191, 112, 34);
		panel.add(Label_Lattle);
		
		JLabel Label_Espreso = new JLabel("Espresso");
		Label_Espreso.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_Espreso.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Espreso.setBounds(10, 236, 112, 34);
		panel.add(Label_Espreso);
		
		Text_Latle = new JTextField();
		Text_Latle.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Latle.setColumns(10);
		Text_Latle.setBounds(253, 191, 137, 34);
		panel.add(Text_Latle);
		
		Text_Espreso = new JTextField();
		Text_Espreso.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Espreso.setColumns(10);
		Text_Espreso.setBounds(253, 236, 137, 34);
		panel.add(Text_Espreso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(426, 120, 400, 315);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Label_Boston = new JLabel("Boston cream pie");
		Label_Boston.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Boston.setBounds(10, 48, 207, 30);
		panel_1.add(Label_Boston);
		
		JLabel Label_AngelFoodCake = new JLabel("Angel food cake");
		Label_AngelFoodCake.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_AngelFoodCake.setBounds(10, 11, 190, 30);
		panel_1.add(Label_AngelFoodCake);
		
		JLabel Label_Banoffee = new JLabel("Banoffee pie");
		Label_Banoffee.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Banoffee.setBounds(10, 85, 149, 30);
		panel_1.add(Label_Banoffee);
		
		JLabel Label_BlackForest = new JLabel("Black Forest cake");
		Label_BlackForest.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_BlackForest.setBounds(10, 122, 221, 30);
		panel_1.add(Label_BlackForest);
		
		JLabel Label_Chiffon = new JLabel("Chiffon cake");
		Label_Chiffon.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_Chiffon.setBounds(10, 159, 190, 30);
		panel_1.add(Label_Chiffon);
		
		JLabel Label_ChocolateCake = new JLabel("Chocolate cake");
		Label_ChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_ChocolateCake.setBounds(10, 196, 196, 30);
		panel_1.add(Label_ChocolateCake);
		
		JLabel Label_CoconutCake = new JLabel("Coconut cake");
		Label_CoconutCake.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_CoconutCake.setBounds(10, 233, 190, 30);
		panel_1.add(Label_CoconutCake);
		
		JLabel Label_DobosCake = new JLabel("Dobos cake");
		Label_DobosCake.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_DobosCake.setBounds(10, 270, 149, 30);
		panel_1.add(Label_DobosCake);
		
		Text_AngelFoodCake = new JTextField();
		Text_AngelFoodCake.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_AngelFoodCake.setBounds(241, 11, 149, 30);
		panel_1.add(Text_AngelFoodCake);
		Text_AngelFoodCake.setColumns(10);
		
		Text_Boston = new JTextField();
		Text_Boston.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Boston.setColumns(10);
		Text_Boston.setBounds(241, 48, 149, 30);
		panel_1.add(Text_Boston);
		
		Text_Banoffee = new JTextField();
		Text_Banoffee.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Banoffee.setColumns(10);
		Text_Banoffee.setBounds(241, 85, 149, 30);
		panel_1.add(Text_Banoffee);
		
		Text_BlackForest = new JTextField();
		Text_BlackForest.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_BlackForest.setColumns(10);
		Text_BlackForest.setBounds(241, 122, 149, 30);
		panel_1.add(Text_BlackForest);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(10, 453, 400, 218);
		frame.getContentPane().add(panel_4);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCostOfDrinks.setBounds(10, 11, 181, 32);
		panel_4.add(lblCostOfDrinks);
		
		JLabel lblCostOfCakes = new JLabel("Cost of Cakes");
		lblCostOfCakes.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCostOfCakes.setBounds(10, 93, 181, 32);
		panel_4.add(lblCostOfCakes);
		
		JLabel lblService = new JLabel("Service Charge");
		lblService.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblService.setBounds(10, 175, 181, 32);
		panel_4.add(lblService);
		
		
		
		JLabel lblCostOfCakes_2 = new JLabel("");
		lblCostOfCakes_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCostOfCakes_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblCostOfCakes_2.setBounds(262, 93, 128, 32);
		panel_4.add(lblCostOfCakes_2);
		
		JLabel lblCostOfDrink_2 = new JLabel("");
		lblCostOfDrink_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCostOfDrink_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblCostOfDrink_2.setBounds(262, 11, 128, 32);
		panel_4.add(lblCostOfDrink_2);
		
		JLabel lblServiceCharge_2 = new JLabel("");
		lblServiceCharge_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblServiceCharge_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblServiceCharge_2.setBounds(262, 175, 128, 32);
		panel_4.add(lblServiceCharge_2);
		
		Text_Chiffon = new JTextField();
		Text_Chiffon.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_Chiffon.setColumns(10);
		Text_Chiffon.setBounds(241, 159, 149, 30);
		panel_1.add(Text_Chiffon);
		
		Text_ChocolateCake = new JTextField();
		Text_ChocolateCake.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_ChocolateCake.setColumns(10);
		Text_ChocolateCake.setBounds(241, 196, 149, 30);
		panel_1.add(Text_ChocolateCake);
		
		Text_CoconutCake = new JTextField();
		Text_CoconutCake.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_CoconutCake.setColumns(10);
		Text_CoconutCake.setBounds(241, 233, 149, 30);
		panel_1.add(Text_CoconutCake);
		
		Text_DobosCake = new JTextField();
		Text_DobosCake.setHorizontalAlignment(SwingConstants.RIGHT);
		Text_DobosCake.setColumns(10);
		Text_DobosCake.setBounds(241, 270, 149, 30);
		panel_1.add(Text_DobosCake);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(426, 453, 400, 218);
		panel_5.setBorder(new LineBorder(new Color(0,0,0),8));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel Label_Tax = new JLabel("Tax");
		Label_Tax.setBounds(10, 11, 167, 34);
		Label_Tax.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_Tax.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_5.add(Label_Tax);
		
		JLabel Label_SubTotal = new JLabel("Sub Total");
		Label_SubTotal.setBounds(10, 90, 167, 34);
		Label_SubTotal.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_SubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_5.add(Label_SubTotal);
		
		JLabel Label_Total = new JLabel("Total");
		Label_Total.setBounds(10, 173, 190, 34);
		Label_Total.setVerticalAlignment(SwingConstants.BOTTOM);
		Label_Total.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_5.add(Label_Total);
		
		JLabel lblTax_2 = new JLabel("");
		lblTax_2.setBounds(262, 13, 128, 32);
		lblTax_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTax_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		panel_5.add(lblTax_2);
		
		JLabel lblSubTotal_2 = new JLabel("");
		lblSubTotal_2.setBounds(262, 90, 128, 32);
		lblSubTotal_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubTotal_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		panel_5.add(lblSubTotal_2);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setBounds(262, 175, 128, 32);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBorder(new LineBorder(new Color(0, 0,0),2));
		panel_5.add(lblTotal);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(845, 120, 497, 452);
		panel_2.setBorder(new LineBorder(new Color(0,0,0), 8));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNaslov = new JLabel("");
		lblNaslov.setHorizontalAlignment(SwingConstants.CENTER);
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNaslov.setBounds(10, 11, 477, 60);
		panel_2.add(lblNaslov);
		
		JLabel Drinks = new JLabel("");
		Drinks.setFont(new Font("Tahoma", Font.BOLD, 16));
		Drinks.setBounds(20, 82, 78, 33);
		panel_2.add(Drinks);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(310, 82, 78, 33);
		panel_2.add(label);
		
		JLabel IcedCapuccino = new JLabel("");
		IcedCapuccino.setBounds(20, 141, 189, 24);
		panel_2.add(IcedCapuccino);
		
		JLabel AmericanC = new JLabel("");
		AmericanC.setBounds(20, 176, 189, 24);
		panel_2.add(AmericanC);
		
		JLabel Cappuccino = new JLabel("");
		Cappuccino.setBounds(20, 211, 189, 24);
		panel_2.add(Cappuccino);
		
		JLabel IcedLattle = new JLabel("");
		IcedLattle.setBounds(20, 246, 189, 24);
		panel_2.add(IcedLattle);
		
		JLabel Lattle = new JLabel("");
		Lattle.setBounds(20, 281, 189, 24);
		panel_2.add(Lattle);
		
		JLabel Espresoo = new JLabel("");
		Espresoo.setBounds(20, 316, 189, 24);
		panel_2.add(Espresoo);
		
		JLabel ChocolateC = new JLabel("");
		ChocolateC.setBounds(310, 291, 177, 22);
		panel_2.add(ChocolateC);
		
		JLabel ChifonCake = new JLabel("");
		ChifonCake.setBounds(310, 261, 177, 22);
		panel_2.add(ChifonCake);
		
		JLabel BlackForestCake = new JLabel("");
		BlackForestCake.setBounds(310, 231, 177, 22);
		panel_2.add(BlackForestCake);
		
		JLabel BanoffeePie = new JLabel("");
		BanoffeePie.setBounds(310, 201, 177, 22);
		panel_2.add(BanoffeePie);
		
		JLabel BostonCreamPie = new JLabel("");
		BostonCreamPie.setBounds(310, 171, 177, 22);
		panel_2.add(BostonCreamPie);
		
		JLabel AngelFoodCake = new JLabel("");
		AngelFoodCake.setBounds(310, 141, 177, 22);
		panel_2.add(AngelFoodCake);
		
		JLabel CoconutC = new JLabel("");
		CoconutC.setBounds(310, 321, 177, 22);
		panel_2.add(CoconutC);
		
		JLabel DobosC = new JLabel("");
		DobosC.setBounds(310, 351, 177, 22);
		panel_2.add(DobosC);
		
		JLabel Thanks = new JLabel("");
		Thanks.setHorizontalAlignment(SwingConstants.CENTER);
		Thanks.setFont(new Font("Tahoma", Font.BOLD, 20));
		Thanks.setBounds(10, 384, 477, 57);
		panel_2.add(Thanks);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(845, 593, 497, 78);
		panel_3.setBorder(new LineBorder(new Color(0,0,0),8));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton Buton_Total = new JButton("Total");
		Buton_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double IcedCapucino=Double.parseDouble(Text_IcedCapucino.getText());
				double iIcedCapucino=4.50;
				double IC;
				IC=(IcedCapucino*iIcedCapucino);
				String pMeal=String.format("%.2f", IC);
				lblCostOfDrink_2.setText(pMeal);
				
				double AmericanCafe=Double.parseDouble(Text_AmericanCofe.getText());
				double iAmericanCafe=5.50;
				double AC;
				AC=(AmericanCafe*iAmericanCafe);
				String aMeal=String.format("%.2f", IC+AC);
				lblCostOfDrink_2.setText(aMeal);
				
				double Capucino=Double.parseDouble(Text_Capucino.getText());
				double iCapucino=4.00;
				double C;
				C=(Capucino*iCapucino);
				String cMeal=String.format("%.2f", IC+AC+C);
				lblCostOfDrink_2.setText(cMeal);
				
				double IcedLatle=Double.parseDouble(Text_IcedLatle.getText());
				double iIcedLatle=5.00;
				double IL;
				IL=(IcedLatle*iIcedLatle);
				String ILMeal=String.format("%.2f", IC+AC+C+IL);
				lblCostOfDrink_2.setText(ILMeal);
				
				double Latle=Double.parseDouble(Text_Latle.getText());
				double iLatle=4.50;
				double L;
				L=(Latle*iLatle);
				String lMeal=String.format("%.2f", IC+AC+C+IL+L);
				lblCostOfDrink_2.setText(lMeal);
				
				double Espreso=Double.parseDouble(Text_Espreso.getText());
				double iEspreso=3.50;
				double IS;
				IS=(Espreso*iEspreso);
				String sMeal=String.format("%.2f", IC+AC+C+IL+L+IS);
				lblCostOfDrink_2.setText(sMeal);
				
				double AngelCake=Double.parseDouble(Text_AngelFoodCake.getText());
				double iAngelCake=5.00;
				double ac;
				ac=(AngelCake*iAngelCake);
				String ameal=String.format("%.2f", ac);
				lblCostOfCakes_2.setText(ameal);
				
				double Boston=Double.parseDouble(Text_Boston.getText());
				double iBoston=4.50;
				double b;
				b=(Boston*iBoston);
				String bmeal=String.format("%.2f", ac+b);
				lblCostOfCakes_2.setText(bmeal);
				
				double Banoffee=Double.parseDouble(Text_Banoffee.getText());
				double iBanoffee=6.00;
				double be;
				be=(Banoffee*iBanoffee);
				String bemeal=String.format("%.2f", ac+b+be);
				lblCostOfCakes_2.setText(bemeal);
				
				double BlackForest=Double.parseDouble(Text_BlackForest.getText());
				double iBlackForest=6.50;
				double bf;
				bf=(BlackForest*iBlackForest);
				String bfmeal=String.format("%.2f", ac+b+be+bf);
				lblCostOfCakes_2.setText(bfmeal);
				
				double Chiffon=Double.parseDouble(Text_Chiffon.getText());
				double iChiffon=5.00;
				double c;
				c=(Chiffon*iChiffon);
				String cmeal=String.format("%.2f", ac+b+be+bf+c);
				lblCostOfCakes_2.setText(cmeal);
				
				double ChocolateCake=Double.parseDouble(Text_ChocolateCake.getText());
				double iChocolateCake=4.50;
				double cc;
				cc=(ChocolateCake*iChocolateCake);
				String ccmeal=String.format("%.2f", ac+b+be+bf+c+cc);
				lblCostOfCakes_2.setText(ccmeal);
				
				double CoconutCake=Double.parseDouble(Text_CoconutCake.getText());
				double iCoconutCake=5.50;
				double cc_2;
				cc_2=(CoconutCake*iCoconutCake);
				String cc_2meal=String.format("%.2f", ac+b+be+bf+c+cc+cc_2);
				lblCostOfCakes_2.setText(cc_2meal);
				
				double DobosCake=Double.parseDouble(Text_DobosCake.getText());
				double iDobosCake=6.00;
				double d;
				d=(DobosCake*iDobosCake);
				String dmeal=String.format("%.2f", ac+b+be+bf+c+cc+cc_2+d);
				lblCostOfCakes_2.setText(dmeal);
				
				double cTotal_1=Double.parseDouble(lblCostOfDrink_2.getText());
				double cTotal_2=Double.parseDouble(lblCostOfCakes_2.getText());
				double Service; 
				Service=(cTotal_1+cTotal_2)/95;
				String ServiceC=String.format("%.2f", Service);
				lblServiceCharge_2.setText(ServiceC);
				
				double Tax;
				Tax=(cTotal_1+cTotal_2)/100;
				String tax=String.format("%.2f", Tax);
				lblTax_2.setText(tax);
				
				double subTotal;
				double S=Double.parseDouble(lblServiceCharge_2.getText());
				subTotal=cTotal_1+cTotal_2+S;
				String SubTotal=String.format("%.2f", subTotal);
				lblSubTotal_2.setText(SubTotal);
				
				double total;
				total=cTotal_1+cTotal_2+S+Tax;
				String Total=String.format("%.2f", total);
				lblTotal.setText(Total);
				
			}

			
		});
		Buton_Total.setFont(new Font("Tahoma", Font.BOLD, 18));
		Buton_Total.setBounds(10, 23, 102, 30);
		panel_3.add(Buton_Total);
		
		JButton Buton_Receipt = new JButton("Receipt");
		Buton_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double IcedCapucino=Double.parseDouble(Text_IcedCapucino.getText());
				double iIcedCapucino=4.50;
				double IC;
				IC=(IcedCapucino*iIcedCapucino);
				
                double AmericanCafe=Double.parseDouble(Text_AmericanCofe.getText());
                double iAmericanCafe=5.50;
                double AC;
                AC=(AmericanCafe*iAmericanCafe);

                double Capucino=Double.parseDouble(Text_Capucino.getText());
                double iCapucino=4.00;
                double C;
                C=(Capucino*iCapucino);

                double IcedLatle=Double.parseDouble(Text_IcedLatle.getText());
                double iIcedLatle=5.00;
                double IL;
                IL=(IcedLatle*iIcedLatle);

                double Latle=Double.parseDouble(Text_Latle.getText());
                double iLatle=4.50;
                double L;
                L=(Latle*iLatle);

                double Espreso=Double.parseDouble(Text_Espreso.getText());
                double iEspreso=3.50;
                double IS;
                IS=(Espreso*iEspreso);

				
				lblNaslov.setText("Caffee Management System");
				Drinks.setText("Drinks");
				IcedCapuccino.setText("Iced-Capuccino:            "+IC);
				AmericanC.setText("American Coffee:          "+AC);
				Cappuccino.setText("Cappuccino:                   "+C);
				IcedLattle.setText("Iced Lattle:                      "+IL);
				Lattle.setText("Lattle:                               "+L);
				Espresoo.setText("Espreso:                          "+IS);
			
			

				double AngelCake=Double.parseDouble(Text_AngelFoodCake.getText());
				double iAngelCake=5.00;
				double ac;
				ac=(AngelCake*iAngelCake);

				double Boston=Double.parseDouble(Text_Boston.getText());
				double iBoston=4.50;
				double b;
				b=(Boston*iBoston);

				double Banoffee=Double.parseDouble(Text_Banoffee.getText());
				double iBanoffee=6.00;
				double be;
				be=(Banoffee*iBanoffee);

				double BlackForest=Double.parseDouble(Text_BlackForest.getText());
				double iBlackForest=6.50;
				double bf;
				bf=(BlackForest*iBlackForest);

				double Chiffon=Double.parseDouble(Text_Chiffon.getText());
				double iChiffon=5.00;
				double c;
				c=(Chiffon*iChiffon);

				double ChocolateCake=Double.parseDouble(Text_ChocolateCake.getText());
				double iChocolateCake=4.50;
				double cc;
				cc=(ChocolateCake*iChocolateCake);

				double CoconutCake=Double.parseDouble(Text_CoconutCake.getText());
				double iCoconutCake=5.50;
				double cc_2;
				cc_2=(CoconutCake*iCoconutCake);

				double DobosCake=Double.parseDouble(Text_DobosCake.getText());
				double iDobosCake=6.00;
				double d;
				d=(DobosCake*iDobosCake);
				label.setText("Cakes");
				AngelFoodCake.setText("Angel food cake:             "+ac);
				BostonCreamPie.setText("Boston cream pie:          "+b);
				BanoffeePie.setText("Banoffee pie:                    "+be);
				BlackForestCake.setText("Black Forest cake:          "+bf);
				ChifonCake.setText("Chiffon cake:                    "+c);
				ChocolateC.setText("Chocolate cake:              "+cc);
				CoconutC.setText("Coconut cake:                 "+cc_2);
				DobosC.setText("Dobos cake:                     "+d);
				
				Thanks.setText("Thanks for using Job Estimator");
			
			
			
			
			}
		});
		Buton_Receipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		Buton_Receipt.setBounds(135, 23, 102, 30);
		panel_3.add(Buton_Receipt);
		
		JButton Buton_Exit = new JButton("Exit");
		Buton_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		Buton_Exit.setFont(new Font("Tahoma", Font.BOLD, 18));
		Buton_Exit.setBounds(385, 23, 102, 30);
		panel_3.add(Buton_Exit);
		
		JButton Buton_Reset = new JButton("Reset");
		Buton_Reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		Buton_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Text_IcedCapucino.setText(null);
				Text_AmericanCofe.setText(null);
				Text_Capucino.setText(null);
				Text_IcedLatle.setText(null);
				Text_Latle.setText(null);
				Text_Espreso.setText(null);
				Text_AngelFoodCake.setText(null);
				Text_Boston.setText(null);
				Text_Banoffee.setText(null);
				Text_BlackForest.setText(null);
				Text_Chiffon.setText(null);
				Text_ChocolateCake.setText(null);
				Text_CoconutCake.setText(null);
				Text_DobosCake.setText(null);
				lblCostOfDrink_2.setText(null);
				lblCostOfCakes_2.setText(null);
				lblServiceCharge_2.setText(null);
				lblTax_2.setText(null);
				lblSubTotal_2.setText(null);
				lblTotal.setText(null);
				lblNaslov.setText(null);
				Drinks.setText(null);
				IcedCapuccino.setText(null);
				AmericanC.setText(null);
				Cappuccino.setText(null);
				IcedLattle.setText(null);
				Lattle.setText(null);
				Espresoo.setText(null);
				Thanks.setText(null);
				label.setText(null);
				AngelFoodCake.setText(null);
				BostonCreamPie.setText(null);
				BanoffeePie.setText(null);
				BlackForestCake.setText(null);
				ChifonCake.setText(null);
				ChocolateC.setText(null);
				CoconutC.setText(null);
				DobosC.setText(null);
				
					
				
			}
		});
		Buton_Reset.setBounds(260, 23, 102, 30);
		panel_3.add(Buton_Reset);
		
		
		
		
		
	}

	
}
