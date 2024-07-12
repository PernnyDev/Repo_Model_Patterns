package ilp037.creational.singleton;

public class Database {
	
	public Connection getConnection() {
		return Connection.getInstance();
	}
	
}
