package com.edu.proyect.Prueba_U.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.proyect.Prueba_U.model.ListaReproduccion;
import com.edu.proyect.Prueba_U.service.IListaService;

@RestController
@RequestMapping("/api")
public class ListaController {

	@Autowired
    IListaService Service;

    @GetMapping("/listarL")
    public ResponseEntity< List<ListaReproduccion>> obtenerLista() {
        return new ResponseEntity<>(Service.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearL")
    public ResponseEntity<ListaReproduccion> crear(@RequestBody ListaReproduccion c){
        return new ResponseEntity<>(Service.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarL/{id}")
    public ResponseEntity<ListaReproduccion> buscar(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.findById(id),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteL/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.delete(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizarL/{id}")
    public ResponseEntity<ListaReproduccion> actualizar(@PathVariable("id") Integer id, @RequestBody ListaReproduccion c){
        return new ResponseEntity<>(Service.update(id, c), HttpStatus.OK);
    }
}