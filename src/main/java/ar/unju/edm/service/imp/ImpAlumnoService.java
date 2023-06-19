package ar.unju.edm.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Alumno;
import ar.unju.edm.repository.AlumnoRepository;
import ar.unju.edm.service.AlumnoService;

@Service
public class ImpAlumnoService implements AlumnoService{
	
	@Autowired
	Alumno unAlumnoService;
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	

	@Override
	public void cargarAlumno(Alumno unAlumno) {
		// TODO Auto-generated method stub
		unAlumno.setEstado(true);
		alumnoRepository.save(unAlumno);
		
	}

	@Override
	public List<Alumno> listarAlumnos() {
		// TODO Auto-generated method stub
		
		return (List<Alumno>) alumnoRepository.findAll();
	}

}
