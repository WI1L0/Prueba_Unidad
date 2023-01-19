package com.edu.proyect.Prueba_U.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.edu.proyect.Prueba_U.model.Cancion;
import com.edu.proyect.Prueba_U.repository.ICancionRepository;

@Service
public class CancionServiceImpl extends GenericServiceImpl<Cancion, Integer> implements ICancionService {

    @Autowired
    ICancionRepository Irepository;

    @Override
    public CrudRepository<Cancion, Integer> getDao() {
        return Irepository;
    }

}
