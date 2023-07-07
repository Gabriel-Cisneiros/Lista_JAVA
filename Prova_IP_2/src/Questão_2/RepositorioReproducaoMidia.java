package Questão_2;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class RepositorioReproducaoMidia implements IRepositorioReproducaoMidia {
	private ArrayList<ReproducaoMidia> reproducao;

	@Override
	public void repositorioReproducaoMidia(ArrayList<ReproducaoMidia> reproducao) {
		this.reproducao = reproducao;
	}

	@Override
	public void cadastrarReproducaoMidia(ReproducaoMidia reproducaomidia) {
		if (reproducaomidia != null) {
			reproducao.add(reproducaomidia);
			System.out.println("Nova mídia cadastrada");
		} else {
			System.out.println("Cadastro inválido, tente novamente");
		}
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
		ArrayList<ReproducaoMidia> reproducoesNoPeriodo = new ArrayList<>();
		for(ReproducaoMidia novaReproducao : reproducao) {
			if (novaReproducao.getDataHoraReproducao().isBefore(fim) && novaReproducao.getDataHoraReproducao().isAfter(inicio)) {
				reproducoesNoPeriodo.add(novaReproducao);
		}
	  }
		return reproducoesNoPeriodo;
	}
	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		ArrayList<ReproducaoMidia> reproducoesPorUsuario = new ArrayList<>();
		for (ReproducaoMidia novaReproducao : reproducao) {
			if (novaReproducao.getConsumidor().equals(usuario)) {
				reproducoesPorUsuario.add(novaReproducao);
			}
		}
		return reproducoesPorUsuario;
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		ArrayList<ReproducaoMidia> reproducoesPorCategorias = new ArrayList<>();
		for (ReproducaoMidia novaReproducao : reproducao) {
			if (novaReproducao.getMidia().getCategoria().contains(categorias)) {
				reproducoesPorCategorias.add(novaReproducao);
			}
		}
		return reproducoesPorCategorias;
	}
}
