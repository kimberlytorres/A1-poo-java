package app;

public class Editora {
	private Long id;
	private String nome;
	private String email;

	public Editora(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "\n Id da editora: " + id + 
				"\n Razão Social: " + nome + 
				"\n E-mail de contato: " + email;
	}

}
