package com.civa.service;

import com.civa.entity.Posicion;

import java.util.List;
import java.util.Optional;


public interface PosicionService {

    List<Posicion> findAll();
    Optional<Posicion> finById(Long id);
    Posicion add(Posicion pos);

}
