package application;

public class Pessoa {
	private String nome;
	private int idade;
	private char genero;
	private Endereco endereco;

	public Pessoa() {
		this.endereco = new Endereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n Nome: " + nome + "\n Idade: " + idade + "\n Gênero: " + genero + "\n Endereço: " + endereco;
	}

}
