package ilp037.structural.composite;

public class App {

	public static void main(String[] args) {
		CompositeDepartment clevel = new CompositeDepartment("C-Level");
		CompositeDepartment tech = new CompositeDepartment("Technology");
		CompositeDepartment mkt = new CompositeDepartment("Marketing");
		CompositeDepartment hr = new CompositeDepartment("Human Resources");
		
		clevel.add(tech);
		clevel.add(mkt);
		clevel.add(hr);
		
		tech.add(new Department("Soft Engineering"));
		tech.add(new Department("Quality Assurance"));
		tech.add(new Department("Data Science"));
		
		mkt.add(new Department("Employee Branding"));
		mkt.add(new Department("Social Media"));
		
		hr.add(new Department("Talent Acquisition"));
		hr.add(new Department("Payment"));
		
		CompositeDepartment infra = new CompositeDepartment("Infrastructure");
		infra.add(new Department("DevSecOps"));
		infra.add(new Department("Observability"));
		
		tech.add(infra);
		
		clevel.print();
	}
}
