package ba.ibu.edu.oop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTML;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.jar.Attributes;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;

public class About extends JFrame {

	private JPanel contentPane;

	public static void openURL(String url) {
		String osName = System.getProperty("os.name");
		try {
			if (osName.startsWith("Windows"))
				Runtime.getRuntime().exec(
						"rundll32 url.dll,FileProtocolHandler " + url);
			else {
				String[] browsers = { "firefox", "opera", "konqueror",
						"epiphany", "mozilla", "netscape" };
				String browser = null;
				for (int count = 0; count < browsers.length && browser == null; count++)
					if (Runtime.getRuntime().exec(
							new String[] { "which", browsers[count] })
							.waitFor() == 0)
						browser = browsers[count];
				Runtime.getRuntime().exec(new String[] { browser, url });
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error in opening browser"
					+ ":\n" + e.getLocalizedMessage());
		}
	}
	
	public static void About() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					ManagerWindow win = new ManagerWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(win);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public About() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("About GMS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(10, 11, 330, 78);
		contentPane.add(labelLogo);
		Image logo = new ImageIcon(this.getClass().getResource("/AboutLogo.png")).getImage();
		labelLogo.setIcon(new ImageIcon(logo));
		
		JLabel lblURL = new JLabel("http://facebook.com");
		lblURL.setFont(new Font("Arial", Font.ITALIC, 13));
		lblURL.setForeground(SystemColor.textHighlight);
		lblURL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				openURL("http://facebook.com");
			}
		});
		lblURL.setBounds(135, 130, 122, 21);
		contentPane.add(lblURL);
		
		JLabel lblHomepage = new JLabel("Homepage");
		lblHomepage.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHomepage.setBounds(31, 130, 94, 21);
		contentPane.add(lblHomepage);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 189, 330, 2);
		contentPane.add(separator);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnOk.setBounds(285, 199, 55, 21);
		contentPane.add(btnOk);
		
		JLabel lblBetaVersion = new JLabel("Beta Version");
		lblBetaVersion.setFont(new Font("Arial", Font.PLAIN, 9));
		lblBetaVersion.setBounds(231, 100, 90, 14);
		contentPane.add(lblBetaVersion);
		
		
	}
}
