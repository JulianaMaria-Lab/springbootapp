package com.fatec.springbootapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fatec.springbootapp.entity.Trabalho;
import com.fatec.springbootapp.service.TrabalhoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoService trabalhoService;

    @PostMapping
    public Trabalho cadastrarTrabalho(@RequestBody Trabalho trabalho) {
        return trabalhoService.cadastrarTrabalho(trabalho);
    }

    @GetMapping
    public List<Trabalho> listarTodosTrabalhos() {
        return trabalhoService.listarTodosTrabalhos();
    }

    @GetMapping("/{id}")
    public Optional<Trabalho> buscarPorId(@PathVariable Long id) {
        return trabalhoService.buscarPorId(id);
    }

    @GetMapping("/pesquisa")
    public List<Trabalho> buscarPorPalavraChaveENota(
            @RequestParam("palavraChave") String palavraChave,
            @RequestParam("nota") Integer nota) {
        return trabalhoService.buscarPorPalavraChaveENota(palavraChave, nota);
    }
}

