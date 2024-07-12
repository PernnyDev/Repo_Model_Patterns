package ilp037.creational.prototype;

public class Person extends Prototype<Person> implements Cloneable {
	String name;
	Long document;
	
	public Person() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Long time to build...");
	}
	
	@Override
	public String toString() {
		return String.format(
				"Person=(name: %s, document: %d)"
				, name
				, document);
	}
}
