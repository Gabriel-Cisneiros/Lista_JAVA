package Questão_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoas {

	private ArrayList<Pessoa> pessoaLista = new ArrayList<>();

	//Inserir Pessoa

	public void inserirPessoa(Pessoa pessoa) {
		boolean identificarPessoa = false;

		for (Pessoa analisePessoa : pessoaLista) {
			if (pessoa.getEmail().equals(analisePessoa.getEmail())) {
				identificarPessoa = true;
			}
		}
		if (identificarPessoa == false) {
			pessoaLista.add(pessoa);
		}
	}

	//Remover Pessoa

	public void removerPessoa(String email) {
		for (Pessoa analisePessoa : pessoaLista) {
			if (email.equals(analisePessoa.getEmail()))
				pessoaLista.remove(analisePessoa);
		}
	}

	//Buscar Pessoa - Email

	public Pessoa buscarPessoaPorEmail(String email) {
		for (Pessoa analisePessoa : pessoaLista) {
			if (analisePessoa.getEmail().equals(email)) {
				return analisePessoa;
			}
		}
		return null;
	}

	//Listar Palestrantes - Empresa

	public List<Palestrante> listarPalestrantePorEmpresa (String empresa) {
		ArrayList<Palestrante> palestrantePorEmpresa = new ArrayList<>();
		for (Pessoa analisePessoa : pessoaLista) {
			if(analisePessoa instanceof Palestrante) {
				if(((Palestrante) analisePessoa).getEmpresa() == empresa) {
					palestrantePorEmpresa.add((Palestrante) analisePessoa);
				}
			}
		}
		return palestrantePorEmpresa;
	}

	public List<Participante> listarParticipanteComInteresseEm (String trilha) {
		ArrayList<Participante> participantePorTrilha = new ArrayList<>();
		for (Pessoa analisePessoa : pessoaLista) {
			if(analisePessoa instanceof Participante) {
				if(((Participante) analisePessoa).getTrilhaDeInteresses() == trilha) {
					participantePorTrilha.add((Participante) analisePessoa);
				}
			}
		}
		return participantePorTrilha;
	}

	public List<Participante> listarParticipantesComIdadeMaiorQue (int idade) {
		ArrayList<Participante> participanteMaiorQue = new ArrayList<>(); {
			for (Pessoa analisePessoa : pessoaLista) {
				if(analisePessoa instanceof Participante) {
					if (LocalDate.now().getYear() - ((Participante) analisePessoa).getDataNascimento().getYear() >= idade) {
						participanteMaiorQue.add((Participante)analisePessoa);
					}
				}
			}
		}
		return participanteMaiorQue;
	}
}