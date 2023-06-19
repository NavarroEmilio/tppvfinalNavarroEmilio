package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.Cuestionario;

@Service
public interface CuestionarioService {
	
	public void cargarCuestionario(Cuestionario unCuestionario);
	public List<Cuestionario> listarCuestionarios();

}
