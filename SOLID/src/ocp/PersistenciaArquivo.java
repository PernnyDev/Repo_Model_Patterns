package ocp;

public class PersistenciaArquivo implements Persistencia {

	@Override
	public void persistir(Fatura fatura) {
		//Implementar o armaz. usando arquivos
		System.out.println("Pers. em arquivo!");
	}

}
