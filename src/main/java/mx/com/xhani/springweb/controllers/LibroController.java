package mx.com.xhani.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.xhani.springweb.repositories.LibroRepository;

@Controller
public class LibroController {
	@Autowired
	private LibroRepository libroRepository;
	@RequestMapping("/libros")
	public String getLibros(Model model) {
		model.addAttribute("libros",libroRepository.findAll());
		return "libros";
	}
}
