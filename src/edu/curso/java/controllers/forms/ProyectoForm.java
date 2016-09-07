package edu.curso.java.controllers.forms;

import java.util.ArrayList;
import java.util.List;

import edu.curso.java.bo.Tarea;
import edu.curso.java.bo.Usuario;

public class ProyectoForm {

	private Long id;
	private String nombre;
	private String descripcion;
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Tarea> tareas = new ArrayList<>();
	private Long idUsuarioPrincipal;
	private Long[] idUsuarios;
	
	public Long getIdUsuarioPrincipal() {
		return idUsuarioPrincipal;
	}



	public void setIdUsuarioPrincipal(Long idUsuarioPrincipal) {
		this.idUsuarioPrincipal = idUsuarioPrincipal;
	}



	public Long getId() {
		return id;
	}

	
	
	public List<Tarea> getTareas() {
		return tareas;
	}



	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}



	public Long[] getIdUsuarios() {
		return idUsuarios;
	}



	public void setIdUsuarios(Long[] idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	
}
