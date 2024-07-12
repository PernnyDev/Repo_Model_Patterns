package isp;

public class CadastroCliente implements Cadastravel, Verificavel {

	@Override
	public void notificar() {
		System.out.println("Cliente notificado no tópico");
	}

	@Override
	public void salvarBD() {
		System.out.println("Cliente salvo no BD");
	}

	@Override
	public void validarSMS() {
		System.out.println("Validando a existência do telefone do cliente");
	}
}
