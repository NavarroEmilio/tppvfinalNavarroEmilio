package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Component
@Entity
public class CuestEstudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCuestEstud;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="idCuestionario")
	Cuestionario cuestionario;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="matricula")
	Alumno alumno;
	
	public CuestEstudiante() {
		// TODO Auto-generated constructor stub
	}

	public CuestEstudiante(Integer idCuestEstud, Cuestionario cuestionario, Alumno alumno) {
		super();
		this.idCuestEstud = idCuestEstud;
		this.cuestionario = cuestionario;
		this.alumno = alumno;
	}

	public Integer getIdCuestEstud() {
		return idCuestEstud;
	}

	public void setIdCuestEstud(Integer idCuestEstud) {
		this.idCuestEstud = idCuestEstud;
	}

	public Cuestionario getCuestionario() {
		return cuestionario;
	}

	public void setCuestionario(Cuestionario cuestionario) {
		this.cuestionario = cuestionario;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	

}
