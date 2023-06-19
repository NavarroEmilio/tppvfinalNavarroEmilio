package ar.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Doc_Cuest;
import ar.unju.edm.repository.Doc_CuestRepository;
import ar.unju.edm.service.Doc_CuestService;

@Service
public class ImpDoc_CuestService implements Doc_CuestService{
	

	@Autowired
	Doc_Cuest unDoc_CuestService;
	
	@Autowired
	Doc_CuestRepository doc_CuestRepository;

	@Override
	public void cargarDoc_Cuest(Doc_Cuest unDoc_Cuest) {
		// TODO Auto-generated method stub
		
		doc_CuestRepository.save(unDoc_Cuest);
		
	}

	@Override
	public List<Doc_Cuest> listarDoc_Cuests() {
		// TODO Auto-generated method stub
		return (List<Doc_Cuest>) doc_CuestRepository.findAll();
	}
	
	

}
