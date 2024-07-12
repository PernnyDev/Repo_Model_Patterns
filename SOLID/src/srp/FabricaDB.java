package srp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDB {
	static Connection c = null;
	
	public static Connection getConn() throws SQLException {
		if (c == null) 
			c = DriverManager.getConnection("jdbc:mysql:localhost:3306/db", "user", "pwd");
		
		return c; 
	}

}
