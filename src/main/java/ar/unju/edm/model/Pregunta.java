package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPreg;
	private String opcion1;
	private String opcion2;
	private String opcion3;
	
	public Pregunta() {
		// TODO Auto-generated constructor stub
	}

	public Pregunta(Integer idPreg, String opcion1, String opcion2, String opcion3) {
		super();
		this.idPreg = idPreg;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
	}

	public Integer getIdPreg() {
		return idPreg;
	}

	public void setIdPreg(Integer idPreg) {
		this.idPreg = idPreg;
	}

	public String getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}

	public String getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}

	public String getOpcion3() {
		return opcion3;
	}

	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}
	
	

}
