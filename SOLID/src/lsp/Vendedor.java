package lsp;

public class Vendedor implements Funcionario {

	@Override
	public Float getSalario() {
		return 5000f;
	}

	@Override
	public Float getComissao() {
		return 10f;
	}

}
