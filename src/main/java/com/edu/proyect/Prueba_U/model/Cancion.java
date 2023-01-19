package com.edu.proyect.Prueba_U.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
public class Cancion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_cancion")
    private Integer id_cancion;
    @Column(name = "title")
    private String title;
    @Column(name = "artist")
    private String artist;
    @Column(name = "album")
    private String album;
    @Column(name = "year")
    private String year;
    
    
    @ManyToOne
    @JoinColumn(name = "id_lista", referencedColumnName = "id_lista")
    private ListaReproduccion listR;
}
