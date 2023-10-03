package com.fatec.springbootapp.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/buscarPorDataLimite")
    public List<Entrega> buscarPorDataLimite(@RequestParam("data_hora_limite") String dataLimite) {
        LocalDateTime dataHoraLimite = LocalDateTime.parse(dataLimite);
        return service.buscarValorSuperiorDataLimiteEntrega(dataHoraLimite);
    }
    
}
