package ilp037.structural.proxy;

import java.util.List;

public class ProductDAOProxy extends ProductDAO {

	private static final long SLOW = 5000;

	public ProductDAOProxy(List<Product> products) {
		super(products);
	}

	@Override
	public List<Product> findAll() {
		//Registro de início
		long start = System.currentTimeMillis();
		//RealSubject->Request
		var ret = super.findAll();
		//Adicionar controle de slow query
		logSlowQuery(start);
		return ret;
	}

	@Override
	public Product findById(Integer id) {
		//Registro de início
		long start = System.currentTimeMillis();
		//RealSubject->Request
		var ret = super.findById(id);
		//Adicionar controle de slow query
		logSlowQuery(start);
		return ret;
	}
	
	@Override
	public void save(Product product) {
		//Registro de início
		long start = System.currentTimeMillis();
		//RealSubject->Request
		super.save(product);
		//Adicionar controle de slow query
		logSlowQuery(start);
	}
	@Override
	public void remove(Product product) {
		//Registro de início
		long start = System.currentTimeMillis();
		//RealSubject->Request
		super.remove(product);
		//Adicionar controle de slow query
		logSlowQuery(start);
	}
	
	private void logSlowQuery(long start) {
		long timelapse = System.currentTimeMillis() - start;
		StackTraceElement frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];
		
		if (timelapse > SLOW)
			System.out.printf("Method %s.%s took too much time to finish. Timelapse: %dms \n"
					, frame.getClassName()
					, frame.getMethodName()
					, timelapse);
	}
}
