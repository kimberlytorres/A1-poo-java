package app;

import java.util.ArrayList;

public class RegistroArtistas {

	private ArrayList<Artista> registro;

	public RegistroArtistas() {
		this.registro = new ArrayList<Artista>();
	}

	public ArrayList<Artista> getRegistro() {
		return registro;
	}

	public void setRegistro(ArrayList<Artista> registro) {
		this.registro = registro;
	}

	public void cadastrarArtista(Artista a1) {
		this.registro.add(a1);
	}

	public void apagarTudo() {
		this.registro.clear();
	}

	public int obterQuantidadeArtistas() {
		return this.registro.size();
	}

	@Override
	public String toString() {
		return "Registro de Artistas {" + "\n" + registro + '}';
	}

}
