package ilp037.structural.composite;

public class Department {
	Integer id;
	String name;
	
	public Department(String name) {
		this.id = (int)Math.round(Math.random()*10);
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("[%d] %s \n"
							, this.id
							, this.name);
	}
}
