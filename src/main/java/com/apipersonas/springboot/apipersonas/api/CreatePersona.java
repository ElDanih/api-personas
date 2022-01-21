package com.apipersonas.springboot.apipersonas.api;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import com.apipersonas.springboot.apipersonas.services.PersonaServices;
import org.springframework.stereotype.Component;

@Component
public class CreatePersona {
    private PersonaServices personaServices;

    public CreatePersona(PersonaServices personaServices) {
        this.personaServices = personaServices;
    }

    public Persona save(Persona newPersona) {
        return personaServices.save(newPersona);
    }
}
