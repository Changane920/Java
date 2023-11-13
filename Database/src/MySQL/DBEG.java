package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBEG {
	static Connection cn;
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			
			
			System.out.println("Connection Successful!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
