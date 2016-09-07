package edu.curso.java.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Usuario;
import edu.curso.java.controllers.forms.ProyectoForm;
import edu.curso.java.controllers.forms.UsuarioForm;
import edu.curso.java.services.ProyectoService;
import edu.curso.java.services.UsuarioService;

@Controller
@RequestMapping("/proyectos")
public class ProyectosController {

	private static final Logger log = Logger.getLogger(ProyectosController.class);
	
	@Autowired
	private ProyectoService proyectoService;

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		log.info("Listando los proyectos");
		List<Proyecto> proyectos = proyectoService.listarProyectos();
		model.addAttribute("proyectos",proyectos);
		return null;
	}
	
	@RequestMapping(value = "/verproyecto")
	public String verProyecto(@RequestParam Long id, Model model) {
		Proyecto proyecto = proyectoService.recuperarProyectoPorId(id);
		model.addAttribute("proyecto", proyecto);
		return null;
	}
	
	@RequestMapping(value = "/borrarproyecto")
	public String borrarProyecto(@RequestParam Long id, Model model) {
		proyectoService.borrarProyectoPorId(id);
		return "redirect:/proyectos/index.html";
	}
	
	@RequestMapping(value = "/nuevoproyecto")
	public String nuevoProyecto(Model model) {
		model.addAttribute("proyectoForm", new ProyectoForm());
		model.addAttribute("usuarios", usuarioService.recuperarUsuarios());
		return "/proyectos/form";
	}
	
//	@RequestMapping(value = "/guardarproyecto", method = RequestMethod.POST)
//	public String guardarUsuario(@ModelAttribute("proyectoForm") ProyectoForm proyectoForm, Model model) {
//
//		Proyecto proyecto = new Proyecto();
//		proyecto.setDescripcion(proyectoForm.getDescripcion());
//		proyecto.setNombre(proyectoForm.getNombre());
//		proyecto.setUsuarios(proyectoForm.getUsuarios());
//		proyecto.setId(proyectoForm.getId());
//		
//		Long idGenerado = proyectoService.guardarProyecto(proyecto);
//
//		return "redirect:/proyectos/verproyecto.html?id=" + idGenerado;
//	}
//	@RequestMapping(value = "/guardarproyecto", method = RequestMethod.POST)
//	public String guardarUsuario(@ModelAttribute("proyectoForm") ProyectoForm proyectoForm, Model model) {
//		Proyecto proyecto = null;
//		Long idActual = proyectoForm.getId();
//		Long idUsuarioPrincipal = proyectoForm.getIdUsuarioPrincipal();
//		
//		if(idActual != null){
//			proyecto= proyectoService.recuperarProyectoPorId(idActual);
//			proyecto.setNombre(proyectoForm.getNombre());
//			proyecto.setDescripcion(proyecto.getDescripcion());
//			idActual = proyectoService.guardarProyecto(proyecto,idUsuarioPrincipal);
//		} else {
//			proyecto = new Proyecto();
//			proyecto.setNombre(proyectoForm.getNombre());
//			proyecto.setDescripcion(proyecto.getDescripcion());
//			idActual = proyectoService.guardarProyecto(proyecto, idUsuarioPrincipal);
//		}
//		
//		
//		
//		return null;
//}
	@RequestMapping(value = "/guardarproyecto", method = RequestMethod.POST)
	public String editarUsuario(@ModelAttribute("proyectoForm") ProyectoForm proyectoForm, Model model) {
		Proyecto proyecto = null;
		Long idActual = proyectoForm.getId();
		Long idUsuarioPrincipal = proyectoForm.getIdUsuarioPrincipal();
		Long [] idUsuarios = proyectoForm.getIdUsuarios();
		if(idActual != null){
			proyecto= proyectoService.recuperarProyectoPorId(idActual);
			proyecto.setNombre(proyectoForm.getNombre());
			proyecto.setDescripcion(proyectoForm.getDescripcion());
			idActual = proyectoService.actualizarProyecto(proyecto,idUsuarioPrincipal, idUsuarios);
		} else {
			proyecto = new Proyecto();
			proyecto.setNombre(proyectoForm.getNombre());
			proyecto.setDescripcion(proyectoForm.getDescripcion());
			idActual = proyectoService.actualizarProyecto(proyecto, idUsuarioPrincipal, idUsuarios);
		}
		
		
		
		return null;
}
	}
