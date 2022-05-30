package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda a1 = new Agenda();
		int opcao;
		
		do {
			System.out.println("****** Agenda Pessoal ******");
			System.out.println("*** Selecione uma opção ***");
			System.out.println("1 - Cadastrar contato");
			System.out.println("2 - Mostrar agenda");
			System.out.println("3 - Mostrar contato pela posição na agenda");
			System.out.println("4 - Buscar posição do contato pelo nome");
			System.out.println("5 - Remover contato da agenda");
			System.out.println("0 - Sair da agenda");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				Contato c1 = new Contato();
				System.out.println("Digite o nome do contato: ");
				sc.nextLine();
				c1.setNome(sc.nextLine());
				do {
					System.out.println("Digite a idade do contato: ");
					c1.setIdade(sc.nextInt());
					if (c1.getIdade() <= 0) {
						System.out.println("Erro! Idade inválida!");
					}
				} while (c1.getIdade() <= 0);
				do {
					System.out.println("Digite a altura do contato (formato: 1,70): ");
					c1.setAltura(sc.nextFloat());
					if (c1.getAltura() <= 1) {
						System.out.println("Erro! Altura inválida!");
					}
				} while (c1.getAltura() <= 1);
				a1.armazenarContato(c1);
				break;
			case 2:
				if (a1.getAgenda().isEmpty()) {
					System.out.println("Não há contatos!");
				} else {
					System.out.println(a1);
				}
				break;
			case 3:
				int posicao;
				do {
					System.out.println("De qual posição você gostaria de imprimir o contato? (0 a 9): ");
					posicao = sc.nextInt();
					if(posicao < 0 || posicao > 9) {
						System.out.println("Posição inexistente! Tente novamente, de 0 a 9.");
					} else {
						a1.imprimirContato(posicao);
					}
				} while (posicao <0 || posicao >9);
				break;
			case 4:
				System.out.println("Digite o nome do contato a ser buscado: ");
				sc.nextLine();
				a1.buscarContato(sc.nextLine());
				break;
			case 5:
				System.out.println("Digite o nome do contato a ser excluído: ");
				sc.nextLine();
				a1.removerContato(sc.nextLine());
				break;
			case 0:
				System.out.println("Agenda encerrada.");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
		
		sc.close();
	}
}