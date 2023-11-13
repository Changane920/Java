package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class showTable {
	public static void main(String[] args) throws SQLException {
		Connection cn;
		Statement st;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
			st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from mark");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getDouble(3));
				if(rs.getInt(1) == 3) {
					st.execute("update mark set id = 2 where name = \"Ko Ko\"");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
