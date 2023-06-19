package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.Docente;
import ar.unju.edm.service.DocenteService;

@Controller
public class DocenteController {
	
	@Autowired
	DocenteService docenteService;
	
	@Autowired
	Docente unDocente;
	
	@GetMapping("/docente")
	public ModelAndView cargarDocente() {
		ModelAndView modelAndView = new ModelAndView("formularioDocentes");
		modelAndView.addObject("docente",unDocente);
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarDocente")
	public ModelAndView guardarDocente(@ModelAttribute ("docente") Docente docenteConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoDocentes");
		docenteService.cargarDocente(docenteConDatos);
		modelAndView.addObject("listadoDocentes", docenteService.listarDocentes());
		
		return modelAndView;
		
	}

}
