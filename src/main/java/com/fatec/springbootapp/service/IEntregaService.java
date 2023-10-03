package com.fatec.springbootapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.fatec.springbootapp.entity.Entrega;

public interface IEntregaService {
       
    public Entrega novaEntrega(Entrega entrega);

    public List<Entrega> buscarTodasEntregas();

    public List<Entrega> buscarValorSuperiorDataLimiteEntrega(LocalDateTime data_hora_limite);

}
