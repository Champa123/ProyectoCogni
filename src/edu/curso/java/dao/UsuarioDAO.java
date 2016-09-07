package edu.curso.java.dao;

import java.util.List;

import edu.curso.java.bo.Usuario;

public interface UsuarioDAO {

	Long guardarUsuario(Usuario usuario);

	Usuario recuperarUsuarioPorId(Long id);

	List<Usuario> recuperarUsuarios();

	void borrarUsuarioPorId(Long id);
	
	void editarUsuario(Usuario usuario);
}