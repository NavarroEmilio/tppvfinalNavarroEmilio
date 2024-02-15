package ar.unju.edm.service.imp;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Alumno;
import ar.unju.edm.repository.AlumnoRepository;
import ar.unju.edm.service.IAlumnoService;


@Service
@Qualifier("servicioAlumnoEnMySQL")
public class ImpAlumnoService implements IAlumnoService{
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public void cargarAlumno(Alumno unAlumno) {
		// TODO Auto-generated method stub
		unAlumno.setEstado(true);
		alumnoRepository.save(unAlumno);
	}

	@Override
	public void eliminarUnAlumno(Integer idAlumno) {
		// TODO Auto-generated method stub
		Optional<Alumno> aux = Optional.of(new Alumno());
		aux =alumnoRepository.findById(idAlumno);
		aux.get().setEstado(false);
		alumnoRepository.save(aux.get());
	}

	@Override
	public Alumno mostrarUnAlumno(Integer idAlumno) {
		// TODO Auto-generated method stub
		Optional<Alumno> aux = Optional.of(new Alumno());
		aux = alumnoRepository.findById(idAlumno);
		
		return aux.get();
	}

	@Override
	public ArrayList<Alumno> listarAlumnos() {
		// TODO Auto-generated method stub
		return (ArrayList<Alumno>) alumnoRepository.findByEstado(true);
	}

	@Override
	public void eliminarTodosLosAlumnos() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Alumno modificarUnAlumno(Integer idAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

}
