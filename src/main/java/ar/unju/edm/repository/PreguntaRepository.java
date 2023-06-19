package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Pregunta;

@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta,Integer> {

}
