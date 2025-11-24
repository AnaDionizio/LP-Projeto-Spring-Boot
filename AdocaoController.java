package com.example.bemestaranimal.controller;

import com.example.bemestaranimal.dto.AdocaoDTO;
import com.example.bemestaranimal.entity.Adocao;
import com.example.bemestaranimal.service.AdocaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adocoes")
public class AdocaoController {

    private final AdocaoService adocaoService;

    public AdocaoController(AdocaoService adocaoService) {
        this.adocaoService = adocaoService;
    }

    // Listar todas as adoções
    @GetMapping
    public List<AdocaoDTO> listar() {
        return adocaoService.listarDTO();
    }

    // Criar nova adoção
    @PostMapping
    public Adocao criar(@RequestBody Adocao adocao) {
        return adocaoService.salvar(adocao);
    }

    // Aprovar adoção
    @PutMapping("/{id}/aprovar")
    public Adocao aprovar(@PathVariable Long id) {
        return adocaoService.aprovar(id);
    }

    // Cancelar adoção
    @PutMapping("/{id}/cancelar")
    public Adocao cancelar(@PathVariable Long id) {
        return adocaoService.cancelar(id);
    }
}
