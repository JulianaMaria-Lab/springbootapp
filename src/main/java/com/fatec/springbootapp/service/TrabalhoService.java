package com.fatec.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.springbootapp.entity.Trabalho;
import com.fatec.springbootapp.repository.TrabalhoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public Trabalho cadastrarTrabalho(Trabalho trabalho) {
        return trabalhoRepository.save(trabalho);
    }

    public List<Trabalho> listarTodosTrabalhos() {
        return trabalhoRepository.findAll();
    }

    public Optional<Trabalho> buscarPorId(Long id) {
        return trabalhoRepository.findById(id);
    }

    public List<Trabalho> buscarPorPalavraChaveENota(String palavraChave, Integer nota) {
        return trabalhoRepository.findByTitulo(palavraChave, nota);
    }
}

