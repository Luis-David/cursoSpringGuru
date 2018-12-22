package mx.com.xhani.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.xhani.springweb.repositories.AutorRepository;

@Controller
public class AutorController {
	@Autowired
	private AutorRepository autorRepository;
	@RequestMapping
	public String getAutores(Model model) {
		model.addAttribute("autores",autorRepository.findAll());
		return "autores";
	}
}
