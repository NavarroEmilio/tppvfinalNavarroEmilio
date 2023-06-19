package ar.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.CuestEstudiante;
import ar.unju.edm.repository.CuestEstudianteRepository;
import ar.unju.edm.service.CuestEstudianteService;

@Service
public class ImpCuestEstudianteService implements CuestEstudianteService{

	@Autowired
	CuestEstudiante unCuestEstudianteService;
	
	@Autowired
	CuestEstudianteRepository cuestEstudianteRepository;
	

	@Override
	public void cargarCuestEstudiante(CuestEstudiante unCuestEstudiante) {
		// TODO Auto-generated method stub
		cuestEstudianteRepository.save(unCuestEstudiante);
		
	}

	@Override
	public List<CuestEstudiante> listarCuestEstudiantes() {
		// TODO Auto-generated method stub
		return (List<CuestEstudiante>) cuestEstudianteRepository.findAll();
	}

}
