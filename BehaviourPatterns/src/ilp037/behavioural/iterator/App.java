package ilp037.behavioural.iterator;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		GetFile getFile = new GetFile("C:\\Users\\vicky\\Downloads");
		Iterator<File> iterator = getFile.iterator();
		
		while (iterator.hasNext()) {
			File next = iterator.next();
			System.out.println(next.getName());
		}
		
		
		var map = new HashMap<String, Integer>();
		var it = map.entrySet().iterator();
		while (it.hasNext()) {
			var next = it.next();
			System.out.println(next.getKey());
		}
	}

}
