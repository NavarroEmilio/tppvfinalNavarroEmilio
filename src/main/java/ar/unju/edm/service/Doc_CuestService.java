package ar.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.unju.edm.model.Doc_Cuest;

@Service
public interface Doc_CuestService {
	
	public void cargarDoc_Cuest(Doc_Cuest unDoc_Cuest);
	public List<Doc_Cuest> listarDoc_Cuests();

}
