package ilp037.creational.singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Connection {
	public static int counter = 0;
	private static List<Connection> conn = new ArrayList<Connection>();
	
	private Connection() {
		counter++;
	}
	public static Connection getInstance() {
		Iterator<Connection> it = conn.iterator();
		while (it.hasNext()) {
			Connection next = it.next();
			if (!next.isBusy())
				return next; 
		}
		Connection free = new Connection();
		conn.add(free);
		return free;
		
	}
	private boolean isBusy() {
		// TODO Auto-generated method stub
		return false;
	}
}
