package Questão_2;

import java.util.ArrayList;

public class RepositorioMidia implements IRepositorioMidia {

	private ArrayList<Midia> MidiasLista;
	
	public RepositorioMidia() {
		MidiasLista = new ArrayList<>();
	}
	
	public ArrayList<Midia> getMidiasLista() {
		return MidiasLista;
	}

	public void setMidiasLista(ArrayList<Midia> midiasLista) {
		MidiasLista = midiasLista;
	}
	
	@Override
	public void cadastrarMidia(Midia midia) {
		boolean identificarMidia = false;
		System.out.println("ENTROU");
		for(Midia analiseMidia : MidiasLista) {
			if (midia.getArquivo().equals(analiseMidia.getArquivo())) {
				identificarMidia = true;
			}
		}
		
		if (identificarMidia == false) {
			MidiasLista.add(midia);
		} else {
			System.out.println("Arquivo de mídia já existente");
		}
	}
	
	@Override
	public void removerMidia(Midia midia) {
		Midia MidiaRemover = null;
		for (Midia analiseMidia : MidiasLista) {
			if (midia.getArquivo().equals(analiseMidia.getArquivo())) {
				MidiaRemover = analiseMidia;
				break;
			}
		}
		
		if (MidiaRemover != null) {
			MidiasLista.remove(MidiaRemover);
		}
	}
	
	@Override
	public ArrayList<Midia> listarMidiasPorFaixaEtaria(int idade){
		ArrayList<Midia> MidiaAcimaDe = new ArrayList<>();
		System.out.println(MidiasLista);
		for(Midia analiseMidia : MidiasLista) {
			System.out.println(analiseMidia.getFaixaEtariaMinima());
			if (analiseMidia.getFaixaEtariaMinima() >= idade) {
				MidiaAcimaDe.add(analiseMidia);
			}
		}
		
		return MidiaAcimaDe;
		
	}
	
	@Override
	public ArrayList<Midia> listarMidiasPorCategoria(Class<String> categoria){
		ArrayList<Midia> MidiaTipo = new ArrayList<>();
		
		for (Midia analiseMidia : MidiasLista) {
			if(categoria.isInstance(analiseMidia)) {
				MidiaTipo.add(analiseMidia);
			}
		}
		
		return MidiaTipo;
		
	}

	@Override
	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}
}
