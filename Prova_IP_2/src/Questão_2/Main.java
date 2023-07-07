package Questão_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ControladorMidia Gabtube = ControladorMidia.getInstance();
		ArrayList<String> conteudoGame = new ArrayList<>();
		ArrayList<String> conteudoVlog = new ArrayList<>();
		ArrayList<String> conteudoCubing = new ArrayList<>();
		
		conteudoGame.add("League Of Legends");
		conteudoGame.add("Minecraft");
		conteudoGame.add("Clash Royale");
		conteudoVlog.add("Daily Routine");
		conteudoVlog.add("Wild Life Vlog");
		conteudoVlog.add("Get Dressed With Me");
		conteudoCubing.add("Speedcubing");
		conteudoCubing.add("Cube interesting facts");
		conteudoCubing.add("Cube Review");
		
		Produtor produtor1 = new Produtor("Gabriel Cisneiros Silva de Oliveira", "gabriel.cisneiros@gmail.com", LocalDate.parse("2004-02-20"),"SpeedCubing", conteudoCubing);
		Produtor produtor2 = new Produtor("Arthur Fellipe de Lira Aleixo", "arthur.fellipe@gmail.com", LocalDate.parse("2004-02-12"),"Gym Workout", conteudoVlog);
		Produtor produtor3 = new Produtor("Nicholas Camargo Silva ", "nicholas.silva@gmail.com", LocalDate.parse("2004-08-20"),"Rpg and Gameplays", conteudoGame);
		
		Gabtube.cadastrarUsuario(produtor1);
		Gabtube.cadastrarUsuario(produtor2);
		Gabtube.cadastrarUsuario(produtor3);
		
		Consumidor consumidor1 = new Consumidor("Jonh Lennon", "jonh.lennon@gmail.com", LocalDate.parse("1940-10-08"), conteudoGame);
		Consumidor consumidor2 = new Consumidor("Jennifer Lawrence", "jenniferlaw@gmail.com", LocalDate.parse("1990-08-15"), conteudoVlog);
        Consumidor consumidor3 = new Consumidor("Tom Hanks", "tomhanks@gmail.com", LocalDate.parse("1956-07-09"), conteudoVlog);
        Consumidor consumidor4 = new Consumidor("Emma Watson", "emmawatson@gmail.com", LocalDate.parse("1990-04-15"), conteudoCubing);
        Consumidor consumidor5 = new Consumidor("Brad Pitt", "bradpitt@gmail.com", LocalDate.parse("2010-12-18"), conteudoGame);
        Consumidor consumidor6 = new Consumidor("Angelina Jolie", "angelinajolie@gmail.com", LocalDate.parse("2007-06-04"), conteudoCubing);
        Consumidor consumidor7 = new Consumidor("Leonardo DiCaprio", "leonardodicaprio@gmail.com", LocalDate.parse("2011-11-11"), conteudoGame);
        
        Gabtube.cadastrarUsuario(consumidor1);
        Gabtube.cadastrarUsuario(consumidor2);
        Gabtube.cadastrarUsuario(consumidor3);
        Gabtube.cadastrarUsuario(consumidor4);
        Gabtube.cadastrarUsuario(consumidor5);
        Gabtube.cadastrarUsuario(consumidor6);
        Gabtube.cadastrarUsuario(consumidor7);
        
        Gabtube.removerUsuario(consumidor7);
        
        ArrayList<Usuario> ListagemIdade = Gabtube.listarUsuariosComIdadeAcimaDe(16);
        System.out.println("\r\nLista de usuarios acima de 16:");
		for(Usuario user : ListagemIdade) {
			System.out.println(user.getNome());
		}
		
		ArrayList<Usuario> ListagemConsumidor = Gabtube.listarUsuariosPorTipo(consumidor1.getClass());
		System.out.println("\r\nLista de Consumidores:");
		for(Usuario user : ListagemConsumidor) {
			System.out.println(user.getNome());
		}
		
		Midia midia1 = new Midia(LocalDateTime.now().minusDays(30), "Do A Barrel Roll", 15, "Geek", produtor3);
		Midia midia2 = new Midia(LocalDateTime.now().minusDays(30), "Top 10 anime Battles", 15, "Geek", produtor3);
        Midia midia3 = new Midia(LocalDateTime.now().minusDays(15), "Exploring the Cosmos", 15, "Science", produtor1);
        Midia midia4 = new Midia(LocalDateTime.now().minusDays(7), "The Art of Cooking", 16, "Food", produtor2);
        Midia midia5 = new Midia(LocalDateTime.now().minusDays(45), "The Power of Music", 14, "Music", produtor3);
        Midia midia6 = new Midia(LocalDateTime.now().minusDays(60), "The Movie Marathon", 18, "Entertainment", produtor1);
        Midia midia7 = new Midia(LocalDateTime.now().minusDays(22), "Coding Masterclass", 15, "Technology", produtor2);
        Midia midia8 = new Midia(LocalDateTime.now().minusDays(10), "Gaming Tips and Tricks", 15, "Geek", produtor3);
		
        Gabtube.cadastrarMidia(midia1);
        Gabtube.cadastrarMidia(midia2);
        Gabtube.cadastrarMidia(midia3);
        Gabtube.cadastrarMidia(midia4);
        Gabtube.cadastrarMidia(midia5);
        Gabtube.cadastrarMidia(midia6);
        Gabtube.cadastrarMidia(midia7);
        Gabtube.cadastrarMidia(midia8);
        
        Gabtube.removerMidia(midia8);
        
        ArrayList<Midia> ListagemMidiaFaixaEtaria = Gabtube.listarMidiasPorFaixaEtaria(14);
        System.out.println("\r\nMidias para 14 anos:");
		for(Midia midia : ListagemMidiaFaixaEtaria) {
			System.out.println("aquii");
			System.out.println(midia.getCategoria());
		}
		
//		ArrayList<Midia> ListagemMidiaCategoria = Gabtube.listarMidiasPorCategoria(String.class);
//		for(Midia midia : ListagemMidiaCategoria) {
//			System.out.println("\r\nMidias Geek:");
//			System.out.println(midia.getArquivo());
//		}
//		
//		Gabtube.reproduzirMidia(consumidor1, midia8);
//		Gabtube.reproduzirMidia(consumidor3, midia7);
//		Gabtube.reproduzirMidia(consumidor1, midia2);
//		Gabtube.reproduzirMidia(consumidor7, midia4);
//		Gabtube.reproduzirMidia(consumidor2, midia3);
//		Gabtube.reproduzirMidia(consumidor6, midia1);
//		Gabtube.reproduzirMidia(consumidor4, midia6);
//		Gabtube.reproduzirMidia(consumidor5, midia8);
//		Gabtube.reproduzirMidia(consumidor2, midia5);
//		Gabtube.reproduzirMidia(consumidor6, midia2);
//		Gabtube.reproduzirMidia(consumidor1, midia3);
//		Gabtube.reproduzirMidia(consumidor4, midia8);
//		Gabtube.reproduzirMidia(consumidor5, midia1);
//		Gabtube.reproduzirMidia(consumidor3, midia6);
//		Gabtube.reproduzirMidia(consumidor7, midia3);
//		Gabtube.reproduzirMidia(consumidor6, midia4);
//		Gabtube.reproduzirMidia(consumidor2, midia1);
//		Gabtube.reproduzirMidia(consumidor1, midia7);
//		Gabtube.reproduzirMidia(consumidor4, midia5);
//		Gabtube.reproduzirMidia(consumidor5, midia2);
	}
}
