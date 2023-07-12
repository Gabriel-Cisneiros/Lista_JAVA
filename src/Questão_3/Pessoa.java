package Questão_3;

import java.time.LocalDate;

public class Pessoa {
	
	private Long codigo;
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String cidade;
	public Pessoa(Long codigo, String nome, String email, LocalDate dataNascimento, String cidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
