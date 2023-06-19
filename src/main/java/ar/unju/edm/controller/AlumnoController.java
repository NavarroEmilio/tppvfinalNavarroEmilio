package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.Alumno;
import ar.unju.edm.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	Alumno unAlumno;
	
	@GetMapping("/alumno")
	public ModelAndView cargarAlumno() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("alumno",unAlumno);
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarAlumno")
	public ModelAndView guardarAlumno(@ModelAttribute ("alumno") Alumno alumnoConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoAlumnos");
		alumnoService.cargarAlumno(alumnoConDatos);
		modelAndView.addObject("listadoAlumnos", alumnoService.listarAlumnos());
		
		return modelAndView;
		
	}

}
