package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.println("**** Cadastro ****");
		System.out.println("Qual seu nome?");
		p1.setNome(sc.next());
		System.out.println("Qual sua idade?");
		p1.setIdade(sc.nextInt());
		System.out.println("Qual seu gênero?");
		p1.setGenero(sc.next().charAt(0));
		sc.nextLine();
		System.out.println("Informações de endereço:");
		System.out.println("Logradouro:");
		p1.getEndereco().setLogradouro(sc.nextLine());
		System.out.println("Complemento:");
		p1.getEndereco().setComplemento(sc.next());
		System.out.println("Número:");
		p1.getEndereco().setNumero(sc.nextInt());
		System.out.println("CEP:");
		p1.getEndereco().setCep(sc.next());
		
		System.out.println(p1);
		
		sc.close();
		
	}
}
