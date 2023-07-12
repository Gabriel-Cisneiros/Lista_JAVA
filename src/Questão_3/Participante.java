package Questão_3;

import java.time.LocalDate;

public class Participante extends Pessoa {
	private String trilhaDeInteresses;

	public Participante(String nomeCompleto, String email, LocalDate dataNascimento, String trilhaDeInteresses, String cidade, Long codigo) {
		super(codigo, nomeCompleto, email, dataNascimento, cidade);
		this.trilhaDeInteresses = trilhaDeInteresses;
	}

	public String getTrilhaDeInteresses() {
		return trilhaDeInteresses;
	}

	public void setTrilhaDeInteresses(String trilhaDeInteresses) {
		this.trilhaDeInteresses = trilhaDeInteresses;
	}
	
}
