package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Integer> {

}
