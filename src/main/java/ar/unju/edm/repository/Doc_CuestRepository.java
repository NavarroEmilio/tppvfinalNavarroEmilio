package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Doc_Cuest;

@Repository
public interface Doc_CuestRepository extends CrudRepository<Doc_Cuest,Integer> {

}
