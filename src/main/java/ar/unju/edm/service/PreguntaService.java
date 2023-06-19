package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.Pregunta;

@Service
public interface PreguntaService {
	
	public void cargarPregunta(Pregunta unPregunta);
	public List<Pregunta> listarPreguntas();

}
