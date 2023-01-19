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

import com.edu.proyect.Prueba_U.model.Cancion;
import com.edu.proyect.Prueba_U.service.ICancionService;

@RestController
@RequestMapping("/api")
public class CancionController {

	@Autowired
    ICancionService Service;

    @GetMapping("/listarC")
    public ResponseEntity< List<Cancion>> obtenerLista() {
        return new ResponseEntity<>(Service.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearC")
    public ResponseEntity<Cancion> crear(@RequestBody Cancion c){
        return new ResponseEntity<>(Service.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarC/{id}")
    public ResponseEntity<Cancion> buscar(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.findById(id),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteC/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.delete(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizarC/{id}")
    public ResponseEntity<Cancion> actualizar(@PathVariable("id") Integer id, @RequestBody Cancion c){
        return new ResponseEntity<>(Service.update(id, c), HttpStatus.OK);
    }
}
