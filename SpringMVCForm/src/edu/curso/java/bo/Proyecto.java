package edu.curso.java.bo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String descripcion;
	@ManyToOne
	private Usuario usuarioPrincipal;
	@ManyToMany
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@OneToMany
	private List<Tarea> tareas = new ArrayList<>();
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
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

	public Usuario getUsuarioPrincipal() {
		return usuarioPrincipal;
	}

	public void setUsuarioPrincipal(Usuario usuarioPrincipal) {
		this.usuarioPrincipal = usuarioPrincipal;
	}
	
	
	
}
