package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer matricula;
	private String apellidoNombre;
	private Integer dni;
	private Boolean estado;
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}


	public Alumno(Integer matricula, String apellidoNombre, Integer dni, Boolean estado) {
		super();
		this.matricula = matricula;
		this.apellidoNombre = apellidoNombre;
		this.dni = dni;
		this.estado = estado;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public String getApellidoNombre() {
		return apellidoNombre;
	}


	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

	

}

