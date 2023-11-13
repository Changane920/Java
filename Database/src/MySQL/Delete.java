package MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connectDB cn = new connectDB();
		Connection getCn = cn.getConnection();
		
		Statement st = getCn.createStatement();
		st.execute("use javadb");
		st.executeUpdate("delete from mark where id = 2");
		
		Statement select = getCn.createStatement();
		ResultSet rs = select.executeQuery("select * from mark");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
}
