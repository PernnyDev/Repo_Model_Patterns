package ilp037.behavioural.observer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import ilp037.behavioural.command.Command;
import ilp037.behavioural.command.InvokerQueue;

public class App {
	static ProductSubject subject = new ProductSubject();

	public static void main(String[] args) {

		loadObservers();

		subject.add(new Product(1, "Tupperware", 200.0));
		subject.add(new Product(2, "Smartband", 250.0));
		subject.add(new Product(3, "Light bulb", 10.0));

		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		do {
			System.out.println("Submit a product or 0 to exit");
			String req = sc.nextLine();
			exit = "0".equals(req);
			if (!exit) {
				subject.add(createProduct(req));
			}
		} while (!exit);

		sc.close();
	}

	private static Product createProduct(String req) {
		String[] split = req.split(";");
		
		Integer i = Integer.valueOf(split[0]);
		String d = split[1];
		Double p = Double.valueOf(split[2]);
		
		return new Product(i, d, p);
	}

	private static void loadObservers() {
		try {
			FileReader reader = new FileReader("./data/observers.conf");
			BufferedReader buf = new BufferedReader(reader);
			buf.lines().forEach(l -> {
				try {
					Observer o = (Observer)Class.forName("ilp037.behavioural.observer."+l).newInstance();
					subject.attach(o);
				} catch (Exception e) {}
			});
			buf.close();
			reader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
