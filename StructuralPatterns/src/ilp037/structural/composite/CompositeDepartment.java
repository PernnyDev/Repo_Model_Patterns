package ilp037.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartment extends Department {
	public List<Department> children = new ArrayList<Department>();
	
	public CompositeDepartment(String name) {
		super(name);
	}
	public void add(Department department) {
		this.children.add(department);
	}
	public void remove(Department department) {
		this.children.remove(department);
	}
	public Department get(Department department) {
		return this.children
				.stream()
				.filter(d -> d.id == department.id)
				.findFirst()
				.orElse(null);
	}
	public void print() {
		children.forEach(d -> {
			if (d instanceof CompositeDepartment) {
				System.out.println(d);
				((CompositeDepartment) d).print(); 
			} else {
				System.out.println(d);
			}
		});
	}
	
}
