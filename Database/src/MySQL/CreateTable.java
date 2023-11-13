package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	static Connection cn;
	static Statement s;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//cn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			
			//direct connect to db
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
			s = cn.createStatement();
			
			s.execute("use javadb");
			//s.execute("create table mark(id int, name varchar(255), mark double)");
			String insert = "insert into mark values (2,\"Ko Ko\",56.5)"; 
			s.executeUpdate(insert);
			System.out.println("inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
