package app;

public class UsaElevador {
	public static void main(String[] args) {

		Elevador elevador = new Elevador(10, 10);

		elevador.Inicializa(0, 0);

		elevador.Entra();
		elevador.Sobe();
		elevador.Sobe();
		elevador.Entra();
		elevador.Entra();
		elevador.Entra();
		elevador.Sobe();
		
		elevador.Desce();
		elevador.Sai();
		
		System.out.println(elevador);
	}
}
