package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Editora BelasArtes = new Editora(123L, "Belas Artes", "contato@belasartes.com");

		System.out.println("**** BEM VINDO(A) AO CADASTRO DE OBRAS DA EDITORA BELAS ARTES ****");
		System.out.println("******************* Cadastre seu livro conosco *******************");

		Livro l1 = new Livro();
		System.out.println("Título do livro: ");
		l1.setTitulo(sc.nextLine());
		System.out.println("Digite o nome do autor: ");
		l1.setAutor(sc.nextLine());
		System.out.println("Digite o ano de publicação: ");
		l1.setAno(sc.nextInt());
		l1.setIdEditora(123L);

		System.out.println(BelasArtes);
		System.out.println(l1);
		System.out.println("\n ******************* Obrigado por se cadastrar *******************");

		sc.close();

	}
}
