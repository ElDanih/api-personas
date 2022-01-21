package com.apipersonas.springboot.apipersonas;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import com.apipersonas.springboot.apipersonas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApipersonasApplication implements CommandLineRunner {

	private PersonaRepository personaInterface;

	public static void main(String[] args) {
		SpringApplication.run(ApipersonasApplication.class, args);
	}

	@Autowired
	public ApipersonasApplication(PersonaRepository personaInterface) {
		this.personaInterface = personaInterface;
	}

	private void guardarPersona(){
		List<Persona> listPersonasTest = new ArrayList<>();
		Persona persona1 = new Persona();
		persona1.setDni(1);
		persona1.setNombre("Daniel");
		persona1.setApellido("Calderon");
		persona1.setEmpleado(true);
		//personaInterface.save(persona1);
		listPersonasTest.add(persona1);

		Persona persona2 = new Persona();
		persona2.setDni(2);
		persona2.setNombre("Andres");
		persona2.setApellido("Olarte");
		persona2.setEmpleado(false);
		listPersonasTest.add(persona2);
		//personaInterface.save(persona);

		Persona persona3 = new Persona();
		persona3.setDni(3);
		persona3.setNombre("Raul");
		persona3.setApellido("Amezquita");
		persona3.setEmpleado(false);
		listPersonasTest.add(persona3);

		personaInterface.saveAll(listPersonasTest);
		System.out.println("Probando findAll ->  " + personaInterface.findAll().size());
	}

	@Override
	public void run(String... args) throws Exception {
		guardarPersona();
	}
}
