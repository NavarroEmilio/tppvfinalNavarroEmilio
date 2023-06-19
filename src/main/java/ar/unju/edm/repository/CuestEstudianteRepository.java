package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.CuestEstudiante;

@Repository
public interface CuestEstudianteRepository extends CrudRepository<CuestEstudiante,Integer> {

}
