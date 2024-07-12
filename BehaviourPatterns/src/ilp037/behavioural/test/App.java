package ilp037.behavioural.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("./data/observers.conf");
		BufferedReader buf = new BufferedReader(reader);
		
		buf.lines().forEach(System.out::println);
	}

}
