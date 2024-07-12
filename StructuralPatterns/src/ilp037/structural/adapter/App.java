package ilp037.structural.adapter;

public class App {

	public static void main(String[] args) {
		Advertisement adv1 = new Advertisement();
		adv1.title = "Smartphone A52";
		adv1.description = "Único dono";
		adv1.price = 100.9;
		adv1.activate();
		adv1.publish();
		adv1.inactivate();
		adv1.delete();
		
		Ad ad1 = new Ad();
		ad1.description = "Produto muito bom!";
		ad1.price = 50f;
		ad1.status = "asdf";
		
		Advertisement adv2 = new AdvertisementAdapter(ad1);
		adv2.activate();
		System.out.println(adv2.title);
	}

}
