package ar.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Cuestionario;
import ar.unju.edm.repository.CuestionarioRepository;
import ar.unju.edm.service.CuestionarioService;

@Service
public class ImpCuestionarioService implements CuestionarioService{
	
	@Autowired
	Cuestionario unCuestionarioService;
	
	@Autowired
	CuestionarioRepository cuestionarioRepository;
	

	@Override
	public void cargarCuestionario(Cuestionario unCuestionario) {
		// TODO Auto-generated method stub
		cuestionarioRepository.save(unCuestionario);
		
	}

	@Override
	public List<Cuestionario> listarCuestionarios() {
		// TODO Auto-generated method stub
		return (List<Cuestionario>) cuestionarioRepository.findAll();
	}

}
