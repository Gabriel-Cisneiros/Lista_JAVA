package Questão_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ControladorMidia  {

	private IRepositorioUsuario ru;
	private IRepositorioMidia rm;
	private IRepositorioReproducaoMidia rrm;

	private static ControladorMidia instance;

	private ControladorMidia() {
		this.ru = new RepositorioUsuario();
		this.rm = new RepositorioMidia();
		this.rrm = new RepositorioReproducaoMidia();
	}

	public static ControladorMidia getInstance() {
		if (instance == null) {
			instance = new ControladorMidia();
		}
		return instance;
	}

	void cadastrarUsuario(Usuario usuario) {
		if (usuario != null) {
			if (usuario instanceof Produtor) {
				if(((Produtor)usuario).getCategorias() != null && !(((Produtor)usuario).getCategorias().isEmpty())) {
					ru.cadastrarUsuario(usuario);
				}
			} else if (usuario instanceof Consumidor) {
					ru.cadastrarUsuario(usuario);
			}
		}
	}
	
	void removerUsuario(Usuario usuario) {
		if (usuario == null) {
			ru.removerUsuario(usuario);
		}
	}
	
	void cadastrarMidia(Midia midia) {
		if (midia != null) {
			System.out.println(rm.getMidiasLista());
			for(Midia md : rm.getMidiasLista()) {
				if(md.getCategoria().equals(midia.getCategoria())) {
					rm.cadastrarMidia(midia);
				}
			}
//			if (midia.getProdutor().getCategorias().contains(midia.getCategoria())) {
//				System.out.println("ENTROU CADASTRAR");
//				rm.cadastrarMidia(midia);
//			}
		}
	}
	
	void removerMidia(Midia midia) {
		if (midia == null) {
			rm.removerMidia(midia);
		}
	}

	void reproduzirMidia(Consumidor consumidor, Midia midia) {
		if (consumidor != null && midia != null) {
			if(LocalDate.now().getYear() - consumidor.getData_de_nascimento().getYear() >= midia.getFaixaEtariaMinima()) {
				ReproducaoMidia reproducao = new ReproducaoMidia(midia, consumidor, LocalDateTime.now());
				rrm.cadastrarReproducaoMidia(reproducao);
			}
		}
	}

	public ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade) {
		return ru.listarUsuariosComIdadeAcimaDe(idade);
	}

	public ArrayList<Usuario> listarUsuariosPorTipo(Class tipo) {
		return ru.listarUsuariosPorTipo(tipo);
	}

	public ArrayList<Midia> listarMidiasPorFaixaEtaria(int idade) {
		return rm.listarMidiasPorFaixaEtaria(idade);
	}

	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		return rm.listarMidiasPorCategoria(categoria);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
		return rrm.listarReproducoesNoPeriodo(inicio, fim);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		return rrm.listarReproducoesPorUsuario(usuario);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		return rrm.listarReproducoesPorCategorias(categorias);
	}
	
}
