package Questão_3;

import java.time.LocalDateTime;
import java.util.List;

public class Palestra {
	public Long id;
	public String titulo;
	public Palestrante palestrante;
	public String descricao;
	public List<Avaliacao> avaliacoes;
	public LocalDateTime dataHora;
	public String local;
	public String trilha;
	
	public Palestra(Long id, String titulo, Palestrante palestrante, String descricao, List<Avaliacao> avaliacoes,
			LocalDateTime dataHora, String local, String trilha) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.avaliacoes = avaliacoes;
		this.dataHora = dataHora;
		this.local = local;
		this.trilha = trilha;
	}
	
	public double calcularMedia() {
		   int somaNotas = 0;
		   for(Avaliacao avaliacao: avaliacoes) {
			  somaNotas += avaliacao.getNota();
		   }
		   return somaNotas/avaliacoes.size();
		}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTrilha() {
		return trilha;
	}

	public void setTrilha(String trilha) {
		this.trilha = trilha;
	}
	
}
