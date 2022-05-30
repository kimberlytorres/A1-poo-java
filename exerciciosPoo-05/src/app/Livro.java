package app;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private Long idEditora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Long getIdEditora() {
		return idEditora;
	}

	public void setIdEditora(Long idEditora) {
		this.idEditora = idEditora;
	}

	@Override
	public String toString() {
		return "\n Título do livro: " + titulo + "\n Autor: " + autor + "\n Ano de publicação: " + ano
				+ "\n Id Editora: " + idEditora;
	}

}
