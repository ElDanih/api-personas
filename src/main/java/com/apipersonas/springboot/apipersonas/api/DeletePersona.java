package com.apipersonas.springboot.apipersonas.api;

import com.apipersonas.springboot.apipersonas.services.PersonaServices;
import org.springframework.stereotype.Component;

@Component
public class DeletePersona {
    private PersonaServices personaServices;

    public DeletePersona(PersonaServices personaServices) {
        this.personaServices = personaServices;
    }

    public void remove(Integer dni) {
        personaServices.remove(dni);
    }
}
