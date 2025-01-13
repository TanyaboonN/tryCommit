package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
	private static final String url = "jdbc:mysql://127.0.0.1:3306/drinkshop";
	private static final String user = "root";
	private static final String password = "12345678";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, password);
		
	}
}
