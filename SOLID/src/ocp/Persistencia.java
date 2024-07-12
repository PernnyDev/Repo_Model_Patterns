package ocp;

public interface Persistencia {

//	public void persistirEmArquivo(Fatura fatura) {
//		//Implementação de persistência de uma fatura em arquivo
//		System.out.println("Fatura salva em arquivo");
//	}
//	public void persistirEmBD(Fatura fatura) {
//		System.out.println("Fatura salva em BD");
//	}
	
	public abstract void persistir(Fatura fatura);

}
