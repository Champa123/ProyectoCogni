package edu.curso.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.bo.Usuario;
import edu.curso.java.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosRestController {

	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listar(Model model) {
		List<Usuario> usuarios = usuarioService.recuperarUsuarios();
		return usuarios;
	}


}