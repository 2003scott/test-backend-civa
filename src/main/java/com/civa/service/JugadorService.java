package com.civa.service;

import com.civa.entity.Jugador;

import java.util.List;
import java.util.Optional;

public interface JugadorService {

    List<Jugador> findAll();
    Optional<Jugador> finById(Long id);
    Jugador add(Jugador jug);

}
