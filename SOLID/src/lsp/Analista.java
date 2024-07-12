package lsp;

public class Analista implements Funcionario {
	private Float salario = 1000f;
	@Override
	public Float getSalario() {
		return salario;
	}

	@Override
	public Float getComissao() {
		return 0.0f;
	}

}
