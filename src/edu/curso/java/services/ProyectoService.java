package edu.curso.java.services;

import java.util.List;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Usuario;
import edu.curso.java.controllers.autocomplete.ItemAutoComplete;

public interface ProyectoService {

	public Long guardarProyecto(Proyecto proyecto);
	public List<Proyecto> listarProyectos();
	
	Proyecto recuperarProyectoPorId(Long id);


	
	void agregarUsuarioProyecto(Usuario usuario, Long id);
	void borrarProyectoPorId(Long id);
	
	void editarProyecto(Proyecto proyecto);

	public Long actualizarProyecto(Proyecto proyecto, Long idUsuarioPrincipal, List<Long> idUsuarios);
	public List<Proyecto> buscarProyectosPorNombre(String term);
	Long guardarProyecto(Proyecto proyecto, Long idUsuarioPrincipal, List<Long> idUsuarios);

}