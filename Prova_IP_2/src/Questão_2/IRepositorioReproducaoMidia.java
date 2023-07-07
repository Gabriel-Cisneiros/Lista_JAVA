package Questão_2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRepositorioReproducaoMidia {

	void repositorioReproducaoMidia(ArrayList<ReproducaoMidia> reproducao);

	void cadastrarReproducaoMidia(ReproducaoMidia reproducaomidia);

	ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim);

	ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario);

	ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias);

}