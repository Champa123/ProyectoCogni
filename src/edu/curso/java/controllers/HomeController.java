package edu.curso.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
 
		return null;
	}
	
}
