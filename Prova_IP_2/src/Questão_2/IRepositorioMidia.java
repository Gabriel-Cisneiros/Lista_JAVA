package Questão_2;

import java.util.ArrayList;

public interface IRepositorioMidia {

	void cadastrarMidia(Midia midia);

	void removerMidia(Midia midia);

	ArrayList<Midia> listarMidiasPorFaixaEtaria(int faixaEtariaMinima);

	ArrayList<Midia> listarMidiasPorCategoria(Class<String> categoria);

}