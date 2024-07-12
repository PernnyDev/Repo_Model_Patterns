package ilp037.behavioural.observer;

public class FiscalObserver implements Observer<Product> {

	@Override
	public void update(Product t) {
		System.out.println("Issuing fiscal invoice...");
	}

}
