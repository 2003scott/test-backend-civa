package com.civa.controller;

import com.civa.entity.Jugador;
import com.civa.entity.Posicion;
import com.civa.service.JugadorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/futbolista")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    /**
     * http://localhost:8090/v1/api/futbolista
     * @return
     */
    @Operation(summary = "Listar todos los Fubolistas")
    @GetMapping
    public List<Jugador> findAll(){
        return jugadorService.findAll();
    }

    /**
     * http://localhost:8090/v1/api/futbolista/1
     * @param id
     * @return
     */
    @Operation(summary = "Buscar un Futbolista por su ID")
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Jugador> jugador = jugadorService.finById(id);
        if(jugador.isPresent()){
            return ResponseEntity.ok(jugador.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Agregar un Futbolista")
    @PostMapping
    public Jugador add(@RequestBody Jugador jug) {
        return jugadorService.add(jug);
    }
}
