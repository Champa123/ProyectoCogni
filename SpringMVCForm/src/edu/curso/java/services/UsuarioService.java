package edu.curso.java.services;

import java.util.List;

import edu.curso.java.bo.Usuario;

public interface UsuarioService {

	Long crearNuevoUsuario(Usuario usuario);

	List<Usuario> recuperarUsuarios();

	Usuario recuperarUsuarioPorId(Long id);

	void borrarUsuario(Long id);

	void editarUsuario(Usuario usuario);
}