package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.Docente;

@Service
public interface DocenteService {
	
	public void cargarDocente(Docente unDocente);
	public List<Docente> listarDocentes();

}
