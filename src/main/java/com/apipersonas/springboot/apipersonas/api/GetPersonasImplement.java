package com.apipersonas.springboot.apipersonas.api;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import com.apipersonas.springboot.apipersonas.repository.PersonaRepository;
import com.apipersonas.springboot.apipersonas.services.PersonaServices;

import java.util.List;

public class GetPersonasImplement implements GetPersonasInterface{

    private PersonaServices personaServices;

    public GetPersonasImplement(PersonaServices personaServices) {
        this.personaServices = personaServices;
    }

    @Override
    public List<Persona> getAll() {
        return personaServices.getAllPersona();
    }
}
