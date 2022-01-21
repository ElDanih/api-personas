package com.apipersonas.springboot.apipersonas.api;

import com.apipersonas.springboot.apipersonas.entity.Persona;

import java.util.List;

public interface GetPersonasInterface {

    List<Persona> getAll();
}
