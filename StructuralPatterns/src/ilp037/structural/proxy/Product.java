package ilp037.structural.proxy;

public class Product {
	//Attributes
	private Integer id;
	private String description;
	private Double price;
	
	//Constructor
	public Product(Integer id, String description, Double price) {
		super();
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
	
	
}
