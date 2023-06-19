package ar.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Docente;
import ar.unju.edm.repository.DocenteRepository;
import ar.unju.edm.service.DocenteService;

@Service
public class ImpDocenteService implements DocenteService{
	
	@Autowired
	Docente unDocenteService;
	
	@Autowired
	DocenteRepository docenteRepository;

	@Override
	public void cargarDocente(Docente unDocente) {
		// TODO Auto-generated method stub
		docenteRepository.save(unDocente);
		
	}

	@Override
	public List<Docente> listarDocentes() {
		// TODO Auto-generated method stub
		return (List<Docente>) docenteRepository.findAll();
	}

}
