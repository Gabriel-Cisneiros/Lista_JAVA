package Questão_3;

import java.time.LocalDate;

public class Palestrante extends Pessoa{
	public String empresa;

	
	public Palestrante(Long codigo, String nome, String email, LocalDate dataNascimento, String cidade, String empresa) {
		super(codigo, nome, email, dataNascimento, cidade);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
