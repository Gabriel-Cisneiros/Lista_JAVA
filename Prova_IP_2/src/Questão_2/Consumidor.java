package Questão_2;

import java.util.List;
import java.time.LocalDate;

public class Consumidor extends Usuario {
	private List<String> categoriasInteresse;

	public Consumidor(String nomeCompleto, String email, LocalDate dataNascimento, List<String> categoriasInteresse) {
		super(nomeCompleto, email, dataNascimento);
		this.categoriasInteresse = categoriasInteresse;
	}

	public List<String> getCategoriasInteresse() {
		return categoriasInteresse;
	}
	
}
