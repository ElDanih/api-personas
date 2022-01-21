package com.apipersonas.springboot.apipersonas.repository;

import com.apipersonas.springboot.apipersonas.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
