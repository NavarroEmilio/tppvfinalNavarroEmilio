package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.CuestEstudiante;
import ar.unju.edm.service.CuestEstudianteService;

@Controller
public class CuestEstudianteController {
	
	@Autowired
	CuestEstudianteService cuestEstudianteService;
	
	@Autowired
	CuestEstudiante unCuestEstudiante;
	
	@GetMapping("/cuestEstudiante")
	public ModelAndView cargarCuestEstudiante() {
		ModelAndView modelAndView = new ModelAndView("formularioCuestEstudiantes");
		modelAndView.addObject("cuestEstudiante",unCuestEstudiante);
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarCuestEstudiante")
	public ModelAndView guardarCuestEstudiante(@ModelAttribute ("cuestEstudiante") CuestEstudiante cuestEstudianteConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoCuestEstudiantes");
		cuestEstudianteService.cargarCuestEstudiante(cuestEstudianteConDatos);
		modelAndView.addObject("listadoCuestEstudiantes", cuestEstudianteService.listarCuestEstudiantes());
		
		return modelAndView;
		
	}

}
