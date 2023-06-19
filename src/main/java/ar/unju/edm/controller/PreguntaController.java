package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.Pregunta;
import ar.unju.edm.service.PreguntaService;

@Controller
public class PreguntaController {
	
	@Autowired
	PreguntaService preguntaService;
	
	@Autowired
	Pregunta unPregunta;
	
	@GetMapping("/pregunta")
	public ModelAndView cargarPregunta() {
		ModelAndView modelAndView = new ModelAndView("formularioPreguntas");
		modelAndView.addObject("pregunta",unPregunta);
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarPregunta")
	public ModelAndView guardarPregunta(@ModelAttribute ("pregunta") Pregunta preguntaConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoPreguntas");
		preguntaService.cargarPregunta(preguntaConDatos);
		modelAndView.addObject("listadoPreguntas", preguntaService.listarPreguntas());
		
		return modelAndView;
		
	}

}
