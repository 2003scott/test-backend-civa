package com.civa.implement;

import com.civa.entity.Jugador;
import com.civa.repository.JugadorRepository;
import com.civa.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorImpl implements JugadorService {

    @Autowired
    JugadorRepository jugadorRepository;

    @Override
    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    @Override
    public Optional<Jugador> finById(Long id) {
        return jugadorRepository.findById(id);
    }

    @Override
    public Jugador add(Jugador jug) {
        return jugadorRepository.save(jug);
    }

}
