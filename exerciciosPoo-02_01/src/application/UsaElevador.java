package application;

import java.util.Scanner;

public class UsaElevador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Elevador elevador = new Elevador(10, 10);

		elevador.Inicializa(0, 0);

		int escolha;

		do {
			System.out.println("***** ELEVADOR *****");
			System.out.println("1 - Entra uma pessoa");
			System.out.println("2 - Sai uma pessoa");
			System.out.println("3 - Sobe um andar");
			System.out.println("4 - Desce um andar");
			System.out.println("0 - Sair do menu");

			escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				elevador.Entra();
				break;
			case 2:
				elevador.Sai();
				break;
			case 3:
				elevador.Sobe();
				break;
			case 4:
				elevador.Desce();
				break;
			case 0:
				System.out.println("Menu encerrado");
				break;
			default:
				System.out.println("Opção inválida!");

			}
			System.out.println(elevador);
		} while (escolha != 0);

		sc.close();
	}
}
