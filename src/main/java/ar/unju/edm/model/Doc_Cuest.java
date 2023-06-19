package ar.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Doc_Cuest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDoc_Cuest;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idDocente")
	Docente docente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCuestionario")
	Cuestionario cuestionario;
	
	private String materiaDoc_Cuest;
	
	public Doc_Cuest() {
		// TODO Auto-generated constructor stub
	}

	


	public Doc_Cuest(Integer idDoc_Cuest, Docente docente, Cuestionario cuestionario, String materiaDoc_Cuest) {
		super();
		this.idDoc_Cuest = idDoc_Cuest;
		this.docente = docente;
		this.cuestionario = cuestionario;
		this.materiaDoc_Cuest = materiaDoc_Cuest;
	}




	public Integer getIdDoc_Cuest() {
		return idDoc_Cuest;
	}






	public void setIdDoc_Cuest(Integer idDoc_Cuest) {
		this.idDoc_Cuest = idDoc_Cuest;
	}






	public Docente getDocente() {
		return docente;
	}






	public void setDocente(Docente docente) {
		this.docente = docente;
	}






	public Cuestionario getCuestionario() {
		return cuestionario;
	}






	public void setCuestionario(Cuestionario cuestionario) {
		this.cuestionario = cuestionario;
	}






	public String getMateriaDoc_Cuest() {
		return materiaDoc_Cuest;
	}






	public void setMateriaDoc_Cuest(String materiaDoc_Cuest) {
		this.materiaDoc_Cuest = materiaDoc_Cuest;
	}
	
	


	

}
