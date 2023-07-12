package Questão_3;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPalestras {

	private ArrayList<Palestra> palestraLista = new ArrayList<>();

	public void inserirPalestra(Palestra palestra) {
		boolean identificarPalestra = false;

		for (Palestra analisePalestra : palestraLista) {
			if(palestra.getId() ==(analisePalestra.getId())) {
				identificarPalestra = true;
			}
		}
		if(identificarPalestra == false) {
			palestraLista.add(palestra);
		}
	}

	public List<Palestra> listarPalestras() {
		return palestraLista;
	}

	public Palestra buscarPalestraPorId(long id) {
		for (Palestra analisePalestra : palestraLista) {
			if(analisePalestra.getId().equals(id)) {
				return analisePalestra;
			}
		}
		return null;
	}

	public ArrayList<Palestra> listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
		ArrayList<Palestra> avaliacaoIgualOuMaior = new ArrayList<>();
		for (Palestra palestraAvaliacao: palestraLista) {
			if(palestraAvaliacao.calcularMedia()>= nota) {
				avaliacaoIgualOuMaior.add(palestraAvaliacao);
			}
		}
		return avaliacaoIgualOuMaior;
	}

	public ArrayList<Avaliacao> listarTodasAvaliacoes(){
		ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
		for(Palestra palestraAvaliacao : palestraLista) {
			avaliacoes.addAll(palestraAvaliacao.getAvaliacoes());
		}
		return avaliacoes;
	}

	public ArrayList<Palestra> getListaPalestra() {
		return palestraLista;
	}

	protected void setListaPalestra(ArrayList<Palestra> palestraLista) {
		this.palestraLista = palestraLista;
	}
}