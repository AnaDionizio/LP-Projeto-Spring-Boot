package com.example.bemestaranimal.controller;

import com.example.bemestaranimal.dto.PessoaDTO;
import com.example.bemestaranimal.entity.Pessoa;
import com.example.bemestaranimal.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    // Listar todos como entidade Pessoa
    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }

    // Listar todos como DTO
    @GetMapping("/dto")
    public List<PessoaDTO> listarDTO() {
        return service.listarDTO();
    }

    // Salvar nova pessoa
    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        Pessoa salvo = service.salvar(pessoa);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }
}
