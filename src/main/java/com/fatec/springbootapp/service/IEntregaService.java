package com.fatec.springbootapp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.fatec.springbootapp.entity.Entrega;

public interface IEntregaService {
       
    public Entrega novaEntrega(Entrega entrega);

    public List<Entrega> buscarTodasEntregas();

    public Optional<Entrega> findByDataLimiteEntrega(LocalDateTime data_hora_limite);

}
