package ilp037.structural.proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
	//Attributes
	private List<Product> products;
	
	//Constructor
	public ProductDAO(List<Product> products) {
		this.products = products;
	}
	
	//CRUD
	public List<Product> findAll() {
		simulateDelay();
		return products;
	}
	public Product findById(Integer id) {
		simulateDelay();
		return this.products
				.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
	}
	public void save(Product product) {
		simulateDelay();
		products.add(product);
	}
	public void remove(Product product) {
		simulateDelay();
		products.remove(product);
	}
	
	private void simulateDelay() {
		Random r = new Random();
		try {
			Thread.sleep(r.nextLong(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
