package ilp037.behavioural.observer;

public class Product {
	//Fields
	private Integer id;
	private String description;
	private Double price;

	//Constructor
	public Product(Integer id, String description, Double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("Product=(id:%d, desc:%s, price: %.2f)"
						, id
						, description
						, price);
	}
}
