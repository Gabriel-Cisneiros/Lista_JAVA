package Questão_2;

import java.time.LocalDateTime;

public class Midia {
	private LocalDateTime dataHoraUpload;
	private String arquivo;
	private int faixaEtariaMinima;
	private String categoria;
	private Produtor Produtor;
	
	public Midia(LocalDateTime dataHoraUpload, String arquivo, int faixaEtariaMinima, String categoria, Produtor produtor) {
		this.dataHoraUpload = dataHoraUpload;
		this.arquivo = arquivo;
		this.faixaEtariaMinima = faixaEtariaMinima;
		this.categoria = categoria;
		Produtor = produtor;
	}

	public LocalDateTime getDataHoraUpload() {
		return dataHoraUpload;
	}
	
	public String getArquivo() {
		return arquivo;
	}

	public int getFaixaEtariaMinima() {
		return faixaEtariaMinima;
	}

	public String getCategoria() {
		return categoria;
	}

	public Produtor getProdutor() {
		return Produtor;
	}
	
	
}
