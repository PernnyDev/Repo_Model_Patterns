package lsp;

public class TesteLiskov {

	public static void main(String[] args) {
		Funcionario a1 = new Analista();
		imprimir(a1);

		Funcionario a2 = new Analista();
		imprimir(a2);
		
		Funcionario v1 = new Vendedor();
		imprimir(v1);
	}

	private static void imprimir(Funcionario a1) {
		System.out.printf("Salário: %f \n", a1.getSalario());
	}

}
