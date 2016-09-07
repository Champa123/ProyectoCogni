package edu.curso.java.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.bo.Tarea;
import edu.curso.java.bo.Usuario;
import edu.curso.java.controllers.forms.ProyectoForm;
import edu.curso.java.controllers.forms.TareaForm;
import edu.curso.java.controllers.forms.UsuarioForm;
import edu.curso.java.services.ProyectoService;
import edu.curso.java.services.TareaService;
import edu.curso.java.services.UsuarioService;

@Controller
@RequestMapping("/tareas")
public class TareaController {

	private static final Logger log = Logger.getLogger(TareaController.class);
	
	@Autowired
	private TareaService tareaService;

//	@Autowired
//	private UsuarioService usuarioService;
	

	//"/proyectos/verproyecto"
	@RequestMapping(value = "/vertarea")
	public String verTarea(@RequestParam Long id, Model model) {
		Tarea tarea = tareaService.recuperarTareaPorId(id);
		model.addAttribute("tarea", tarea);
		return null;
	}
	
	@RequestMapping(value = "/borrartarea")
	public String borrarTarea(@RequestParam Long id, Model model) {
		tareaService.borrarTareaPorId(id);
		return "redirect:/tareas/index.html";
	}
	
	@RequestMapping(value = "/nuevatarea")
	public String nuevaTarea(Model model) {
		model.addAttribute("tareaForm", new TareaForm());
		
		return "/tarea/form";
	}
	
	@RequestMapping(value = "/editartarea")
	public String editarTarea(@RequestParam Long id, Model model) {
		Tarea tarea = tareaService.recuperarTareaPorId(id);
		TareaForm tareaForm = new TareaForm();
		tareaForm.setId(tarea.getId());
		
		tareaForm.setTitulo(tarea.getTitulo());
		model.addAttribute("tareaForm", tareaForm);
		model.addAttribute("tarea",tarea);
		return "/tareas/formeditado";
	}
	
	
	@RequestMapping(value = "/guardarnuevatarea", method = RequestMethod.POST)
	public String guardarNuevaTarea(@RequestParam Long id ,@ModelAttribute("tareaForm") TareaForm tareaForm, Model model) {
		Tarea tarea = null;
		Long idActual = tareaForm.getId();
			tarea = new Tarea();
			tarea.setTitulo(tareaForm.getTitulo());
			
			idActual = tareaService.guardarTarea(tarea);
		
		
		
		
		return "redirect:/tarea/vertarea.html?id=" + id;
}
	

	
//	@RequestMapping(value = "/guardaredittarea", method = RequestMethod.POST)
//	public String guardarEditTarea(@ModelAttribute("tareaForm") TareaForm tareaForm, Model model) {
//		Tarea tarea = null;
//		Long idActual = tareaForm.getId();
//				if(idActual != null){
//			tarea= tareaService.recuperarTareaPorId(idActual);
//			tarea.setTitulo(tareaForm.getTitulo());
//			idActual = tareaService.editarTarea(tarea);
//		} 
//		
//		 
//		return "redirect:/tareas/vertarea.html?id=" + idActual;
//}
	}
