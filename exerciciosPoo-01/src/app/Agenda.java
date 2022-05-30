package app;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> agenda;

	public Agenda() {
		this.agenda = new ArrayList<Contato>(10);
	}

	public ArrayList<Contato> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Contato> agenda) {
		this.agenda = agenda;
	}

	public void armazenarContato(Contato c1) {
		this.agenda.add(c1);
	}

	public void imprimirContato(int i) {
		System.out.println(agenda.get(i));
	}

	public void buscarContato(String nome) {
		for (Contato c1 : agenda) {
			if (c1.getNome().equals(nome)) {
				System.out.println("Posição do contato na agenda: " + agenda.indexOf(c1));
			}
		}
	}

	public void removerContato(String nome) {
		for (int i = 0; i < agenda.size(); ++i) {
			final Contato indice = agenda.get(i);
			agenda.remove(indice);
		}
		System.out.println("Contato removido com sucesso!");
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}

}
