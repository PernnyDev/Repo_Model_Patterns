package dip;

public class ClienteService {
	//Atributo
	private Repository<Cliente> repository;
	
	//Construtor onde irá receber a Injeção de Dependência
	public ClienteService(Repository<Cliente> r) {
		repository = r;
	}
	public String adicionarCliente(Cliente cliente) {
		//Dependência invertida
//		ClienteRepository repository = new ClienteRepository();
		repository.add(cliente);
		
		return "Cliente adicionado.";
	}
}
