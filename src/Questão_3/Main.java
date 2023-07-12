package Questão_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		
		LocalDateTime dataHora1 = LocalDateTime.of(2023, 10, 2, 10, 0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
		String dataHoraFormatada = dataHora1.format(formatter);
		
		ControladorRECnPlay recnplay  = ControladorRECnPlay.getInstance();
		
		Palestrante palestrante1 = new Palestrante(1L, "GUSTAVO FRANCO", "gustavo.franco@gmail.com", LocalDate.parse("1970-10-20"), "Chã Grande", "Empresa X");
		Palestrante palestrante2 = new Palestrante(2L, "SIMONE ZELAQUETTE", "simone.zelaquette@gmail.com", LocalDate.parse("1969-08-04"), "Gravatá", "Accenture");
		Palestrante palestrante3 = new Palestrante(1L, "ANDREA PINHO", "andrea.pinho@gmail.com", LocalDate.parse("1985-02-05"), "Recife", "Prefeitura do Recife");
		Palestrante palestrante4 = new Palestrante(1L, "MARIANA MOURA", "mariana.moura@gmail.com", LocalDate.parse("1988-12-27"), "Araçoiaba", "Grupo Moura");
		Palestrante palestrante5 = new Palestrante(1L, "SILVIO MEIRA", "silvio.meira@gmail.com", LocalDate.parse("1977-11-15"), "Recife", "UFRPE");
		
		Participante participante1 = new Participante("Nicholas Camargo Silva", "nicholas.camargo@gmail.com", LocalDate.parse("2004-08-20"), "TECNOLOGIA", "São Paulo", 00L);
		Participante participante2 = new Participante("Gabriel Cisneiros Silva de Oliveira", "gabriel.cisneiros@gmail.com", LocalDate.parse("2004-02-20"), "TECNOLOGIA", "Recife", 01L);
		Participante participante3 = new Participante("Arthur Fellipe de Lira Aleixo", "arthur.fellipe@gmail.com", LocalDate.parse("2004-02-12"), "CIDADES", "Gravatá", 02L);
		Participante participante4 = new Participante("Marcela Hadassa de Oliveira", "marcela.hadassa@gmail.com", LocalDate.parse("2003-03-20"), "ECONOMIA_CRIATIVA", "Recife", 03L);
		Participante participante5 = new Participante("Marcio Antonio da Silva Filho", "marcio.antonio@gmail.com", LocalDate.parse("2004-05-16"), "CIDADES", "Recife", 04L);
		Participante participante6 = new Participante("Antonio da Silva Neto", "antonio.silvao@gmail.com", LocalDate.parse("1977-12-03"), "ECONOMIA_CRIATIVA", "Rio de Janeiro", 05L);
		Participante participante7 = new Participante("Igor Nasciemento da Silva", "igor.nascimento@gmail.com", LocalDate.parse("1970-08-11"), "ECONOMIA_CRIATIVA", "Volta Redonda", 06L);
		Participante participante8 = new Participante("Leandro Nascimento", "leandro.nascimento@gmail.com", LocalDate.parse("2004-08-20"), "TECNOLOGIA", "Recife", 07L);
		
		Avaliacao avaliacao1 = new Avaliacao(palestra1, 2, "Ruim", participante6);
		Avaliacao avaliacao2 = new Avaliacao(palestra2, 3, "Mediano", particia);
		Avaliacao avaliacao3 = new Avaliacao(palestra3, 1, "Pessimo", partiOito);
		Avaliacao avaliacao4 = new Avaliacao(palestra2, 4, "Bom", partiUm);
		Avaliacao avaliacao5 = new Avaliacao(palestra1, 5, "Otimo", partiDois);
		Avaliacao avaliacao6 = new Avaliacao(palestra3, 1, "Pessimo", partiTres);
		Avaliacao avaliacao7 = new Avaliacao(palestra4, 3, "Mediana", partiQuatro);
		Avaliacao avaliacao8 = new Avaliacao(palestra5, 2, "Ruim", partiCinco);
		Avaliacao avaliacao9 = new Avaliacao(palestra4, 4, "Boa", partiSeis);
		Avaliacao avaliacao10 = new Avaliacao(palestra5, 5, "Otimo", partiSete);
		Avaliacao avaliacao11 = new Avaliacao(palestra4, 3, "Mediana", partiSeis);
		Avaliacao avaliacao12 = new Avaliacao(palestra5, 1, "Pessima", partiSete);
	}
}
