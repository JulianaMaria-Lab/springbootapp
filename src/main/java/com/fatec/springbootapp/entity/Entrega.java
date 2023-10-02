package com.fatec.springbootapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ent_entrega")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ent_id")
    private Long id;

    @Column(name = "ent_descricao")
    private String descricao;

    @Column(name="ent_data_hora_cadastro")
    private LocalDateTime data_hora_cadastro;

    @Column(name="ent_data_hora_limite")
    private LocalDateTime data_hora_limite;

    @Column(name="peso")
    private Integer peso;

    @Column(name="ent_observacoes")
    private String observacoes;


    public Entrega(String descricao, LocalDateTime data_hora_cadastro, LocalDateTime data_hora_limite, Integer peso,
        String observacoes) {
        this.descricao = descricao;
        this.data_hora_cadastro = data_hora_cadastro;
        this.data_hora_limite = data_hora_limite;
        this.peso = peso;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_hora_cadastro() {
        return data_hora_cadastro;
    }

    public void setData_hora_cadastro(LocalDateTime data_hora_cadastro) {
        this.data_hora_cadastro = data_hora_cadastro;
    }

    public LocalDateTime getData_hora_limite() {
        return data_hora_limite;
    }

    public void setData_hora_limite(LocalDateTime data_hora_limite) {
        this.data_hora_limite = data_hora_limite;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


}
