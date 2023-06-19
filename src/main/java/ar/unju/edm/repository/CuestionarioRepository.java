package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Cuestionario;

@Repository
public interface CuestionarioRepository extends CrudRepository<Cuestionario,Integer> {

}
