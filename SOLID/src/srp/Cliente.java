package srp;

public class Cliente {
	//Atributos
	private Integer id;
	private String nome;

	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return String.format("Id: %d; Nome: %s \n"
								,this.getId()
								,this.getNome());
	}
}
