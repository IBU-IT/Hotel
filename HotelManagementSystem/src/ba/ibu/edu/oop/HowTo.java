package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class HowTo extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void HowToUse() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowTo frame = new HowTo();
					ManagerWindow man = new ManagerWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(man);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private int clicks = 0;

	public HowTo() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("How to use program");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 610, 621);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 574, 525);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panelHelp = new JPanel();
		panel.add(panelHelp, "name_56940309091206");
		JLabel label1 = new JLabel("");
		panelHelp.add(label1);
		Image help1 = new ImageIcon(this.getClass().getResource("/HowTo1.png")).getImage();
		label1.setIcon(new ImageIcon(help1));
		
		
		JPanel panelHelpSave = new JPanel();
		panel.add(panelHelpSave, "name_56942747299201");
		JLabel label2 = new JLabel("");
		panelHelpSave.add(label2);
		Image help2 = new ImageIcon(this.getClass().getResource("/PicSave1.png")).getImage();
		label2.setIcon(new ImageIcon(help2));
		
		JPanel panelHelpUpdate = new JPanel();
		panel.add(panelHelpUpdate, "name_58722593221719");
		JLabel label3 = new JLabel("");
		panelHelpUpdate.add(label3);
		Image help3 = new ImageIcon(this.getClass().getResource("/PicUpdate1.png")).getImage();
		label3.setIcon(new ImageIcon(help3));
		
		JPanel panelHelpDelete = new JPanel();
		panel.add(panelHelpDelete, "name_58855389853427");
		JLabel label4 = new JLabel("");
		panelHelpDelete.add(label4);
		Image help4 = new ImageIcon(this.getClass().getResource("/PicDelete1.png")).getImage();
		label4.setIcon(new ImageIcon(help4));
		
		JPanel panelHelpClear = new JPanel();
		panel.add(panelHelpClear, "name_59077692648812");
		JLabel label5 = new JLabel("");
		panelHelpClear.add(label5);
		Image help5 = new ImageIcon(this.getClass().getResource("/ClearFields.png")).getImage();
		label5.setIcon(new ImageIcon(help5));
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(504, 548, 80, 23);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicks++;
				
				if(clicks == 1)
				{
					panelHelpSave.setVisible(true);
					panelHelp.setVisible(false);
					getContentPane().add(panel);
				}
				
				else if(clicks == 2)
				{
					panelHelpUpdate.setVisible(true);
					panelHelpSave.setVisible(false);
					panelHelp.setVisible(false);
				}
				
				else if(clicks == 3)
				{
					panelHelpDelete.setVisible(true);
					panelHelpUpdate.setVisible(false);
					panelHelpSave.setVisible(false);
					panelHelp.setVisible(false);
				}
				
				else if(clicks == 4)
				{
					panelHelpClear.setVisible(true);
					panelHelpDelete.setVisible(false);
					panelHelpUpdate.setVisible(false);
					panelHelpSave.setVisible(false);
					panelHelp.setVisible(false);
					btnNext.setVisible(false);
					btnFinish.setVisible(true);
					getContentPane().add(btnFinish);
				}
				
			}
		});
		btnNext.setBounds(504, 548, 80, 23);
		getContentPane().add(btnNext);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.controlHighlight);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(10, 539, 574, 8);
		getContentPane().add(separator);
		
	}
}
