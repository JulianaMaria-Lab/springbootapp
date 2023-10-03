package com.fatec.springbootapp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fatec.springbootapp.entity.Entrega;
import com.fatec.springbootapp.repository.EntregaRepository;

import jakarta.transaction.Transactional;

@Service
public class EntregaService implements IEntregaService{

    @Autowired
    private EntregaRepository entregaRepo;

    @Transactional
    public Entrega novaEntrega(@RequestBody Entrega entrega) {
        if (entrega.getData_hora_cadastro() == null) {
            entrega.setData_hora_cadastro(LocalDateTime.now());
            }
        return entregaRepo.save(entrega);
    }

    @Override
    public List<Entrega> buscarTodasEntregas() {
        return entregaRepo.findAll();
    }

    @Override
    public List<Entrega> buscarValorSuperiorDataLimiteEntrega(LocalDateTime data_hora_limite){
        return entregaRepo.findByDataLimiteEntrega(data_hora_limite);
    }
    
}
