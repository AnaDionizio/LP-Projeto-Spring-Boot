package com.example.petcare.controller;

import com.example.petcare.model.transacoes.Adocao;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adocoes")
public class AdocaoController {

    private List<Adocao> adocoes = new ArrayList<>();

    @PostMapping("/registrar")
    public Adocao registrar(@RequestBody Adocao adocao) {
        adocoes.add(adocao);
        return adocao;
    }

    @GetMapping
    public List<Adocao> listar() {
        return adocoes;
    }

    @GetMapping("/{id}")
    public Adocao buscar(@PathVariable Long id) {
        return adocoes.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/certificado/{id}")
    public String certificado(@PathVariable Long id) {
        return adocoes.stream()
                .filter(a -> a.getId().equals(id))
                .map(Adocao::gerarCertificado)
                .findFirst()
                .orElse("Adoção não encontrada.");
    }
}


