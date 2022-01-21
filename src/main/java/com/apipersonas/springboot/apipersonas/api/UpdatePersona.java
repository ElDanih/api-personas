package com.apipersonas.springboot.apipersonas.api;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import com.apipersonas.springboot.apipersonas.services.PersonaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UpdatePersona {
    private PersonaServices personaServices;

    public UpdatePersona(PersonaServices personaServices) {
        this.personaServices = personaServices;
    }

    public Persona update(Persona newPersona, Integer dni) {
        return personaServices.update(newPersona, dni);
    }
}
