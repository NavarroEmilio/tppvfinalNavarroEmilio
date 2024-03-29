package ar.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ar.unju.edm.service.imp.LoginService;


@Configuration
@EnableWebSecurity
public class ConfiguracionWeb extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private Autenticacion autenticacion;
	
	String[] resources = new String[] { "/include/**","/css/**","/icons/**","/img/**","/images/**","/js/**","/layer/**", "/webjars/**"};

	protected void configure(HttpSecurity http) throws Exception{
		http
		    .authorizeRequests()
		    .antMatchers(resources).permitAll()
		    .antMatchers("/","index","/login","/home","/elegirCuestionario","/resolverCuestionario/{id_Cuestionario}","/resultadoDeCuestionario/{id_Cuestionario}","/cuestionariosRealizados","/listaDeAlumnos","/listaDeDocentes","/docente/{id}").permitAll()
		    
		    //saquen de comentarios este para que puedan crear un docente con contraseña y luego dejen el que estaba
		    .antMatchers("/","index","/docente","/guardarDocente","/login","/home","/elegirCuestionario","/resolverCuestionario/{id_Cuestionario}","/resultadoDeCuestionario/{id_Cuestionario}","/cuestionariosRealizados","/listaDeAlumnos","/listaDeDocentes").permitAll()
		    //.antMatchers("/**").hasAuthority("ADMIN")
		    .antMatchers("/","index","/login","/home","/cuestionario","/guardarCuestionario","/listadoCuestionarios","/cuestionarioConPreguntas/{id_Cuestionario}","/cuestionarioPregunta/{id_Cuestionario}","/guardarCuestionarioPregunta/{id_Cuestionario}","/elegirCuestionario","/resolverCuestionario/{id_Cuestionario}","/resultadoDeCuestionario/{id_Cuestionario}","/cuestionariosRealizados","/pregunta","/guardarPregunta","/eliminarPregunta/{idPregunta}","/modificarPregunta/{idPregunta}","/alumno","/listadoAlumno","/guardarAlumno","/modificarAlumno/{id_Alumno}","/modificarAlumno","/eliminarAlumno/{id_Alumno}","/docente","/listadoDocente","/guardarDocente","/modificarDocente/{id_Docente}","/modificarDocente","/eliminarDocente/{id_Docente}").permitAll()
		    .anyRequest().authenticated()
		    .and()
		    .formLogin()
		    	.loginPage("/login")
		    	.permitAll()
		    	.successHandler(autenticacion)
		    	.failureUrl("/login?error=true")
		    	.usernameParameter("id_Docente")
		    	.passwordParameter("contrasenia")
		    	.and()
		    	.csrf().disable()
		    .logout()
		    	.permitAll()
		    	.logoutSuccessUrl("/login?logout");
	}
	
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(4);
	}
	
	@Autowired
	LoginService userDetailsService;
	
	@Autowired
	public void configuracionGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService);
	}
	
}
