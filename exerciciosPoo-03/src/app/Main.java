package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		System.out.println("Qual o seu nome?");
		estudante.setNome(sc.nextLine());
		
		System.out.println("Qual sua primeira nota?");
		estudante.setNota1(sc.nextDouble());
		
		System.out.println("Qual sua segunda nota?");
		estudante.setNota2(sc.nextDouble());
		
		System.out.println("Qual sua terceira nota?");
		estudante.setNota3(sc.nextDouble());
		
		System.out.println(estudante.getNota1());
		System.out.println(estudante.getNota2());
		System.out.println(estudante.getNota3());
		
		System.out.println("Nota final: " + estudante.notaFinal());
		
		if (estudante.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.println("Quantidade de pontos faltando para aprovação: " + estudante.quantosPontosFaltam());
		} else {
			System.out.println("PASS!");
		}
		
		sc.close();
	}
}
