package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Docente;

@Repository
public interface DocenteRepository extends CrudRepository<Docente,Integer> {
	

}
