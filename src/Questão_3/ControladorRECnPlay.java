package Questão_3;

import java.util.ArrayList;
import java.util.List;

public class ControladorRECnPlay {

	private RepositorioPessoas repositoriopessoa;
	private RepositorioPalestras repositoriopalestra;

	private static ControladorRECnPlay instance;

	private ControladorRECnPlay() {
		this.repositoriopessoa = new RepositorioPessoas();
		this.repositoriopalestra = new RepositorioPalestras();
	}

	public static ControladorRECnPlay getInstance() {
		if (instance == null) {
			instance = new ControladorRECnPlay();
		}
		return instance;
	}

	protected RepositorioPessoas getRepositorioPessoa() {
		return repositoriopessoa;
	}

	protected RepositorioPalestras getRepositorioPalestra() {
		return repositoriopalestra;
	}

	public void realizarInscricao(Participante participante) {
		if (participante != null) {
			if (participante instanceof Participante) {
				Participante trilha = (Participante) participante;
				if (trilha.getTrilhaDeInteresses() != null && !trilha.getTrilhaDeInteresses().isBlank()) {
					if (participante.getTrilhaDeInteresses().equals("TECNOLOGIAS")
							|| participante.getTrilhaDeInteresses().equals("ECONOMIA_CRIATIVA")
							|| participante.getTrilhaDeInteresses().equals("CIDADES")) {
						repositoriopessoa.inserirPessoa(participante);
					}

				}
			}

		}
	}

	//	public void cadastrarPalestra (Palestra palestra) {
	//		if (palestra != null && palestra.getPalestrante() != null && palestra.getDataHora() != null && palestra.getDescricao() != null && palestra.getId() != null && palestra.getLocal() != null && palestra.getTitulo() != null && palestra.getTrilha() != null) {
	//			if (palestra.getPalestrante().getEmpresa() != null) {
	//				repositoriopessoa.inserirPessoa(palestra.getPalestrante()){
	//					
	//				}
	//			}
	//		}
	//	}

	public void avaliarPalestra(Avaliacao aval) {
		if (!(aval.getAvaliador() != null) && !(aval.getPalestra() != null)) {
			System.out.println("Verifique o avaliador e a palestra inseridos.");
		}

		if (aval.getNota() < 0 || aval.getNota() > 5) {
			System.out.println("A nota deve ser entre 0 e 5.");
		}
	}

	public ArrayList<Palestra> listarPalestrasMaisBemAvaliadas() {
		double maiorMedia = 0;
		ArrayList<Palestra> palestrasAv = new ArrayList<>();

		for (Palestra palestra : this.getRepositorioPalestra().listarPalestras()) {

			double media = palestra.calcularMedia();
			if (media > maiorMedia) {
				maiorMedia = media;
				palestrasAv.add(palestra);
			} 
			if (media == maiorMedia) {
				palestrasAv.add(palestra);
			}

		}
		return palestrasAv;
	}

	public int listarTotalPalestrasComMediaAvaliacaoMaiorQue (int nota) {
		ArrayList<Palestra> avaliacaoMaior = new ArrayList<>();
		for(Palestra listarPalestras : this.getRepositorioPalestra().getListaPalestra()) {
			if(listarPalestras.calcularMedia() > nota) {
				avaliacaoMaior.add(listarPalestras);
			}
		}
		return avaliacaoMaior.size();
	}

	public List<Palestrante> listarPalestrantePorEmpresa(String empresa) {
		return repositoriopessoa.listarPalestrantePorEmpresa(empresa);
	}

	public List<Participante> listarParticipanteComInteresseEm(String trilha) {
		return repositoriopessoa.listarParticipanteComInteresseEm(trilha);
	}

	public List<Participante> listarParticipantesComIdadeMaiorQue(int idade) {
		return repositoriopessoa.listarParticipantesComIdadeMaiorQue(idade);
	}

	public List<Palestra> listarPalestras() {
		return repositoriopalestra.listarPalestras();
	}

	public ArrayList<Palestra> listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
		return repositoriopalestra.listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(nota);
	}

	public ArrayList<Avaliacao> listarTodasAvaliacoes() {
		return repositoriopalestra.listarTodasAvaliacoes();
	}


}
