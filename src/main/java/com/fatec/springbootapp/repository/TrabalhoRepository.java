package com.fatec.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.springbootapp.entity.Trabalho;

import java.util.List;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

    List<Trabalho> findByTitulo(String palavraChave, Integer nota);
}
