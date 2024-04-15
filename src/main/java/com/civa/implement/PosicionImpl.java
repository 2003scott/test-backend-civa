package com.civa.implement;

import com.civa.entity.Posicion;
import com.civa.repository.PosicionRepository;
import com.civa.service.PosicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PosicionImpl implements PosicionService {

    @Autowired
    PosicionRepository posicionRepository;

    @Override
    public List<Posicion> findAll() {
        return posicionRepository.findAll();
    }

    @Override
    public Optional<Posicion> finById(Long id) {
        return posicionRepository.findById(id);
    }

    @Override
    public Posicion add(Posicion pos) {
        return posicionRepository.save(pos);
    }

}
