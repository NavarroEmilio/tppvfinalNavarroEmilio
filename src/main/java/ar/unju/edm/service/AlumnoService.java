package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.Alumno;


@Service
public interface AlumnoService {
	
	public void cargarAlumno(Alumno unAlumno);
	public List<Alumno> listarAlumnos();

}
