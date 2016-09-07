package edu.curso.java.dao;

import java.util.List;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Tarea;
import edu.curso.java.bo.Usuario;
import edu.curso.java.controllers.autocomplete.ItemAutoComplete;

public interface TareaDAO {

	public Long guardarTarea(Tarea tarea);
	
	Tarea recuperarTareaPorId(Long id);

	void borrarTareaPorId(Long id);
	
	void editarTarea(Tarea tarea);
	
	
}
