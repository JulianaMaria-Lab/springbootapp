package com.fatec.springbootapp.service;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.springbootapp.entity.Entrega;
import com.fatec.springbootapp.repository.EntregaRepository;

import jakarta.transaction.Transactional;

public class EntregaService implements IEntregaService{

    @Autowired
    private EntregaRepository entregaRepo;

    @Transactional
    public Entrega novaEntrega(Entrega entrega) {
        if(entrega.getData_hora_cadastro() == null );
        entrega.setData_hora_cadastro(null);
        return entrega;
        }

    @Override
    public List<Entrega> buscarTodasEntregas() {
        return entregaRepo.findAll();
    }

    @Override
    public Optional<Entrega> findByDataLimiteEntrega(LocalDateTime data_hora_limite){
        return entregaRepo.findByDataLimiteEntrega(data_hora_limite);
    }
    
}
