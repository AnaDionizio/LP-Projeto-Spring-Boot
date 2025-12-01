package com.example.petcare.controller;

import com.example.petcare.model.transacoes.Doacao;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

    private List<Doacao> doacoes = new ArrayList<>();

    @PostMapping("/registrar")
    public Doacao registrar(@RequestBody Doacao doacao) {
        doacoes.add(doacao);
        return doacao;
    }

    @GetMapping
    public List<Doacao> listar() {
        return doacoes;
    }

    @GetMapping("/{id}")
    public Doacao buscar(@PathVariable Long id) {
        return doacoes.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

