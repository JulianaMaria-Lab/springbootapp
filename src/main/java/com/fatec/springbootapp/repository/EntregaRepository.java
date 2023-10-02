package com.fatec.springbootapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

import com.fatec.springbootapp.entity.Entrega;

public interface EntregaRepository extends JpaRepository <Entrega,Long> {

    @Query("select e from Entrega e where e.data_hora_limite > ?1")
    Optional<Entrega> findByDataLimiteEntrega(LocalDateTime data_hora_limite);
    
}
