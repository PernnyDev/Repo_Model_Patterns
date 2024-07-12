package ilp037.structural.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class App {

	public static void main(String[] args) throws Exception {
		File f = new File("./data/sample.txt");
		Reader reader = new FileReader(f);
		
//		int ch = 0;
//		while ((ch = reader.read()) != -1) {
//			System.out.println(ch);
//		}
//		reader.close();
		
		
		BufferedReader buffReader = new BufferedReader(reader);
		buffReader.lines().forEach(System.out::println);
		buffReader.close();
	}

}
