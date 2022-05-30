package app;

public class Estudante {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return this.nota1;
	}

	public void setNota1(double nota1) {
		if (nota1 > 30) {
			System.out.println("Nota máxima do trimestre: 30!");
			return;
		} else {
			this.nota1 = nota1;
		}
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public void setNota2(double nota2) {
		if (nota2 > 35) {
			System.out.println("Nota máxima do trimestre: 35!");
			return;
		} else {
			this.nota2 = nota2;
		}
	}
	
	public double getNota3() {
		return this.nota3;
	}
	
	public void setNota3(double nota3) {
		if (nota3 > 35) {
			System.out.println("Nota máxima do trimestre: 35!");
			return;
		} else {
			this.nota3 = nota3;
		}
	}

	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}

	public double quantosPontosFaltam() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
