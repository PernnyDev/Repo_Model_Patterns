package ilp037.structural.adapter;

public class Advertisement {
	String title;
	String description;
	Double price;
	AdvertisementStatus status = AdvertisementStatus.DRAFT;
	
	public void publish() {
		System.out.println("Advertisement publishing...");
	}
	public void inactivate() {
		System.out.println("Advertisement inactivate...");
	}
	public void activate() {
		System.out.println("Advertisement activate...");
	}
	public void delete() {
		System.out.println("Advertisement delete...");
	}
}
