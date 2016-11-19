package ba.ibu.edu.oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class DatabaseConnector {
	
	Connection con = null;
	
	public static Connection databaseConnector()
	{
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mujo\\git\\Hotel\\HotelManagementSystem\\GymDatabase.sqlite");
			
			return con;
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e);
			
			return null;
		}
	}
}
