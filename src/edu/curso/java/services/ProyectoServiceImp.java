package edu.curso.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Usuario;
import edu.curso.java.dao.ProyectoDAO;
import edu.curso.java.dao.UsuarioDAO;

@Service
@Transactional
public class ProyectoServiceImp implements ProyectoService {

	@Autowired
	ProyectoDAO proyectoDAO;
	@Autowired
	UsuarioDAO usuarioDAO;
	@Override
	public Long guardarProyecto(Proyecto proyecto) {
		return proyectoDAO.guardarProyecto(proyecto);
	}
	
	@Override
	public List<Proyecto> listarProyectos() {
		return proyectoDAO.listarProyectos();
	}

	@Override
	public Proyecto recuperarProyectoPorId(Long id) {
		
		return proyectoDAO.recuperarProyectoPorId(id);
	}

	@Override
	public void agregarUsuarioProyecto(Usuario usuario, Long id) {
		proyectoDAO.agregarUsuarioProyecto(usuario, id);
		
	}

	@Override
	public void borrarProyectoPorId(Long id) {
		proyectoDAO.borrarProyectoPorId(id);
		
	}

	@Override
	public void editarProyecto(Proyecto proyecto) {
		proyectoDAO.editarProyecto(proyecto);
		
	}

	@Override
	public Long guardarProyecto(Proyecto proyecto, Long idUsuarioPrincipal) {
		
		Usuario usuario = usuarioDAO.recuperarUsuarioPorId(idUsuarioPrincipal);
		proyecto.setUsuarioPrincipal(usuario);
		proyectoDAO.guardarProyecto(proyecto);
		return proyecto.getId();
	}

	@Override
	public Long actualizarProyecto(Proyecto proyecto, Long idUsuarioPrincipal, Long[] idUsuarios) {
		Usuario usuarioPpal = usuarioDAO.recuperarUsuarioPorId(idUsuarioPrincipal);
		proyecto.getUsuarios().clear();
		for (Long id : idUsuarios) {
			Usuario usuario = usuarioDAO.recuperarUsuarioPorId(id);
			proyecto.getUsuarios().add(usuario);
		}
			
		
		proyecto.setUsuarioPrincipal(usuarioPpal);
		proyectoDAO.guardarProyecto(proyecto);
		return proyecto.getId();
		
	}
	
}
