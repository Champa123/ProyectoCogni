package edu.curso.java.dao;

import java.util.List;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Usuario;

public interface ProyectoDAO {

	public Long guardarProyecto(Proyecto proyecto);
	public List<Proyecto> listarProyectos();
	
	Proyecto recuperarProyectoPorId(Long id);


	
	void agregarUsuarioProyecto(Usuario usuario, Long id);
	void borrarProyectoPorId(Long id);
	
	void editarProyecto(Proyecto proyecto);
	
}
