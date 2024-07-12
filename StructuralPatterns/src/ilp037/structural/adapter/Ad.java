package ilp037.structural.adapter;

public class Ad {
	String description;
	Float price;
	String status;
	
	public void publish() {
		System.out.println("Ad publishing...");
	}
	public void delete() {
		System.out.println("Ad deleting...");
	}
}
