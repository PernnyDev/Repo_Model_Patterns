package ilp037.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Código Limpo", 100.0));
		products.add(new Product(2, "Fone de Ouvido", 30.0));
		products.add(new Product(3, "Garrafa térmica", 50.0));
		products.add(new Product(4, "Bloco de anotações", 15.0));
		products.add(new Product(5, "Teclado Abnt", 80.0));


		ProductDAO dao = new ProductDAOProxy(products);
		dao.findAll();
		dao.findById(3);
		Product p1 = new Product(6, "Caneta Faber-Castell", 5.0);
		dao.save(p1);
		dao.remove(p1);
	}

}
