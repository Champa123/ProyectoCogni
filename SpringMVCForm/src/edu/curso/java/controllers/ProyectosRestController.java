package edu.curso.java.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.bo.Proyecto;
import edu.curso.java.controllers.autocomplete.ItemAutoComplete;
import edu.curso.java.services.ProyectoService;

@RestController
@RequestMapping(value="/api/proyectos")
public class ProyectosRestController {

	@Autowired
	private ProyectoService proyectoService;
	@RequestMapping(value="/autocomplete.json")
	
	public List<ItemAutoComplete> autocomplete(@RequestParam String term){
		List<ItemAutoComplete> items = new ArrayList<>();
		List<Proyecto> proyectos = proyectoService.buscarProyectosPorNombre(term);
		for (Proyecto proyecto : proyectos) {
			ItemAutoComplete item = new ItemAutoComplete();
			item.setId(proyecto.getId());
			item.setItem(proyecto.getNombre());
			item.setLabel(proyecto.getNombre());
			items.add(item);
		}
		return items;
	}
	
}
