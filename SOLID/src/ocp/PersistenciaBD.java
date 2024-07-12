package ocp;

public class PersistenciaBD implements Persistencia {

	@Override
	public void persistir(Fatura fatura) {
		//Impl. da persistência em BD
		System.out.println("Persis. em BD");
	}

}
