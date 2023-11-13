package MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connectDB cn = new connectDB();
		Connection getCn = cn.getConnection();
		Statement st = getCn.createStatement();
		
		
		st.execute("use javadb");
		ResultSet r = st.executeQuery("select * from mark");
		
		Statement update = getCn.createStatement();
		while(r.next()) {
			if(r.getInt(1) == 1) {
				update.executeUpdate("update mark set id = 1 where name = \"Maung Maung\"");
				System.out.println("Update successful!");
			}
		}
		r.close();
		st.close();
		getCn.close();
	}
}
