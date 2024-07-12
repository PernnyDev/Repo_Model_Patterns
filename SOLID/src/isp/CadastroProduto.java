package isp;

public class CadastroProduto implements Cadastravel {
	
	@Override
	public void salvarBD() {
		System.out.println("Produto salvo no BD");
	}
	
	@Override
	public void notificar() {
		System.out.println("Produto publicado no tópico");
	}
}
