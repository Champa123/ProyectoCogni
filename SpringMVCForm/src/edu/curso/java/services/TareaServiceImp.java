package edu.curso.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Tarea;
import edu.curso.java.bo.Usuario;
import edu.curso.java.controllers.autocomplete.ItemAutoComplete;
import edu.curso.java.dao.ProyectoDAO;
import edu.curso.java.dao.TareaDAO;
import edu.curso.java.dao.UsuarioDAO;

@Service
@Transactional
public class TareaServiceImp implements TareaService {

	@Autowired
	TareaDAO tareaDAO;
	@Autowired
	UsuarioDAO usuarioDAO;
	

	@Override
	public Long guardarTarea(Tarea tarea) {
		return tareaDAO.guardarTarea(tarea);

	}

	
	@Override
	public Tarea recuperarTareaPorId(Long id) {
		return tareaDAO.recuperarTareaPorId(id);
	}

	
	@Override
	public void borrarTareaPorId(Long id) {
		tareaDAO.borrarTareaPorId(id);
			
	}

	@Override
	public void editarTarea(Tarea tarea) {
		tareaDAO.editarTarea(tarea);
		
	}


	
	
}
