package com.civa.controller;

import com.civa.entity.Posicion;
import com.civa.service.PosicionService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posicion")
public class PosicionController {

    @Autowired
    PosicionService posicionService;

    /**
     * http://localhost:8090/v1/api/posicion
     */
    @Operation(summary = "Listar Todas las Posiciones")
    @GetMapping
    public List<Posicion> findAll(){
        return posicionService.findAll();
    }

    @Operation(summary = "Agregar una Posicion")
    @PostMapping
    public Posicion add(@RequestBody Posicion pos) {
        return posicionService.add(pos);
    }

}
