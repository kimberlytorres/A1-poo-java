package app;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		RegistroArtistas r1 = new RegistroArtistas();
		int opcao;

		do {

			System.out.println("****** CADASTRO DE ARTISTAS POP ******");
			System.out.println("********** DIGITE A OPÇÃO: ***********");
			System.out.println("1 - Cadastrar um Artista");
			System.out.println("2 - Visualizar Artistas e Álbuns");
			System.out.println("3 - Visualizar quantidade de Artistas");
			System.out.println("4 - Apagar todo o registor de Artistas");
			System.out.println("0 - Sair do menu");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				Artista a1 = new Artista();
				System.out.println("Digite o nome do artista: ");
				sc.nextLine();
				a1.setNome(sc.nextLine());
				System.out.println("Digite o nome do álbum: ");

				a1.setAlbum(sc.nextLine());
				r1.cadastrarArtista(a1);
				break;
			case 2:
				if (r1.getRegistro().isEmpty()) {
					System.out.println("Não há artistas cadastrados!");
				} else {
					System.out.println(r1);
				}
				break;
			case 3:
				System.out.println("Total de artistas cadastrados: " + r1.obterQuantidadeArtistas());
				break;
			case 4:
				if (r1.getRegistro().isEmpty()) {
					System.out.println("Não há nada a ser excluído!");
				} else {
					System.out.println("Tem certeza de que deseja EXCLUIR todo o registro? \n1 - Sim\n2 - Não");
					opcao = sc.nextInt();
					if (opcao == 1) {
						r1.apagarTudo();
						System.out.println("Registro excluído com sucesso!");
					} else {
						System.out.println("Operação cancelada");
					}
				}
				break;
			case 0:
				System.out.println("Menu encerrado");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		sc.close();
	}
}
