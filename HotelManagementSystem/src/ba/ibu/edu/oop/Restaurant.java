package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.List;
import javax.swing.JFormattedTextField;
import java.awt.Label;
import java.awt.ScrollPane;
import javax.swing.Box;

public class Restaurant {

	private JFrame frame;
	
	double firstNum;
	double secondNum;
	double result;
	String operation;
	String answer;
	
	
	double[]i=new double[5];
	
	double US_Dollar=1.95;
	double Brazil=5.86;
	double Canada=2.03;
	protected JLabel label_3;
	private JTextField textField;
	private JTextField TextDisplay;
	private JTextField Text_TomatoSoup;
	private JTextField Text_French;
	private JTextField Text_TomatoSalad;
	private JTextField Text_ChickenSalad;
	private JTextField Text_German;
	private JTextField Text_GrilledFish;
	private JTextField Text_Italian;
	private JTextField Text_Thai;
	private JTextField Text_Vegetable;
	private JTextField Text_Roast;
	private JTextField Text_Irish;
	private JTextField Text_Water;
	private JTextField Text_Juice;
	private JTextField Text_Soft;
	private JTextField Text_Tea;
	private JTextField Text_Fruit;
	private JTextField Text_IceCream;
	private JTextField Text_Lemon;
	private JTextField Text_Chocolate;
	private JTextField Text_Cheese;
	private JTextField Text_Nachos;
	private JTextField Text_Jalapeno;
	private JTextField Text_MozzarellaSticks;
	private JTextField Text_Peel;
	private JTextField Text_HotWings;
	private JTextField Text_GrilledChipotle;
	private JTextField Text_ZMan;
	private JTextField Text_PulledChicken;
	private JTextField Text_Open;
	private JTextField Text_TheHog;
	private JTextField Text_Carolina;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 100, 615, 310);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTomatoSoup = new JLabel("Tomato soup");
		lblTomatoSoup.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTomatoSoup.setBounds(10, 50, 81, 29);
		panel.add(lblTomatoSoup);
		
		JLabel lblFrench = new JLabel("French onion soup");
		lblFrench.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrench.setBounds(10, 70, 113, 29);
		panel.add(lblFrench);
		
		JLabel lblTomatoSalad = new JLabel("Tomato salad");
		lblTomatoSalad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTomatoSalad.setBounds(10, 90, 83, 29);
		panel.add(lblTomatoSalad);
		
		JLabel lblChickenSalad = new JLabel("Chicken salad");
		lblChickenSalad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenSalad.setBounds(10, 110, 83, 29);
		panel.add(lblChickenSalad);
		
		JLabel lblStarters = new JLabel("Starters");
		lblStarters.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStarters.setBounds(10, 6, 142, 37);
		panel.add(lblStarters);
		
		Text_TomatoSoup = new JTextField();
		Text_TomatoSoup.setBounds(139, 55, 86, 20);
		panel.add(Text_TomatoSoup);
		Text_TomatoSoup.setColumns(10);
		
		Text_French = new JTextField();
		Text_French.setColumns(10);
		Text_French.setBounds(139, 75, 86, 20);
		panel.add(Text_French);
		
		Text_TomatoSalad = new JTextField();
		Text_TomatoSalad.setColumns(10);
		Text_TomatoSalad.setBounds(139, 95, 86, 20);
		panel.add(Text_TomatoSalad);
		
		Text_ChickenSalad = new JTextField();
		Text_ChickenSalad.setColumns(10);
		Text_ChickenSalad.setBounds(139, 115, 86, 20);
		panel.add(Text_ChickenSalad);
		
		JLabel lblMainCourse = new JLabel("Main Course");
		lblMainCourse.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMainCourse.setBounds(299, 6, 152, 37);
		panel.add(lblMainCourse);
		
		JLabel lblGerman = new JLabel("German sausage and chips");
		lblGerman.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGerman.setBounds(299, 35, 172, 29);
		panel.add(lblGerman);
		
		JLabel lblGrilledFish = new JLabel("Grilled fish and potatoes");
		lblGrilledFish.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrilledFish.setBounds(299, 55, 152, 29);
		panel.add(lblGrilledFish);
		
		JLabel lblItalianCheese = new JLabel("Italian cheese & tomato pizza");
		lblItalianCheese.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItalianCheese.setBounds(299, 75, 185, 29);
		panel.add(lblItalianCheese);
		
		JLabel lblVegetablePasta = new JLabel("Vegetable pasta");
		lblVegetablePasta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVegetablePasta.setBounds(299, 115, 99, 29);
		panel.add(lblVegetablePasta);
		
		JLabel lblRoastChicken = new JLabel("Roast chicken and potatoes");
		lblRoastChicken.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoastChicken.setBounds(299, 135, 172, 29);
		panel.add(lblRoastChicken);
		
		JLabel lblThaiChicken = new JLabel("Thai chicken and rice");
		lblThaiChicken.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThaiChicken.setBounds(299, 95, 126, 29);
		panel.add(lblThaiChicken);
		
		Text_German = new JTextField();
		Text_German.setColumns(10);
		Text_German.setBounds(508, 44, 86, 20);
		panel.add(Text_German);
		
		Text_GrilledFish = new JTextField();
		Text_GrilledFish.setColumns(10);
		Text_GrilledFish.setBounds(508, 64, 86, 20);
		panel.add(Text_GrilledFish);
		
		Text_Italian = new JTextField();
		Text_Italian.setColumns(10);
		Text_Italian.setBounds(508, 84, 86, 20);
		panel.add(Text_Italian);
		
		Text_Thai = new JTextField();
		Text_Thai.setColumns(10);
		Text_Thai.setBounds(508, 104, 86, 20);
		panel.add(Text_Thai);
		
		Text_Vegetable = new JTextField();
		Text_Vegetable.setColumns(10);
		Text_Vegetable.setBounds(508, 124, 86, 20);
		panel.add(Text_Vegetable);
		
		Text_Roast = new JTextField();
		Text_Roast.setColumns(10);
		Text_Roast.setBounds(508, 144, 86, 20);
		panel.add(Text_Roast);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 170, 580, 4);
		panel.add(separator);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDrinks.setBounds(10, 170, 142, 29);
		panel.add(lblDrinks);
		
		JLabel lblMineralWater = new JLabel("Mineral water");
		lblMineralWater.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMineralWater.setBounds(10, 215, 99, 29);
		panel.add(lblMineralWater);
		
		JLabel lblFreshOrangeJuice = new JLabel("Fresh orange juice");
		lblFreshOrangeJuice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFreshOrangeJuice.setBounds(10, 235, 113, 29);
		panel.add(lblFreshOrangeJuice);
		
		JLabel lblEnglishTea = new JLabel("English tea");
		lblEnglishTea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnglishTea.setBounds(10, 275, 83, 29);
		panel.add(lblEnglishTea);
		
		JLabel lblSoftDrinks = new JLabel("Soft drinks");
		lblSoftDrinks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoftDrinks.setBounds(10, 255, 83, 29);
		panel.add(lblSoftDrinks);
		
		JLabel lblIrish = new JLabel("Irish cream coffee");
		lblIrish.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIrish.setBounds(10, 195, 119, 29);
		panel.add(lblIrish);
		
		Text_Irish = new JTextField();
		Text_Irish.setColumns(10);
		Text_Irish.setBounds(139, 200, 86, 20);
		panel.add(Text_Irish);
		
		Text_Water = new JTextField();
		Text_Water.setColumns(10);
		Text_Water.setBounds(139, 220, 86, 20);
		panel.add(Text_Water);
		
		Text_Juice = new JTextField();
		Text_Juice.setColumns(10);
		Text_Juice.setBounds(139, 240, 86, 20);
		panel.add(Text_Juice);
		
		Text_Soft = new JTextField();
		Text_Soft.setColumns(10);
		Text_Soft.setBounds(139, 260, 86, 20);
		panel.add(Text_Soft);
		
		Text_Tea = new JTextField();
		Text_Tea.setColumns(10);
		Text_Tea.setBounds(139, 280, 86, 20);
		panel.add(Text_Tea);
		
		JLabel lblDessert = new JLabel("Dessert");
		lblDessert.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDessert.setBounds(299, 170, 142, 29);
		panel.add(lblDessert);
		
		JLabel lblFruitSalad = new JLabel("Fruit salad and cream");
		lblFruitSalad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFruitSalad.setBounds(299, 195, 142, 29);
		panel.add(lblFruitSalad);
		
		JLabel lblIceCream = new JLabel("Ice cream");
		lblIceCream.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIceCream.setBounds(299, 215, 81, 29);
		panel.add(lblIceCream);
		
		JLabel lblLemonCake = new JLabel("Lemon cake");
		lblLemonCake.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLemonCake.setBounds(299, 235, 113, 29);
		panel.add(lblLemonCake);
		
		JLabel lblChocolateCake = new JLabel("Chocolate cake");
		lblChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChocolateCake.setBounds(299, 255, 126, 29);
		panel.add(lblChocolateCake);
		
		JLabel lblCheeseAndBiscuits = new JLabel("Cheese and biscuits");
		lblCheeseAndBiscuits.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCheeseAndBiscuits.setBounds(299, 275, 142, 29);
		panel.add(lblCheeseAndBiscuits);
		
		Text_Fruit = new JTextField();
		Text_Fruit.setColumns(10);
		Text_Fruit.setBounds(508, 195, 86, 20);
		panel.add(Text_Fruit);
		
		Text_IceCream = new JTextField();
		Text_IceCream.setColumns(10);
		Text_IceCream.setBounds(508, 215, 86, 20);
		panel.add(Text_IceCream);
		
		Text_Lemon = new JTextField();
		Text_Lemon.setColumns(10);
		Text_Lemon.setBounds(508, 235, 86, 20);
		panel.add(Text_Lemon);
		
		Text_Chocolate = new JTextField();
		Text_Chocolate.setColumns(10);
		Text_Chocolate.setBounds(508, 255, 86, 20);
		panel.add(Text_Chocolate);
		
		Text_Cheese = new JTextField();
		Text_Cheese.setColumns(10);
		Text_Cheese.setBounds(508, 275, 86, 20);
		panel.add(Text_Cheese);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(635, 98, 339, 312);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSnacks = new JLabel("Snacks");
		lblSnacks.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSnacks.setBounds(10, 6, 152, 37);
		panel_1.add(lblSnacks);
		
		JLabel lblNachos = new JLabel("Nachos");
		lblNachos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNachos.setBounds(10, 35, 142, 29);
		panel_1.add(lblNachos);
		
		JLabel lblJalapeno = new JLabel("Jalape\u00F1o poppers");
		lblJalapeno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJalapeno.setBounds(10, 55, 152, 29);
		panel_1.add(lblJalapeno);
		
		JLabel lblMozzarellaSticks = new JLabel("Mozzarella Sticks");
		lblMozzarellaSticks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMozzarellaSticks.setBounds(10, 75, 179, 29);
		panel_1.add(lblMozzarellaSticks);
		
		JLabel lblPeel = new JLabel("Peel-n-eat shrimp");
		lblPeel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPeel.setBounds(10, 95, 142, 29);
		panel_1.add(lblPeel);
		
		Text_Nachos = new JTextField();
		Text_Nachos.setColumns(10);
		Text_Nachos.setBounds(232, 40, 86, 20);
		panel_1.add(Text_Nachos);
		
		Text_Jalapeno = new JTextField();
		Text_Jalapeno.setColumns(10);
		Text_Jalapeno.setBounds(232, 60, 86, 20);
		panel_1.add(Text_Jalapeno);
		
		Text_MozzarellaSticks = new JTextField();
		Text_MozzarellaSticks.setColumns(10);
		Text_MozzarellaSticks.setBounds(232, 80, 86, 20);
		panel_1.add(Text_MozzarellaSticks);
		
		Text_Peel = new JTextField();
		Text_Peel.setColumns(10);
		Text_Peel.setBounds(232, 100, 86, 20);
		panel_1.add(Text_Peel);
		
		Text_HotWings = new JTextField();
		Text_HotWings.setColumns(10);
		Text_HotWings.setBounds(232, 120, 86, 20);
		panel_1.add(Text_HotWings);
		
		JLabel lblHowWings = new JLabel("Hot Wings");
		lblHowWings.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHowWings.setBounds(10, 115, 142, 29);
		panel_1.add(lblHowWings);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 170, 300, 4);
		panel_1.add(separator_1);
		
		JLabel lblGrilledChipotle = new JLabel("Grilled Chipotle BBQ Snack Wrap");
		lblGrilledChipotle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrilledChipotle.setBounds(10, 135, 212, 29);
		panel_1.add(lblGrilledChipotle);
		
		Text_GrilledChipotle = new JTextField();
		Text_GrilledChipotle.setColumns(10);
		Text_GrilledChipotle.setBounds(232, 140, 86, 20);
		panel_1.add(Text_GrilledChipotle);
		
		JLabel lblSpecialty = new JLabel("SPECIALTY");
		lblSpecialty.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSpecialty.setBounds(10, 170, 152, 37);
		panel_1.add(lblSpecialty);
		
		JLabel lblCarolinaPorkSandwich = new JLabel("Carolina Pork Sandwich");
		lblCarolinaPorkSandwich.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCarolinaPorkSandwich.setBounds(10, 195, 152, 29);
		panel_1.add(lblCarolinaPorkSandwich);
		
		JLabel lblTheHogHeaven = new JLabel("The Hog Heaven");
		lblTheHogHeaven.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTheHogHeaven.setBounds(10, 215, 113, 29);
		panel_1.add(lblTheHogHeaven);
		
		JLabel lblOpenfacedLeann = new JLabel("Open-Faced Lean 'n' Mean");
		lblOpenfacedLeann.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOpenfacedLeann.setBounds(10, 235, 179, 29);
		panel_1.add(lblOpenfacedLeann);
		
		JLabel lblPulledChickenBreast = new JLabel("Pulled Chicken Breast Sandwich");
		lblPulledChickenBreast.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPulledChickenBreast.setBounds(10, 255, 199, 29);
		panel_1.add(lblPulledChickenBreast);
		
		JLabel lblTheZmanSandwich = new JLabel("The Z-Man Sandwich");
		lblTheZmanSandwich.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTheZmanSandwich.setBounds(10, 275, 142, 29);
		panel_1.add(lblTheZmanSandwich);
		
		Text_ZMan = new JTextField();
		Text_ZMan.setColumns(10);
		Text_ZMan.setBounds(232, 280, 86, 20);
		panel_1.add(Text_ZMan);
		
		Text_PulledChicken = new JTextField();
		Text_PulledChicken.setColumns(10);
		Text_PulledChicken.setBounds(232, 260, 86, 20);
		panel_1.add(Text_PulledChicken);
		
		Text_Open = new JTextField();
		Text_Open.setColumns(10);
		Text_Open.setBounds(232, 240, 86, 20);
		panel_1.add(Text_Open);
		
		Text_TheHog = new JTextField();
		Text_TheHog.setColumns(10);
		Text_TheHog.setBounds(232, 220, 86, 20);
		panel_1.add(Text_TheHog);
		
		Text_Carolina = new JTextField();
		Text_Carolina.setColumns(10);
		Text_Carolina.setBounds(232, 200, 86, 20);
		panel_1.add(Text_Carolina);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(635, 421, 339, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTax.setBounds(10, 11, 181, 32);
		panel_2.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubTotal.setBounds(10, 69, 181, 32);
		panel_2.add(lblSubTotal);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_11.setBounds(10, 603, 1332, 68);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(10, 127, 181, 32);
		panel_2.add(lblTotal);
		
		JLabel lblTax_2 = new JLabel("");
		lblTax_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTax_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblTax_2.setBounds(201, 11, 128, 32);
		panel_2.add(lblTax_2);
		
		JLabel lblSubTotal_2 = new JLabel("");
		lblSubTotal_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubTotal_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblSubTotal_2.setBounds(201, 69, 128, 32);
		panel_2.add(lblSubTotal_2);
		
		JLabel lblTotal_2 = new JLabel("");
		lblTotal_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal_2.setBorder(new LineBorder(new Color(0, 0,0),2));
		lblTotal_2.setBounds(201, 127, 128, 32);
		panel_2.add(lblTotal_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(10, 421, 615, 171);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfStarters = new JLabel("Cost of Starters");
		lblCostOfStarters.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfStarters.setBounds(10, 8, 216, 35);
		panel_3.add(lblCostOfStarters);
		
		JLabel lblCostOfMain = new JLabel("Cost of Main Course");
		lblCostOfMain.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfMain.setBounds(10, 38, 216, 35);
		panel_3.add(lblCostOfMain);
		
		JLabel lblCostOfSnacks = new JLabel("Cost of Snacks");
		lblCostOfSnacks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfSnacks.setBounds(10, 68, 216, 35);
		panel_3.add(lblCostOfSnacks);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfDrinks.setBounds(10, 98, 216, 35);
		panel_3.add(lblCostOfDrinks);
		
		JLabel lblCostOfDessert = new JLabel("Cost of Dessert");
		lblCostOfDessert.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfDessert.setBounds(10, 128, 216, 35);
		panel_3.add(lblCostOfDessert);
		
		JLabel Label_STARTERS = new JLabel("");
		Label_STARTERS.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_STARTERS.setBorder(new LineBorder(new Color(0, 0,0),2));
		Label_STARTERS.setBounds(477, 8, 128, 32);
		panel_3.add(Label_STARTERS);
		
		JLabel Label_MAIN = new JLabel("");
		Label_MAIN.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_MAIN.setBorder(new LineBorder(new Color(0, 0,0),2));
		Label_MAIN.setBounds(477, 38, 128, 32);
		panel_3.add(Label_MAIN);
		
		JLabel Label_SNACKS = new JLabel("");
		Label_SNACKS.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_SNACKS.setBorder(new LineBorder(new Color(0, 0,0),2));
		Label_SNACKS.setBounds(477, 68, 128, 32);
		panel_3.add(Label_SNACKS);
		
		JLabel Label_DRINKS = new JLabel("");
		Label_DRINKS.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_DRINKS.setBorder(new LineBorder(new Color(0, 0,0),2));
		Label_DRINKS.setBounds(477, 98, 128, 32);
		panel_3.add(Label_DRINKS);
		
		JLabel Label_DESSERT = new JLabel("");
		Label_DESSERT.setFont(new Font("Tahoma", Font.BOLD, 24));
		Label_DESSERT.setBorder(new LineBorder(new Color(0, 0,0),2));
		Label_DESSERT.setBounds(477, 128, 128, 32);
		panel_3.add(Label_DESSERT);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(984, 98, 358, 494);
		frame.getContentPane().add(panel_4);
		

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 568, 1332, 83);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 338, 445);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textArea = new JTextArea(30,30);
		panel_7.add(textArea);
		JScrollPane Combe=new JScrollPane(textArea);
		
		
	
		
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_8, null);
		panel_8.setLayout(null);
		
		TextDisplay = new JTextField();
		TextDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		TextDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextDisplay.setColumns(10);
		TextDisplay.setBounds(34, 11, 260, 53);
		panel_8.add(TextDisplay);
		
		JButton ButtonBack = new JButton("\uF0E7");
		ButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				String backspace=null;
				
				if(TextDisplay.getText().length()>0){
					StringBuilder strB= new StringBuilder(TextDisplay.getText());
					strB.deleteCharAt(TextDisplay.getText().length()-1);
					backspace=strB.toString();
					TextDisplay.setText(backspace);
				}
			}
		});
		ButtonBack.setForeground(new Color(0, 128, 0));
		ButtonBack.setFont(new Font("Wingdings", Font.BOLD, 20));
		ButtonBack.setBackground(UIManager.getColor("Button.background"));
		ButtonBack.setBounds(34, 75, 65, 65);
		panel_8.add(ButtonBack);
		
		JButton ButtonC = new JButton("C");
		ButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextDisplay.setText(null);
			}
		});
		ButtonC.setForeground(new Color(0, 100, 0));
		ButtonC.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonC.setBounds(99, 75, 65, 65);
		panel_8.add(ButtonC);
		
		JButton ButtonPercent = new JButton("%");
		ButtonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(TextDisplay.getText());
				TextDisplay.setText("");
				operation="%";
			}
		});
		ButtonPercent.setForeground(new Color(0, 128, 0));
		ButtonPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonPercent.setBounds(164, 75, 65, 65);
		panel_8.add(ButtonPercent);
		
		JButton ButtonPlus = new JButton("+");
		ButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(TextDisplay.getText());
				TextDisplay.setText("");
				operation="+";
			}
		});
		ButtonPlus.setForeground(Color.RED);
		ButtonPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonPlus.setBounds(229, 75, 65, 65);
		panel_8.add(ButtonPlus);
		
		JButton ButtonMinus = new JButton("-");
		ButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(TextDisplay.getText());
				TextDisplay.setText("");
				operation="-";
			}
		});
		ButtonMinus.setForeground(Color.RED);
		ButtonMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonMinus.setBounds(229, 141, 65, 65);
		panel_8.add(ButtonMinus);
		
		JButton ButtonNine = new JButton("9");
		ButtonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonNine.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonNine.setForeground(new Color(95, 158, 160));
		ButtonNine.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonNine.setBounds(164, 141, 65, 65);
		panel_8.add(ButtonNine);
		
		JButton ButtonEight = new JButton("8");
		ButtonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonEight.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonEight.setForeground(new Color(95, 158, 160));
		ButtonEight.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonEight.setBounds(99, 141, 65, 65);
		panel_8.add(ButtonEight);
		
		JButton ButtonSeven = new JButton("7");
		ButtonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonSeven.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonSeven.setForeground(new Color(95, 158, 160));
		ButtonSeven.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonSeven.setBounds(34, 141, 65, 65);
		panel_8.add(ButtonSeven);
		
		JButton ButtonFour = new JButton("4");
		ButtonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonFour.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonFour.setForeground(new Color(95, 158, 160));
		ButtonFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonFour.setBounds(34, 207, 65, 65);
		panel_8.add(ButtonFour);
		
		JButton ButtonFive = new JButton("5");
		ButtonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonFive.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonFive.setForeground(new Color(95, 158, 160));
		ButtonFive.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonFive.setBounds(99, 207, 65, 65);
		panel_8.add(ButtonFive);
		
		JButton ButtonSix = new JButton("6");
		ButtonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonSix.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonSix.setForeground(new Color(95, 158, 160));
		ButtonSix.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonSix.setBounds(164, 207, 65, 65);
		panel_8.add(ButtonSix);
		
		JButton ButtonMult = new JButton("*");
		ButtonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(TextDisplay.getText());
				TextDisplay.setText("");
				operation="/";
			}
		});
		ButtonMult.setForeground(Color.RED);
		ButtonMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonMult.setBounds(229, 207, 65, 65);
		panel_8.add(ButtonMult);
		
		JButton ButtonDiv = new JButton("/");
		ButtonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(TextDisplay.getText());
				TextDisplay.setText("");
				operation="/";
			}
		});
		ButtonDiv.setForeground(Color.RED);
		ButtonDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonDiv.setBounds(229, 273, 65, 65);
		panel_8.add(ButtonDiv);
		
		JButton ButtonThree = new JButton("3");
		ButtonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonThree.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonThree.setForeground(new Color(95, 158, 160));
		ButtonThree.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonThree.setBounds(164, 273, 65, 65);
		panel_8.add(ButtonThree);
		
		JButton ButtonTwo = new JButton("2");
		ButtonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonTwo.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonTwo.setForeground(new Color(95, 158, 160));
		ButtonTwo.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonTwo.setBounds(99, 273, 65, 65);
		panel_8.add(ButtonTwo);
		
		JButton ButtonOne = new JButton("1");
		ButtonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonOne.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonOne.setForeground(new Color(95, 158, 160));
		ButtonOne.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonOne.setBounds(34, 273, 65, 65);
		panel_8.add(ButtonOne);
		
		JButton ButtonZero = new JButton("0");
		ButtonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonZero.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonZero.setForeground(new Color(95, 158, 160));
		ButtonZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonZero.setBounds(34, 339, 65, 65);
		panel_8.add(ButtonZero);
		
		JButton ButtonDot = new JButton(".");
		ButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=TextDisplay.getText()+ ButtonDot.getText();
				TextDisplay.setText(EnterNumber);
			}
		});
		ButtonDot.setForeground(Color.BLUE);
		ButtonDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonDot.setBackground(UIManager.getColor("Button.background"));
		ButtonDot.setBounds(99, 339, 65, 65);
		panel_8.add(ButtonDot);
		
		JButton ButtonPlusMinus = new JButton("\u00B1");
		ButtonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(TextDisplay.getText()));
				ops=ops*(-1);
				TextDisplay.setText(String.valueOf(ops));
			}
		});
		ButtonPlusMinus.setForeground(Color.BLUE);
		ButtonPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonPlusMinus.setBounds(164, 339, 65, 65);
		panel_8.add(ButtonPlusMinus);
		
		JButton ButtonEqual = new JButton("=");
		ButtonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum=Double.parseDouble(TextDisplay.getText());
				if(operation=="+")
				{
					result=firstNum+secondNum;
					answer=String.format("%.2f", result);
					TextDisplay.setText(answer);
					
				}
				else if(operation=="-")
				{
					result=firstNum-secondNum;
					answer=String.format("%.2f", result);
					TextDisplay.setText(answer);
					
				}
				else if(operation=="*")
				{
					result=firstNum*secondNum;
					answer=String.format("%.2f", result);
					TextDisplay.setText(answer);
				}
				else if(operation=="/")
				{
					result=firstNum/secondNum;
					answer=String.format("%.2f", result);
					TextDisplay.setText(answer);
					
				}
				
				
				else if(operation=="%")
				{
					result=firstNum%secondNum;
					answer=String.format("%.2f", result);
					TextDisplay.setText(answer);
					
				}
				
				
			}
			
		});
		ButtonEqual.setForeground(Color.RED);
		ButtonEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		ButtonEqual.setBounds(229, 339, 65, 65);
		panel_8.add(ButtonEqual);
		
		
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double TomatoSoup=Double.parseDouble(Text_TomatoSoup.getText());
				double iTomatoSoup=2.00;
				double TS;
				TS=(TomatoSoup*iTomatoSoup);
				String aMeal=String.format("%.2f", TS);
				Label_STARTERS.setText(aMeal);
				
				double French=Double.parseDouble(Text_French.getText());
				double iFrench=2.50;
				double F;
				F=(French*iFrench);
				String bMeal=String.format("%.2f", TS+F);
				Label_STARTERS.setText(bMeal);
				
				double TomatoSalad=Double.parseDouble(Text_TomatoSalad.getText());
				double iTomatoSalad=3.90;
				double TS_2;
				TS_2=(TomatoSalad*iTomatoSalad);
				String cMeal=String.format("%.2f", TS+F+TS_2);
				Label_STARTERS.setText(cMeal);
				
				double ChickenSalad=Double.parseDouble(Text_ChickenSalad.getText());
				double iChickenSalad=3.30;
				double CS;
				CS=(ChickenSalad*iChickenSalad);
				String dMeal=String.format("%.2f", TS+F+TS_2+CS);
				Label_STARTERS.setText(dMeal);
				
				double German=Double.parseDouble(Text_German.getText());
				double iGerman=6.50;
				double G;
				G=(German*iGerman);
				String eMeal=String.format("%.2f", G);
				Label_MAIN.setText(eMeal);
				
				double GrilledFish=Double.parseDouble(Text_GrilledFish.getText());
				double iGrilledFish=6.25;
				double GF;
				GF=(GrilledFish*iGrilledFish);
				String fMeal=String.format("%.2f", G+GF);
				Label_MAIN.setText(fMeal);
				
				double Italian=Double.parseDouble(Text_Italian.getText());
				double iItalian=4.85;
				double I;
				I=(Italian*iItalian);
				String gMeal=String.format("%.2f", G+GF+I);
				Label_MAIN.setText(gMeal);
				
				double Thai=Double.parseDouble(Text_Thai.getText());
				double iThai=5.95;
				double T;
				T=(Thai*iThai);
				String hMeal=String.format("%.2f", G+GF+I+T);
				Label_MAIN.setText(hMeal);
				
				double Vegetable=Double.parseDouble(Text_Vegetable.getText());
				double iVegetable=4.85;
				double V;
				V=(Vegetable*iVegetable);
				String iMeal=String.format("%.2f", G+GF+I+T+V);
				Label_MAIN.setText(iMeal);
				
				double Roast=Double.parseDouble(Text_Roast.getText());
				double iRoast=5.95;
				double R;
				R=(Roast*iRoast);
				String jMeal=String.format("%.2f", G+GF+I+T+V+R);
				Label_MAIN.setText(jMeal);
				
				double Carolina=Double.parseDouble(Text_Carolina.getText());
				double iCarolina=8.85;
				double C;
				C=(Carolina*iCarolina);
				String qMeal=String.format("%.2f", G+GF+I+T+V+R+C);
				Label_MAIN.setText(qMeal);
				
				double TheHog=Double.parseDouble(Text_TheHog.getText());
				double iTheHog=9.25;
				double TH;
				TH=(TheHog*iTheHog);
				String rMeal=String.format("%.2f", G+GF+I+T+V+R+C+TH);
				Label_MAIN.setText(rMeal);
				
				double Open=Double.parseDouble(Text_Open.getText());
				double iOpen=12.00;
				double O;
				O=(Open*iOpen);
				String sMeal=String.format("%.2f", G+GF+I+T+V+R+C+TH+O);
				Label_MAIN.setText(sMeal);
				
				double PulledChicken=Double.parseDouble(Text_PulledChicken.getText());
				double iPulledChicken=11.50;
				double PC;
				PC=(PulledChicken*iPulledChicken);
				String tMeal=String.format("%.2f", G+GF+I+T+V+R+C+TH+O+PC);
				Label_MAIN.setText(tMeal);
				
				double ZMan=Double.parseDouble(Text_ZMan.getText());
				double iZMan=10.95;
				double ZM;
				ZM=(ZMan*iZMan);
				String uMeal=String.format("%.2f", G+GF+I+T+V+R+C+TH+O+PC+ZM);
				Label_MAIN.setText(uMeal);
				
				double Nachos=Double.parseDouble(Text_Nachos.getText());
				double iNachos=4.60;
				double N;
				N=(Nachos*iNachos);
				String kMeal=String.format("%.2f", N);
				Label_SNACKS.setText(kMeal);
				
				double Jalapeno=Double.parseDouble(Text_Jalapeno.getText());
				double iJalapeno=5.25;
				double J;
				J=(Jalapeno*iJalapeno);
				String lMeal=String.format("%.2f", N+J);
				Label_SNACKS.setText(lMeal);
				
				double Mozarela=Double.parseDouble(Text_MozzarellaSticks.getText());
				double iMozarela=3.95;
				double M;
				M=(Mozarela*iMozarela);
				String mMeal=String.format("%.2f", N+J+M);
				Label_SNACKS.setText(mMeal);
				
				double Peel=Double.parseDouble(Text_Peel.getText());
				double iPeel=4.50;
				double P;
				P=(Peel*iPeel);
				String nMeal=String.format("%.2f", N+J+M+P);
				Label_SNACKS.setText(nMeal);
				
				double Hot=Double.parseDouble(Text_HotWings.getText());
				double iHot=5.00;
				double H;
				H=(Hot*iHot);
				String oMeal=String.format("%.2f", N+J+M+P+H);
				Label_SNACKS.setText(oMeal);
				
				double Grilled=Double.parseDouble(Text_GrilledChipotle.getText());
				double iGrilled=6.50;
				double G_1;
				G_1=(Grilled*iGrilled);
				String pMeal=String.format("%.2f", N+J+M+P+H+G_1);
				Label_SNACKS.setText(pMeal);
			
				double Irish=Double.parseDouble(Text_Irish.getText());
				double iIrish=1.30;
				double IR;
				IR=(Irish*iIrish);
				String vMeal=String.format("%.2f", IR);
				Label_DRINKS.setText(vMeal);
				
				double Water=Double.parseDouble(Text_Water.getText());
				double iWater=1.00;
				double W;
				W=(Water*iWater);
				String wMeal=String.format("%.2f", IR+W);
				Label_DRINKS.setText(wMeal);

				double Juice=Double.parseDouble(Text_Juice.getText());
				double iJuice=6.50;
				double JC;
				JC=(Juice*iJuice);
				String xMeal=String.format("%.2f", IR+W+JC);
				Label_DRINKS.setText(xMeal);
				
				double Soft=Double.parseDouble(Text_Soft.getText());
				double iSoft=3.50;
				double S;
				S=(Soft*iSoft);
				String yMeal=String.format("%.2f", IR+W+JC+S);
				Label_DRINKS.setText(yMeal);
				
				double Tea=Double.parseDouble(Text_Tea.getText());
				double iTea=1.50;
				double Te;
				Te=(Tea*iTea);
				String zMeal=String.format("%.2f", IR+W+JC+S+Te);
				Label_DRINKS.setText(zMeal);
				
				double Fruit=Double.parseDouble(Text_Fruit.getText());
				double iFruit=2.25;
				double FR;
				FR=(Fruit*iFruit);
				String AMeal=String.format("%.2f", FR);
				Label_DESSERT.setText(AMeal);
				
				double IceCream=Double.parseDouble(Text_IceCream.getText());
				double iIceCream=2.00;
				double IC;
				IC=(IceCream*iIceCream);
				String BMeal=String.format("%.2f", FR+IC);
				Label_DESSERT.setText(BMeal);
				
				double Lemon=Double.parseDouble(Text_Lemon.getText());
				double iLemon=2.25;
				double L;
				L=(Lemon*iLemon);
				String CMeal=String.format("%.2f", FR+IC+L);
				Label_DESSERT.setText(CMeal);
				
				double Chocolate=Double.parseDouble(Text_Chocolate.getText());
				double iChocolate=2.25;
				double CC;
				CC=(Chocolate*iChocolate);
				String DMeal=String.format("%.2f", FR+IC+L+CC);
				Label_DESSERT.setText(DMeal);
				
				double Cheese=Double.parseDouble(Text_Cheese.getText());
				double iCheese=2.50;
				double CH;
				CH=(Cheese*iCheese);
				String EMeal=String.format("%.2f", FR+IC+L+CC+CH);
				Label_DESSERT.setText(EMeal);
				
				double Total_1=Double.parseDouble(Label_STARTERS.getText());
				double Total_2=Double.parseDouble(Label_MAIN.getText());
				double Total_3=Double.parseDouble(Label_SNACKS.getText());
				double Total_4=Double.parseDouble(Label_DRINKS.getText());
				double Total_5=Double.parseDouble(Label_DESSERT.getText());
				
				double Tax=(Total_1+Total_2+Total_3+Total_4+Total_5)/100;
				String tax=String.format("%.2f", Tax);
				lblTax_2.setText(tax);
				
				double subTotal=(Total_1+Total_2+Total_3+Total_4+Total_5);
				String subtotal=String.format("%.2f", subTotal);
				lblSubTotal_2.setText(subtotal);
				
				double ATotal=Double.parseDouble(lblTax_2.getText());
				double BTotal=Double.parseDouble(lblSubTotal_2.getText());
				double AllTotal=(ATotal+BTotal);
				String alltotal=String.format("%.2f", AllTotal);
				lblTotal_2.setText(alltotal);
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotal.setBounds(237, 11, 95, 26);
		panel_11.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double TomatoSoup=Double.parseDouble(Text_TomatoSoup.getText());
				double iTomatoSoup=2.00;
				double TS;
				TS=(TomatoSoup*iTomatoSoup);

				double French=Double.parseDouble(Text_French.getText());
				double iFrench=2.50;
				double F;
				F=(French*iFrench);

				double TomatoSalad=Double.parseDouble(Text_TomatoSalad.getText());
				double iTomatoSalad=3.90;
				double TS_2;
				TS_2=(TomatoSalad*iTomatoSalad);

				double ChickenSalad=Double.parseDouble(Text_ChickenSalad.getText());
				double iChickenSalad=3.30;
				double CS;
				CS=(ChickenSalad*iChickenSalad);

				double German=Double.parseDouble(Text_German.getText());
				double iGerman=6.50;
				double G;
				G=(German*iGerman);

				double GrilledFish=Double.parseDouble(Text_GrilledFish.getText());
				double iGrilledFish=6.25;
				double GF;
				GF=(GrilledFish*iGrilledFish);

				double Italian=Double.parseDouble(Text_Italian.getText());
				double iItalian=4.85;
				double I;
				I=(Italian*iItalian);

				double Thai=Double.parseDouble(Text_Thai.getText());
				double iThai=5.95;
				double T;
				T=(Thai*iThai);

				double Vegetable=Double.parseDouble(Text_Vegetable.getText());
				double iVegetable=4.85;
				double V;
				V=(Vegetable*iVegetable);

				double Roast=Double.parseDouble(Text_Roast.getText());
				double iRoast=5.95;
				double R;
				R=(Roast*iRoast);

				double Carolina=Double.parseDouble(Text_Carolina.getText());
				double iCarolina=8.85;
				double C;
				C=(Carolina*iCarolina);

				double TheHog=Double.parseDouble(Text_TheHog.getText());
				double iTheHog=9.25;
				double TH;
				TH=(TheHog*iTheHog);

				double Open=Double.parseDouble(Text_Open.getText());
				double iOpen=12.00;
				double O;
				O=(Open*iOpen);

				double PulledChicken=Double.parseDouble(Text_PulledChicken.getText());
				double iPulledChicken=11.50;
				double PC;
				PC=(PulledChicken*iPulledChicken);

				double ZMan=Double.parseDouble(Text_ZMan.getText());
				double iZMan=10.95;
				double ZM;
				ZM=(ZMan*iZMan);

				double Nachos=Double.parseDouble(Text_Nachos.getText());
				double iNachos=4.60;
				double N;
				N=(Nachos*iNachos);

				double Jalapeno=Double.parseDouble(Text_Jalapeno.getText());
				double iJalapeno=5.25;
				double J;
				J=(Jalapeno*iJalapeno);
				
				double Mozarela=Double.parseDouble(Text_MozzarellaSticks.getText());
				double iMozarela=3.95;
				double M;
				M=(Mozarela*iMozarela);

				double Peel=Double.parseDouble(Text_Peel.getText());
				double iPeel=4.50;
				double P;
				P=(Peel*iPeel);

				double Hot=Double.parseDouble(Text_HotWings.getText());
				double iHot=5.00;
				double H;
				H=(Hot*iHot);

				double Grilled=Double.parseDouble(Text_GrilledChipotle.getText());
				double iGrilled=6.50;
				double G_1;
				G_1=(Grilled*iGrilled);

				double Irish=Double.parseDouble(Text_Irish.getText());
				double iIrish=1.30;
				double IR;
				IR=(Irish*iIrish);

				double Water=Double.parseDouble(Text_Water.getText());
				double iWater=1.00;
				double W;
				W=(Water*iWater);

				double Juice=Double.parseDouble(Text_Juice.getText());
				double iJuice=6.50;
				double JC;
				JC=(Juice*iJuice);

				double Soft=Double.parseDouble(Text_Soft.getText());
				double iSoft=3.50;
				double S;
				S=(Soft*iSoft);

				double Tea=Double.parseDouble(Text_Tea.getText());
				double iTea=1.50;
				double Te;
				Te=(Tea*iTea);

				double Fruit=Double.parseDouble(Text_Fruit.getText());
				double iFruit=2.25;
				double FR;
				FR=(Fruit*iFruit);

				double IceCream=Double.parseDouble(Text_IceCream.getText());
				double iIceCream=2.00;
				double IC;
				IC=(IceCream*iIceCream);

				double Lemon=Double.parseDouble(Text_Lemon.getText());
				double iLemon=2.25;
				double L;
				L=(Lemon*iLemon);

				double Chocolate=Double.parseDouble(Text_Chocolate.getText());
				double iChocolate=2.25;
				double CC;
				CC=(Chocolate*iChocolate);

				double Cheese=Double.parseDouble(Text_Cheese.getText());
				double iCheese=2.50;
				double CH;
				CH=(Cheese*iCheese);
			
				
					String Salida;
				Salida="\t Restaurant Menagement System\n\nStarters"
						+"\nTomato soup:                            "+TS
						+"\nFrench onion soup:                      "+F
						+"\nTomato salad:                           "+TS_2
						+"\nChicken Salad                           "+CS
						+"\n\nSnacks"
						+"\nNachos:                                 "+N
						+"\nJalapeno poppers:                       "+J
						+"\nMozzarella Sticks:                      "+M
						+"\nPeel-n-eat shrimp:                      "+P
						+"\nHot Wings:                              "+H
						+"\nGrilled Chipotle BBQ Snack Wrap:        "+G_1
						+"\n\nMain Course"
						+"\nGerman sausage and chips:               "+G
						+"\nGrilled fish and potatoes:              "+GF
						+"\nItalian cheese & tomato pizza:          "+I
						+"\nThai chicken and rice:                  "+T
						+"\nVegetable pasta:                        "+V
						+"\nRoast chicken and potatoes:             "+R
						+"\n\nSPECIALTY"
						+"\nCarolina Pork Sandwich:                 "+C
						+"\nThe Hog Heaven:                         "+TH
						+"\nOpen-Faced Lean 'n' Mean:               "+O
						+"\nPulled Chicken Breast Sandwich:         "+PC
						+"\nThe Z-Man Sandwich:                     "+ZM
						+"\n\nDessert"
						+"\nFruit salad and cream:                  "+FR
						+"\nIce cream:                              "+IC
						+"\nLemon cake:                             "+L
						+"\nChocolate cake:                         "+CC
						+"\nCheese and biscuits:                    "+CH
						+"\n\nDrinks"
						+"\nIrish cream coffee:                     "+IR
						+"\nMineral Water:                          "+W
						+"\nFresh orange juice:                     "+JC
						+"\nSoft Drinks:                            "+S
						+"\nEnglish Tea:                            "+Te
						+"\n\n\t Thanks for using Job Estimator";
				
			textArea.setText(Salida);
			JOptionPane.showMessageDialog(null, Combe);
			}
		});
		
		
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReceipt.setBounds(417, 11, 95, 26);
		panel_11.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Text_TomatoSoup.setText(null);
				Text_French.setText(null);
				Text_TomatoSalad.setText(null);
				Text_ChickenSalad.setText(null);
				Text_German.setText(null);
				Text_GrilledFish.setText(null);
				Text_Italian.setText(null);
				Text_Thai.setText(null);
				Text_Vegetable.setText(null);
				Text_Roast.setText(null);
				Text_Fruit.setText(null);
				Text_IceCream.setText(null);
				Text_Lemon.setText(null);
				Text_Chocolate.setText(null);
				Text_Cheese.setText(null);
				Text_Irish.setText(null);
				Text_Water.setText(null);
				Text_Juice.setText(null);
				Text_Soft.setText(null);
				Text_Tea.setText(null);
				Text_Nachos.setText(null);
				Text_Jalapeno.setText(null);
				Text_MozzarellaSticks.setText(null);
				Text_Peel.setText(null);
				Text_HotWings.setText(null);
				Text_GrilledChipotle.setText(null);
				Text_Carolina.setText(null);
				Text_TheHog.setText(null);
				Text_Open.setText(null);
				Text_PulledChicken.setText(null);
				Text_ZMan.setText(null);
				lblTax_2.setText(null);
				lblSubTotal_2.setText(null);
				lblTotal_2.setText(null);
				Label_STARTERS.setText(null);
				Label_MAIN.setText(null);
				Label_SNACKS.setText(null);
				Label_DRINKS.setText(null);
				Label_DESSERT.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(643, 11, 95, 26);
		panel_11.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(802, 11, 95, 26);
		panel_11.add(btnExit);
		
		JLabel lblRestaurantMenagingSystem = new JLabel("Restaurant Menaging System");
		lblRestaurantMenagingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurantMenagingSystem.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblRestaurantMenagingSystem.setBounds(10, -13, 1332, 109);
		frame.getContentPane().add(lblRestaurantMenagingSystem);
		
		
	}
}
