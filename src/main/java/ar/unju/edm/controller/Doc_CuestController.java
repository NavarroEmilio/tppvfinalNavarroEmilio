package ar.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.unju.edm.model.Doc_Cuest;
import ar.unju.edm.service.CuestionarioService;
import ar.unju.edm.service.Doc_CuestService;
import ar.unju.edm.service.DocenteService;

@Controller
public class Doc_CuestController {
	
	@Autowired
	Doc_CuestService doc_CuestService;
	
	@Autowired
	DocenteService docenteService;
	
	@Autowired
	CuestionarioService cuestionarioService;
	
	@Autowired
	Doc_Cuest unDoc_Cuest;
	
	@GetMapping("/doc_Cuest")
	public ModelAndView cargarDoc_Cuest() {
		ModelAndView modelAndView = new ModelAndView("formularioDoc_Cuests");
		modelAndView.addObject("doc_Cuest",unDoc_Cuest);
		modelAndView.addObject("docente",docenteService.listarDocentes());
		modelAndView.addObject("cuestionario",cuestionarioService.listarCuestionarios());
		
		
		return modelAndView;
		
		
	}
	
	@PostMapping("/cargarDoc_Cuest")
	public ModelAndView guardarDoc_Cuest(@ModelAttribute ("doc_Cuest") Doc_Cuest doc_CuestConDatos) {
		ModelAndView modelAndView = new ModelAndView("listadoDoc_Cuests");
		doc_CuestService.cargarDoc_Cuest(doc_CuestConDatos);
		modelAndView.addObject("listadoDoc_Cuests", doc_CuestService.listarDoc_Cuests());
		
		return modelAndView;
		
	}

}
