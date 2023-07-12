package Questão_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioUsuario implements IRepositorioUsuario {
	
	private ArrayList<Usuario> usuariosLista;
	
	public RepositorioUsuario() {
		usuariosLista = new ArrayList<>();
	}
	
	@Override
	public void cadastrarUsuario(Usuario usuario) {
		boolean identificarUsuario = false;
		
		for(Usuario analiseUsuario : usuariosLista) {
			if (usuario.getEmail().equals(analiseUsuario.getEmail())) {
				identificarUsuario = true;
			}
		}
		
		if (!identificarUsuario) {
			usuariosLista.add(usuario);
		} else {
			System.out.println("Usuário já existente");
		}
	}
	
	@Override
	public void removerUsuario(Usuario usuario) {
		for (Usuario analiseUsuario : usuariosLista) {
			if (usuario.getEmail().equals(analiseUsuario.getEmail()))
				usuariosLista.remove(usuario);
			}
		}
	
	@Override
	public ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade){
		ArrayList<Usuario> usuarioAcimaDe = new ArrayList<>();
		
		for(Usuario analiseUsuario : usuariosLista) {
			if (LocalDate.now().getYear() - analiseUsuario.getData_de_nascimento().getYear() <= idade) {
				usuarioAcimaDe.add(analiseUsuario);
			}
		}
		
		return usuarioAcimaDe;
	}
	
	@Override
	public ArrayList<Usuario> listarUsuariosPorTipo(Class tipo){
		ArrayList<Usuario> usuarioTipo = new ArrayList<>();
		
		for (Usuario analiseUsuario : usuariosLista) {
			if(tipo.isInstance(analiseUsuario)) {
				usuarioTipo.add(analiseUsuario);
			}
		}
		
		return usuarioTipo;
		
	}
}
