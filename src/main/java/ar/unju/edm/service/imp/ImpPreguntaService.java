package ar.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Pregunta;
import ar.unju.edm.repository.PreguntaRepository;
import ar.unju.edm.service.PreguntaService;

@Service
public class ImpPreguntaService implements PreguntaService{
	
	@Autowired
	Pregunta unPreguntaService;
	
	@Autowired
	PreguntaRepository preguntaRepository;

	@Override
	public void cargarPregunta(Pregunta unPregunta) {
		// TODO Auto-generated method stub
		preguntaRepository.save(unPregunta);
		
	}

	@Override
	public List<Pregunta> listarPreguntas() {
		// TODO Auto-generated method stub
		return (List<Pregunta>) preguntaRepository.findAll();
	}

}
