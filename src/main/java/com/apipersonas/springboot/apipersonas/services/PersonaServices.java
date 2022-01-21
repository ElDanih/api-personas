package com.apipersonas.springboot.apipersonas.services;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import com.apipersonas.springboot.apipersonas.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServices {

    PersonaRepository personaRepository;

    public PersonaServices(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersona(){
        return personaRepository.findAll();
    }

    public Persona save(Persona newPersona){
        return personaRepository.save(newPersona);
    }

    public void remove(Integer dni){
        personaRepository.delete(new Persona(dni));
    }

    public Persona update(Persona newPersona, Integer dni) {
        return personaRepository.findById(dni).
                map(persona -> {
                    persona.setNombre(newPersona.getNombre());
                    persona.setApellido(newPersona.getApellido());
                    persona.setEmpleado(newPersona.isEmpleado());
                    return personaRepository.save(persona);
                }).get();
    }
}
