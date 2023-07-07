package Questão_2;

import java.util.List;
import java.time.LocalDate;

public class Produtor extends Usuario{
	
	private String nomeCanal;
	private List<String> categorias;
	
	public Produtor(String nomeCompleto, String email, LocalDate dataNascimento, String nomeCanal, List<String> categorias) {
		super(nomeCompleto, email, dataNascimento);
		this.nomeCanal = nomeCanal;
		this.categorias = categorias;
	}

	public String getNomeCanal() {
		return nomeCanal;
	}

	public List<String> getCategorias() {
		return categorias;
	}
}
