package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDocente;
	private String apellidoNombreDoc;
	private String materia;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public Docente(Integer idDocente, String apellidoNombreDoc, String materia) {
		super();
		this.idDocente = idDocente;
		this.apellidoNombreDoc = apellidoNombreDoc;
		this.materia = materia;
	}

	public Integer getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}

	public String getApellidoNombreDoc() {
		return apellidoNombreDoc;
	}

	public void setApellidoNombreDoc(String apellidoNombreDoc) {
		this.apellidoNombreDoc = apellidoNombreDoc;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	

}
