package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.Cuestionario;
import ar.unju.edm.service.CuestionarioService;
import ar.unju.edm.service.DocenteService;

@Controller
public class CuestionarioController {
	
	@Autowired
	CuestionarioService cuestionarioService;
	
	@Autowired
	DocenteService docenteService;
	
	@Autowired
	Cuestionario unCuestionario;
	
	@GetMapping("/cuestionario")
	public ModelAndView cargarCuestionario() {
		ModelAndView modelAndView = new ModelAndView("formularioCuestionarios");
		modelAndView.addObject("cuestionario",unCuestionario);
		modelAndView.addObject("docente",docenteService.listarDocentes());
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarCuestionario")
	public ModelAndView guardarCuestionario(@ModelAttribute ("cuestionario") Cuestionario cuestionarioConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoCuestionarios");
		cuestionarioService.cargarCuestionario(cuestionarioConDatos);
		modelAndView.addObject("listadoCuestionarios", cuestionarioService.listarCuestionarios());
		
		return modelAndView;
		
	}


}
