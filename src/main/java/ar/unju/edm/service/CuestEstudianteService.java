package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.CuestEstudiante;

@Service
public interface CuestEstudianteService {
	
	public void cargarCuestEstudiante(CuestEstudiante unCuestEstudiante);
	public List<CuestEstudiante> listarCuestEstudiantes();

}
