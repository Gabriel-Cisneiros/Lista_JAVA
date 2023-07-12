package Questão_3;

public class Avaliacao {
	public Palestra palestra;
	public int nota;
	public String comentario;
	public Participante avaliador;
	
	public Avaliacao(Palestra palestra, int nota, String comentario, Participante avaliador) {
		super();
		this.palestra = palestra;
		this.nota = nota;
		this.comentario = comentario;
		this.avaliador = avaliador;
	}

	public Palestra getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Participante getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Participante avaliador) {
		this.avaliador = avaliador;
	}

}
