package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Cuestionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCuestionario;
	
	@ManyToOne
	@JoinColumn(name = "docente_id")
	Docente docente;
	
	private String nombreCuestionario;
	private String pregunta1;
	private String pregunta2;
	private String pregunta3;
	
	public Cuestionario() {
		// TODO Auto-generated constructor stub
	}

	public Cuestionario(Integer idCuestionario, Docente docente, String nombreCuestionario, String pregunta1,
			String pregunta2, String pregunta3) {
		super();
		this.idCuestionario = idCuestionario;
		this.docente = docente;
		this.nombreCuestionario = nombreCuestionario;
		this.pregunta1 = pregunta1;
		this.pregunta2 = pregunta2;
		this.pregunta3 = pregunta3;
	}

	public Integer getIdCuestionario() {
		return idCuestionario;
	}

	public void setIdCuestionario(Integer idCuestionario) {
		this.idCuestionario = idCuestionario;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getNombreCuestionario() {
		return nombreCuestionario;
	}

	public void setNombreCuestionario(String nombreCuestionario) {
		this.nombreCuestionario = nombreCuestionario;
	}

	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}
	
	

	
	



}

