package Questão_2;

import java.util.ArrayList;

public interface IRepositorioUsuario {

	void cadastrarUsuario(Usuario usuario);

	void removerUsuario(Usuario usuario);

	ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade);

	ArrayList<Usuario> listarUsuariosPorTipo(Class<String> tipo);

}