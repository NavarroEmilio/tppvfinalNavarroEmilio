package ar.unju.edm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Cuestionario;


@Repository
public interface CuestionarioRepository extends CrudRepository<Cuestionario,Integer>{
	 public List<Cuestionario> findByEstado (Boolean estado);
}
