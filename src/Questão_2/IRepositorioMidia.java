package Questão_2;

import java.util.ArrayList;

public interface IRepositorioMidia {

	void cadastrarMidia(Midia midia);

	void removerMidia(Midia midia);

	public ArrayList<Midia> getMidiasLista();
	
	public void setMidiasLista(ArrayList<Midia> midiasLista);	

	ArrayList<Midia> listarMidiasPorFaixaEtaria(int faixaEtariaMinima);

	ArrayList<Midia> listarMidiasPorCategoria(String categoria);

	ArrayList<Midia> listarMidiasPorCategoria(Class<String> categoria);

}