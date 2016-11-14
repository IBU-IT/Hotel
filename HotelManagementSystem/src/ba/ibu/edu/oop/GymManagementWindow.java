package ba.ibu.edu.oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class GymManagementWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GymManagementWindow window = new GymManagementWindow();
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
	public GymManagementWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Manager");
		button.setBounds(231, 197, 104, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Employee");
		button_1.setBounds(229, 151, 104, 41);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("Login as:");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setBounds(180, 155, 70, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Welcome to \"Body Fit\"");
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		label_1.setBounds(119, 107, 181, 23);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel(" ");
		label_2.setBounds(41, 11, 335, 85);
		frame.getContentPane().add(label_2);
	}
}
