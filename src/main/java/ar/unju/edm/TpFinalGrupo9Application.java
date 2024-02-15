package ar.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.unju.edm.model.Alumno;
import ar.unju.edm.model.Docente;
import ar.unju.edm.service.IAlumnoService;
import ar.unju.edm.service.IDocenteService;

@SpringBootApplication
public class TpFinalGrupo9Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TpFinalGrupo9Application.class, args);
	}


	@Autowired
	Docente docente;
	
	@Autowired
	IDocenteService docenteService;
	
	@Autowired
	Alumno alumno;
	
	@Autowired
	IAlumnoService alumnoService;
	@Override
	public void run (String... args) throws Exception{
		
		docente.setEstado(true);
		docente.setApellido("Sosa");
		docente.setContrasenia("1234");
		docente.setDni(12345678);
		docente.setCorreo("aylen@gmail.com");
		docente.setMateria("programacion");
		docente.setNombre("Aylen");
		docente.setTipo("ADMIN");
		docente.setTelefono("3881234567");
		docente.setDireccion("cuyaya");
		docente.setLegajo(1234);
		docente.setLocalidad("Jujuy");
		docenteService.cargarDocente(docente);

	}
}
