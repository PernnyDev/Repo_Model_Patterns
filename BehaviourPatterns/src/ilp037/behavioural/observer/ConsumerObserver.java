package ilp037.behavioural.observer;

public class ConsumerObserver implements Observer<Product> {

	@Override
	public void update(Product t) {
		System.out.println("Your product has arrived! Run to buy!");
	}
}
