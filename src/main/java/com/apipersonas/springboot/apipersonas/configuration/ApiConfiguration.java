package com.apipersonas.springboot.apipersonas.configuration;

import com.apipersonas.springboot.apipersonas.api.GetPersonasImplement;
import com.apipersonas.springboot.apipersonas.api.GetPersonasInterface;
import com.apipersonas.springboot.apipersonas.services.PersonaServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {

    @Bean
    GetPersonasInterface getPersonasInterface(PersonaServices personaServices){
        return new GetPersonasImplement(personaServices);
    }
}
