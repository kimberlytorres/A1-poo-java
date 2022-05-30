package app;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeMaxElevador;
	private int pessoasDentro;

	public Elevador(int totalAndares, int capacidadeMaxElevador) {
		this.totalAndares = totalAndares;
		this.capacidadeMaxElevador = capacidadeMaxElevador;
	}

	public void Inicializa(int pessoasDentro, int andarAtual) {
		this.pessoasDentro = pessoasDentro;
		this.andarAtual = andarAtual;
	}

	public boolean Entra() {
		if (this.pessoasDentro < this.capacidadeMaxElevador) {
			this.pessoasDentro = pessoasDentro + 1;
			return true;
		} else {
			System.out.println("Elevador lotado!");
			return false;
		}

	}

	public boolean Sai() {
		if (this.pessoasDentro > 0) {
			this.pessoasDentro -= 1;
			return true;
		} else {
			System.out.println("Elevador vazio!");
			return false;
		}

	}

	public boolean Sobe() {
		if (this.andarAtual < this.totalAndares) {
			this.andarAtual += 1;
			return true;
		} else {
			System.out.println("Elevador está no último andar!");
			return false;
		}
	}

	public boolean Desce() {
		if (this.andarAtual > 0) {
			this.andarAtual -= 1;
			return true;
		} else {
			System.out.println("Elevador está no térreo!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Elevador [andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidadeMaxElevador="
				+ capacidadeMaxElevador + ", pessoasDentro=" + pessoasDentro + "]";
	}

}
