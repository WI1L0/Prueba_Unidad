package com.edu.proyect.Prueba_U.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.proyect.Prueba_U.model.Cancion;

@Repository
public interface ICancionRepository extends JpaRepository<Cancion, Integer>{

}
