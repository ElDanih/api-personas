package com.apipersonas.springboot.apipersonas.controller;

import com.apipersonas.springboot.apipersonas.api.CreatePersona;
import com.apipersonas.springboot.apipersonas.api.DeletePersona;
import com.apipersonas.springboot.apipersonas.api.GetPersonasInterface;
import com.apipersonas.springboot.apipersonas.api.UpdatePersona;
import com.apipersonas.springboot.apipersonas.entity.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin(origins = {"localhost:4200"})//localhost:4200
@RestController
@RequestMapping("/api/personas/")
public class PersonaRestController {

    private GetPersonasInterface getPersonasInterface;
    private CreatePersona createPersona;
    private UpdatePersona updatePersona;
    private DeletePersona deletePersona;

    public PersonaRestController(GetPersonasInterface getPersonasInterface, CreatePersona createPersona, UpdatePersona updatePersona, DeletePersona deletePersona) {
        this.getPersonasInterface = getPersonasInterface;
        this.createPersona = createPersona;
        this.updatePersona = updatePersona;
        this.deletePersona = deletePersona;
    }

    //Consultar Personas
    @GetMapping("/")
    List<Persona> get(){
        return getPersonasInterface.getAll();
    }

    //Crear persona
    @PostMapping("/")
    ResponseEntity<Persona> newPersona(@RequestBody Persona newPersona){
        return new ResponseEntity<>(createPersona.save(newPersona), HttpStatus.CREATED);
    }

    //Eliminar persona
    @DeleteMapping("/{dni}")
    ResponseEntity removePersona(@PathVariable Integer dni){
        deletePersona.remove(dni);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    //Actualizar persona
    @PutMapping("/{dni}")
    ResponseEntity<Persona> replacePersona(@RequestBody Persona newPersona, @PathVariable Integer dni){
        return new ResponseEntity<>(updatePersona.update(newPersona, dni), HttpStatus.OK);
    }
}
