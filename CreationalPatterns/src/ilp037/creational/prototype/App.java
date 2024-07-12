package ilp037.creational.prototype;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "John";
		p1.document = 123456789L;
		System.out.println(p1);

		Person p2 = p1.copy();
		p2.name = "Mary";
		p2.document = 987654321L;
		System.out.println(p2);
	}

}
