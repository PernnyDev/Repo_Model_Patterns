package ilp037.behavioural.observer;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProductSubject extends Subject<Product> implements Runnable {
	private final Queue<Product> queue = new ArrayDeque<Product>();
	
	public ProductSubject() {
		Thread t = new Thread(this);
		t.start();
	}
	public void add(Product product) {
		queue.add(product);
	}
	
	@Override
	public void run() {
		while (true) {
			int size = queue.size();
			if (size > 0) {
				var p = queue.poll();
				this.notifyObservers(p);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
			} else {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) { }
			}
		}
	}

}
