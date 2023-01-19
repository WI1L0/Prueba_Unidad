package com.edu.proyect.Prueba_U.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.edu.proyect.Prueba_U.model.ListaReproduccion;
import com.edu.proyect.Prueba_U.repository.IListaRepository;

@Service
public class ListaServiceImpl extends GenericServiceImpl<ListaReproduccion, Integer> implements IListaService {

    @Autowired
    IListaRepository Irepository;

    @Override
    public CrudRepository<ListaReproduccion, Integer> getDao() {
        return Irepository;
    }

}
