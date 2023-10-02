package com.fatec.springbootapp.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.springbootapp.service.IEntregaService;
import com.fatec.springbootapp.entity.Entrega;

@RestController
@RequestMapping(value = "/entrega")
@CrossOrigin
public class EntregaController {

    @Autowired
    private IEntregaService service;
    
    @GetMapping
    public List<Entrega> todasEntregas() {
        return service.buscarTodasEntregas();
    }

    @PostMapping
    public Entrega novaEntrega(@RequestBody Entrega entrega) {
        return service.novaEntrega(entrega);
    }

    @GetMapping(value = "/{data_hora_limite}")
    public Optional<Entrega> buscarPorId(@PathVariable("data_hora_limite") LocalDateTime data_hora_limite) {
        return service.findByDataLimiteEntrega(data_hora_limite);
    }
    
}
